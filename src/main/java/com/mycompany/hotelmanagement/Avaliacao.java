/**
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelmanagement;

/**
 *
 * @author gustavooliveira
 */

public class Avaliacao 
{

    private int id;
    private Hospedes hospede ;
    private Reserva reserva;
    private int nota; // Exemplo: de 1 a 5
    private String comentario;
    private Quarto quartos ;

        // Getters
        public int getId() 
        {
            return id;
        }
    
        
        public Hospedes getHospede() 
        {
            return hospede;
        }
    
        
        public Reserva getReserva() 
        {
            return reserva;
        }
    
        
        public int getNota() 
        {
            return nota;
        }
    
        
        public String getComentario() 
        {
            return comentario;
        }
    
       
        public Quarto getQuartos() {
            return quartos;
        }

}