package com.example.demo.controller;


import com.example.demo.service.FileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/files")
public class FileController {
    @Autowired
    FileService fileService;
    /*
    //https://stackoverflow.com/questions/28039709/what-is-difference-between-requestbody-and-requestparam
    //different used in ItemController and FileController
    //@RequestBody annotated parameter is expected to hold the entire body of the request and bind to one object, so you essentially will have to go with your option
    //so at here we use @RequestParam("file")
    @RequestMapping(value = "/addFile", method = RequestMethod.POST,consumes = "multipart/form-data")
    public void addFile(@RequestParam("file") MultipartFile item){
       // fileService.storeFile(item);
    }
    */
    @RequestMapping(value = "/addFile", method = RequestMethod.POST,consumes = "multipart/form-data")
    public Map addFile(@RequestParam("file") MultipartFile item) throws IOException {

        return fileService.uploadFile(item);

    }
}
