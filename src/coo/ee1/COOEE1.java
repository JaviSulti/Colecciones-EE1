package coo.ee1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class COOEE1 {

    public static void main(String[] args) {

        System.out.println("Bienvenido/a al listador de numeros enteros. Por favor, lea con atencion las indicaciones.");

        ArrayList<Integer> listadoDeNumeros = new ArrayList();

        agregarNumeros(listadoDeNumeros);

        borrar99(listadoDeNumeros);

        mostrarLista(listadoDeNumeros);

        System.out.println("La suma de todos los valores ingresados en la lista es > " + sumaDeValores(listadoDeNumeros));

        promedio(sumaDeValores(listadoDeNumeros), listadoDeNumeros.size());
    }

    public static ArrayList agregarNumeros(ArrayList<Integer> listadoDeNumeros) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Debera ingresar numeros enteros. La misma se detendra cuando ingrese el numero -99.");
        int numero;
        int i = 1;
        do {
            System.out.print("Numero " + i + " > ");
            numero = teclado.nextInt();
            listadoDeNumeros.add(numero);
            i++;
        } while (numero != -99);
        return listadoDeNumeros;
    }

    public static ArrayList borrar99(ArrayList listadoDeNumeros) {
        Iterator<Integer> it = listadoDeNumeros.iterator();
        while (it.hasNext()) {
            if (it.next() == -99) {
                it.remove();
            }
        }
        return listadoDeNumeros;
    }

    public static ArrayList mostrarLista(ArrayList<Integer> listadoDeNumeros) {
        System.out.println("Los numeros ingresados son:");
        listadoDeNumeros.forEach((aux) -> {
            System.out.println(aux);
        });
        return listadoDeNumeros;
    }

    private static int sumaDeValores(ArrayList<Integer> listadoDeNumeros) {
        int suma = 0;
        for (int i = 0; i < listadoDeNumeros.size(); i++) {
            suma = suma + listadoDeNumeros.get(i);
        }
        return suma;
    }

    public static void promedio(int suma, int size) {
        double promedio = (double) suma / (double) size; //Importante: para que la division de dos numeros enteros me de uno decimal, hayque hacer un casting en cada numero entero.
        System.out.println("El valor del promedio de los numeros ingresados es: " + promedio);
    }

}
