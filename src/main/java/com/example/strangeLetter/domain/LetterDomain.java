package com.example.strangeLetter.domain;

import java.util.Date;


public class LetterDomain {
    private int id;
    private Date creat_time;
    private String content;

    public LetterDomain(){

    }
    public LetterDomain(int id, String content, Date createTime) {
        this.id = id;
        this.creat_time = createTime;
    }

    public LetterDomain( String content, Date createTime) {
        this.creat_time = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getCreateTime() {
        return creat_time;
    }

    public void setCreateTime(Date createTime) {
        this.creat_time = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}