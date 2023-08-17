package com.softeem.crm.base;


import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

public class BaseController {


    @ModelAttribute
    public void preHandler(HttpServletRequest request){
        System.out.println("这里面是什么路径？request.getContextPath() = " + request.getContextPath());
        request.setAttribute("ctx", request.getContextPath());
    }

    public ResultInfo success(){
        return new ResultInfo();
    }

    public ResultInfo success(String msg){
        ResultInfo resultInfo= new ResultInfo();
        resultInfo.setMsg(msg);
        return resultInfo;
    }

    public ResultInfo success(String msg,Object result){
        ResultInfo resultInfo= new ResultInfo();
        resultInfo.setMsg(msg);
        resultInfo.setResult(result);
        return resultInfo;
    }


}
