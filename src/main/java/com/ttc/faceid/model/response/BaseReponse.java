package com.ttc.faceid.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.ttc.faceid.util.config.StatusCode;

/**
 * Created by tudv on 2019/09/14
 */
public class BaseReponse {
    @SerializedName("error_code")
    @Expose
    private int errorCode;
    @Expose
    private Object message;
    @Expose
    private Object data;

    public BaseReponse() {
        this.errorCode = StatusCode.ERROR;
        this.message = "Error";
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
