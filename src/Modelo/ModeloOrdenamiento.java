/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class ModeloOrdenamiento {
    
    
    /*
    #################################################################################
    #################################################################################
    #################################################################################
      ___               _                                      _                  _                  
    / _ \   _ __    __| |   ___   _ __     __ _   _ __ ___   (_)   ___   _ __   | |_    ___    ___  
   | | | | | '__|  / _` |  / _ \ | '_ \   / _` | | '_ ` _ \  | |  / _ \ | '_ \  | __|  / _ \  / __| 
   | |_| | | |    | (_| | |  __/ | | | | | (_| | | | | | | | | | |  __/ | | | | | |_  | (_) | \__ \ 
    \___/  |_|     \__,_|  \___| |_| |_|  \__,_| |_| |_| |_| |_|  \___| |_| |_|  \__|  \___/  |___/ 


             _   _ 
            | | | |
            | |_| |
             \__, |
             |___/ 
    _                                                _                 
   | |__    _   _   ___    __ _   _   _    ___    __| |   __ _   ___   
   | '_ \  | | | | / __|  / _` | | | | |  / _ \  / _` |  / _` | / __|  
   | |_) | | |_| | \__ \ | (_| | | |_| | |  __/ | (_| | | (_| | \__ \_ 
   |_.__/   \__,_| |___/  \__, |  \__,_|  \___|  \__,_|  \__,_| |___(_)
                             |_|                                       

    
    La mayor parte de los siguientes algoritmos, se encuentran detalladamente explicados
    en el libro: "La culpa es del programmer versiòn 1.0", páginas 234 a 239. Autor: Hector Conde
    
    Link de lectura:
    https://books.google.com.co/books?id=WTViJVeFCy0C&lpg=PP1&dq=la%20culpa%20es%20del%20programmer&pg=PP1#v=onepage&q&f=false
    
    #################################################################################
    #################################################################################
    #################################################################################
    
    */
    /*
    Animaciones de ordenamientos: http://lwh.free.fr/pages/algo/tri/tri_es.html
    
     _      ____                   _                 _         
    / |    | __ )   _   _   _ __  | |__    _   _    (_)   __ _ 
    | |    |  _ \  | | | | | '__| | '_ \  | | | |   | |  / _` |
    | |_   | |_) | | |_| | | |    | |_) | | |_| |   | | | (_| |
    |_(_)  |____/   \__,_| |_|    |_.__/   \__,_|  _/ |  \__,_|
                                                  |__/         
    Documentaciòn: https://www.ecured.cu/Ordenamiento_de_burbuja
    
    Video explicativo:  https://www.youtube.com/watch?v=Iv3vgjM8Pv4
    
    Animaciòn: http://lwh.free.fr/pages/algo/tri/tri_bulle_es.html
    
    */
    public void burbuja(double [] a){
     //Se recorre el vector
        double aux;
        for(int i = 0; i < a.length; i++){

            /**Utilizamos un for anidado para comparar
             * los valores contenidos en la matriz
             */
            for (int j = i + 1; j < a.length; j++){
                
                if(a[j]< a[i]){
                    /**Si el valor de nums[j] es menor que el valor de
                     * nums[i] este se intercambiará de la siguiente forma,
                     * si queremos ordenar de manera Descendente solo tenemos
                     * que cambiar este signo.
                     */
                    aux = a[i]; /**Se guarda en un auxiliar para
                                    *no perder el valor y volver a utilizarlo
                                    */
                    a[i] = a[j];
                    a[j] = aux;
                    /**En las dos líneas anteriores lo que hicimos
                     * fue intercambiar valores con el fin de ordenarlos,
                     * por último vamos a imprimir la matriz.
                     */
                }
            }           
        }
    }//Fin método de la burbuja.
    
    /*
         ____       ____    _              _   _ 
        |___ \     / ___|  | |__     ___  | | | |
          __) |    \___ \  | '_ \   / _ \ | | | |
         / __/ _    ___) | | | | | |  __/ | | | |
        |_____(_)  |____/  |_| |_|  \___| |_| |_|
    
    
    Método de shell
    
    Animación y algoritmo: http://lwh.free.fr/pages/algo/tri/tri_shell_es.html
    Documentación: http://puntocomnoesunlenguaje.blogspot.com/2014/09/metodo-shell-de-ordenacion.html
    Video explicativo: https://www.youtube.com/watch?v=CmPA7zE8mx0

    */
    
    
    /*
    
     _____      ___            _          _        ____                   _   
    |___ /     / _ \   _   _  (_)   ___  | | __   / ___|    ___    _ __  | |_ 
      |_ \    | | | | | | | | | |  / __| | |/ /   \___ \   / _ \  | '__| | __|
     ___) |   | |_| | | |_| | | | | (__  |   <     ___) | | (_) | | |    | |_ 
    |____(_)   \__\_\  \__,_| |_|  \___| |_|\_\   |____/   \___/  |_|     \__|

    Método de Quick sort
    
    Animación y algoritmo: http://lwh.free.fr/pages/algo/tri/tri_rapide_es.html
    Documentación: http://puntocomnoesunlenguaje.blogspot.com/2014/09/metodo-shell-de-ordenacion.html
    Video explicativo: https://www.youtube.com/watch?v=3San3uKKHgg
    
    
    
    */
    
/*   _  _       ___                               _     _                     ____                   _   
    | || |     |_ _|  _ __    ___    ___   _ __  | |_  (_)   ___    _ __     / ___|    ___    _ __  | |_ 
    | || |_     | |  | '_ \  / __|  / _ \ | '__| | __| | |  / _ \  | '_ \    \___ \   / _ \  | '__| | __|
    |__   _|    | |  | | | | \__ \ |  __/ | |    | |_  | | | (_) | | | | |    ___) | | (_) | | |    | |_ 
       |_|(_)  |___| |_| |_| |___/  \___| |_|     \__| |_|  \___/  |_| |_|   |____/   \___/  |_|     \__|

    
    Animación y algoritmo: http://lwh.free.fr/pages/algo/tri/tri_insertion_es.html
    Documentación: https://www.ecured.cu/Ordenamiento_por_Inserci%C3%B3n
    Video: https://www.youtube.com/watch?v=ROalU379l3U
           https://www.youtube.com/watch?v=5kVQ8kf52K4 
    
  */  
    
    
    /*
    Animación y algoritmo: http://lwh.free.fr/pages/algo/tri/tri_selection_es.html
    
     ____      ____           _                 _     _                     ____                   _   
    | ___|    / ___|    ___  | |   ___    ___  | |_  (_)   ___    _ __     / ___|    ___    _ __  | |_ 
    |___ \    \___ \   / _ \ | |  / _ \  / __| | __| | |  / _ \  | '_ \    \___ \   / _ \  | '__| | __|
     ___) |    ___) | |  __/ | | |  __/ | (__  | |_  | | | (_) | | | | |    ___) | | (_) | | |    | |_ 
    |____(_)  |____/   \___| |_|  \___|  \___|  \__| |_|  \___/  |_| |_|   |____/   \___/  |_|     \__|
    
    
    Animación y algoritmo: http://lwh.free.fr/pages/algo/tri/tri_selection_es.html
    Video: https://www.youtube.com/watch?v=l0YwcUJB3vo
            https://www.youtube.com/watch?v=l0YwcUJB3vo

    
    */
    
    
    /*
      __       ____                  _      _             _   _                          _   
    / /_     / ___|   ___     ___  | | __ | |_    __ _  (_) | |    ___    ___    _ __  | |_ 
   | '_ \   | |      / _ \   / __| | |/ / | __|  / _` | | | | |   / __|  / _ \  | '__| | __|
   | (_) |  | |___  | (_) | | (__  |   <  | |_  | (_| | | | | |   \__ \ | (_) | | |    | |_ 
    \___(_)  \____|  \___/   \___| |_|\_\  \__|  \__,_| |_| |_|   |___/  \___/  |_|     \__|
    
    También llamado "burbuja bidireccional" o "método de la sacudida" o "coctail sort" o "shaker sort.


    Animación y algoritmo: http://lwh.free.fr/pages/algo/tri/tri_shaker_es.html
    Video: https://www.youtube.com/watch?v=RZjEFfb1DwI
    
    
    */
 public void cocktailSort(double a[]) 
 { 
  boolean swapped = true; 
  int start = 0; 
  int end = a.length; 
 
  while (swapped == true) { 
   // reset the swapped flag on entering the 
   // loop, because it might be true from a 
   // previous iteration. 
   swapped = false; 
 
   // loop from bottom to top same as 
   // the bubble sort 
   for (int i = start; i < end - 1; ++i) { 
    if (a[i] > a[i + 1]) { 
     double temp = a[i]; 
     a[i] = a[i + 1]; 
     a[i + 1] = temp; 
     swapped = true; 
    } 
   } 
 
   // if nothing moved, then array is sorted. 
   if (swapped == false) 
    break; 
 
   // otherwise, reset the swapped flag so that it 
   // can be used in the next stage 
   swapped = false; 
 
   // move the end point back by one, because 
   // item at the end is in its rightful spot 
   end = end - 1; 
 
   // from top to bottom, doing the 
   // same comparison as in the previous stage 
   for (int i = end - 1; i >= start; i--) { 
    if (a[i] > a[i + 1]) { 
     double temp = a[i]; 
     a[i] = a[i + 1]; 
     a[i + 1] = temp; 
     swapped = true; 
    } 
   } 
 
   // increase the starting point, because 
   // the last stage would have moved the next 
   // smallest number to its rightful spot. 
   start = start + 1; 
  } 
 } 
    
    
    
  /*  
     _____    ____                                             _         
    |___  |  | __ )   _   _   ___    __ _   _   _    ___    __| |   __ _ 
       / /   |  _ \  | | | | / __|  / _` | | | | |  / _ \  / _` |  / _` |
      / /_   | |_) | | |_| | \__ \ | (_| | | |_| | |  __/ | (_| | | (_| |
     /_/(_)  |____/   \__,_| |___/  \__, |  \__,_|  \___|  \__,_|  \__,_|
                                       |_|                               
                                                       _           _ 
     ___    ___    ___   _   _    ___   _ __     ___  (_)   __ _  | |
    / __|  / _ \  / __| | | | |  / _ \ | '_ \   / __| | |  / _` | | |
    \__ \ |  __/ | (__  | |_| | |  __/ | | | | | (__  | | | (_| | | |
    |___/  \___|  \___|  \__,_|  \___| |_| |_|  \___| |_|  \__,_| |_|

                 _       _                          _         
      _   _     | |__   (_)  _ __     __ _   _ __  (_)   __ _ 
     | | | |    | '_ \  | | | '_ \   / _` | | '__| | |  / _` |
     | |_| |    | |_) | | | | | | | | (_| | | |    | | | (_| |
      \__, |    |_.__/  |_| |_| |_|  \__,_| |_|    |_|  \__,_|
      |___/                                                   

    Documentación: http://artemisa.unicauca.edu.co/~nediaz/EDDI/cap02.html
    Video: https://www.youtube.com/watch?v=h4IL6R0pz6w
    
    */

}