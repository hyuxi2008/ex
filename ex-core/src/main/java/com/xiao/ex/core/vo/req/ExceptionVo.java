package com.xiao.ex.core.vo.req;

import java.io.Serializable;
import java.util.Date;

/**
 * 异常VO
 *
 * @author 肖亭
 * @since 2017年09月11 15:53
 **/
public class ExceptionVo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 异常处理
     */
    private String exception;
    /**
     * 异常名称
     */
    private String className;
    /**
     * IP
     */
    private String ip;
    /**
     * 请求参数
     */
    private String parameters;
    /**
     * 请求方式GET还是POST
     */
    private String type;
    /**
     * 请求格式
     */
    private String contentType;
    /**
     * 异常发生时间
     */
    private Date exTime;

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Date getExTime() {
        return exTime;
    }

    public void setExTime(Date exTime) {
        this.exTime = exTime;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
