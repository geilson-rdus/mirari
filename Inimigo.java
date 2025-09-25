/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mirari;

/**
 *
 * @author alunolab10
 */
public class Inimigo {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private int velocidade;
    private int dinheiro;
    
    public Inimigo(String nome, int vida, int ataque, int defesa, int velocidade, int dinheiro){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.velocidade = velocidade;
        this.dinheiro = dinheiro;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getVida(){
        return vida;
    }
    
    public int getAtaque(){
        return ataque;
    }
    
    public int getDefesa(){
        return defesa;
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public int getDinheiro(){
        return dinheiro;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
}
