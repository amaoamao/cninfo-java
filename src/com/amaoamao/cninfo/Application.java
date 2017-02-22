package com.amaoamao.cninfo;


import com.amaoamao.cninfo.callback.PDFDownloadCallback;
import com.amaoamao.cninfo.client.CIClient;
import com.amaoamao.cninfo.constant.Category;
import com.amaoamao.cninfo.constant.Plate;
import com.amaoamao.cninfo.entities.Announcement;
import com.amaoamao.cninfo.entities.QueryResult;
import com.squareup.okhttp.Request;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) throws CIClient.HistoryTooLargeException, IOException {
        CIClient ci = new CIClient();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2017, 1, 21);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2017, 1, 22);
        boolean hasMore;
        int pageNum = 0;
        do {
            QueryResult result = ci.queryHistory(Plate.values(), new Category[]{Category.jy}, calendar1, calendar2, ++pageNum);
            hasMore = result.getHasMore();
            List<Announcement> announcements = result.getAnnouncements();
            announcements.forEach(announcement -> {
                System.out.println(announcement.getAnnouncementTitle() + "  " + announcement.getSecName() + "  " + new Date(announcement.getAnnouncementTime()));
                ci.downloadPDF("./downloads/" + announcement.getSecName() + "/", announcement.getAnnouncementTitle(), announcement, new PDFDownloadCallback() {
                    @Override
                    public void onSucceed() {
                        System.out.println("Succeed " + announcement.getAnnouncementTitle());
                    }

                    @Override
                    public void onFailure(Request request, IOException e) {
                        System.err.println("Failed " + announcement.getAnnouncementTitle());
                    }
                });
            });
        } while (hasMore);
    }
}
