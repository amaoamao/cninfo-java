package com.amaoamao.cninfo.constant;


public enum ApiURL {
    QUERY(
            "http://www.cninfo.com.cn/cninfo-new/announcement/query"
    ), DOWNLOAD(
            "http://www.cninfo.com.cn/{0}"
    );
    private String url;

    ApiURL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String buildUrl(Object... params) {
        int i = 0;
        String url = this.url;
        for (Object param : params) {
            url = url.replace("{" + i++ + "}", param.toString());
            i++;
        }
        return url;
    }

}
