/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_serie;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Iepiadm
 */
public class Ejemplo_serie {

    public static void main(String[] args) {

        Ejemplo_serie ejemplo = new Ejemplo_serie();
        ejemplo.serie4();

    }

    public void hola_mundo() {
        System.out.println("Hola mundo");
    }

    public void serie1() {
        System.out.println("Ingrese el valor maximo: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {

            if (x == n) {
                System.out.print(x);
            } else {
                System.out.print(x + ",");
            }
        }
    }

    public void serie2() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        System.out.println("Ingrese el valor maximo: ");
        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {
            if (x == n) {
                System.out.print(x);
            } else {
                System.out.print(x + "+");
            }
            suma = suma + x;
        }
        System.out.print(" = " + suma);
    }

    public void serie3() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        System.out.println("Ingrese el valor maximo: ");
        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {
            if (x % 2 == 1) {

                if (x == n) {
                    System.out.print(x);
                } else {
                    System.out.print(x + "+");
                }
                suma = suma + x;
            }
        }
        System.out.print(" = " + suma);
    }

    public void serie4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor maximo: ");
        int n = sc.nextInt();
        int cont = 0;
        String signo;
        int resultado = 1;

        for (int x = 1; x <= n; x++) {
            if (x % 2 == 1) {
                if (x == n) {
                    System.out.print(x);
                } else {
                    if (cont % 2 == 0) {
                        signo = "+";
                        resultado += x;
                        cont++;
                    } else {
                        signo = "-";
                        resultado -= x;
                        cont++;
                    }
                    System.out.print(x + signo);
                }
            }
        }
        System.out.print(" = " + resultado);
    }
}
