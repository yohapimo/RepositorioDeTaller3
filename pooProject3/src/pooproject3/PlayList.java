/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooproject3;

/**
 *
 * @author yohapimo
 */
public class PlayList implements Comparable<PlayList> {

    public int id;
    public String titulo;
    public String genero;
    public String fecha;
    public double duracion;
    public String caratula;
    public String descripcion;

    public PlayList(int id, String titulo, String genero, String fecha, double duracion, String caratula, String descripcion) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.fecha = fecha;
        this.duracion = duracion;
        this.caratula = caratula;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getCaratula() {
        return caratula;
    }

    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /*
    Metodo to string
     */
    @Override
    public String toString() {
        return "PlayList{" + "id" + id + ", titulo=" + titulo + ", genero=" + genero + ", fecha=" + fecha + ", duracion=" + duracion + ", caratula=" + caratula + ", descripcion=" + descripcion + '}' + "\n";
    }

    @Override
    public int compareTo(PlayList t) {
        return fecha.compareTo(t.getFecha());

    }

}
