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
public class ControlCurso {
    private String grado;
    private String Director;

    public ControlCurso(String grado, String Director) {
        this.grado = grado;
        this.Director = Director;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }
    
    
    
}
