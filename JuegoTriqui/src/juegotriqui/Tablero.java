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
    //int Turno=0;
    //char FichaO;
    char FichaXO;
    Grafico turnoGráfico;
    int miTurno=0;
    void Turno(){
        turnoGráfico.Turno=miTurno;
    }
    //Jugador miJugador1, miJugador2;
    char Fichas[]= new char[9];
    /*public void Definirturno(){
      *  miJugador.miTurno=Turno;
    }*/
    public void DefinirFicha(){
        if (miTurno%2==0 && miTurno<10){
            FichaXO=Fichas[miTurno]='O';
        }else{
            if (miTurno%2!=0 && miTurno<10) {
                FichaXO=Fichas[miTurno]='X';
                
            }
        }
    }   
}
