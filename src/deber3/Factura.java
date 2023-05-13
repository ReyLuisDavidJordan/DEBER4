/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber3;

/**
 *
 * @author Usuario
 */
public class Factura {
    String Nombre;
    int id;

    public Factura() {
    }

    public Factura(String Nombre, int id) {
        this.Nombre = Nombre;
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Factura{" + "Nombre=" + Nombre + ", id=" + id + '}';
    }
    
}
