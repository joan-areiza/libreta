/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;



/**
 *
 * @author  www.joanareiza.ga
 * date: 20/08/2024
 */
public class ModeloEstadistica {
    
    
     public double calcMinimo( double[] a, int Cantidad )
      {
   	
   	 double min;       // Current min value
   	   
   	 min = a[1];       // Initial min. value
    
   	 for (int i = 2 ; i <= Cantidad ; i++ )
   	 {
   	    if ( a[i] < min )
   	    {
   	      min = a[i];  // Found a smaller min. value
   	    }
   	 }
       
   	 return(min);      // Return the min found (instead of printing it)
      }
     
     
     /*
     {{{}}}{}{}{}{}{}[][][][][][][][
     
     */
     
     public double calcPromedio( double[] a, int Cantidad )
      {
          /*
          
          La media armónica (H) de un conjunto de elementos no nulos (X1, X2,…,XN)
          es el recíproco de la suma de los recíprocos (donde 1/Xi es el recíproco de Xi))
          multiplicado por el número de elementos del conjunto (N).

        Fórmula de la media armónica
        La media armónica es la recíproca de la media aritmética. Los elementos del conjunto 
        deben ser necesariamente no nulos. Esta media es poco sensible a los valores grandes 
        y los infravalora respecto a la media aritmética, pero muy sensible a los valores 
        próximos a cero, ya que los recíprocos 1/Xi son muy altos, por lo que les da más 
        peso que en las medias aritmética y geométrica. Si algún valor fuese cero, la media armónica quedaría indeterminada.

Ésta no tiene un uso muy extenso en el mundo científico. Suele utilizarse principalmente para calcular la media de velocidades, tiempos o en electrónica.
          
          
          */
   	 double sum=0, prom=0;  
   	 for (int i = 1 ; i <= Cantidad ; i++ )
   	 {
             sum+=a[i];//Acumula el valor.
             
   	 }
         prom=sum/Cantidad;
         return(prom);      // Return array average 
      }
     
     
    
}
