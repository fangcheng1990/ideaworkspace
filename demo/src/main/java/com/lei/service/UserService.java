package com.lei.service;

import com.github.pagehelper.Page;
import com.lei.entity.PoetryWord;

public interface UserService {

    Page list(PoetryWord request);
}
