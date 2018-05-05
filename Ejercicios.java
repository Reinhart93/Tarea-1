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
public class Ejercicios {

    static int sumar(int x, int y) {
        return x+y;
    }

    static int restar(int x, int y) {
        int res=x-y;
        return res;
    }

    static int multiplicar(int x, int y) {
        return x*y;
    }

    static int residuo(int x, int y) {
        int residuo=x%y;
        return residuo;
    }

    static boolean esPar(int x) {
        boolean respuesta;
        if(x%2==0) 
            respuesta = true;                 
        else 
            respuesta = false;
        
        return respuesta;
    }

    static boolean esMultiploDe3(int x) {
        boolean respuesta;
        if(x%3==0)
            respuesta = true;
        else
            respuesta = false;
        return respuesta;
    }

    static int getMayor(int x, int y) {
        int mayor;
        if(x>y)
            mayor = x;
        else
            mayor = y;
        return mayor;
    }

    static boolean esMayorDeEdad(int edad) {
        boolean respuesta;
        if(edad>=18)
            respuesta = true;
        else
            respuesta = false;
        return respuesta;
    }

    static boolean sonPares(int x, int y, int z) {
        boolean respuesta;
        if((x%2==0) && (y%2==0) && (z%2==0))
            respuesta = true;
        else
            respuesta = false;
        return respuesta;
    }

    static int getMayorDe3(int x, int y, int z) {
        int respuesta;
        if(x>y && x>z) {
            return x;          
        }
        respuesta = x;
        if(y>x && y>z) {
            return y;
        } 
        respuesta = y;
        if(z>x && z>y) {
            return z;
        }
        respuesta = z;
            
                    
        return respuesta;
    }

}
