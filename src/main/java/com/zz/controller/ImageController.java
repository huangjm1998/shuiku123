package com.zz.controller;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.xml.ws.RespectBinding;
import javax.xml.ws.ResponseWrapper;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping(value = "/image")
public class ImageController {
    @RequestMapping(value = "/get/{path}", produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public Object getImage(@PathVariable String path) throws IOException {
        File file = new File(path);
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        return bytes;
    }
}