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
public class PROYECTOAMHAD {
    public static int busquedaBinariaRecursivaAMHAD(int[] arreglo, int busqueda, int izquierda, int derecha){
        if(izquierda > derecha){
            return -1;
        }
        int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
        int elementoDelMedio = arreglo[indiceDelElementoDelMedio];
        if(elementoDelMedio == busqueda){
            return indiceDelElementoDelMedio;
        }
        if(busqueda < elementoDelMedio){
            derecha = indiceDelElementoDelMedio - 1;
            return busquedaBinariaRecursivaAMHAD(arreglo, busqueda, izquierda, derecha);
        }else{
            izquierda = indiceDelElementoDelMedio + 1;
            return busquedaBinariaRecursivaAMHAD(arreglo, busqueda, izquierda, derecha);
        }
    }
    public static void main(String[] args) {
        int[] arreglo = {5, 7, 11, 20, 21, 25, 80, 85, 90, 95, 97, 98, 115, 500, 510, 512, 1024};
        int busqueda = 5;
        int indiceDelElementoBuscado = busquedaBinariaRecursivaAMHAD(arreglo, busqueda, 0, arreglo.length - 1);
        System.out.println("El elemento buscado (" + String.valueOf(busqueda) + ") se encuentra en la posición " + indiceDelElementoBuscado);
    }

}
