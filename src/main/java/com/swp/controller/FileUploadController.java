package com.swp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/upload")
public class FileUploadController {

    //绑定文件上传路径到uploadPath
    @Value("${web.upload-path}")
    private String uploadPath;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");

    @PostMapping("/file")
    public String upload(MultipartFile file,
                         HttpServletRequest request) {

        // 在 uploadPath 文件夹中通过日期对上传的文件归类保存
        // 比如：/2019/06/06/cf13891e-4b95-4000-81eb-b6d70ae44930.png
        String format = sdf.format(new Date());
        File folder = new File(uploadPath + format);
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }

        String oldName = file.getOriginalFilename();
        // 对上传的文件重命名，避免文件重名
        String newName = UUID.randomUUID().toString()
                + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        try {
            // 文件保存
            file.transferTo(new File(folder, newName));

            // 返回上传文件的访问路径
            String filePath = request.getScheme() + "://" + request.getServerName()
                    + ":" + request.getServerPort() + "/"+ format + newName;
            return filePath; //返回路径
        } catch (IOException e) {
            return  "error";
        }

    }
}