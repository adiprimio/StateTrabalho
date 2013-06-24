/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.EngenhariaSoftware.clases;

import br.com.EngenhariaSoftware.interfaces.state.MarioState;

public class MarioPequeno implements MarioState {
 
    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario grande");
        return new MarioGrande();
    }
 
    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario grande com fogo");
        return new MarioFogo();
    }
 
    @Override
    public MarioState pegarPena() {
        System.out.println("Mario grande com capa");
        return new MarioCapa();
    }
 
    @Override
    public MarioState levarDano() {
        System.out.println("Mario morto");
        return this;
    }
 
}
