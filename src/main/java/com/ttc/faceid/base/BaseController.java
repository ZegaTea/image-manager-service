package com.ttc.faceid.base;

import com.ttc.faceid.global.GlobalObjects;
import com.ttc.faceid.model.response.BaseReponse;

/**
 * Created by tudv on 2019/09/14
 */
public abstract class BaseController extends Base {
//    protected static final Logger requestLog = LogManager.getLogger("RequestLog");
    public String getResponse(BaseReponse baseReponse) {
        return GlobalObjects.gsonNull.toJson(baseReponse);
    }
}
