/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.EngenhariaSoftware.main;

import br.com.EngenhariaSoftware.clases.Mario;

public class MarioWorld {

    public static void main(String[] args) {
        Mario mario = new Mario();
        
        mario.pegarCogumelo();
        mario.pegarPena();
        mario.levarDano();
        
        mario.pegarFlor();
        mario.pegarFlor();
        mario.levarDano();        
        mario.levarDano();
        
        mario.pegarPena();
        mario.levarDano();
        mario.levarDano();
        mario.levarDano();
    }
}
