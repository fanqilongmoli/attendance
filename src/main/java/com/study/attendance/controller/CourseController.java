package com.study.attendance.controller;

import com.study.attendance.bean.Course;
import com.study.attendance.service.CourseService;
import com.study.attendance.vo.OkResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @ApiOperation("添加课程")
    @PostMapping("add")
    public OkResult add(@RequestBody Course course){
        return  courseService.add(course);
    }
}
