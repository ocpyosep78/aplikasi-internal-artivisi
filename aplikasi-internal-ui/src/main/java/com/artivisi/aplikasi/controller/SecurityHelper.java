package com.artivisi.aplikasi.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class SecurityHelper {

    public static String getCurrentUsername() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            return auth.getName();
        } else {
            return "undefined";
        }
    }
    
    public static String getUserRole() {
        return "";
    }
}
