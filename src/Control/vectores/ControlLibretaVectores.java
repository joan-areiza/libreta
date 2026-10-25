


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.vectores;

import Control.ControlPersona;
import static Control.vectores.ConstantesVectores.MAX;
import static Control.vectores.ConstantesVectores.MAXFIL;

/**
 *
 * @author Joan Areiza
 * @date 18/05/2024
 * @URL www.joanareiza.ga
 */
public class ControlLibretaVectores extends ControlPersona{
    
    
     //DECLARACION DE VARIABLES PUBLICAS
    public int i,j;
    public int Cantidad;
    
    //---------------------------------------
    //DECLARACION DE VECTORES PUBLICOS
    public String [] v_materia = new String[MAX];
    public double [] v_nota1 = new double[MAX];
    public double [] v_nota1_30 = new double[MAX];
    public double [] v_nota2 = new double[MAX];
    public double [] v_nota2_30 = new double[MAX];
    public double [] v_nota3 = new double[MAX];
    public double [] v_nota3_40 = new double[MAX];
    public double [] v_definitiva = new double[MAX];
    public String [] v_msj_materia = new String[MAX];
    //-----------------------------------------

    /*
     __  __      _      _____   ____    ___    ____   _____   ____  
    |  \/  |    / \    |_   _| |  _ \  |_ _|  / ___| | ____| / ___| 
    | |\/| |   / _ \     | |   | |_) |  | |  | |     |  _|   \___ \ 
    | |  | |  / ___ \    | |   |  _ <   | |  | |___  | |___   ___) |
    |_|  |_| /_/   \_\   |_|   |_| \_\ |___|  \____| |_____| |____/ 

    */
    
    //DECLARACION DE MATRICES
    public String [][] MT = new String [MAXFIL+1][2];
    public double [][] MR = new double [MAXFIL+1][7];
    
    
    
    //-----------------------------------------
    //DECLARACION DE VARIABLES PRIVADAS
    private int perdidas;
    private int total_perdidas;
    private String msj_definitivo;
    
    private double promedio;
    private double nota_promedio;
    private double nota_maxima;
    private double nota_minima;
    private double moda;
    private double mediana;
    private double desviacion_estandar;
    private double media_geometrica;

    public ControlLibretaVectores(int i, int Cantidad, int perdidas, int total_perdidas, String msj_definitivo, double promedio, double nota_promedio, double nota_maxima, double nota_minima, double moda, double mediana, double desviacion_estandar, double media_geometrica, String Nombres, String Apellidos, String grado, String Director) {
        super(Nombres, Apellidos, grado, Director);
        this.i = i;
        this.Cantidad = Cantidad;
        this.perdidas = perdidas;
        this.total_perdidas = total_perdidas;
        this.msj_definitivo = msj_definitivo;
        this.promedio = promedio;
        this.nota_promedio = nota_promedio;
        this.nota_maxima = nota_maxima;
        this.nota_minima = nota_minima;
        this.moda = moda;
        this.mediana = mediana;
        this.desviacion_estandar = desviacion_estandar;
        this.media_geometrica = media_geometrica;
    }

    

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getNota_promedio() {
        return nota_promedio;
    }

    public void setNota_promedio(double nota_promedio) {
        this.nota_promedio = nota_promedio;
    }

    public double getNota_maxima() {
        return nota_maxima;
    }

    public void setNota_maxima(double nota_maxima) {
        this.nota_maxima = nota_maxima;
    }

    public double getNota_minima() {
        return nota_minima;
    }

    public void setNota_minima(double nota_minima) {
        this.nota_minima = nota_minima;
    }

    public double getModa() {
        return moda;
    }

    public void setModa(double moda) {
        this.moda = moda;
    }

    public double getMediana() {
        return mediana;
    }

    public void setMediana(double mediana) {
        this.mediana = mediana;
    }

    public double getDesviacion_estandar() {
        return desviacion_estandar;
    }

    public void setDesviacion_estandar(double desviacion_estandar) {
        this.desviacion_estandar = desviacion_estandar;
    }

    public double getMedia_geometrica() {
        return media_geometrica;
    }

    public void setMedia_geometrica(double media_geometrica) {
        this.media_geometrica = media_geometrica;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public int getTotal_perdidas() {
        return total_perdidas;
    }

    public void setTotal_perdidas(int total_perdidas) {
        this.total_perdidas = total_perdidas;
    }

    public String getMsj_definitivo() {
        return msj_definitivo;
    }

    public void setMsj_definitivo(String msj_definitivo) {
        this.msj_definitivo = msj_definitivo;
    }
 
}
