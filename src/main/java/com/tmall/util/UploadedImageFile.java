package com.tmall.util;

import org.springframework.web.multipart.MultipartFile;
 
public class UploadedImageFile {
    MultipartFile image;
 
    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile jpg) {
        this.image = jpg;
    }

}