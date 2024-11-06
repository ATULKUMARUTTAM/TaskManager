package com.atuluttam.TaskManager.TaskRepo;

import com.atuluttam.TaskManager.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
