/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

/**
 *
 * @author turupawn
 */
public class Evaluador {

    public static void main(String[] args) {
        System.out.print("sumar: \t");
        if (Ejercicios.sumar(5, 4) == 9 && Ejercicios.sumar(2, 1) == 3) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.print("restar: \t");
        if (Ejercicios.restar(2, 1) == 1 && Ejercicios.restar(6, 3) == 3) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.print("multiplicar: \t");
        if (Ejercicios.multiplicar(2, 2) == 4 && Ejercicios.multiplicar(5, 3) == 15) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.print("residuo: \t");
        if (Ejercicios.residuo(4, 3) == 1 && Ejercicios.residuo(17, 5) == 2) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.print("esPar: \t");
        if (Ejercicios.esPar(4) == true && Ejercicios.esPar(9) == false) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.print("esMultiploDe3: \t");
        if (Ejercicios.esMultiploDe3(4) == false && Ejercicios.esMultiploDe3(9) == true) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.print("getMayor: \t");
        if (Ejercicios.getMayor(4, 2) == 4 && Ejercicios.getMayor(1, 9) == 9) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.print("esMayorDeEdad: \t");
        if (Ejercicios.esMayorDeEdad(12) == false && Ejercicios.esMayorDeEdad(19) == true && Ejercicios.esMayorDeEdad(18) == true) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.print("sonPares: \t");
        if (Ejercicios.sonPares(1, 3, 4) == false && Ejercicios.sonPares(2, 6, 8) == true && Ejercicios.sonPares(11, 6, 8) == false && Ejercicios.sonPares(2, 10, 100) == true) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

        System.out.print("getMayorDe3: \t");
        if (Ejercicios.getMayorDe3(12, 5, 2) == 12 && Ejercicios.getMayorDe3(5, 19, 1) == 19 && Ejercicios.getMayorDe3(1, 4, 18) == 18) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
