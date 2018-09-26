package com.example.demo.config;

import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cloudinary.*;


@Configuration
public class CloudinaryConfig {

    //https://cloudinary.com/console
    //go to cloudinary through heroku console
    @Bean
    public Cloudinary setColudinary(){
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "hrn9hnb3l",
                "api_key", "447811794964918",
                "api_secret", "faV8UxC9t4zZc60HtaEzkjb6oLI"));

        return cloudinary;
    }


}
