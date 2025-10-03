/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mirari;

/**
 *
 * @author Augusto Luiz Marim e Geilson Lucas de Souza Silva - CC3M
 */
public class Inimigo {
    private String nome;
    private int vida;
    private int ataque;
    private int velocidade;
    private int ataqueMaximo;
    private int dinheiro;
    private int vidaMaxima;
    private boolean fogo;
    private boolean gelo;
    private boolean veneno;
    private boolean luz;
    private int debuff;
    private int debuff2;
    private boolean fraco;
    
    public Inimigo(String nome, int vida, int ataque, int velocidade, int dinheiro){
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.ataqueMaximo = ataque;
        this.velocidade = velocidade;
        this.dinheiro = dinheiro;
        this.vidaMaxima = vida;
        this.fogo = false;
        this.gelo = false;
        this.veneno = false;
        this.luz = false;
        this.fraco = false;
        this.debuff = 0;
        this.debuff2 = 0;
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
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public void setAtaque(){
        this.ataque -= 5;
        if(this.ataque < 5){
            this.ataque = 5;
        }
    }
    
    public int getAtaqueMaximo(){
        return this.ataqueMaximo;
    }
    
    
    
    public int getDinheiro(){
        return dinheiro;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public int getVidaMaxima(){
        return vidaMaxima;
    }
    
    public void setDinheiro(int a){
        switch(a){
            case 1:
                this.dinheiro  = (int) (this.dinheiro * 1.25);
                break;
            case 2:
                this.dinheiro  = (int) (this.dinheiro * 1.50);
                break;
            case 3:
                this.dinheiro  = (int) (this.dinheiro * 1.75);
                break;
            case 4:
                this.dinheiro  = (int) (this.dinheiro * 2);
                break;
        }    
    }
    
    public int getDebuff(){
        return this.debuff;
    }
    
    public void setDebuff(int debuff){
        this.debuff = debuff;    
    }
    
    public int getDebuff2(){
        return this.debuff2;
    }
    
    public void setDebuff2(int debuff2){
        this.debuff2 = debuff2;    
    }

    public void setFogo(boolean fogo){
        this.fogo = fogo;
    }

    public void setGelo(boolean gelo){
        this.gelo = gelo;
    }

    public void setVeneno(boolean veneno){
        this.veneno = veneno;
    }

    public void setLuz(boolean luz){
        this.luz = luz;
    }
    
    public void setFraco(boolean fraco){
        this.fraco = fraco;
    }

    public boolean getGelo() {
        return gelo;
    }

    public boolean getFogo(){
        return fogo;
    }

    public boolean getVeneno() {
        return veneno;
    }

    public boolean getLuz(){
        return luz;
    }
    
    public boolean getFraco(){
        return fraco;
    }
    
    public void resetarAtaque(){
        this.ataque = ataqueMaximo;
        System.out.println("O ataque de " + getNome() + "voltou ao normal\n");
    }
    
    public void curaVeneno(){
        this.veneno = false;
        System.out.println(getNome() + " se recuperou do envenenamento\n");
    }
    
    public void curaCegueira(){
        this.luz = false;
        System.out.println(getNome() + " se recuperou da cegueira\n");
    }
    
    public void curaGelo(){
        this.gelo = false;
        System.out.println(getNome() + " se recuperou do congelamento\n");
    }
    
    public void curaFogo(){
        this.fogo = false;
        System.out.println(getNome() + " se recuperou da queimadura\n");
    }
}

