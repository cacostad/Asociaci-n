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
public class DiscoTienda {
    private String nombre;
    private int nit;
    private Disco[] discos;
    private int cantidadDiscos;

    public DiscoTienda(String nombre, int nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.discos = new Disco[20];
        this.cantidadDiscos=0;
    }
    
    public boolean agregarCancionDisco
        (String nombreDisco,String nombre, double precio, 
                float duracion, float tamanio, float calidad){
        boolean resultado = false;
        for (int i = 0; i < this.cantidadDiscos; i++) {
            if(this.discos[i].getNombre().equals(nombreDisco)){
              resultado = this.discos[i].agregarCancion(nombre, precio, duracion, tamanio, calidad);
              break;
            }
        }
       return resultado;
    }
    public boolean agregarDisco(String nombre, String artista){
       Disco disco = new Disco(nombre, artista);
       if(this.cantidadDiscos < 20){
         this.discos[this.cantidadDiscos] = disco;
         this.cantidadDiscos++;
         return true;
       }else{
         return false;
       }
    }
    
    public Cancion darInformacionCancion(String nombreDisco, String nombreCancion){
        Cancion cancion = null;
        for (int i = 0; i < this.cantidadDiscos; i++) {
            if(this.discos[i].getNombre().equals(nombreDisco)){
              cancion= this.discos[i].darInformacionCancion(nombreCancion);
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

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Disco[] getDiscos() {
        return discos;
    }

    public void setDiscos(Disco[] discos) {
        this.discos = discos;
    }

    public int getCantidadDiscos() {
        return cantidadDiscos;
    }

    public void setCantidadDiscos(int cantidadDiscos) {
        this.cantidadDiscos = cantidadDiscos;
    }
    
     
}
