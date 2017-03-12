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
    int Turno=0;
    public char DefinirFicha(){
        if (Turno%2==0 && Turno<10){
            Ficha='O';
            Turno ++;
        }else{
            if (Turno%2!=0) {
            } else {
                Ficha='X';
                Turno ++;
            }
        }
       return Ficha;
    }   
}
