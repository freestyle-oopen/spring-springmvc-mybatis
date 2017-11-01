package com.ren.qq.pojo;

/**
 * 返回结果状态码枚举
 * 100-199 用于指定客户端应相应的某些动作。
 * 200-299 用于表示请求成功。
 * 300-399 用于已经移动的文件并且常被包含在定位头信息中指定新的地址信息。
 * 400-499 用于指出客户端的错误。
 * 500-599 用于支持服务器错误。
 * http://www.cnblogs.com/lxinxuan/archive/2009/10/22/1588053.html
 */
public enum ResponseCode {
    SC_OK(200, "OK"),
    SC_BAD_REQUEST(400, "Bad Request/错误请求"),
    SC_UNAUTHORIZED(401, "Unauthorized/未授权"),
    SC_FORBIDDEN(403, "Forbidden/禁止"),
    SC_NOT_FOUND(404, "Not Found/未找到"),
    SC_METHOD_NOT_ALLOWED(405, "Method Not Allowed/方法未允许"),
    SC_PRECONDITION_FAILED(412,"Precondition Failed/先决条件错误"),
    SC_INTERNAL_SERVER_ERROR(500, "Internal Server Error/内部服务器错误"),
    SC_HTTP_VERSION_NOT_SUPPORTED(505, "HTTP Version Not Supported/不支持的 HTTP 版本");


    private int code;
    private String msg;
    private ResponseCode(int code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }

    public int getCode()
    {
        return this.code;
    }

    public String getMsg()
    {
        return this.msg;
    }
}
