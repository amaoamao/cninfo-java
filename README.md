# cninfo-java
一个巨潮信息网爬虫，直接clone本项目写个main方法运行即可。
```java
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
                ci.downloadPDF("./downloads/" + announcement.getSecName() + "/", announcement.getAnnouncementTitle(),
                 announcement,
                 new PDFDownloadCallback() {
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
```
依赖
- OkHttp 2.7.5
- gson 2.8.0
- jdk1.8