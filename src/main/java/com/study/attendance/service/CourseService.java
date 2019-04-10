package com.study.attendance.service;

import com.study.attendance.bean.Classes;
import com.study.attendance.bean.Course;
import com.study.attendance.bean.Person;
import com.study.attendance.repository.ClassesRepository;
import com.study.attendance.repository.CourseRepository;
import com.study.attendance.repository.PersonRepository;
import com.study.attendance.vo.CourseVo;
import com.study.attendance.vo.OkResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    ClassesRepository classesRepository;

    public OkResult add(Course course) {
        courseRepository.save(course);
        return new OkResult(true);
    }

    public List<CourseVo> list() {
        List<CourseVo> courseVos = new ArrayList<>();
        final List<Course> all = courseRepository.findAll();
        all.forEach(course -> {
            CourseVo courseVo = new CourseVo();

            final Classes classes = classesRepository.findById(course.getClassesId()).orElse(null);
            courseVo.setClassesId(classes != null ? classes.getName() : "---");

            final Person person = personRepository.findById(course.getTeacherId()).orElse(null);
            courseVo.setTeacherId(person != null ? person.getUsername() : "---");

            courseVo.setId(course.getId());

            courseVos.add(courseVo);
        });
        return courseVos;
    }

    public OkResult del(Course course) {
        courseRepository.deleteById(course.getId());
        return new OkResult(true);
    }
}
