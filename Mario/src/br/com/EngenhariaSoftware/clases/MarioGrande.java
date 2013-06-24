/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.EngenhariaSoftware.clases;

import br.com.EngenhariaSoftware.interfaces.state.MarioState;

class MarioGrande implements MarioState {

    public MarioGrande() {
    }

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
        System.out.println("Mario com capa");
        return new MarioCapa();
    }

    @Override
    public MarioState levarDano() {
        System.out.println("Mario pequeno");
        return new MarioPequeno();
    }
    
}
