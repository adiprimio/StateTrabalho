/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.EngenhariaSoftware.interfaces.state;


public interface MarioState {
    MarioState pegarCogumelo();
 
    MarioState pegarFlor();
 
    MarioState pegarPena();
 
    MarioState levarDano();
}
