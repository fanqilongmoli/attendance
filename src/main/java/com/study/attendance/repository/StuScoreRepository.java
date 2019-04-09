package com.study.attendance.repository;

import com.study.attendance.bean.StuScore;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StuScoreRepository extends PagingAndSortingRepository<StuScore,Long> {
}
