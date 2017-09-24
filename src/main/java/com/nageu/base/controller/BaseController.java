package com.nageu.base.controller;

import com.nageu.base.bean.Result;
import com.nageu.base.util.Constants;

public class BaseController {
    Result result = new Result();
    public Result result(String code,String msg,Object obj){
        this.result.setCode(code);
        this.result.setMsg(msg);
        this.result.setObj(obj);
        return result;
    }

    public Result resultSuccess(Object obj){
        this.result.setCode(Constants.SUCCESS_CODE);
        this.result.setMsg(Constants.SUCCESS_MSG);
        this.result.setObj(obj);
        return result;
    }

    public Result resultFailure(Object obj){
        this.result.setCode(Constants.FAILURE_CODE);
        this.result.setMsg(Constants.FAILURE_MSG);
        this.result.setObj(obj);
        return result;
    }
}
