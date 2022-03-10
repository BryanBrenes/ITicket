/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ITicket.service;

import com.ITicket.entity.Conciertos;
import java.util.List;

/**
 *
 * @author bryan
 */
public interface IConciertosService {
        public List<Conciertos> getAllPerson();
    public void savePerson(Conciertos conciertos);
    public Conciertos getPersonById (long id_Conciertos);
    public void delete(long id_Conciertos);
}
