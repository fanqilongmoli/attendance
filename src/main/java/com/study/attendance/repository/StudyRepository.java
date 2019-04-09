package com.study.attendance.repository;

import com.study.attendance.bean.Study;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudyRepository extends PagingAndSortingRepository<Study,Long> {
}
