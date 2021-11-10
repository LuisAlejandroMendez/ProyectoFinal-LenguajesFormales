
package com.mycompany.proyectofinallenguajes.analizadorLexico;

/**
 *
 * @author Luis
 */

//Tipos de Token
public enum Tipo {
    IDENTIFICADOR("DECIMAL"),
    ENTERO("ENTERO"),
    LITERAL("LITERAL"),
    COMENTARIO("COMENTARIO"),
    CARACTER("CARACTER"),
    PALABRA_RESERVADA("PALABRA_RESERVADA");
    
    String tipo;
    private Tipo(String tipo){
        this.tipo=tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
}
