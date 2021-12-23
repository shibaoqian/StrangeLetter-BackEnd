package com.example.strangeLetter.controller;

import com.example.strangeLetter.commonResponse.ComResponse;
import com.example.strangeLetter.domain.LetterDomain;
import com.example.strangeLetter.server.SetLetterServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping(value = "/letter")
public class LetterActionController {
    @Autowired
    private SetLetterServer setLetterServer;

    @PostMapping (value = "/add")
    public Object add(@RequestBody Map<String,String> params){
        LetterDomain letterDomain = new LetterDomain();
        letterDomain.setCreateTime(new Date());
        letterDomain.setContent(params.get("content"));
        int id = setLetterServer.add(letterDomain);
        return ComResponse.buildSuccess();
    }
}
