/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author bryan
 */
public class PrincipalController {
    
        
    @GetMapping({"/"})
    public String conciertos() {
        return "conciertos";
    }
    
}
