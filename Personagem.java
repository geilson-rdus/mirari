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
    private int vidaMaxima;
    private int defesa;
    private int ataque;
    private int mana;
    private int dinheiro;
    private int nivel;
    private int velocidade;
    private ArrayList<Habilidade> habilidades = new ArrayList<>();
    
    public Personagem(String nome, int vida, int defesa, int ataque, int mana, int dinheiro, int velocidade, Habilidade h1, Habilidade h2){
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.defesa = defesa;
        this.ataque = ataque;
        this.mana = mana;
        this.dinheiro = dinheiro;
        this.velocidade = velocidade;
        this.nivel = 1;
        habilidades.add(h1);
        habilidades.add(h2);
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
    
    public void gastaDinheiro(int dim){
        if(this.dinheiro >= dim){
            this.dinheiro -= dim;
        }
    }
    
}


