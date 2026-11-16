package Controlador;

import Modelo.Coche;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JLabel;

public class ListaCoches {
    private int actual;
    private ArrayList<Coche> lista;
    
    public ListaCoches() {
        this.lista = new ArrayList<>();
        this.actual = 0;
        lista.add(new Coche("1234ABC", LocalDate.now(), (float) 100.000));
        lista.add(new Coche("9876ZYX", LocalDate.now(), (float) 70.000));
        lista.add(new Coche("2312ADH", LocalDate.now(), (float) 130.000));
        lista.add(new Coche("5869GHS", LocalDate.now(), (float) 25.000));
        System.out.println(lista.toString());
    }
    
    //ANADIR COCHE
    public boolean anadirCoche(String matricula, LocalDate fecaMatriculacion, float precio, JLabel lblError) {
        if(ControlErrores.validar(matricula, fecaMatriculacion, precio, lblError)) {
            lista.add(new Coche(matricula, fecaMatriculacion, precio));
            return true;
        }
        return false;
    }
    
    //Borrar COCHE
    public void borrarCoche() {
        lista.remove(actual);
    }
    
    //COJO EL COHCE ACTUAL
    public Coche obtenerCocheActual() {
        if (lista.isEmpty() || actual < 0 || actual >= lista.size()) {
            return null;
        }
        return lista.get(actual);
    }
    
    
    
    
    //DEVUELVE SI LA LISTA ESSTA VACIA
    public boolean esVacia() {
        return lista.isEmpty();
    }
    
    public void avanzar(){
        if (actual < lista.size() -1) {
            actual++;
        }
    }
    
    public void retroceder(){
        if (actual > 0) {
            actual--;
        }
    }
    
    public void irAlPrimero(){
        actual = 0;
    }
    
    public void irAlUltimo(){
        if (!lista.isEmpty()) {
            actual = lista.size() - 1;
        }
    }
    
    public boolean esPrimero() {
        return actual == 0;
    }
    
    public boolean esUltimo() {
        return actual == lista.size() - 1;
    }
}
