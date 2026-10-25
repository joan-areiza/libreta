/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ModeloFiltro {
    
    public double FiltraDouble(String dato){
        
        Boolean BandLetras=false;
        double Nota=0;
        
            //while (BandLetras!=true) {
                try {
                    /* El try verifica que se ingresen solo números.*/
                    Nota = Double.parseDouble(dato);
                    /* Verifica que el valor de la nota este en el rango Nota>0 y Nota<=5
                             |(XXXXXXXXXXX)|
                    <--------|-------------|---------->
                    -∞      0             5        +∞ 
                
                     */
                    if ((Nota > 0) && (Nota <= 5)) {
                        /*
                    Si está en el rango, entonces la bandera BandLetras se 
                    vuelve verdadera.                    
                         */
                        BandLetras = true;

                    } else {
                        /*
                    En caso contrario, si no está en el rango, entonces la bandera BandLetras  
                    saca un mensaje de error y la bandera se vuelve falsa.
                    
                         */

                        JOptionPane.showMessageDialog(null, "!Error!, nota fuera de rango."
                                + "\nSolo puede ingresar notas en el rango [Nota>0 y Nota<=5].",
                                "Entrada de datos inválida para nota.", JOptionPane.QUESTION_MESSAGE);

                        BandLetras = false;
                    }

                } catch (NumberFormatException e) {

                    /*
                 El catch "atrapa" o "captura" el error y evita que el progama colapse.                               
                     */
                    //Despliega un mensaje de error
                    JOptionPane.showMessageDialog(null, "!Error!, en la lectura de la nota, solo puede ingresar números.\n" + e, "Entrada de datos inválida", JOptionPane.ERROR_MESSAGE);
                    //La bandera se vuelve falsa
                    BandLetras = false;

                }//Fin del filtro de lectura de la variable nota
            //}//Fin while
            
            return Nota;
    
    
    }
    
}
