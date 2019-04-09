package com.study.attendance.service;

import com.study.attendance.bean.Course;
import com.study.attendance.repository.CourseRepository;
import com.study.attendance.vo.OkResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public OkResult add(Course course) {
        courseRepository.save(course);
        return new OkResult(true);
    }
}
