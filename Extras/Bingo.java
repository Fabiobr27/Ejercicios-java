package bingo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FABIO
 */
public class Bingo {

    public static void main(String[] args) {

        int[][] CartonBingo = new int[4][8]; // array de 3 filas por 6 columnas

        int fila;
        int columna;
        int numero = 0;
        int opcion = 0;
        int contador = 0;
        int opcion1 = 0;

        boolean encontrado = false;
        System.out.print(" ");
        Scanner s = new Scanner(System.in);
        //Inicializa Carton
      

        do {
            //Mete valores en la 1 columna
            opcion = (int) (Math.random() * 3) + 2;
            switch (opcion) {

                case 2:
                    for (int i = 0; i < 2; i++) {
                        numero = (int) (Math.random() * 10) + 1;
                        CartonBingo[i][0] = numero;
                        contador++;

                    }
                    break;

                case 3:
                    for (int i = 0; i < 3; i++) {
                        numero = (int) (Math.random() * 10) + 1;
                        CartonBingo[i][0] = numero;
                        contador++;
                    }
            }

            //Mete valores en la 2 columna
            opcion = (int) (Math.random() * 3) + 2;
            switch (opcion) {

                case 2:
                    System.out.println(" ");
                    for (int i = 0; i < 2; i++) {
                        numero = (int) (Math.random() * 10) + 11;
                        CartonBingo[i][1] = numero;
                        contador++;
                    }
                    break;

                case 3:
                    for (int i = 0; i < 3; i++) {
                        numero = (int) (Math.random() * 10) + 11;
                        CartonBingo[i][1] = numero;
                        contador++;
                    }
            }

            //Mete valores en la 3 columna
            opcion = (int) (Math.random() * 3) + 2;
            switch (opcion) {

                case 2:
                    for (int i = 0; i < 2; i++) {
                        numero = (int) (Math.random() * 10) + 21;
                        CartonBingo[i][2] = numero;
                        contador++;
                    }
                    break;

                case 3:
                    for (int i = 0; i < 3; i++) {
                        numero = (int) (Math.random() * 10) + 21;
                        CartonBingo[i][2] = numero;
                        contador++;
                    }
            }

            //Mete valores en la 4 columna
            switch (opcion) {

                case 2:
                    for (int i = 0; i < 2; i++) {
                        numero = (int) (Math.random() * 10) + 31;
                        CartonBingo[i][3] = numero;
                        contador++;
                    }
                    break;

                case 3:
                    for (int i = 0; i < 3; i++) {
                        numero = (int) (Math.random() * 10) + 31;
                        CartonBingo[i][3] = numero;
                        contador++;
                    }
            }

            //Mete valores en la 5 columna
            switch (opcion) {

                case 2:
                    for (int i = 0; i < 2; i++) {
                        numero = (int) (Math.random() * 10) + 41;
                        CartonBingo[i][4] = numero;
                        contador++;
                    }
                    break;

                case 3:
                    for (int i = 0; i < 3; i++) {
                        numero = (int) (Math.random() * 10) + 41;
                        CartonBingo[i][4] = numero;
                        contador++;
                    }
            }
            //Mete valores en la 6 columna
            switch (opcion) {

                case 2:
                    for (int i = 0; i < 2; i++) {
                        numero = (int) (Math.random() * 10) + 51;
                        CartonBingo[i][5] = numero;
                        contador++;
                    }
                    break;

                case 3:
                    for (int i = 0; i < 3; i++) {
                        numero = (int) (Math.random() * 10) + 51;
                        CartonBingo[i][5] = numero;
                        contador++;
                    }
            }
            //Mete valores en la 7 columna
            switch (opcion) {

                case 2:
                    for (int i = 0; i < 2; i++) {
                        numero = (int) (Math.random() * 10) + 61;
                        CartonBingo[i][6] = numero;
                        contador++;
                    }
                    break;

                case 3:
                    for (int i = 0; i < 3; i++) {
                        numero = (int) (Math.random() * 10) + 61;
                        CartonBingo[i][6] = numero;
                        contador++;
                    }
            }
            //Mete valores en la 8 columna
            switch (opcion) {

                case 2:
                    for (int i = 0; i < 2; i++) {
                        numero = (int) (Math.random() * 10) + 71;
                        CartonBingo[i][7] = numero;
                        contador++;
                    }
                    break;

                case 3:
                    for (int i = 0; i < 3; i++) {
                        numero = (int) (Math.random() * 10) + 71;
                        CartonBingo[i][7] = numero;
                        contador++;
                    }
            }
            //Comprueba Carton
            for (fila = 0; fila < 4; fila++) {
                for (columna = 0; columna < 8; columna++) {
                    if (CartonBingo[fila][columna] != numero) {
                        encontrado = false;

                    } else {
                        encontrado = true;
                    }

                }
            }
        } while (contador <= 20);

        //Muestra carton
        System.out.println("");
        for (columna = 0; columna < 8; columna++) {
            
        }
        for (fila = 0; fila < 4; fila++) {
            System.out.print("\n ");
            for (columna = 0; columna < 8; columna++) {
                System.out.printf("%4d ", CartonBingo[fila][columna]);

            }
        }
        System.out.println("");
        System.out.println("EL numero total de numeros es " + contador);

        System.out.println("");

        //Genenera el orden del bombo
        int aux = 80;  //auxiliar;
        int[] numeros = new int[80];
        int[] resultado = new int[80];
        Random rnd = new Random();
        int res;

        //se rellena una matriz ordenada del 1 al 80(1..n)
        for (int i = 0; i < 80; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < 80; i++) {
            res = rnd.nextInt(aux);
            resultado[i] = numeros[res];
            numeros[res] = numeros[aux - 1];
            aux--;

        }

        do {

            System.out.println("Introduce la opcion que quieras realizar");
            System.out.println("1.Generar Numeros Aleatorios");
            System.out.println("2.Comprobar carton");
            System.out.println("3.Salir ");
            System.out.println("Elige una opción (1-3): ");
            opcion1 = Integer.parseInt(s.nextLine());

            switch (opcion1) {
                case 1:

                    //se imprime el resultado;
                    System.out.println("El orden del bombo de es:");
                    for (int i = 0; i < 80; i++) {
                        System.out.println(i + " " + resultado[i]);
                    }

                    break;

                case 2:

                    System.out.println("Comprobar carton ");
                    contador = 0;
                    for (int i = 0; i < 80; i++) {

                        for (fila = 0; fila < 4; fila++) {

                            for (columna = 0; columna < 8; columna++) {
                                if ((resultado[i] == CartonBingo[fila][columna])) {
                                    System.out.println("El numero " + resultado[i] + " se encuentra en el carton bola: " + i);
                                    contador++;
                                }
                            }

                        }
                    }
                    System.out.println("EL numero total de numeros es " + contador);
                    break;
                case 3:
                    System.out.println("Gracias por jugar");

                    break;
                default:
            }
        } while (opcion1 != 3);
    }
}
