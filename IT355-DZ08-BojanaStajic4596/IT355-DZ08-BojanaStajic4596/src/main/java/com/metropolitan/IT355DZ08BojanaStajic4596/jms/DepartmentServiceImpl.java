package com.metropolitan.IT355DZ08BojanaStajic4596.jms;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private JmsTemplate jmsTemplate;
    @Override
    public void sendMessage(String message) {
        jmsTemplate.convertAndSend("test", message);
    }
}
