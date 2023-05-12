package com.metropolitan.IT355DZ08BojanaStajic4596.jms;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;
    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable String message){
        departmentService.sendMessage(message);
        return message;
    }
}

