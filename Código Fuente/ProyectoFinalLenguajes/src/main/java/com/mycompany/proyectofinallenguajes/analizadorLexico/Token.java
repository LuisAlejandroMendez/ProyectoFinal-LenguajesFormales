package com.mycompany.proyectofinallenguajes.analizadorLexico;

/**
 *
 * @author Luis
 */
public class Token {
    
    private String texto; private String tipo;
    private int fila; private int columna;

    //Constructor
    public Token(String texto, String tipo, int fila, int columna) {
        this.texto = texto;
        this.tipo = tipo;
        this.fila = fila;
        this.columna = columna;
    }

    //Getters y Setters
    public String getTexto() {
        return texto;
    }

    public String getTipo() {
        return tipo;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
}
