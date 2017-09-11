package com.nageu.base.controller;

import com.nageu.base.bean.Result;

public class BaseController {
    Result result = new Result();
    public Result result(String code,String msg,Object obj){
        this.result.setCode(code);
        this.result.setMsg(msg);
        this.result.setObj(obj);
        return result;
    }
}
