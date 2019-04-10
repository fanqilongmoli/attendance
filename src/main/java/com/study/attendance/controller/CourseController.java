package com.study.attendance.controller;

import com.study.attendance.bean.Course;
import com.study.attendance.service.CourseService;
import com.study.attendance.vo.CourseVo;
import com.study.attendance.vo.OkResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @ApiOperation("获取课程列表")
    @GetMapping("list")
    public List<CourseVo> list(){
        return  courseService.list();
    }
    @ApiOperation("删除课程")
    @PostMapping("del")
    public OkResult del(@RequestBody Course course){
        return courseService.del(course);
    }


}
