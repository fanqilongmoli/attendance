package com.study.attendance.controller;

import com.study.attendance.bean.Classes;
import com.study.attendance.service.ClassesService;
import com.study.attendance.vo.OkResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("classes")
public class ClassesController {

    @Autowired
    ClassesService classesService;

    @ApiOperation("添加班级")
    @PostMapping("add")
    public OkResult add(@RequestBody Classes classes){
        return classesService.add(classes);
    }

    @ApiOperation("获取班级列表")
    @PostMapping("list")
    public List<Classes> list(){
        return classesService.list();
    }
}
