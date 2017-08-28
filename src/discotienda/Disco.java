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
public class Disco {
    private String nombre;
    private String artista;
    private Cancion[] canciones;
    private int numeroCanciones;

    public Disco(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
        this.canciones = new Cancion[15];
        this.numeroCanciones = 0;
    }
    public boolean agregarCancion
        (String nombre, double precio, float duracion, float tamanio, float calidad){
      Cancion cancion = new Cancion(nombre, precio, duracion, tamanio, calidad);
      if(this.numeroCanciones < 15){
         this.canciones[this.numeroCanciones] = cancion;
         this.numeroCanciones++;
         return true;
      }else 
          return false;
    }
    
    public Cancion darInformacionCancion(String nombreCancion){
         Cancion cancion = null;
         for (int i = 0; i < this.numeroCanciones; i++) {
           if(this.canciones[i].getNombre().equals(nombreCancion)){
              cancion = this.canciones[i];
              break;
           }   
         }
        return cancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Cancion[] getCanciones() {
        return canciones;
    }

    public void setCanciones(Cancion[] canciones) {
        this.canciones = canciones;
    }
    
    
}
