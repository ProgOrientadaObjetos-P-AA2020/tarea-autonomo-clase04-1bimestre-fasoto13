/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodotostring;

/**
 *
 * @author 59399
 */
public class AdultosMayores {

    private String nombre; // atributo en donde se almacenara el nombre del adulto
    // mayor
    private String apellido; // atributo en donde se almacenara el apellido del 
    // adulto mayor
    private String cedula; // atributo en donde se almacenara la cedula del adulto
    // mayor
    private int edad; // atributo en donde se almacenara la edad del adulto
    // mayor
    private int anioNacimiento; // atributo en donde se almacenara el anio de 
    // nacimiento  del adulto mayor

    public AdultosMayores(String n, String a, String c, int e, int an) {
        // constructor en el cual se asignaran valores a los atributos del objeto

        nombre = n;
        apellido = a;
        cedula = c;
        edad = e;
        anioNacimiento = an;

    }

    public String toString() {

        // uso del metodo toString() para la creacion del reporte solicitado
        String reporte = "Nombre: " + nombre + "\n" + "Apellido: " + apellido
                + "\n" + "Cedula: " + cedula + "\n" + "Edad: " + edad + "\n"
                + "Año Nacimiento: " + anioNacimiento + "\n" + "*****************";

        return reporte;
    }

}
