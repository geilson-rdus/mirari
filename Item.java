/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mirari;

/**
 *
 * @author alunolab10
 */
public class Item {
    private String nome;
    private int valor;
    private String descricao;
    private String status;
    private int qtdVendida;
    
    public Item(String nome, int valor, String descricao){
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.status = "Disponivel";
        this.qtdVendida = 0;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public String getStatus(){
        return this.status;
    }
    
    public void itemVendido(){
        this.status = "Vendido";
    }
    
    public int getQtd(){
        return this.qtdVendida;
    }
    
    public void contador(){
        this.qtdVendida ++;
    }
}