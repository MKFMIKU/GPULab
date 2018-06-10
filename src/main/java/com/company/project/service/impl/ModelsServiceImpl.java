package com.company.project.service.impl;

import com.company.project.dao.ModelsMapper;
import com.company.project.model.Models;
import com.company.project.service.ModelsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by KangfuMei on 2018/06/09.
 */
@Service
@Transactional
public class ModelsServiceImpl extends AbstractService<Models> implements ModelsService {
    @Resource
    private ModelsMapper modelsMapper;

}
