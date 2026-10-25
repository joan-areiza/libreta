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
public class ControlLibreta extends ControlPersona {
    public int i;
    public int Cantidad;
    private String materia;
    private double nota1;
    private double nota1_30;
    private double nota2;
    private double nota2_30;
    private double nota3;
    private double nota3_40;
    private double definitiva;
    private int perdidas;
    private int total_perdidas;
    private String msj_materia;
    private String msj_definitivo;
    private double promedio;
    private double nota_promedio;
    private double nota_maxima;
    private double nota_minima;
    private double moda;
    private double mediana;
    private double desviacion_estandar;
    private double media_geometrica;

    public ControlLibreta(String materia, double nota1, double nota1_30, double nota2, double nota2_30, double nota3, double nota3_40, double definitiva, int perdidas, int total_perdidas, String msj_materia, String msj_definitivo, double promedio, double nota_promedio, double nota_maxima, double nota_minima, double moda, double mediana, double desviacion_estandar, double media_geometrica, String Nombres, String Apellidos, String grado, String Director) {
        super(Nombres, Apellidos, grado, Director);
        this.materia = materia;
        this.nota1 = nota1;
        this.nota1_30 = nota1_30;
        this.nota2 = nota2;
        this.nota2_30 = nota2_30;
        this.nota3 = nota3;
        this.nota3_40 = nota3_40;
        this.definitiva = definitiva;
        this.perdidas = perdidas;
        this.total_perdidas = total_perdidas;
        this.msj_materia = msj_materia;
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

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota1_30() {
        return nota1_30;
    }

    public void setNota1_30(double nota1_30) {
        this.nota1_30 = nota1_30;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota2_30() {
        return nota2_30;
    }

    public void setNota2_30(double nota2_30) {
        this.nota2_30 = nota2_30;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota3_40() {
        return nota3_40;
    }

    public void setNota3_40(double nota3_40) {
        this.nota3_40 = nota3_40;
    }

    public double getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(double definitiva) {
        this.definitiva = definitiva;
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

    public String getMsj_materia() {
        return msj_materia;
    }

    public void setMsj_materia(String msj_materia) {
        this.msj_materia = msj_materia;
    }

    public String getMsj_definitivo() {
        return msj_definitivo;
    }

    public void setMsj_definitivo(String msj_definitivo) {
        this.msj_definitivo = msj_definitivo;
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
    
 
    
}
