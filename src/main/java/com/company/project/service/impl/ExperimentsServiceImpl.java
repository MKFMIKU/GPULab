package com.company.project.service.impl;

import com.company.project.dao.ExperimentsMapper;
import com.company.project.model.Experiments;
import com.company.project.service.ExperimentsService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by KangfuMei on 2018/06/10.
 */
@Service
@Transactional
public class ExperimentsServiceImpl extends AbstractService<Experiments> implements ExperimentsService {
    @Resource
    private ExperimentsMapper experimentsMapper;

}
