/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4;
import java.util.Scanner;
/**
 *
 * @author danii
 */
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        
        int opciones;
        double resul;

        
        System.out.println("Calculo de seno, coseno y tangente de un ángulo");
        System.out.println("Introduzca el número con la opción correspondiente");
        System.out.println("1.Calcular seno");
        System.out.println("2.Calcular coseno");
        System.out.println("3.Calcular tangente");
        System.out.println("4.Salir");
        
        opciones = key.nextInt();
       

           
        switch (opciones){
            case 1:
                resul = Math.sin(datos());   
                resultado(resul,"Seno");
                break;
            case 2:
                resul = Math.cos(datos());   
                resultado(resul,"Coseno");
                break;
            case 3:
                resul = Math.tan(datos());   
                resultado(resul,"Tangente");
                break;
            default:
                System.out.println("Adiós");
                break;
        }
       }

        
       
    static double datos (){
double ang = 0;
Scanner key = new Scanner (System.in);
        System.out.println("Escribe el ángulo entre 0° y 360°: ");
        ang = key.nextDouble(); 
        ang=Math.toRadians(ang);

return ang;
    }
    
    static void resultado(double r, String dato){
            System.out.println(dato +" del ángulo: "+r);
}


    
}
