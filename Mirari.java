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
        Item i1 = new Item("Nome1",10,"Descricao");
        Item i2 = new Item("Nome2",10,"Descricao");
        Item i3 = new Item("Nome3",10,"Descricao");
        Item i4 = new Item("Nome4",10,"Descricao");
        Item i5 = new Item("Nome5",10,"Descricao");
        Item i6 = new Item("Nome6",10,"Descricao");
        l.adicionaItem(i1);
        l.adicionaItem(i2);
        l.adicionaItem(i3);
        l.adicionaItem(i4);
        l.adicionaItem(i5);
        l.adicionaItem(i6);
        
        System.out.println("ESCOLHA O PERSONAGEM INICIAL [INSIRA O NÚMERO CORRESPONDENTE]: ");
        System.out.printf("[1] - Thomas%nVida máxima - 20%nDefesa - 10%nAtaque - 10%nMana - 40%nVelocidade - 20%nDinheiro - 50%n%n");
        System.out.printf("[2] - Kenai%nVida máxima - 30%nDefesa - 10%nAtaque - 30%nMana - 10%nVelocidade - 40%nDinheiro - 10%n%n");
        System.out.printf("[3] - Cassandra%nVida máxima - 40%nDefesa - 10%nAtaque - 40%nMana - 20%nVelocidade - 30%nDinheiro - 20%n%n");
        System.out.printf("[4] - Melissa%nVida máxima - 10%nDefesa - 10%nAtaque - 20%nMana - 30%nVelocidade - 10%nDinheiro - 200%n");
        int contador = 0;
        Habilidade h1 = new Habilidade("Nome","Dano",10,10);
        Habilidade h2 = new Habilidade("Nome","Dano",10,10);
        Personagem p1 = new Personagem("Thomas", 20, 10, 10, 40, 50, 20,h1,h2);
        
        do{
            int opcao = s.nextInt();
            s.nextLine();
            switch(opcao){
                case 1:{
                    h1 = new Habilidade("Nome","Dano",10,10);
                    h2 = new Habilidade("Nome","Dano",10,10);
                    p1 = new Personagem("Thomas", 20, 10, 10, 40, 50, 20,h1,h2);
                    contador++;
                    break;
                }
                case 2:{
                    h1 = new Habilidade("Nome","Dano",10,10);
                    h2 = new Habilidade("Nome","Dano",10,10);
                    p1 = new Personagem("Kenai", 20, 10, 10, 40, 50, 20,h1,h2);
                    contador++;
                    break;
                }
                case 3:{
                    h1 = new Habilidade("Nome","Dano",10,10);
                    h2 = new Habilidade("Nome","Dano",10,10);
                    p1 = new Personagem("Cassandra", 20, 10, 10, 40, 50, 20,h1,h2);
                    contador++;
                    break;
                }
                case 4:{
                    h1 = new Habilidade("Nome","Dano",10,10);
                    h2 = new Habilidade("Nome","Dano",10,10);
                    p1 = new Personagem("Melissa", 20, 10, 10, 40, 50, 20,h1,h2);
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
        int c5 = 0;
        int c6 = 0;
        
        do{
            System.out.println("DINHEIRO DISPONÍVEL: " + p1.getDinheiro());
            System.out.println("");
            loja = l.comprarItem(p1.getDinheiro());
            
            switch(loja){
                case 1:
                    if(p1.getDinheiro()>=i1.getValor() && c1==0){
                        p1.setDinheiro(i1.getValor());
                        c1++;
                    }
                    break;
                case 2:
                    if(p1.getDinheiro()>=i2.getValor() && c2==0){
                        p1.setDinheiro(i2.getValor());
                        c2++;
                    }
                    break;
                case 3:
                    if(p1.getDinheiro()>=i3.getValor() && c3==0){
                        p1.setDinheiro(i3.getValor());
                        c3++;
                    }
                    break;
                case 4:
                    if(p1.getDinheiro()>=i4.getValor() && c4==0){
                        p1.setDinheiro(i4.getValor());
                        c4++;
                    }
                    break;
                case 5:
                    if(p1.getDinheiro()>=i5.getValor() && c5==0){
                        p1.setDinheiro(i5.getValor());
                        c5++;
                    }
                    break;
                case 6:
                    if(p1.getDinheiro()>=i6.getValor() && c6==0){
                        p1.setDinheiro(i6.getValor());
                        c6++;
                    }
                    break;
                default:
                    break;
            }
        }while(loja >= 1 && loja <= 6);
    }
}
