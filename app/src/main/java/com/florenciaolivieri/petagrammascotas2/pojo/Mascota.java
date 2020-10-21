package com.florenciaolivieri.petagrammascotas2.pojo;

public class Mascota {
    private String nombre;
    private int numeroLikes;
    private int foto;

    public Mascota(int foto, String nombre, int numeroLikes) {
        this.nombre      = nombre;
        this.numeroLikes = numeroLikes;
        this.foto        = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getNumeroLikes() {
        return numeroLikes;
    }

    public void setNumeroLikes(int numeroLikes) {
        this.numeroLikes = numeroLikes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}