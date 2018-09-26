package com.example.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;


public class AsyncCallbackImpl implements AsyncCallback {

    private static final Logger logger = LogManager.getLogger(AsyncCallbackImpl.class);
    HttpServletResponse response;

    public AsyncCallbackImpl(HttpServletResponse response){
        this.response = response;
    }

    @Override
    public void callback(Map result) throws IOException{
        logger.info(result);
        /*
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();

        // finally output the json string
        String json = new ObjectMapper().writeValueAsString(result);

        //out.write(json);

        out.print(json);
        //no flush the json will not return
        out.flush();
        */

    }
}
