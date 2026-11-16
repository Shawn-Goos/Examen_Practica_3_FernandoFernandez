package Controlador;

import java.time.LocalDate;
import javax.swing.JLabel;

public class ControlErrores {
    public static boolean validar(String matricula, LocalDate fechaMatriculacion, float precio, JLabel lblError) {
        if (precio<0 || precio>150000) {
            mostrarError(lblError, "Error, el precio no esta comprendido entre 0 y 150.000");
            return false;
        }
        
        int anio = fechaMatriculacion.getYear();
        if (anio < 1990 ||LocalDate.now().isBefore(fechaMatriculacion)) {
            mostrarError(lblError, "Error, la fecha tiene que estar entre el 1 de enero del 90 y hoy.");
            return false;
        }
        
        //TERMINAR CUANDO PEUDA
        char [] mat = matricula.toCharArray();
        
        
        return true;
    }
    
    public static void mostrarError(JLabel lblError, String mensaje) {
        lblError.setText(mensaje);
    }
}
