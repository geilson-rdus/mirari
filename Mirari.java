/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mirari;

/**
 *
 * @author alunolab10
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mirari {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        ArrayList<Inimigo> inimigos = new ArrayList<>();
        inimigos.add(new Inimigo("Plofin, o Slime Saltitante", 1, 20, 20, 20, 100));
        inimigos.add(new Inimigo("Plofinette, a Slime Cativante", 1, 20, 20, 20, 100));
        inimigos.add(new Inimigo("Rei Plofin, o Rei Slime", 1, 20, 20, 20, 100));
        inimigos.add(new Inimigo("Crokanha, a Aranha Filhote", 1, 20, 20, 20, 100));        
        inimigos.add(new Inimigo("Crokanharom, a Aranha sem Expressão", 1, 20, 20, 20, 100));
        inimigos.add(new Inimigo("Thalyssra, a Rainha Aranha", 1, 20, 20, 20, 100));
        inimigos.add(new Inimigo("Cavaleiro Licornio, um Cavaleiro Errante", 1, 20, 20, 20, 100));
        inimigos.add(new Inimigo("Campeão Noctis, o Desalmado", 1, 20, 20, 20, 100));
        inimigos.add(new Inimigo("Duque Licornio, o Senhor Sem Alma", 1, 20, 20, 20, 100));
        inimigos.add(new Inimigo("Angelinna, a Rainha de Mirari", 1, 20, 20, 20, 100));
              
                
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
            System.out.printf("\nOpção: ");
            int opcao = s.nextInt();
            System.out.println("");
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
                    System.out.println("\nOpção inválida");
            }
        }while(contador == 0);
        Loja l = new Loja(p1);
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
        
        boolean jogadorVivo = true;
        int z = 0;
        for (Inimigo inimigo : inimigos) {
            Batalha batalha = new Batalha(p1, inimigo);
            int resultado = batalha.combate();
            if (resultado == 1) {
                System.out.println("O jogador derrotou " + inimigo.getNome() + "\n");
                z ++;
                p1.setNivel();
                p1.setAtaque();
                p1.setAtaqueMaximo();
                p1.setManaMaxima();
                p1.setMana(p1.getManaMaxima());
                p1.ganhaDinheiroBatalha();
                p1.getHabilidades().get(0).setDano();
                p1.getHabilidades().get(1).setDano();
                if(z % 3 == 0){
                   l.menu(); 
                } 
            } else {
                System.out.println("Jogador derrotado por " + inimigo.getNome() + "!\n");
                System.out.println("GAMER OVER!");
                jogadorVivo = false;
                break;
            }
            
             
        }
        
        if (jogadorVivo) {
            System.out.println("Parabéns! Você venceu todos os inimigos!");
        }  
    }
}
