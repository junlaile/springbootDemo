package com.jun.warrior.server.impl;

import com.jun.warrior.entity.Steam;
import com.jun.warrior.mapper.SteamMapper;
import com.jun.warrior.server.SteamServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SteamServerImpl implements SteamServer {

    @Resource
    private SteamMapper steamMapper;

    @Override
    public List<Steam> selectAll() {
        List<Steam> steams = steamMapper.selectAll();
        return steams;
    }
}
