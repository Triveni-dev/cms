package com.triveni.cms.api;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Home {
   public String home(){
       return "Application is working!!!"+new Date();

    }
}
