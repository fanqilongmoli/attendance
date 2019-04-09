package com.study.attendance.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 请假表
 */
@Entity
public class LeaveT {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long studyId;

    private String content;

    private Integer status;

    private String passDesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudyId() {
        return studyId;
    }

    public void setStudyId(Long studyId) {
        this.studyId = studyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPassDesc() {
        return passDesc;
    }

    public void setPassDesc(String passDesc) {
        this.passDesc = passDesc;
    }
}
