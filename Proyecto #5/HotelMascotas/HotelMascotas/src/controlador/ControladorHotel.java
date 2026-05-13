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
import modelo.Dueño;
import vista.JFReserva;

/**
 *
 * @author USUARIO
 */

public class ControladorHotel implements ActionListener{

    JFReserva frmReserva = new JFReserva ();
    
    private ArrayList <Dueño> listaDueños;
    private ArrayList <Cuidador> listaCuidadores;
    private ArrayList <Reserva> listaReservas;
    private ArrayList <Mascota> listaMascotas;

    public ControladorHotel() {
    }
    
    public ControladorHotel(JFReserva frmReserva) {
        
        this.frmReserva = frmReserva;
        
        this.frmReserva.btnRegistarDueñoMascota.addActionListener(this);
        this.frmReserva.btnRegistrarCuidador.addActionListener(this);
        this.frmReserva.btnRealizarReserva.addActionListener(this);
        this.frmReserva.btnVerReservas.addActionListener(this);
        
        listaDueños = new ArrayList <> ();
        listaCuidadores = new ArrayList <> ();
        listaReservas = new ArrayList <> ();
        listaMascotas = new ArrayList <> ();
        
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
        
        String nombreD = this.frmReserva.txtNombreD.getText();
        String cedulaD = this.frmReserva.txtCedulaD.getText();
        String telefonoD = this.frmReserva.txtTelefonoD.getText();
        
        String nombreM = this.frmReserva.txtnombreM.getText();
        String raza = this.frmReserva.txtRazaM.getText();
        String nescesidades = this.frmReserva.txtNescesidadesM.getText();
        
        if (nombreD.isEmpty()||cedulaD.isEmpty()||telefonoD.isEmpty()||nombreM.isEmpty()||raza.isEmpty()||nescesidades.isEmpty()||this.frmReserva.txtEdadM.getText().isEmpty()){
            this.frmReserva.txtAMostrar.setText("DATOS INCOMPLETOS\nSE HA CANCELADO EL REGISTRO DEL DUEÑO Y SU MASCOTA");
            
        }
        
        else if (verificarCedula (cedulaD) == false){
            this.frmReserva.txtAMostrar.setText("Ya existe un dueño registrado con esa cedula\nSE HA CANCELADO EL REGISTRO");
        }
        
        else {
            
            int edad = Integer.parseInt(this.frmReserva.txtEdadM.getText());
            
            Mascota m = new Mascota (nombreM, raza, edad, nescesidades);
            listaMascotas.add(m);
            
            Dueño d = new Dueño (listaMascotas.getLast(), null, nombreD, cedulaD, telefonoD);
            listaDueños.add(d);
            
            this.frmReserva.txtAMostrar.setText("Se ha registrado correctamente al dueño: "+nombreD+"\nJunto a su mascota: "+nombreM);
            
        }
        
        reiniciarCampos();
        
    }
    
    public void registrarCuidador (){
        
        String nombreC = this.frmReserva.txtNombreC.getText();
        String cedulaC = this.frmReserva.txtCedulaC.getText();
        String razaC = this.frmReserva.txtRazaC.getText();
        
        if (nombreC.isEmpty()||cedulaC.isEmpty()||razaC.isEmpty()){
            this.frmReserva.txtAMostrar.setText("DATOS INCOMPLETOS\nSe ha cancelado el registro del cuidador");
        }
        
        else {
            int nivelExp = Integer.parseInt(this.frmReserva.cmbNivelExpC.getSelectedItem().toString());
            String [] razasC = razaC.split("/");
                    
            Cuidador c = new Cuidador (nivelExp, razasC, nombreC, cedulaC);
            listaCuidadores.add(c);
            
            this.frmReserva.txtAMostrar.setText("Se ha registrado exitosamente al cuidador: "+nombreC);
        }
        
    }
    
    public void realizarReserva (){
        
        
        
    }
    
    public void verReservas (){
        
        
        
    }
    
    public boolean verificarCedula (String cedula){
        for (Dueño d: listaDueños){
            if (d.getCedula().equals(cedula)){
                return false;
            }
        }
        return true;
    }
    
    public void reiniciarCampos (){
        this.frmReserva.txtCedulaC.setText("");
        this.frmReserva.txtCedulaD.setText("");
        this.frmReserva.txtCuidadorR.setText("");
        this.frmReserva.txtDuracionR.setText("");
        this.frmReserva.txtEdadM.setText("");
        this.frmReserva.txtFechaIngreso.setText("");
        this.frmReserva.txtMascotaR.setText("");
        this.frmReserva.txtNescesidadesM.setText("");
        this.frmReserva.txtNombreC.setText("");
        this.frmReserva.txtNombreD.setText("");
        this.frmReserva.txtRazaC.setText("");
        this.frmReserva.txtRazaM.setText("");
        this.frmReserva.txtTelefonoD.setText("");
        this.frmReserva.txtnombreM.setText("");
    }
    
    
}
