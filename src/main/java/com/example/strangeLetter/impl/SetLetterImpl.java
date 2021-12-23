package com.example.strangeLetter.impl;


import com.example.strangeLetter.domain.LetterDomain;
import com.example.strangeLetter.mapper.SetLetterMapper;
import com.example.strangeLetter.server.SetLetterServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetLetterImpl implements SetLetterServer {
    @Autowired
    private SetLetterMapper setLetterMapper;

    @Override
    public int add(LetterDomain letterDomain) {
        setLetterMapper.insert(letterDomain);
        int id = letterDomain.getId();
        return id;
    }
}