
package Metodos;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Validar {
    
public float validaFloatPositivo() {
        Scanner sc = new Scanner(System.in);
        float valor;
        do{
        valor = sc.nextFloat();
        }while (valor<=0);
        return valor;
        }
    
    public static float darValor(){
        Scanner sc = new Scanner(System.in);
        float valor;
        do{
        valor = sc.nextFloat();
        }while (valor<=0);
        return valor;
        }
            
        }