package com.atuluttam.TaskManager.Controller;

import com.atuluttam.TaskManager.Model.Task;
import com.atuluttam.TaskManager.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    TaskService ts;

    @GetMapping
    public String getTasks(Model model)
    {
        List<Task> tasks = ts.getAllTask();
        model.addAttribute("tasks", tasks);
        return  "tasks";
    }


    @PostMapping
    public String createTasks(@RequestParam String title )
    {
        ts.createTask(title);
        return  "redirect:/";
    }



    @GetMapping("/{id}/delete")
    public String deleteTasks(@PathVariable Long id)
    {
            ts.deleteTask(id);
        return  "redirect:/";
    }


    @GetMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Long id)
    {
        ts.toggleTask(id);
        return  "redirect:/";
    }
}
