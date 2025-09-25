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
import java.util.List;
import java.util.Scanner;

public class Loja {
    ArrayList<Item> itens = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    
    public void adicionaItem(Item i){
        itens.add(i);
    }
    
    public int comprarItem(int dinheiro){
        System.out.println("ITENS DA LOJA: ");
        for(int i = 0; i < itens.size(); i++){
            System.out.println("[" + (i+1) + "] - " + itens.get(i).getNome());
            System.out.println("Valor: " + itens.get(i).getValor());
            System.out.println("Descricao: " + itens.get(i).getDescricao());
            System.out.println("Status: " + itens.get(i).getStatus());
            System.out.println("");
        }
        System.out.print("ESCOLHA UMA OPÇÃO OU DIGITE QUALQUER OUTRA TECLA PARA SAIR DA LOJA: ");
        int opcao = s.nextInt();
        switch(opcao){
            case 1:{
                if(dinheiro >= itens.get(0).getValor()){
                    itens.get(opcao-1).itemVendido();
                }else{
                    System.out.println("Sem dinheiro suficiente");
                }
                break;
            }
            case 2:{
                if(dinheiro >= itens.get(1).getValor()){
                    itens.get(opcao-1).itemVendido();
                }else{
                    System.out.println("Sem dinheiro suficiente");
                }
                break;
            }
            case 3:{
                if(dinheiro >= itens.get(2).getValor()){
                    itens.get(opcao-1).itemVendido();
                }else{
                    System.out.println("Sem dinheiro suficiente");
                }
                break;
            }
            case 4:{
                if(dinheiro >= itens.get(3).getValor()){
                    itens.get(opcao-1).itemVendido();
                }else{
                    System.out.println("Sem dinheiro suficiente");
                }
                break;
            }
            case 5:{
                if(dinheiro >= itens.get(4).getValor()){
                    itens.get(opcao-1).itemVendido();
                }else{
                    System.out.println("Sem dinheiro suficiente");
                }
                break;
            }
            case 6:{
                if(dinheiro >= itens.get(5).getValor()){
                    itens.get(opcao-1).itemVendido();
                }else{
                    System.out.println("Sem dinheiro suficiente");
                }
                break;
            }
            default:{
                System.out.println("SAINDO DA LOJA!");
                break;
            }
        }
        
        return opcao;
    }
    
    
}
