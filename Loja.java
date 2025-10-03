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
import java.util.List;
import java.util.Scanner;

public class Loja {
    private Personagem p1;
    ArrayList<Item> itens = new ArrayList<>();
    Scanner s = new Scanner(System.in);
    
    public Loja(Personagem a){
        this.p1 = a;
    }
    
    public void adicionaItem(Item i){
        itens.add(i);
    }
    
    public int comprarItem(int dinheiro){
        System.out.println("ITENS DA LOJA: ");
        for(int i = 0; i < itens.size(); i++){
            System.out.println("[" + (i+1) + "] - " + itens.get(i).getNome());
            System.out.println("Valor: " + itens.get(i).getValor() + " Florins");
            System.out.println("Descricao: " + itens.get(i).getDescricao());
            System.out.println("Status: " + itens.get(i).getStatus());
            System.out.println("");
        }
        System.out.print("ESCOLHA UMA OPÇÃO OU DIGITE QUALQUER OUTRO NÚMERO PARA SAIR DA LOJA: ");
        int opcao = s.nextInt();
        switch(opcao){
            case 1:{
                if(dinheiro >= itens.get(0).getValor() && itens.get(0).getStatus().equals("Disponivel")){
                    itens.get(opcao-1).itemVendido();
                }else{
                    System.out.println("Sem dinheiro suficiente ou item já comprado.");
                }
                break;
            }
            case 2:{
                if(dinheiro >= itens.get(1).getValor() && itens.get(1).getStatus().equals("Disponivel")){
                    itens.get(opcao-1).itemVendido();
                }else{
                    System.out.println("Sem dinheiro suficiente ou item já comprado.");
                }
                break;
            }
            case 3:{
                if(dinheiro >= itens.get(2).getValor() && itens.get(2).getStatus().equals("Disponivel")){
                    itens.get(opcao-1).itemVendido();
                }else{
                    System.out.println("Sem dinheiro suficiente ou item já comprado.");
                }
                break;
            }
            case 4:{
                if(dinheiro >= itens.get(3).getValor() && itens.get(3).getStatus().equals("Disponivel")){
                    itens.get(opcao-1).itemVendido();
                }else{
                    System.out.println("Sem dinheiro suficiente ou item já comprado.");
                }
                break;
            }
            case 5:{
                if(dinheiro < itens.get(4).getValor()){
                    System.out.println("\nSem dinheiro suficiente ou item já comprado.");
                }
                break;
            }
            case 6:{
                if(dinheiro < itens.get(5).getValor()){
                    System.out.println("\nSem dinheiro suficiente ou item já comprado.");
                }
                break;
            }
            default:{
                System.out.println("\nSAINDO DA LOJA!\n");
                break;
            }
        }
        
        return opcao;
    }
    
    public void menu(){
        //CICLO DA LOJA
        int loja = 1;
        
        //VARIAVEIS C# QUE CONTAM QUANTAS VEZES O ITEM FOI VENDIDO, CADA ITEM SÓ PODE SER VENDIDO UMA VEZ    
        do{
            System.out.println("\nDINHEIRO DISPONÍVEL: " + p1.getDinheiro());
            System.out.println("");
            loja = comprarItem(p1.getDinheiro());
            
            switch(loja){
                case 1:
                    if(p1.getDinheiro()>= itens.get(0).getValor() && itens.get(0).getQtd() == 0){
                        p1.gastaDinheiro(itens.get(0).getValor());
                        p1.setVelocidade();
                        itens.get(0).contador();
                    }
                    break;
                case 2:
                    if(p1.getDinheiro()>= itens.get(1).getValor() && itens.get(1).getQtd() == 0){
                        p1.gastaDinheiro( itens.get(1).getValor());
                        p1.setManaMaxima();
                        p1.setMana(p1.getManaMaxima());
                        itens.get(1).contador();
                    }
                    break;
                case 3:
                    if(p1.getDinheiro()>= itens.get(2).getValor() && itens.get(2).getQtd() == 0){
                        p1.gastaDinheiro(itens.get(2).getValor());
                        p1.setAtaque();
                        p1.setAtaqueMaximo();
                        itens.get(2).contador();
                    }
                    break;
                case 4:
                    if(p1.getDinheiro()>= itens.get(3).getValor() && itens.get(3).getQtd() == 0){
                        p1.gastaDinheiro(itens.get(3).getValor());
                        p1.setVidaMaxima();
                        p1.setVida(p1.getVidaMaxima());
                        itens.get(3).contador();
                    }
                    break;
                case 5:
                    if(p1.getDinheiro()>= itens.get(4).getValor()){
                        p1.gastaDinheiro( itens.get(4).getValor());
                        p1.setPocaoMana();
                        itens.get(4).contador();
                    }
                    break;
                case 6:
                    if(p1.getDinheiro()>= itens.get(5).getValor()){
                        p1.gastaDinheiro(itens.get(5).getValor());
                        p1.setPocao();
                        itens.get(5).contador();
                    }
                    break;
                default:
                    break;
            }
        }while(loja >= 1 && loja <= 6);
        
    }
    
}