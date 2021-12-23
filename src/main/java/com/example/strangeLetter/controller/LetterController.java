package com.example.strangeLetter.controller;

import com.example.strangeLetter.commonResponse.ComResponse;
import com.example.strangeLetter.domain.LetterDomain;
import com.example.strangeLetter.server.LetterServer;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class LetterController {
    @Resource
    private LetterServer userService;

    @GetMapping(value = "/getMessages")
    public ComResponse getService() {
        ComResponse objComResponse = new ComResponse();
        List<LetterDomain> letterList = userService.getList();
        objComResponse.setData(letterList);
        objComResponse.setMsg("返回成功");
        return objComResponse;
    }

    @PostMapping(value = "/setMessages")
    public Object setService( @RequestBody Map<String,Object> params) {
//        System.out.println(params);
        ComResponse objComResponse = new ComResponse();
        List<Object> letterList = Collections.singletonList(params);
        objComResponse.setData(letterList);
        objComResponse.setMsg("返回成功");
        return objComResponse;
    }
}
