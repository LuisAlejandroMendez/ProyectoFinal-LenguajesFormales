/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectofinallenguajes.analizadorLexico;

/**
 *
 * @author Luis
 */
public enum Caracter {
    //Simbolos
    IGUAL('='), MENORQUE('<'), MAYORQUE('>'),
    //Operaciones Matematicas
    SUMA('+'), RESTA('-'), MULTIPLICACION('*'), DIVISION('/'), MODULO('%'),
    //¨Puntuacion
    PUNTO('.'), COMA(','), PUNTO_COMA(';'), DOS_PUNTOS(':'),
    //Agrupacion
    CORCHETE_IZQUIERDO('['), CORCHETE_DERECHO(']'), PARENTESIS_IZQUIERDO('('), PARENTESIS_DERECHO(')'),
    LLAVE_IZQUIERDA('{'), LLAVE_DERECHA('}'),
    //Para Caracter
    COMILLA_SIMPLE('\'');
    
    char tipo;
    
    //Metodo Get Tipo de Caracter
    private Caracter(char tipo) {
        this.tipo = tipo;
    }

    public char getTipo() {
        return this.tipo;
    }
}
