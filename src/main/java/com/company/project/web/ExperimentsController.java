package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Experiments;
import com.company.project.model.Models;
import com.company.project.service.ExperimentsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by KangfuMei on 2018/06/10.
*/
@RestController
@RequestMapping("/experiments")
public class ExperimentsController {
    @Resource
    private ExperimentsService experimentsService;

    @PostMapping("/add")
    public Result add(Experiments experiments) {
        experimentsService.save(experiments);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        experimentsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Experiments experiments) {
        experimentsService.update(experiments);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Experiments experiments = experimentsService.findById(id);
        return ResultGenerator.genSuccessResult(experiments);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Experiments> list = experimentsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/model")
    public Result model(@RequestParam Integer id) {
        Condition condition = new Condition(Experiments.class);
        condition.createCriteria().andEqualTo("modelId", id);
        List<Experiments> list = experimentsService.findByCondition(condition);
        return ResultGenerator.genSuccessResult(list);
    }
}
