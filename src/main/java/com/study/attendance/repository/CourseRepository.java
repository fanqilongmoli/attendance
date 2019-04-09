package com.study.attendance.repository;

import com.study.attendance.bean.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course,Long> {
}
