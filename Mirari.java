/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mirari;

/**
 *
 * @author Augusto Luiz Marim e Geilson Lucas de Souza Silva - CC3M
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mirari {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        ArrayList<Inimigo> inimigos = new ArrayList<>();
        inimigos.add(new Inimigo("Plofin, o Slime Saltitante", 20, 6, 5, 5));
        inimigos.add(new Inimigo("Plofinette, a Slime Cativante", 30, 8, 5, 5));
        inimigos.add(new Inimigo("Rei Plofin, o Rei Slime", 50, 15, 3, 20));
        inimigos.add(new Inimigo("Crokanha, a Aranha Filhote", 30, 10, 20, 15));        
        inimigos.add(new Inimigo("Crokanharom, a Aranha sem Expressão", 50, 15, 30, 30));
        inimigos.add(new Inimigo("Thalyssra, a Rainha Aranha", 70, 20, 40, 50));
        inimigos.add(new Inimigo("Cavaleiro Licornio, um Cavaleiro Errante", 60, 15, 25, 40));
        inimigos.add(new Inimigo("Campeão Noctis, o Desalmado", 80, 25, 30, 60));
        inimigos.add(new Inimigo("Duque Licornio, o Senhor Sem Alma", 100, 40, 25, 100));
        inimigos.add(new Inimigo("Angelinna, a Rainha de Mirari", 400, 50, 20, 0));
        Inimigo amariell = new Inimigo("Amariell, a Deusa do Amor", 600, 55, 150, 0);
        Inimigo aurelith = new Inimigo("Aurelith, o Pecado do 'Amor'", 1000, 60, 150, 0);
        
        System.out.print("Antes de tudo, informe seu nome: ");
        String usuario = s.nextLine();
        System.out.println("");
        
        System.out.println("O Reino de Mirari está em trevas. A Rainha Angelinna traiu seu povo, conspirando com suas tropas para escravizar os mirarianos e eliminar seus próprios descendentes, temendo a sucessão da Coroa.");
        System.out.println("Mas uma antiga profecia anuncia: quando forças ocultas tentarem usurpar o trono, um dos herdeiros se levantará. Sua jornada decidirá o futuro de Mirari e a esperança de todo o reino.\n");
        System.out.println("ESCOLHA O PERSONAGEM INICIAL [INSIRA O NÚMERO CORRESPONDENTE]: ");
        System.out.printf("[1] - Thomas Holycups%nVida máxima - 20%nDefesa - 10%nAtaque - 10%nMana máxima - 40%nVelocidade - 20%nDinheiro - 50%n%n");
        System.out.printf("[2] - Kenai Treeclubs%nVida máxima - 30%nDefesa - 10%nAtaque - 30%nMana máxima - 10%nVelocidade - 40%nDinheiro - 10%n%n");
        System.out.printf("[3] - Cassandra Snowblade%nVida máxima - 40%nDefesa - 10%nAtaque - 40%nMana máxima - 20%nVelocidade - 30%nDinheiro - 20%n%n");
        System.out.printf("[4] - Melissa Goldwharf%nVida máxima - 10%nDefesa - 10%nAtaque - 20%nMana máxima - 30%nVelocidade - 10%nDinheiro - 200%n");
        int contador = 0;
        Habilidade h1 = new Habilidade("Nome","Dano",10,10);
        Habilidade h2 = new Habilidade("Nome","Dano",10,10);
        Personagem p1 = new Personagem("Thomas", 20, 10, 40, 20, h1, h2);
        
        do{
            System.out.printf("\nOpção: ");
            int opcao = s.nextInt();
            System.out.println("");
            s.nextLine();
            switch(opcao){
                case 1:{
                    h1 = new Habilidade("Bola de Fogo","Dano - Pode causar queimadura por 2 turnos", 15, 10);
                    h2 = new Habilidade("Raio de Luz","Dano - Causa cegueira por 2 turnos", 10, 20);
                    p1 = new Personagem("Thomas Holycups", 20, 20, 60, 30, h1, h2);
                    contador++;
                    break;
                }
                case 2:{
                    h1 = new Habilidade("Flecha Envenenada","Dano - Causa envenamento por 2 turnos",10,10);
                    h2 = new Habilidade("Metamorfose","Aprimoramento - Aumenta o ataque", 0,15);
                    p1 = new Personagem("Kenai Treeclubs", 30, 25, 30, 50, h1,h2);
                    contador++;
                    break;
                }
                case 3:{
                    h1 = new Habilidade("Prisão de Gelo","Dano - Congela inimigo por 2 turnos",10,20);
                    h2 = new Habilidade("Ventos da Aurora","Dano - Ataque duas vezes", 0,15);
                    p1 = new Personagem("Cassandra Snowblade", 40, 30, 40, 40, h1,h2);
                    contador++;
                    break;
                }
                case 4:{
                    h1 = new Habilidade("Chamado do Mar","Dano - Diminui a ataque do inimigo em 2 turnos",15,15);
                    h2 = new Habilidade("Voto Dourado","Dano - Aumenta o ouro recebido de inimigos",10,30);
                    p1 = new Personagem("Melissa Goldwharf", 25, 15, 50, 25, h1,h2);
                    contador++;
                    break;
                }
                default:
                    System.out.println("Opção inválida");
            }
        }while(contador == 0);
        Loja l = new Loja(p1);
        Item i1 = new Item("Botas do Ladino", 30,"Aumenta sua velocidade");
        Item i2 = new Item("Codex do Arquimago", 50,"Aumenta sua mana");
        Item i3 = new Item("Espada do Rei",70,"Aumenta seu ataque");
        Item i4 = new Item("Escudo Alado",50,"Aumenta sua Vida Máxima");
        Item i5 = new Item("Poção de Mana",15,"Cura 20% da sua Mana");
        Item i6 = new Item("Poção de Vida",15,"Cura 50% da sua Vida");
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
                System.out.println("O inimigo derrubou " + inimigo.getDinheiro() + " Florins Mirarianos\n");
                z ++;
                if(p1.getNivel() < 10){
                    p1.setNivel();
                }
                batalha.ganhaDinheiroBatalha();    
                if(z % 3 == 0){
                   p1.setVida(p1.getVidaMaxima());
                   p1.setMana(p1.getManaMaxima());
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
            System.out.println("Após uma árdua batalha, " + p1.getNome() + " consegue derrotar Angelinna. " + p1.getNome() + " caminha lentamente até o corpo da Rainha, com os olhos vidrados na Coroa, ele toma o artefato e coloca na própria cabeça. "
                    + "\nAgora, o novo governante de Mirari está aqui, pronto para governar essas terras. FIM!!!");
        }
        
        if(p1.getVida() == p1.getVidaMaxima()){
            try {
                for (int i = 0; i < 3; i++) { 
                    Thread.sleep(2000); 
                    System.out.println(".");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Nos últimos suspiros, Angelinna lança uma magia que derruba o herdeiro e despedaça a coroa. Dos estilhaços surge uma névoa doce que toma forma nos céus: Amariell, a Deusa do Amor.\n");
                System.out.println("Imponente, porém corrompida, ela revela ser o verdadeiro desafio. Recompanha-se e enfrente Amariell para selar o destino de Mirari.\n");
            Batalha secreta = new Batalha(p1, amariell);
            int resultado = secreta.combate();
            if(resultado == 1){
                System.out.println("A batalha parece está no fim, " + p1.getNome() + " utilizou todas as suas forças, Amariell parece fraca. O golpe final se aproxima...");
                try {
                        for (int i = 0; i < 3; i++){ 
                            Thread.sleep(2000); 
                            System.out.println(".");
                        }
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("NÃO ACHOU QUE SERIA TÃO SIMPLES, NÉ!? " + usuario.toUpperCase() +";\n");
                    System.out.println("Aurelith, o Pecado do 'Amor', o fruto da mentira surge. Não há para onde fugir, " + p1.getNome() + " terá que encontrar forças e demonstrar muita coragem. Lute.");
                    Batalha secreta1 = new Batalha(p1, aurelith);
                    resultado = secreta1.combate();
                    if(resultado == 1){
                        System.out.println("O mal foi vencido, a paz restaurada e Aurelith derrotada.\n" +
                                            "Espero que algo lindo aconteça...\n" +
                                            "Obrigado, "+ usuario +"!");

                    }
                    else{
                        System.out.println("Jogador derrotado por " + aurelith.getNome() + "!\n");
                        System.out.println("GAMER OVER!");
                    }
                }
                else{
                    System.out.println("Jogador derrotado por " + amariell.getNome() + "!\n");
                    System.out.println("GAMER OVER!");
                }
        }

    }
}
