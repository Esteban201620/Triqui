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
    char Jugador;
    char Jugador2;
    int miTurno=0;
    Grafico turnoGrafico;
    void Turno(){
        turnoGrafico.Turno=miTurno;
    }
    Tablero mificha;
    public char Jugar(){
        if (miTurno%2==0 && miTurno<10){
            Jugador=mificha.FichaXO;
            return Jugador;
        }else{
            if (miTurno%2!=0 && miTurno<10){
                Jugador=mificha.FichaXO;
                return Jugador;
           }   
        }
        return ' ';
    }
}

