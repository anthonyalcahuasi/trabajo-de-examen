/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amhad;

import java.util.Scanner;

/**
 *
 * @author anthony
 */
public class EJERCICIO_2_DEL_EXAMEN_QUE_FALTABA {
    public static void main(String[] args){
        int n1,n2, total=1;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        n1=leer.nextInt();
        System.out.println("Ingresa la operacion: ");
        String op=leer.next();
        System.out.println("Ingrese el segundo numero: ");
        n2=leer.nextInt();
        if("+".equals(op)){
            total=n1+n2;
        }else if("-".equals(op)){
            total=n1-n2;
        }else if("x".equals(op)){
            total=n1*n2;
        }if("/".equals(op)){
            total=n1/n2;
        }
        System.out.println("el Resultado es "+n1+" "+op+" "+n2+ " = "+total);
        
    }
    
}
