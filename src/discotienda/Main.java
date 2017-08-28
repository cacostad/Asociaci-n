/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discotienda;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        DiscoTienda tienda = new DiscoTienda("xx", 1234);
        Scanner in = new Scanner(System.in);
        int continuar = 1, opcion = 0;
        do{
            System.out.println("1. Crear Disco");
            System.out.println("2. Crear Cancion");
            System.out.println("3. Informacion cancion");
            opcion = in.nextInt();
            if(opcion == 1){
                System.out.println("Ingrese el nombre del Disco");
                String nombre = in.next();
                System.out.println("Ingrese el nombre del artista");
                String artista = in.next();
                boolean resultado = tienda.agregarDisco(nombre, artista);
                if(resultado == true){
                    System.out.println("Se ha creado satisfactoriamente el disco");
                }else{
                    System.out.println("Problemas en la creacion del disco");
                }
            }else if(opcion == 2){
                System.out.println("Nombre del Disco");
                Disco[] discos = tienda.getDiscos();
                for (int i = 0; i < tienda.getCantidadDiscos(); i++) {
                    System.out.println(discos[i].getNombre());
                }
                String nombreDisco = in.next();
                System.out.println("Ingrese los datos de la cancion");
                System.out.println("Nombre");
                String nombreCancion = in.next();
                System.out.println("Precio");
                double precio = in.nextDouble();
                System.out.println("Duracion");
                float duracion = in.nextFloat();
                System.out.println("Tamanio");
                float tamanio = in.nextFloat();
                System.out.println("Calidad");
                float calidad = in.nextFloat();
                boolean  resultado = tienda.agregarCancionDisco(nombreDisco, nombreCancion, precio, duracion, tamanio, calidad);
                if(resultado == true){
                    System.out.println("Se creo la cancion satisfactoriamente");
                }else{
                    System.out.println("La Cancion no puede ser agregado al disco especificado");
                }
            }else if(opcion == 3){
                
            }else{
                System.out.println("Opcion invalida");
            }
        
        }while(continuar == 1);
    
    }
}
