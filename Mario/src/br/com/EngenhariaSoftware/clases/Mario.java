/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.EngenhariaSoftware.clases;

import br.com.EngenhariaSoftware.interfaces.state.MarioState;

public class Mario {
    protected MarioState estado;
     
    public Mario() {
        estado = new MarioPequeno();
    }
 
    public void pegarCogumelo() {
        estado = estado.pegarCogumelo();
    }
 
    public void pegarFlor() {
        estado = estado.pegarFlor();
    }
 
    public void pegarPena() {
        estado = estado.pegarPena();
    }
 
    public void levarDano() {
        estado = estado.levarDano();
    }
}
