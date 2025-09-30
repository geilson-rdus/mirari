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
    private int ataque;
    private int mana;
    private int manaMaxima;
    private int dinheiro;
    private int nivel;
    private int velocidade;
    private int pocao;
    private int pocaoMana;
    private ArrayList<Habilidade> habilidades = new ArrayList<>();
    
    public Personagem(String nome, int vida, int defesa, int ataque, int mana, int dinheiro, int velocidade, Habilidade h1, Habilidade h2){
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.ataque = ataque;
        this.mana = mana;
        this.manaMaxima = mana;
        this.dinheiro = dinheiro;
        this.velocidade = velocidade;
        this.nivel = 1;
        this.pocao = 0;
        habilidades.add(h1);
        habilidades.add(h2);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getVida(){
        return this.vida;
    }
    
    public int getVidaMaxima(){
        return this.vidaMaxima;
    }
    
    public void setVidaMaxima(){
        this.vidaMaxima += 30;
    }
    
    public int getAtaque(){
        return this.ataque;
    }
    
    public void setAtaque(){
        this.ataque += 10;
    }
    
    public int getMana(){
        return this.mana;
    }
    
    public void setMana(int mana){
        this.mana = mana;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    
    public int getPocao(){
        return this.pocao;
    }
    
    public void setPocao(){
        this.pocao ++;
    }
    
    public int getPocaoMana(){
        return this.pocaoMana;
    }
    
    public void setPocaoMana(){
        this.pocaoMana ++;
    }
    
    public int getManaMaxima(){
        return this.manaMaxima;
    }
    
    public void setManaMaxima(){
        this.manaMaxima += 10;
    }
    
    public int getDinheiro(){
        return this.dinheiro;
    }
    
    public int getNivel(){
        return this.nivel;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public ArrayList<Habilidade> getHabilidades() {
        return habilidades;
    }
    
    public void gastaDinheiro(int dim){
        if(this.dinheiro >= dim){
            this.dinheiro -= dim;
        }
    }
    
}


