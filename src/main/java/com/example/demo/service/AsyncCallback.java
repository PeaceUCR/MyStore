package com.example.demo.service;

import java.io.IOException;
import java.util.Map;

public interface AsyncCallback {
    void callback(Map map) throws IOException; // would be in any signature
}
