/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Joan Areiza
 * @date: 18/05/2024
 * @URL: www.joanareiza.ga
 */
public class ModeloLibreta {
    public double Calc30(double nota){
       return nota*0.3;
    }
    public double Calc40(double nota){
       return nota*0.4;
    }
    public double CalcDef(double porc1_30, double porc2_30, double porc3_40){
       return porc1_30+porc2_30+porc3_40;
    }
    
    public String CalcMsjMateria(double nota_def)
    {
        if (nota_def<3)
            return "Habilita";
        else
            return "Aprueba";
    
    }
    
     public String CalcMsjDefinitivo(int total_perdidas)
    {
        if (total_perdidas==0)
            return "!Felicitaciones!, gana el año.";
        else
            if (total_perdidas<3)
            return "Pierde el año lectivo, puede presentar recuperación.";
            else
                return "Pierde definitivamente el año lectivo.";
    
    }
    
    
}
