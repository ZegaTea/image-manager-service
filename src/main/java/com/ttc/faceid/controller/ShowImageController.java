//package com.ttc.faceid.controller;
//
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.util.StreamUtils;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.IOException;
//
///**
// * Created by tudv on 2019/10/22
// */
//@RestController
//public class ShowImageController {
//    @RequestMapping(value = "/{imageLink}", method = RequestMethod.GET, produces = {MediaType.IMAGE_GIF_VALUE, MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
//    public ResponseEntity<byte[]> getImage(@PathVariable(value = "imageLink") String link) throws IOException {
//
//        ClassPathResource imgFile = new ClassPathResource(link);
//        byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());
//
//        return ResponseEntity
//                .ok()
////                .contentType(MediaType.IMAGE_JPEG)
//                .body(bytes);
//    }
//}
