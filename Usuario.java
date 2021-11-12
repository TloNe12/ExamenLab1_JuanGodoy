/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen1;

/**
 *
 * @author jcgol
 */
public class Usuario {
    private String nombre;
    private String usuario;
    private String contra;
    private int edad;
    private double saldo;
    private int cuenta;
    private String personaje;
    

    public Usuario() {
    }

    public Usuario(String nombre, String usuario, String contra, int edad, double saldo,int cuenta,String personaje) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contra = contra;
        this.setEdad(edad);
        this.setSaldo(saldo);
        this.setCuenta(cuenta);
        this.personaje= personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>=18){
        this.edad = edad;}
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo>=2000.00 && saldo<=10000.00){
        this.saldo = saldo;}
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }
    
    
    
    
    
}
