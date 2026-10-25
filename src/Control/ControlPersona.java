/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author usuario
 */
public class ControlPersona extends ControlCurso {
    private String Nombres;
    private String Apellidos;

    public ControlPersona(String Nombres, String Apellidos, String grado, String Director) {
        super(grado, Director);
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
    
}
