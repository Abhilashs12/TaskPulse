package com.abhi.main.controller;

import com.abhi.main.entity.Task;
import com.abhi.main.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        return taskService.updateTask(id, task);
    }

    @PatchMapping("/{taskId}/assign/{userId}")
    public Task assignTask(@PathVariable Long taskId, @PathVariable Long userId) {
        return taskService.assignTask(taskId, userId);
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable Long id) {
        return taskService.getTask(id);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    @PatchMapping("/{id}/status")
    public Task updateStatus(@PathVariable Long id, @RequestBody String status) {
        return taskService.updateTaskStatus(id, status);
    }@DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "Task deleted successfully";
    }


}
