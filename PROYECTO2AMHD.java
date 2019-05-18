/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amhad;

/**
 *
 * @author anthony
 */
public class PROYECTO2AMHD {
    public int[] ordenAscendenteAMHAD(int[] arreglo){
        int aux, j;
        for (int i = 1; i < arreglo.length; i++) {
            aux=arreglo[i];
            j=i;
            while(j>0 && aux<arreglo[j-1]){
            arreglo[j]=arreglo[j-1];
            j--;
            }
            arreglo[j]=aux;
        }        
    return arreglo;
    }
    public int[] ordenDescendenteAMHAD(int[] arreglo){
        int aux, j;
        for (int i = 1; i < arreglo.length; i++) {
            aux=arreglo[i];
            j=i;
            while(j>0 && aux>arreglo[j-1]){
            arreglo[j]=arreglo[j-1];
            j--;
            }
            arreglo[j]=aux;
        }        
    return arreglo;
    }
    public void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("vector["+i+"]="+arreglo[i]);
        }
    }    
    public static void main(String[] args) {
        int[] vector={1,4,2,5,3,6,7,9,11,8,14,13,12,10};
        PROYECTO2AMHD or=new PROYECTO2AMHD();
        or.imprimir(vector);
        System.out.println("Ordenado");
        or.imprimir(or.ordenAscendenteAMHAD(vector));  
        System.out.println("Ordenado Descendente");
        or.imprimir(or.ordenDescendenteAMHAD(vector));   
    }
}
