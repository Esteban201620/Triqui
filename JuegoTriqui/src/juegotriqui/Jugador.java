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
public class Jugador {
    char Jugador1;
    char Jugador2;
    int miTurno=0;
    Tablero mitablero;
    Tablero mificha;
    public void Jugar(){
        if (miTurno%2==0 && miTurno<10){
            mificha.FichaO=Jugador1;
        }else{
            if (miTurno%2!=0 && miTurno<10){
                mificha.FichaX=Jugador2;
           }   
        }  
    }
}

