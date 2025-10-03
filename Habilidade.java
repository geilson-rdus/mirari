/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mirari;

/**
 *
 * @author Augusto Luiz Marim e Geilson Lucas de Souza Silva - CC3M
 */
public class Habilidade {
    private String nome;
    private String descricao;
    private int dano;
    private int custo;
    
    public Habilidade(String nome, String descricao, int dano, int custo){
        this.nome = nome;
        this.descricao = descricao;
        this.dano = dano;
        this.custo = custo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public int getDano(){
        return dano;
    }
    
    public int getCusto(){
        return custo;
    }

    public void setDano(){
        this.dano += 5;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
}




