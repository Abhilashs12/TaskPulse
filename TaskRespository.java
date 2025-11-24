package com.abhi.main.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.main.entity.Task;

public interface TaskRespository extends JpaRepository<Task, Long> {

}
