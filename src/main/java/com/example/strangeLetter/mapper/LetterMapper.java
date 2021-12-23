package com.example.strangeLetter.mapper;

import com.example.strangeLetter.domain.LetterDomain;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

@Mapper
public interface LetterMapper {
    public List<LetterDomain> getLetterList();
}

