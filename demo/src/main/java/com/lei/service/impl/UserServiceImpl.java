package com.lei.service.impl;

import com.github.pagehelper.Page;
import com.lei.dao.PoetryWordMapper;
import com.lei.entity.PoetryWord;
import com.lei.entity.PoetryWordExample;
import com.lei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    PoetryWordMapper poetryWordMapper;

    @Override
    public Page list(PoetryWord request) {
        Page page = new Page();
        PoetryWordExample example = new PoetryWordExample();
        PoetryWordExample.Criteria criteria = example.createCriteria();
        if(request.getType() != null){
            criteria.andTypeEqualTo(request.getType());
        }
        List<PoetryWord> list = poetryWordMapper.selectByExample(example);
        page.addAll(list);
        return page;
    }
}
