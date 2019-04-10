package com.study.attendance.controller;

import com.study.attendance.bean.Person;
import com.study.attendance.service.PersonService;
import com.study.attendance.vo.OkResult;
import com.study.attendance.vo.PersonVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    PersonService personService;

    @ApiOperation("添加学生 或者 老师")
    @RequestMapping("add")
    public OkResult add(@RequestBody Person person){
       return personService.add(person);
    }

    @ApiOperation("获取学生 或者 老师列表")
    @RequestMapping("list")
    public List<PersonVo> list(@RequestBody Person person){
        return personService.list(person);
    }
    @ApiOperation("删除学生 或者 老师")
    @RequestMapping("del")
    public OkResult del(@RequestBody Person person){
        return personService.del(person);
    }
}
