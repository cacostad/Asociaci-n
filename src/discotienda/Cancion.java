/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

/**
 *
 * @author Estudiante
 */
public class Cancion {
    private String nombre;
    private double precio;
    private float duracion;
    private float tamanio;
    private float calidad;

    public Cancion(String nombre, double precio, float duracion, float tamanio, float calidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.duracion = duracion;
        this.tamanio = tamanio;
        this.calidad = calidad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public float getCalidad() {
        return calidad;
    }

    public void setCalidad(float calidad) {
        this.calidad = calidad;
    }
    
    
 }
