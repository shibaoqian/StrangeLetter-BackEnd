package com.example.strangeLetter.server;


import com.example.strangeLetter.domain.LetterDomain;
import com.example.strangeLetter.mapper.LetterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class LetterServer {
    @Resource
    public LetterMapper letterMapper;
    public List<LetterDomain> getList(){
        return letterMapper.getLetterList();
    }
}
