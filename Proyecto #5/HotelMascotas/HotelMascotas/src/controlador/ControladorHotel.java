/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Mascota;
import modelo.Cuidador;
import modelo.Fecha;
import modelo.Persona;
import modelo.Reserva;
import vista.JFReserva;

/**
 *
 * @author USUARIO
 */

public class ControladorHotel implements ActionListener{

    JFReserva frmReserva = new JFReserva ();

    public ControladorHotel() {
    }
    
    public ControladorHotel(JFReserva frmReserva) {
        
        this.frmReserva = frmReserva;
        this.frmReserva.btnRegistarDueñoMascota.addActionListener(this);
        this.frmReserva.btnRegistrarCuidador.addActionListener(this);
        this.frmReserva.btnRealizarReserva.addActionListener(this);
        this.frmReserva.btnVerReservas.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        
        if (e.getSource() == this.frmReserva.btnRegistarDueñoMascota){
            registrarDueñoMascota ();
        }
        
        if (e.getSource() == this.frmReserva.btnRegistrarCuidador){
            registrarCuidador ();
        }
        
        if (e.getSource() == this.frmReserva.btnRealizarReserva){
            realizarReserva ();
        }
        
    }
    
    public void registrarDueñoMascota (){
        
        
        
    }
    
    public void registrarCuidador (){
        
        
        
    }
    
    public void realizarReserva (){
        
        
        
    }
    
    public void verReservas (){
        
        
        
    }
    
    
}
