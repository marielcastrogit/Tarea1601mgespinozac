package models;

import java.io.Serializable;

public class Persona implements Serializable {
    private String primerNombre, segundoNombre, primerApellido, segundoApellido,fechaNacimiento, numCedula;
    int edad;
    
    public Persona(){
        primerNombre = new String();
        segundoNombre = new String();
        primerApellido = new String();
        segundoApellido = new String();
        fechaNacimiento = new String();
        edad = 0;
        numCedula = "";
    }
    
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }
    
    
    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public String getNumCedula() {
        return numCedula;
    }
    
    
    
    
}
