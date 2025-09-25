/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mirari;

/**
 *
 * @author alunolab10
 */

import java.util.ArrayList;

public class Personagem {
    private String nome;
    private int vida;
    private int defesa;
    private int ataque;
    private int mana;
    private int dinheiro;
    private int nivel;
    private ArrayList<Habilidades> habilidades;
    
    public Personagem(String nome, int vida, int defesa, int ataque, int mana, int dinheiro){
        this.nome = nome;
        this.vida = vida;
        this.defesa = defesa;
        this.ataque = ataque;
        this.mana = mana;
        this.dinheiro = dinheiro;
        this.nivel = 1;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getVida(){
        return this.vida;
    }
    
    public int getDefesa(){
        return this.defesa;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public int getMana(){
        return this.mana;
    }
    
    public int getDinheiro(){
        return this.dinheiro;
    }
    
    public int getNivel(){
        return this.nivel;
    }
    
}


