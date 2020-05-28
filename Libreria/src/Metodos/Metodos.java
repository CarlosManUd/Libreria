
package Metodos;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Metodos {
    
    public static void buscar(int[] lista){ 
            
            Scanner sc = new Scanner(System.in);
            int atopado=0;
            System.out.println("Introduce el numero que quieras buscar: ");
            int buscar =sc.nextInt() ; // buscar elemento
            for(int i=0;i<lista.length;i++){
                if(buscar== lista[i]){
                    atopado = 1; //encontrado
                break;
            }
            }
                if (atopado==0){
                    System.out.println("No esta");
                }
                else{
                    System.out.println("Esta");
                }
       }
    public static void visualizar(int[]lista){ //ver la lista
            for(int i = 0;i<lista.length;i++)
                System.out.println("***"+lista[i]);
        }
     
    public static int buscarProfe(int[] lista,int elemento){
         int atopado= 0;
         int indice=0;
         for(int i=0;i<lista.length;i++){
             if(lista[i]== elemento){
                 indice = i;
                 atopado = 1;
             }
         }
         if(atopado == 0){
             System.out.println(elemento+" no esta en la lista");
             return -1;
         }
         else
             System.out.println(elemento+" Esta");
         return indice;
     }
     
} 