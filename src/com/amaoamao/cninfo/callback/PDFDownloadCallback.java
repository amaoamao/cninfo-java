package com.amaoamao.cninfo.callback;

import com.squareup.okhttp.Request;

import java.io.IOException;

public interface PDFDownloadCallback {
    void onSucceed();

    void onFailure(Request request, IOException e);
}
