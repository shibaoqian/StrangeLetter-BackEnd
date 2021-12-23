package com.example.strangeLetter.mapper;

import com.example.strangeLetter.domain.LetterDomain;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface SetLetterMapper {
    //推荐使用#{}取值，不要用${},因为存在注入的风险
    @Insert("INSERT INTO message_main(content,creat_time) value ( #{content}, #{creat_time})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    //keyProperty java对象的属性；keyColumn表示数据库的字段
    int insert(LetterDomain letterDomain);
}
