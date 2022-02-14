/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author yohapimo
 */
public class PlayList1 extends PlayList {

    Scanner sc = new Scanner(System.in);

    public PlayList1(int id, String titulo, String genero, String fecha, double duracion, String caratula, String descripcion) {
        super(id, titulo, genero, fecha, duracion, caratula, descripcion);
    }

    public void crearList() throws InputMismatchException {

        PlayList play1 = new PlayList(1, "cTituloCancion1", "ageneroCancion1", "Noviembre 10", 8.2, "caratula 1", " adescripcion1");
        PlayList play2 = new PlayList(2, "aTituloCancion2", "bgeneroCancion2", "Febrero 2", 5, "caratula 2", " bdescripcion2");
        PlayList play3 = new PlayList(3, "bTituloCancion3", "cgeneroCancion3", "Junio 25 1", 7.5, "caratula 3", " cdescripcion3");

        ArrayList<PlayList> playlistas = new ArrayList<PlayList>();

        playlistas.add(play1);
        playlistas.add(play2);
        playlistas.add(play3);

        //Collections.sort(playlistas);  // ascendente
        //Collections.sort(playlistas, Collections.reverseOrder());  // Descendente
        System.out.print("Puedes ordenar la Play List de Rock en español por Fecha: "
                + "\nIngrese 1 para ordenar ascendente! "
                + "\nIngrese 2 para descendente "
                + "\nIngrese 1 o 2 : ");

        int numero = Integer.parseInt(sc.nextLine());
        try {

            if (numero == 1) {
                Collections.sort(playlistas);
            } else if (numero == 2) {
                Collections.sort(playlistas, Collections.reverseOrder());
            }
            else{
                System.out.println("Solo ingresa 1 o 2");
            }
            
        } catch (Exception InException) {
            System.out.println("solo 1 0 2");
        }

        for (PlayList elemento : playlistas) {
            System.out.println(elemento);

        }

    }

}
