package com.study.attendance.repository;

import com.study.attendance.bean.Attendance;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AttendanceRepository extends PagingAndSortingRepository<Attendance, Long> {
}
