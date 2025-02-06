/**
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelmanagement;

/**
 *
 * @author gustavooliveira
 */

public class Avaliacao {

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

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setHospede(Hospedes hospede) {
        this.hospede = hospede;
    }

    
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    
    public void setNota(int nota) {
        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException("A nota deve estar entre 1 e 5.");
        }
        this.nota = nota;
    }

   
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    
    public void setQuartos(Quarto quartos) {
        this.quartos = quartos;
    }

}