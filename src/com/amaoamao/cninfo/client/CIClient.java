package com.amaoamao.cninfo.client;

import com.amaoamao.cninfo.callback.PDFDownloadCallback;
import com.amaoamao.cninfo.constant.ApiURL;
import com.amaoamao.cninfo.constant.Category;
import com.amaoamao.cninfo.constant.Plate;
import com.amaoamao.cninfo.entities.Announcement;
import com.amaoamao.cninfo.entities.QueryResult;
import com.google.gson.Gson;
import com.squareup.okhttp.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;


public class CIClient {
    private SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");

    private Headers headers = new Headers.Builder()
            .add("Host", "www.cninfo.com.cn")
            .add("Proxy-Connection", "keep-alive")
            .add("Content-Length", "230")
            .add("Accept", "application/json, text/javascript, */*; q=0.01")
            .add("Origin", "http://www.cninfo.com.cn")
            .add("X-Requested-With", "XMLHttpRequest")
            .add("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36")
            .add("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
            .add("DNT", "1").add("Accept-Encoding", "gzip, deflate")
            .add("Accept-Language", "en-US,en;q=0.8")
            .add("Cookie", "JSESSIONID=D7A35D7D531AF75CFE77ACDA63BD5106").build();
    private OkHttpClient client = new OkHttpClient();

    public CIClient() {
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public QueryResult queryHistory(Plate[] plates, Category[] categories, Calendar calendar, int pageNum) throws HistoryTooLargeException, IOException {
        return queryHistory(plates, categories, ft.format(calendar.getTime()), pageNum);
    }

    public QueryResult queryHistory(Plate[] plates, Category[] categories, Calendar calendar1, Calendar calendar2, int pageNum) throws HistoryTooLargeException, IOException {
        return queryHistory(plates, categories, ft.format(calendar1.getTime()) + " ~ " + ft.format(calendar2.getTime()), pageNum);
    }

    private QueryResult queryHistory(Plate[] plates, Category[] categories, String seDate, int pageNum) throws HistoryTooLargeException, IOException {
        RequestBody formBody = new FormEncodingBuilder()
                .add("stock", "")
                .add("searchkey", "")
                .add("plate", String.join("", Arrays.stream(plates).distinct().map(Plate::getPlateName).toArray(String[]::new)))
                .add("category", String.join("", Arrays.stream(categories).distinct().map(Category::getCatName).toArray(String[]::new)))
                .add("trade", "")
                .add("column", "szse")
                .add("columnTitle", "")
                .add("pageNum", String.valueOf(pageNum))
                .add("pageSize", "50")
                .add("tabName", "fulltext")
                .add("sortName", "")
                .add("sortType", "")
                .add("limit", "")
                .add("showTitle", "")
                .add("seDate", seDate).build();
        Request request = new Request.Builder().url(ApiURL.QUERY.getUrl()).headers(headers).post(formBody).build();
        QueryResult result = new Gson().fromJson(client.newCall(request).execute().body().string(), QueryResult.class);
        if (result.getTotalRecordNum() > 3000) {
            throw new HistoryTooLargeException();
        }
        return result;
    }

    public void downloadPDF(String filePath, String fileName, Announcement announcement, PDFDownloadCallback callback) {
        File path = new File(filePath);
        if (!path.exists())
            path.mkdirs();
        File file = new File(filePath + fileName);
        Request request = new Request.Builder().url(ApiURL.DOWNLOAD.buildUrl(announcement.getAdjunctUrl())).build();
        Call call = client.newCall(request);

        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                callback.onFailure(request, e);
            }

            @Override
            public void onResponse(Response response) throws IOException {
                byte[] buf = new byte[2048];
                int len;
                try (InputStream is = response.body().byteStream();
                     FileOutputStream fos = new FileOutputStream(file)) {
                    while ((len = is.read(buf)) != -1) {
                        fos.write(buf, 0, len);
                    }
                }
                callback.onSucceed();
            }
        });
    }

    public class HistoryTooLargeException extends Exception {
        HistoryTooLargeException(String msg) {
            super(msg);
        }

        HistoryTooLargeException() {
            super();
        }
    }
}
