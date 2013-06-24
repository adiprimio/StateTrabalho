/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.EngenhariaSoftware.clases;

import br.com.EngenhariaSoftware.interfaces.state.MarioState;

public class MarioCapa implements MarioState {
 
    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }
 
    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario com fogo");
        return new MarioFogo();
    }
 
    @Override
    public MarioState pegarPena() {
        System.out.println("Mario ganhou 1000 pontos");
        return this;
    }
 
    @Override
    public MarioState levarDano() {
        System.out.println("Mario grande");
        return new MarioGrande();
    }
 
}
