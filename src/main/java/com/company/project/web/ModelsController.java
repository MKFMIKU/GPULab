package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Models;
import com.company.project.service.ModelsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by KangfuMei on 2018/06/09.
*/
@RestController
@RequestMapping("/models")
public class ModelsController {
    @Resource
    private ModelsService modelsService;

    @PostMapping("/add")
    public Result add(Models models) {
        modelsService.save(models);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        modelsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Models models) {
        modelsService.update(models);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Models models = modelsService.findById(id);
        return ResultGenerator.genSuccessResult(models);
    }

    @GetMapping("/list")
    public Result list() {
        List<Models> list = modelsService.findAll();
        return ResultGenerator.genSuccessResult(list);
    }
}
