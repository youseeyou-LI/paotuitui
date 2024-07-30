package com.paotuitui.controller;

import com.paotuitui.JwtUtils.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/api")
public class AuditController {
    public static final String ImgPath = "image";
    @PostMapping("/uploadImage")
    public String uploadImage(@RequestParam("image") MultipartFile image,@RequestHeader("Authorization") String token) throws IOException {
        if(image.isEmpty()){
            return "文件上传失败";
        }
        try{
            if(token == null){
                return "请你先登陆";
            }
            Integer userIdFromToken = JwtUtil.getUserIdFromToken(token);
            if(userIdFromToken == null){
                return "请先登陆";
            }
            String projectDirectory = System.getProperty("user.dir");
            Path destinationPath = Paths.get(projectDirectory + "/" + image + "/" + userIdFromToken.toString()+"jpg");

            Files.createDirectories(destinationPath.getParent());
            Files.write(destinationPath,image.getBytes());
        }catch (IOException e){
            return "文件上传失败";
        }
        return "文件上传成功";

    }

}
