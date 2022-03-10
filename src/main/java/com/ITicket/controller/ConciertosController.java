/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.controller;

import com.ITicket.entity.Conciertos;
import com.ITicket.service.IConciertosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author bryan
 */

@Controller
public class ConciertosController {
    
    @Autowired
    private IConciertosService conciertosService;
    
    @GetMapping("/conciertos")
    public String index(Model model){
        List<Conciertos> listaConciertos=conciertosService.getAllPerson();
        model.addAttribute("titulo","Conciertos");
        model.addAttribute("personas",listaConciertos );
        return "conciertos";
    }
    
    @GetMapping("/conciertosN")
    public String crearPersona(Model model){
        model.addAttribute("conciertos", new Conciertos());
        return "CrearEvento";
    }
    
    @PostMapping("/save")
    public String guardarConciertos(@ModelAttribute Conciertos conciertos){
        conciertosService.savePerson(conciertos);
        return "redirect:/conciertos";
    }
    
    @GetMapping ("/delete/{id_Conciertos}")
    public String eliminarConciertos(@PathVariable("id_Conciertos") Long id_Conciertos){
        conciertosService.delete(id_Conciertos);
        return "redirect:/Conciertos";
    }
    
    
            

}
