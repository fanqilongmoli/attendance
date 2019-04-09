package com.study.attendance.service;

import com.study.attendance.bean.Study;
import com.study.attendance.repository.StudyRepository;
import com.study.attendance.vo.OkResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyService {

    @Autowired
    StudyRepository studyRepository;

    public OkResult addStudy(Study study) {
        studyRepository.save(study);
        return new OkResult(true);
    }

    public List<Study> getStudyList() {
        return studyRepository.findAll();
    }
}
