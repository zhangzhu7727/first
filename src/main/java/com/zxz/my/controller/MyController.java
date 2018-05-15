package com.zxz.my.controller;

import com.zxz.my.domain.JSONResult;
import com.zxz.my.domain.TheResources;
import com.zxz.my.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MyController {
    @Autowired
  private TheResources resources;
    @RequestMapping("/getUser")
      public JSONResult equals(   ) {
         User user =new User();
         user.setName("sdjfsh");
         user.setAge(3);
         user.setId(new Date().toString());
         return JSONResult.ok(user);
    }

    @RequestMapping("/getR")
     public JSONResult getR(   ) {
         return JSONResult.ok(resources);
    }
}
