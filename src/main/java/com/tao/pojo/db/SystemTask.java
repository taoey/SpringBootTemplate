package com.tao.pojo.db;

public class SystemTask {
    private String id;

    private String title;

    private String author;

    private String bean;

    private String method;

    private Long runtime;

    private String taskExplain;

    private Short status;

    private String timing;

    private String params;

    private Short paramcount;

    private Short retry;

    private Short runstatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getBean() {
        return bean;
    }

    public void setBean(String bean) {
        this.bean = bean == null ? null : bean.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public Long getRuntime() {
        return runtime;
    }

    public void setRuntime(Long runtime) {
        this.runtime = runtime;
    }

    public String getTaskExplain() {
        return taskExplain;
    }

    public void setTaskExplain(String taskExplain) {
        this.taskExplain = taskExplain == null ? null : taskExplain.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing == null ? null : timing.trim();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public Short getParamcount() {
        return paramcount;
    }

    public void setParamcount(Short paramcount) {
        this.paramcount = paramcount;
    }

    public Short getRetry() {
        return retry;
    }

    public void setRetry(Short retry) {
        this.retry = retry;
    }

    public Short getRunstatus() {
        return runstatus;
    }

    public void setRunstatus(Short runstatus) {
        this.runstatus = runstatus;
    }
}