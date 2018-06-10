package com.company.project.web;

import com.alibaba.druid.util.StringUtils;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringJoiner;
import java.util.UUID;

@Controller
@RestController
public class UploadController {

    @PostMapping("/upload")
    public Result submit(@RequestParam("file") MultipartFile file, ModelMap modelMap) {
        StringJoiner sj = new StringJoiner(" , ");
        try {
            String filename = UUID.randomUUID().toString().replace("-", "").toLowerCase() + ".pth";
            byte[] bytes = file.getBytes();
            Path path = Paths.get(System.getProperty("user.home") + "/tmp/" + filename);
            Files.write(path, bytes);

            sj.add(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String uploadedFileName = sj.toString();
        if (StringUtils.isEmpty(uploadedFileName)) {
            return ResultGenerator.genFailResult("file is empty");
        } else {
            return ResultGenerator.genSuccessResult(uploadedFileName);
        }
    }

    @RequestMapping(path = "/download", method = RequestMethod.GET)
    public ResponseEntity<Resource> download(String url) throws IOException {

        String file = System.getProperty("user.home") + "/tmp/" + url;

        Path path = Paths.get(file);

        Resource resource = new UrlResource(path.toUri());

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(resource);
    }
}
