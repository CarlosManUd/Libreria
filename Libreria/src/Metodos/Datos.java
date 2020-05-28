
package Metodos;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Datos {
    
public static int pedirInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un int ");
        int n=sc.nextInt();
        return n;
    }
    
    public static String pedirString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un String ");
        String n=sc.next();
        return n;
    }
    public static String pedirMensaxe(String mensaxe){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un String ");
        mensaxe=sc.next();
        return mensaxe;
    }
      
}