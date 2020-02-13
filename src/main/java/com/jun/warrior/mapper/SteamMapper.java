package com.jun.warrior.mapper;

import com.jun.warrior.entity.Steam;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SteamMapper {

    @Select("select * from steam")
    List<Steam> selectAll();

}

