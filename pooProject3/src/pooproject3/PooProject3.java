/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject3;

import java.util.Scanner;

/**
 *
 * @author yohapimo
 */
public class PooProject3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese codigo de canción: : ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese Titulo de canción: ");
        String titulo = sc.nextLine();

        System.out.print("Ingrese Genero de canción: ");
        String genero = sc.nextLine();

        System.out.print("Ingrese Fecha de cancion: ");
        String fecha = sc.nextLine();

        System.out.print("Ingrese duracion de canción: : ");
        double duracion = Double.parseDouble(sc.nextLine());

//        System.out.print("Ingrese Caratula: ");
//        String caratula = sc.nextLine(); 
//        
        System.out.print("Ingrese breve descripción: ");
        String descripcion = sc.nextLine();

        PlayList1 objPlayList1 = new PlayList1(id, titulo, genero, fecha, duracion, "Caratula disco", descripcion);

        System.out.println("\n");

        System.out.println("Mi play list es: ");
        System.out.println(objPlayList1);
        objPlayList1.crearList();

    }

}
