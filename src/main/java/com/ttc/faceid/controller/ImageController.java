package com.ttc.faceid.controller;

import com.ttc.faceid.base.BaseController;
import com.ttc.faceid.model.response.BaseReponse;
import com.ttc.faceid.util.DateUtils;
import com.ttc.faceid.util.FileUtils;
import com.ttc.faceid.util.config.Constant;
import com.ttc.faceid.util.config.StatusCode;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by tudv on 2019/09/23
 */
@RestController
@RequestMapping(value = "/image")
public class ImageController extends BaseController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        BaseReponse baseReponse = new BaseReponse();
        DateUtils dateUtils = new DateUtils();
        try {
            // Get the file and save it somewhere
            String pathDate = Constant.IMAGE_STORAGE + dateUtils.getDateToday();
            FileUtils.createDirectory(pathDate);
            String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();
            String imagePath = pathDate + "/" + fileName;

            Path path = Paths.get(imagePath);
            byte[] bytes = file.getBytes();
            Files.write(path, bytes);
            baseReponse.setErrorCode(StatusCode.SUCCESS);
            baseReponse.setMessage("Upload image success");
            baseReponse.setData(imagePath);
            return new ResponseEntity<>(getResponse(baseReponse), HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            baseReponse.setMessage("Error when upload image");
            return new ResponseEntity<>(getResponse(baseReponse), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/uploadImage2", method = RequestMethod.POST)
    public String uploadImage2(HttpServletRequest request
            , @RequestParam("imageValue") String imageValue) {
        try {
            //This will decode the String which is encoded by using Base64 class
            byte[] imageByte = Base64.decodeBase64(imageValue);

            String directory = "/Users/tudv/Workspace/TTC/faceid/image-manager-service/" + "sample.png";

            new FileOutputStream(directory).write(imageByte);
            return "success ";
        } catch (Exception e) {
            return "error = " + e;
        }

    }
}
