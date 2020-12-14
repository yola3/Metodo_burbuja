/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo_de_ordenamiento_interno_burbuja;

import java.util.Scanner;

public class Algoritmo_de_ordenamiento_interno {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);// se hace una instantacion para que se pueda leer datos
        Scanner entrada = new Scanner(System.in);// delclarar un scanner pra la entrada de dato
        int arreglo[], nElementos, aux;//se crea el arreglo
        
       System.out.println("introduzca el tamaño del arreglo ");//vamos a pedir el numero de elemnto que va conter el arreglo
        nElementos = leer.nextInt();// se lee la variable
        
        arreglo = new int[nElementos];// le asignamos el numero de elementos al arreglo

        for (int i = 0; i < nElementos; i++) {// utilizamos un cicclo for para pedir todos los elementos al usuario hasta que sea menor en nElementos
            System.out.print((i + 1) + ". Introduzca un numero:");// se pide los elemntos desde el teclado
            arreglo[i] = entrada.nextInt();//guardamos los numeros ingresados del arreglo con un iterador 
        }
        // metodo burbuja
        for (int i = 0; i < (nElementos - 1); i++) {// este ciclo le va servir al programa pra saber exactamente cuantas vueltas tine que dar
            for (int j = 0; j <(nElementos - 1); j++) {//for anidado nos va servir pra ordenar en si el arreglo
                if (arreglo[j] > arreglo[j + 1]) {// si numero actual es mayor que siguiente se intercambia los valores
                    aux = arreglo[j];// si aux es al igual al numeo actual
                    arreglo[j] = arreglo[j + 1];//entonces aqui agregamos el vlalor del siguiente
                    arreglo[j + 1] = aux; // se guradan los valores dentro del aux

                }
            }

        }
        // mostrando el arreglo ordenaod en forma creciente
        System.out.println("\nArreglo ordenado en forma creciente");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i] + " - ");// imprimimos el iterador 
        }
        // mostrando el arreglo ordenado en forma decreciente
        System.out.println("\nArreglo ordenado en forma decreciente");
        for(int i = ( nElementos - 1); i >= 0; i--) {// este ciclo  lo que va ser es meter de mayor a menor.
            System.out.print(arreglo[i] + " - "); // imprimimos un iterador
        }
        
    
    }
}
