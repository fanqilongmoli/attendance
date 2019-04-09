package com.study.attendance.repository;

import com.study.attendance.bean.LeaveT;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LeaveTRepository extends PagingAndSortingRepository<LeaveT,Long> {
}
