package com.metropolitan.IT355DZ08BojanaStajic4596.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;
@Service
public class CountryService {
    @JmsListener(destination = "test")
    public void listener(String message){
        System.out.println("Pristigla poruka je " + message);
    }
}

