/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodotostring;

import java.util.Scanner;

/**
 *
 * @author 59399
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nos ayudara al ingreso de datos por teclado

        String nombre; // almacenara el nombre de los adultos mayores
        String apellido; // almacenara el apellido de los adultos mayores
        String cedula; // almacenara la cedula de los adultos mayores
        int edad; // almacenara la edad de los adultos mayores
        int anioNacimiento; // almanecenara el anio de nacimiento de los 
        // adultos mayores

        System.out.println("Ingrese el nombre del adulto mayor:");
        nombre = sc.nextLine(); // se ingresara el nombre del adulto mayor
        // por teclado
        System.out.println("Ingrese el apellido del adulto mayor:");
        apellido = sc.nextLine(); // se ingresara el apellido del adulto mayor
        // por teclado
        System.out.println("Ingrese la cedula del adulto mayor:");
        cedula = sc.nextLine(); // se ingresara el apellidp del adulto mayor
        // por teclado
        System.out.println("Ingrese la edad del adulto mayor");
        edad = sc.nextInt(); // se ingresara el apellido del adulto mayor
        // por teclado
        System.out.println("Ingrese el año de nacimiento:");
        anioNacimiento = sc.nextInt(); // se ingresara el año de nacimiento 
        // del adulto mayor por teclado

        sc.nextLine(); // limpia el buffer

        AdultosMayores aM = new AdultosMayores(nombre, apellido, cedula, edad,
                anioNacimiento); // creacion de un objeto

        // System.out.println(aM.toString());
        String nombre2; // almacenara el nombre de los adultos mayores
        String apellido2; // almacenara el apellido de los adultos mayores
        String cedula2; // almacenara la cedula de los adultos mayores
        int edad2; // almacenara la edad de los adultos mayores
        int anioNacimiento2; // almanecenara el anio de nacimiento de los 
        // adultos mayores

        System.out.println("Ingrese el nombre del adulto mayor:");
        nombre2 = sc.nextLine(); // se ingresara el nombre del adulto mayor
        // por teclado
        System.out.println("Ingrese el apellido del adulto mayor:");
        apellido2 = sc.nextLine(); // se ingresara el apellido del adulto mayor
        // por teclado
        System.out.println("Ingrese la cedula del adulto mayor:");
        cedula2 = sc.nextLine(); // se ingresara la cedula del adulto mayor
        // por teclado
        System.out.println("Ingrese la edad del adulto mayor");
        edad2 = sc.nextInt(); // se ingresara la edad del adulto mayor
        // por teclado
        System.out.println("Ingrese el año de nacimiento:");
        anioNacimiento2 = sc.nextInt(); // se ingresara el año de nacimiento 
        // del adulto mayor por teclado

        sc.nextLine(); // limpia el buffer

        AdultosMayores aM2 = new AdultosMayores(nombre2, apellido2, cedula2, edad2,
                anioNacimiento2); // creacion de un objeto

        System.out.println(aM.toString()); // presentaran el reporte solicitado
        System.out.println(aM2.toString());

    }

}
