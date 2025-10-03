/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mirari;

/**
 *
 * @author Augusto Luiz Marim e Geilson Lucas de Souza Silva - CC3M
 */

import java.util.ArrayList;

public class Personagem {
    private String nome;
    private int vida;
    private int vidaMaxima;
    private int ataque;
    private int ataqueMaximo;
    private int mana;
    private int manaMaxima;
    private int dinheiro;
    private int nivel;
    private int velocidade;
    private int pocao;
    private int pocaoMana;
    private ArrayList<Habilidade> habilidades = new ArrayList<>();
    
    public Personagem(String nome, int vida, int ataque, int mana, int velocidade, Habilidade h1, Habilidade h2){
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.ataque = ataque;
        this.ataqueMaximo = ataque;
        this.mana = mana;
        this.manaMaxima = mana;
        this.dinheiro = 0;
        this.velocidade = velocidade;
        this.nivel = 1;
        this.pocao = 1;
        this.pocaoMana = 1;
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
    
    public int getAtaqueMaximo(){
        return this.ataqueMaximo;
    }
    
    public void setAtaqueMaximo(){
        this.ataqueMaximo += 10;
    }
    
    public void kenai(String nome){
        if(nome.equals("Kenai Treeclubs")){
            this.ataque = this.ataqueMaximo;
        }
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
    
    public void setVelocidade(){
        this.velocidade += 10;
    }
    
    public int getPocao(){
        return this.pocao;
    }
    
    public void setPocao(){
        this.pocao ++;
    }
    
    public void usarVida(){
        this.pocao --;
    }
    
    public int getPocaoMana(){
        return this.pocaoMana;
    }
    
    public void setPocaoMana(){
        this.pocaoMana ++;
    }
    
    public void usarMana(){
        this.pocaoMana --;
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
    
    public void setNivel(){
        this.nivel ++;
        this.setAtaque();
        this.setVidaMaxima();
        this.setManaMaxima();
        this.setVelocidade();
        this.getHabilidades().get(0).setDano();
        this.getHabilidades().get(1).setDano();
        switch(this.nivel){
            case 4:
                switch(this.nome){
                    case "Thomas Holycups":
                        this.getHabilidades().get(0).setNome("Chama Congelante");
                        this.getHabilidades().get(1).setNome("Clarão Divino");
                        this.getHabilidades().get(0).setDescricao("Dano - Causa queimadura por 3 turnos");
                        this.getHabilidades().get(1).setDescricao("Dano - Causa cegueira por 3 turnos");
                        break;
                    case "Kenai Treeclubs":
                        this.getHabilidades().get(0).setNome("Chuva de Dardos");
                        this.getHabilidades().get(1).setNome("Fúria Bestial");
                        this.getHabilidades().get(0).setDescricao("Dano - Causa envenenamento por 3 turnos");
                        this.getHabilidades().get(1).setDescricao("Aprimoramento - Aumenta o ataque");
                        break;
                    case "Melissa Goldwharf":
                        this.getHabilidades().get(0).setNome("Investida das Marés");
                        this.getHabilidades().get(1).setNome("Benção das Pêrolas");
                        this.getHabilidades().get(0).setDescricao("Dano - Diminui o ataque do inimigo em 3 turnos");
                        this.getHabilidades().get(1).setDescricao("Dano - Aumenta o ouro recebido de inimigos");
                        break;
                    case "Cassandra Snowblade":
                        this.getHabilidades().get(0).setNome("Tumba Congelante");
                        this.getHabilidades().get(1).setNome("Benção da Aurora");
                        this.getHabilidades().get(0).setDescricao("Dano -  Congela Inimigos por 3 turnos");
                        this.getHabilidades().get(1).setDescricao("Dano - Ataca três vezes");
                        break;
                }
                break;
            case 7:
                switch(this.nome){
                    case "Thomas Holycups":
                        this.getHabilidades().get(0).setNome("Trindade Elemental");
                        this.getHabilidades().get(1).setNome("Juízo Solar");
                        this.getHabilidades().get(0).setDescricao("Dano - Causa queimadura 2 turnos");
                        this.getHabilidades().get(1).setDescricao("Dano - Causa cegueira por 4 turnos");
                        break;
                    case "Kenai Treeclubs":
                        this.getHabilidades().get(0).setNome("Sussuro da Serpente");
                        this.getHabilidades().get(1).setNome("Alma Primordial");
                        this.getHabilidades().get(0).setDescricao("Dano - Causa envenenamento por 4 turnos");
                        this.getHabilidades().get(1).setDescricao("Aprimoramento - Aumenta o ataque");
                        break;
                    case "Melissa Goldwharf":
                        this.getHabilidades().get(0).setNome("Corsário Imperial");
                        this.getHabilidades().get(1).setNome("Toque de Midas");
                        this.getHabilidades().get(0).setDescricao("Dano - Diminui o ataque do inimigo em 4 turnos");
                        this.getHabilidades().get(1).setDescricao("Dano - Aumenta o ouro recebido de inimigos");
                        break;
                    case "Cassandra Snowblade":
                        this.getHabilidades().get(0).setNome("Grilhões da Geada");
                        this.getHabilidades().get(1).setNome("Sussuro Enevoado");
                        this.getHabilidades().get(0).setDescricao("Dano -  Congela Inimigos por 4 turnos");
                        this.getHabilidades().get(1).setDescricao("Dano - Ataca quatro vezes");
                        break;
                }
                break;
            case 10:
                switch(this.nome){
                    case "Thomas Holycups":
                        this.getHabilidades().get(0).setNome("Sinfonia do Éter");
                        this.getHabilidades().get(1).setNome("Centelha Final");
                        this.getHabilidades().get(0).setDescricao("Dano - Causa queimadura por 3 turnos");
                        this.getHabilidades().get(1).setDescricao("Dano - Causa cegueira por 5 turnos");
                        break;
                    case "Kenai Treeclubs":
                        this.getHabilidades().get(0).setNome("Pragas da Floresta");
                        this.getHabilidades().get(1).setNome("Avatar Selvagem");
                        this.getHabilidades().get(0).setDescricao("Dano - Causa envenenamento por 5 turnos");
                        this.getHabilidades().get(1).setDescricao("Aprimoramento - Aumenta o ataque");
                        break;
                    case "Melissa Goldwharf":
                        this.getHabilidades().get(0).setNome("Redemoinho Abissal");
                        this.getHabilidades().get(1).setNome("Fortuna dos Ouros");
                        this.getHabilidades().get(0).setDescricao("Dano - Diminui o ataque do inimigo em 5 turnos");
                        this.getHabilidades().get(1).setDescricao("Dano - Aumenta o ouro recebido de inimigos");
                        break;
                    case "Cassandra Snowblade":
                        this.getHabilidades().get(0).setNome("Palácio de Cristal");
                        this.getHabilidades().get(1).setNome("Reflexo do Crepúsculo");
                        this.getHabilidades().get(0).setDescricao("Dano -  Congela Inimigos por 5 turnos");
                        this.getHabilidades().get(1).setDescricao("Dano - Ataca cinco vezes");
                        break;
                }
                break;
        }       
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
    
    public void setDinheiro(int dinheiro){
        this.dinheiro += dinheiro;
    }
    
}



