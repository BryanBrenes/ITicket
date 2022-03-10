/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.service;

import com.ITicket.entity.Conciertos;
import com.ITicket.repository.ConciertosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bryan
 */
@Service
public class ConciertosService implements IConciertosService{
    
     @Autowired
    private ConciertosRepository conciertosRepository;
    
    @Override
    public List<Conciertos> getAllPerson() {
        return (List<Conciertos>)conciertosRepository.findAll();
    }

    @Override
    public void savePerson(Conciertos conciertos) {
        conciertosRepository.save(conciertos);
        
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Conciertos getPersonById(long id) {
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(long id_Conciertos) {
        conciertosRepository.deleteById(id_Conciertos);

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
