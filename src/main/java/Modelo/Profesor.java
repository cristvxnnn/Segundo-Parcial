/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author crstc
 */
public class Profesor extends Persona {
    private String cedula;
    private String area;
    private double salarioPorHora;
    private int horasDictadas;

    public Profesor(String cedula, String area, double salarioPorHora, int horasDictadas, String nombre, String direccion, String telefono, Fecha fechaNacimiento) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioPorHora = salarioPorHora;
        this.horasDictadas = horasDictadas;
    }
    public double calcularPagoMensual(){
        double salarioBase= salarioPorHora * horasDictadas;
        return salarioBase + (salarioBase*0.30);
    }
    public double calcularPrestaciones(){
        return calcularPagoMensual()*0.19;
    }
    public double calcularPagoMensual(int horasExtras){
        double salarioBase=salarioPorHora*(horasDictadas+horasExtras);
        return salarioBase+(salarioBase*0.30);
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasDictadas() {
        return horasDictadas;
    }

    public void setHorasDictadas(int horasDictadas) {
        this.horasDictadas = horasDictadas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCedula: "+cedula+ "\nArea: "+area +
               "\nPago mensual: "+ calcularPagoMensual()+ 
               "\nPrestaciones: "+calcularPrestaciones(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
