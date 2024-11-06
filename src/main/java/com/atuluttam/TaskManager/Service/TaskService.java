package com.atuluttam.TaskManager.Service;

import com.atuluttam.TaskManager.Model.Task;
import com.atuluttam.TaskManager.TaskRepo.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepository tr;


    public List<Task> getAllTask() {
        return tr.findAll();
    }

    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        tr.save(task);

    }

    public void deleteTask(Long id) {
        tr.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = tr.findById(id)
                .orElseThrow(()->new IllegalArgumentException("Invalid task Id"));
    task.setCompleted(!task.isCompleted());
    tr.save(task);
    }
}
