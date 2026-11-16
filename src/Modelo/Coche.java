package Modelo;

import java.time.LocalDate;

public class Coche {
    private String matricula;
    private LocalDate fechaMatriculacion;
    private float precio;

    //CONSTRUCTOR VACIO
    public Coche () {
        this.matricula = "SIN MATIRCULA";
        this.fechaMatriculacion = null;
        this.precio = -1;
    }
    
    public Coche(String matricula, LocalDate fechaMatriculacion, float precio){
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.precio = precio;
    }
    
    /*TO STRING*/
    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", fechaMatriculacion="
                + fechaMatriculacion + ", precio=" + precio + '}';
    }

    
    
    
    //GETTERS Y SETTERS
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
