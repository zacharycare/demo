package com.nageu.base.controller;

import com.nageu.base.bean.Result;

public class BaseController {
    public Result result(String code,String msg,Object obj){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setObj(obj);
        return result;
    }
}
