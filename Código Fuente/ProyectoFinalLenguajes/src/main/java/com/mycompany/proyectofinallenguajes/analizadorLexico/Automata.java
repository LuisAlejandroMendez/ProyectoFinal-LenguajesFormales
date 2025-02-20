package com.mycompany.proyectofinallenguajes.analizadorLexico;

import com.mycompany.proyectofinallenguajes.jframes.JFrameReportes;
import com.mycompany.proyectofinallenguajes.jframes.JFramePrincipal;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class Automata {

    private JTextArea textoEntrada;
    private int[][] AutomataMatriz;
    private final int[] ESTADOS_ACEPTACION = {2, 3, 10, 11};
    private String[] lineas;
    private String[] palabras;
    private int fila = 1;
    private int columna = 1;
    private int estadoActual = 0;
    private ArrayList<Token> tokens = new ArrayList<>();
    private ArrayList<Error> errores = new ArrayList<>();
    private Tipo[] tipos = Tipo.values();
    private PalabrasReservadas[] reservadas = PalabrasReservadas.values();

    public Automata(JTextArea textoEntrada) {
        this.textoEntrada = textoEntrada;
        inicializarMatriz();
        estadoActual = 0;
    }

    private void inicializarMatriz() {
        int filas = 11;
        int columnas = 7;
        AutomataMatriz = new int[filas][columnas];

        //Transiciones/Posiciones del Automata
        //A=1 B=2 C=3 D=4 E=5 F=6 G=7 H=8 I=9 J=10 K=11 
        //Error=-1 Revisar Practica 1 anterior para recordar Estados de Aceptacion
        
        AutomataMatriz[0][0] = 2;
        AutomataMatriz[0][1] = 3;
        AutomataMatriz[0][2] = 4;
        AutomataMatriz[0][3] = 6;
        AutomataMatriz[0][4] = 11;
        AutomataMatriz[0][5] = 5;
        AutomataMatriz[0][6] = 2;

        AutomataMatriz[1][0] = 2;
        AutomataMatriz[1][1] = 2;
        AutomataMatriz[1][2] = -1;
        AutomataMatriz[1][3] = -1;
        AutomataMatriz[1][4] = -1;
        AutomataMatriz[1][5] = 2;
        AutomataMatriz[1][6] = 2;

        AutomataMatriz[2][0] = -1;
        AutomataMatriz[2][1] = 3;
        AutomataMatriz[2][2] = -1;
        AutomataMatriz[2][3] = -1;
        AutomataMatriz[2][4] = -1;
        AutomataMatriz[2][5] = -1;
        AutomataMatriz[2][6] = -1;

        AutomataMatriz[3][0] = 7;
        AutomataMatriz[3][1] = 7;
        AutomataMatriz[3][2] = -1;
        AutomataMatriz[3][3] = 7;
        AutomataMatriz[3][4] = 7;
        AutomataMatriz[3][5] = 7;
        AutomataMatriz[3][6] = 7;

        AutomataMatriz[4][0] = -1;
        AutomataMatriz[4][1] = 3;
        AutomataMatriz[4][2] = -1;
        AutomataMatriz[4][3] = -1;
        AutomataMatriz[4][4] = -1;
        AutomataMatriz[4][5] = -1;
        AutomataMatriz[4][6] = -1;

        AutomataMatriz[5][0] = -1;
        AutomataMatriz[5][1] = -1;
        AutomataMatriz[5][2] = -1;
        AutomataMatriz[5][3] = 8;
        AutomataMatriz[5][4] = -1;
        AutomataMatriz[5][5] = -1;
        AutomataMatriz[5][6] = -1;

        AutomataMatriz[6][0] = 7;
        AutomataMatriz[6][1] = 7;
        AutomataMatriz[6][2] = 9;
        AutomataMatriz[6][3] = 7;
        AutomataMatriz[6][4] = 7;
        AutomataMatriz[6][5] = 7;
        AutomataMatriz[6][6] = 7;

        AutomataMatriz[7][0] = 10;
        AutomataMatriz[7][1] = 10;
        AutomataMatriz[7][2] = 10;
        AutomataMatriz[7][3] = 10;
        AutomataMatriz[7][4] = 10;
        AutomataMatriz[7][5] = 10;
        AutomataMatriz[7][6] = 10;

        AutomataMatriz[8][0] = -1;
        AutomataMatriz[8][1] = -1;
        AutomataMatriz[8][2] = -1;
        AutomataMatriz[8][3] = -1;
        AutomataMatriz[8][4] = -1;
        AutomataMatriz[8][5] = -1;
        AutomataMatriz[8][6] = -1;

        AutomataMatriz[9][0] = 10;
        AutomataMatriz[9][1] = 10;
        AutomataMatriz[9][2] = 10;
        AutomataMatriz[9][3] = 10;
        AutomataMatriz[9][4] = 10;
        AutomataMatriz[9][5] = 10;
        AutomataMatriz[9][6] = 10;

        AutomataMatriz[10][0] = -1;
        AutomataMatriz[10][1] = -1;
        AutomataMatriz[10][2] = -1;
        AutomataMatriz[10][3] = -1;
        AutomataMatriz[10][4] = 11;
        AutomataMatriz[10][5] = -1;
        AutomataMatriz[10][6] = -1;
    }

    //Metodo para leer el JTextArea
    public void leerTextArea() {
        char[] caracteres = textoEntrada.getText().toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            //analizarPalbra
            analizarCaracter(caracteres[i]);
            columna++;
            fila++;
        }
    }

    //Analizar caracter por caracter
    private void analizarCaracter(char caracter) {
        
        if (caracter=='\n') { //Salto de linea
            
        }
        else {
            if (caracter==' ') { //espacios
                if (true) {
                }
                else {
                }
            }
            else {
                if (caracter=='\t') { //Salto de tabulacion
                    if (true) {    
                    }
                    else{
                    }
                }
                else{
                    if (caracter=='\r') { //
                        
                    } else {
                    }
                }
            }
        }
    }
    Caracter[] caracterList = Caracter.values(); //Vector que almacena valores de caracteres

    //Metodo para Reportes (Incompleto) tomando de mi Pr[actica 1
    public void reportes() {
        if (errores.isEmpty()) {
            DefaultTableModel model = new DefaultTableModel();
            JFrameReportes.jTableReportes.setModel(model);
            model.addColumn("Token");
            model.addColumn("Lexema");
            model.addColumn("Fila");
            model.addColumn("Columna");
            
            for (Token token : tokens) {
                model.addRow(new Object[]{token.getTipo(), token.getTexto(), token.getFila(), token.getColumna()});
            }
            
            JFramePrincipal.jButtonAnalisisSintactico.setEnabled(true);
            JFramePrincipal.jButtonReportes.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Análisis Léxico Correcto, ningún error econtrando");
        }
        else {
            DefaultTableModel modelo = new DefaultTableModel();
            JFrameReportes.jTableReportes.setModel(modelo);
            modelo.addColumn("Cadena");
            modelo.addColumn("Fila");
            modelo.addColumn("Columna");
            
            for (Error error : errores) {
                modelo.addRow(new Object[]{error.getTexto(), error.getFila(), error.getColumna()});
            }
            JOptionPane.showMessageDialog(null, "" + errores.size() + " errores encontrados");
        }
    }
}
