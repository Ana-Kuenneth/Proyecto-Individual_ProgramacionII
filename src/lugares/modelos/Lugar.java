/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lugares.modelos;

/**
 *
 * @author estudiante
 */
public class Lugar {
    private String nombre;

    //Constructor
    public Lugar(String nombre) {
        this.nombre = nombre;
    }

    //Metodos get/set
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    public void mostrar(){
        System.out.println("Lugar: "+this.nombre);
    }
    //toString
}
