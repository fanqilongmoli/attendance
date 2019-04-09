package com.study.attendance.controller;

import com.study.attendance.bean.Study;
import com.study.attendance.service.StudyService;
import com.study.attendance.vo.OkResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("study")
public class StudyController {

    @Autowired
    StudyService studyService;


    @ApiOperation("添加学生")
    @PostMapping("add")
    public OkResult addStudy(@RequestBody Study study){
       return studyService.addStudy(study);
    }
    @ApiOperation("获取学生列表")
    @GetMapping("list")
    public List<Study> getStudyList(){
        return studyService.getStudyList();
    }
}
