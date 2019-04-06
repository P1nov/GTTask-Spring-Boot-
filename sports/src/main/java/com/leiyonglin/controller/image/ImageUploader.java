package com.leiyonglin.controller.image;

import com.leiyonglin.base.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@RestController
@RequestMapping("/image")
public class ImageUploader {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public JsonResult imageUpload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request, HttpServletResponse response){

        File imageFile = null;
        String url = "";

        String fileName = file.getOriginalFilename();

        if(fileName != null && fileName != ""){

            String returnUrl = request.getScheme() + "://" + request.getServerName() + ":" +request.getServerPort() +request.getContextPath() + "/upload/images/";
            String path = request.getSession().getServletContext().getRealPath("upload/images");
            String fileF = fileName.substring(fileName.lastIndexOf("."), fileName.length());

            fileName = new Date().getTime() + "_" + new Random().nextInt(1000) + fileF;

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String fileAdd = dateFormat.format(new Date());

            File existFile = new File(path + "/" + fileAdd);

            if (!existFile.exists() && !existFile.isDirectory()){

                boolean isDirectory = existFile.mkdirs();
                if(isDirectory){

                    imageFile = new File(existFile, fileName);
                    try {

                        file.transferTo(imageFile);

                        url = returnUrl + fileAdd + "/" + fileName;
                        return new JsonResult(0, "上传成功", url);
                    }catch(Exception e){

                        return JsonResult.doError(500, e.getLocalizedMessage());
                    }
                }else{

                    return JsonResult.doError(501, "文件上传失败");

                }
            }else{

                imageFile = new File(existFile, fileName);
                try {

                    file.transferTo(imageFile);

                    url = returnUrl + fileAdd + "/" + fileName;
                    return new JsonResult(0, "上传成功", url);
                }catch(Exception e){

                    return JsonResult.doError(500, e.getLocalizedMessage());
                }

            }


        }


        return null;
    }
}
