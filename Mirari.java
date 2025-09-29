/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mirari;

/**
 *
 * @author alunolab10
 */
import java.util.Scanner;

public class Mirari {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Loja l = new Loja();
        Item i1 = new Item("Botas do Ladino",10,"Aumenta sua velocidade");
        Item i2 = new Item("Codex do Arquimago",10,"Aumenta sua mana");
        Item i3 = new Item("Espada do Rei",10,"Aumenta seu ataque");
        Item i4 = new Item("Escudo Alado",10,"Aumenta sua Vida Máxima");
        Item i5 = new Item("Poção de Mana",5,"Cura 20% da sua Mana");
        Item i6 = new Item("Poção de Vida",5,"Cura 50% da sua Vida");
        l.adicionaItem(i1);
        l.adicionaItem(i2);
        l.adicionaItem(i3);
        l.adicionaItem(i4);
        l.adicionaItem(i5);
        l.adicionaItem(i6);
        Inimigo inim = new Inimigo("Angelitta, a Rainha de Mirari", 100, 20, 20, 20, 100);
        
        System.out.println("ESCOLHA O PERSONAGEM INICIAL [INSIRA O NÚMERO CORRESPONDENTE]: ");
        System.out.printf("[1] - Thomas Holycups%nVida máxima - 20%nDefesa - 10%nAtaque - 10%nMana máxima - 40%nVelocidade - 20%nDinheiro - 50%n%n");
        System.out.printf("[2] - Kenai Treeclubs%nVida máxima - 30%nDefesa - 10%nAtaque - 30%nMana máxima - 10%nVelocidade - 40%nDinheiro - 10%n%n");
        System.out.printf("[3] - Cassandra Snowblade%nVida máxima - 40%nDefesa - 10%nAtaque - 40%nMana máxima - 20%nVelocidade - 30%nDinheiro - 20%n%n");
        System.out.printf("[4] - Melissa Goldwharf%nVida máxima - 10%nDefesa - 10%nAtaque - 20%nMana máxima - 30%nVelocidade - 10%nDinheiro - 200%n");
        int contador = 0;
        Habilidade h1 = new Habilidade("Nome","Dano",10,10);
        Habilidade h2 = new Habilidade("Nome","Dano",10,10);
        Personagem p1 = new Personagem("Thomas", 20, 10, 10, 40, 50, 20,h1,h2);
        
        do{
            int opcao = s.nextInt();
            s.nextLine();
            switch(opcao){
                case 1:{
                    h1 = new Habilidade("Bola de Fogo","Dano - Pode causar queimadura por 2 turnos", 10, 10);
                    h2 = new Habilidade("Raio de Luz","Dano - Causa cegueira por 3 turnos", 10, 10);
                    p1 = new Personagem("Thomas Holycups", 20, 10, 10, 40, 50, 20, h1, h2);
                    contador++;
                    break;
                }
                case 2:{
                    h1 = new Habilidade("Flecha Envenenada","Dano - Causa envenamento por 3 turnos",10,10);
                    h2 = new Habilidade("Metamorfose","Aprimoramento - Aumenta o ataque",10,10);
                    p1 = new Personagem("Kenai Treeclubs", 20, 10, 10, 40, 50, 20,h1,h2);
                    contador++;
                    break;
                }
                case 3:{
                    h1 = new Habilidade("Prisão de Gelo","Dano - Congela inimigo por 2 turnos",10,10);
                    h2 = new Habilidade("Ventos da Aurora","Dano - Ataque três vezes",10,10);
                    p1 = new Personagem("Cassandra Snowblade", 20, 10, 10, 40, 50, 20,h1,h2);
                    contador++;
                    break;
                }
                case 4:{
                    h1 = new Habilidade("Chamado do Mar","Dano - Diminui a velocidade do inimigo",10,10);
                    h2 = new Habilidade("Voto Dourado","Dano - Aumenta o ouro recebido de inimigos",10,10);
                    p1 = new Personagem("Melissa Goldwharf", 20, 10, 10, 40, 50, 20,h1,h2);
                    contador++;
                    break;
                }
                default:
                    System.out.println("Opção inválida");
            }
        }while(contador == 0);
        
        //CICLO DA LOJA
        int loja = 1;
        
        //VARIAVEIS C# QUE CONTAM QUANTAS VEZES O ITEM FOI VENDIDO, CADA ITEM SÓ PODE SER VENDIDO UMA VEZ
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        
        do{
            System.out.println("DINHEIRO DISPONÍVEL: " + p1.getDinheiro());
            System.out.println("");
            loja = l.comprarItem(p1.getDinheiro());
            
            switch(loja){
                case 1:
                    if(p1.getDinheiro()>=i1.getValor() && c1==0){
                        p1.gastaDinheiro(i1.getValor());
                        c1++;
                    }
                    break;
                case 2:
                    if(p1.getDinheiro()>=i2.getValor() && c2==0){
                        p1.gastaDinheiro(i2.getValor());
                        p1.setManaMaxima();
                        c2++;
                    }
                    break;
                case 3:
                    if(p1.getDinheiro()>=i3.getValor() && c3==0){
                        p1.gastaDinheiro(i3.getValor());
                        c3++;
                    }
                    break;
                case 4:
                    if(p1.getDinheiro()>=i4.getValor() && c4==0){
                        p1.gastaDinheiro(i4.getValor());
                        p1.setVidaMaxima();
                        c4++;
                    }
                    break;
                case 5:
                    if(p1.getDinheiro()>=i5.getValor()){
                        p1.gastaDinheiro(i5.getValor());
                        p1.setPocaoMana();                       
                    }
                    break;
                case 6:
                    if(p1.getDinheiro()>=i6.getValor()){
                        p1.gastaDinheiro(i6.getValor());
                        p1.setPocao();
                    }
                    break;
                default:
                    break;
            }
        }while(loja >= 1 && loja <= 6);
        
        Batalha b = new Batalha(p1, inim);
        b.menu();
        
    }
}