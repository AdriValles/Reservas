/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservas.dto;

/**
 *
 * @author alumno
 */
public class Reserva {
    String titulo;
    String autor;
    int anoPubli;
    String editorial;

    public Reserva(String titulo, String autor, int anoPubli, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubli = anoPubli;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    
}
