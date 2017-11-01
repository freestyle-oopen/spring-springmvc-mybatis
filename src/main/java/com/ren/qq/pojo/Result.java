package com.ren.qq.pojo;


import org.springframework.util.StringUtils;

/**
 * Created by tmg-yesky on 2016/10/20.
 */
public class Result {

    private int code;//返回状态码
    private String msg;//返回状态描述
    private Object body;//返回结果实体

    public Result() {
        super();
    }

    public Result(ResponseCode rpco, Object body, String msg) {
        super();
        this.code = rpco.getCode();
        if(StringUtils.isEmpty(msg))
            this.msg = rpco.getMsg();
        else
            this.msg = msg;
        this.body = body;
    }

    /**
     * 创建成功时候的返回结果
     * @param body
     * @return
     */
    public static Result BuildSuccessResult(Object body) {
        Result result = new Result(ResponseCode.SC_OK, body,null);
        return result;
    }
    /**
     * 创建失败时候的返回结果，次序body不需要传递
     * @param rpco
     * @return
     */
    public static Result BuildFailResult(ResponseCode rpco,String msg) {
        Result result = new Result(rpco, null, msg);
        return result;
    }

    public static Result BuildFailResult(ResponseCode rpco) {
        Result result = new Result(rpco, null, null);
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

}
