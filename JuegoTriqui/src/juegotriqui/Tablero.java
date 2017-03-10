/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegotriqui;

/**
 *
 * @author Estudiantes
 */
public class Tablero {
    char Ficha;
    int Turno;
    public char DefinirFicha(int Turno){
        if (Turno%2==0){
            Ficha='O';
        }else{
            if (Turno%2==0) {
            } else {
                Ficha='X';
            }
        }
       return Ficha;
    }   
}
