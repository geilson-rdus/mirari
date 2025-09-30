/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mirari;
/**
 *
 * @author alunolab10
 */
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author alunolab10
 */
public class Batalha {
    Scanner scanner = new Scanner(System.in);
    private Personagem p1;
    private Inimigo inim;
    
    public Batalha(Personagem a, Inimigo b){
        this.p1 = a;
        this.inim = b;
    }
    
    public int combate(){
        int retorno = 0;
        while(retorno!=5){
            if(p1.getVelocidade() >= inim.getVelocidade()){
                retorno = menuP1AtacaPrimeiro();
                if(p1.getVida()>inim.getVida()){
                    return 1;
                }else{
                    return 0;
                }
            }
            else{
                retorno = menuInimAtacaPrimeiro();
                if(p1.getVida()>inim.getVida()){
                    return 1;
                }else{
                    return 0;
                }
            }
        }
        return 0;
    }
    
    public int atacarInim(){
        inim.setVida(inim.getVida() - p1.getAtaque());
        System.out.println(p1.getNome() + " causou " + p1.getAtaque() + " de dano!\n");
        if(inim.getVida() <= 0){
            System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
        }
        else{
            System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
        }
        return 1;
    }
    
    public void atacarP1(int opcao){
        if(opcao == 2){
            p1.setVida((int) (p1.getVida() - (inim.getAtaque() * 0.3)));
            System.out.println(inim.getNome() + " causou " + (inim.getAtaque() * 0.3) + " de dano!\n");
            if(p1.getVida() <= 0){
                System.out.println(p1.getNome() + " possui " + 0 + " pontos de vida\n");
            }
            else{
                System.out.println(p1.getNome() + " possui " + p1.getVida() + " pontos de vida\n");
            }
        }else{
            p1.setVida(p1.getVida() - inim.getAtaque());
            System.out.println(inim.getNome() + " causou " + inim.getAtaque() + " de dano!\n");
            if(p1.getVida() <= 0){
                System.out.println(p1.getNome() + " possui " + 0 + " pontos de vida\n");
            }
            else{
                System.out.println(p1.getNome() + " possui " + p1.getVida() + " pontos de vida\n");
            }
        }
    }
    
    public int usarHabilidades(){
        int opcao = 0;
        System.out.println("Escolha a habilidade desejada ou aperte qualquer outra tecla para trocar a sua ação\n");
        for(int i = 0; i < p1.getHabilidades().size(); i++){
            System.out.println("[" + (i + 1) + "] " + p1.getHabilidades().get(i).getNome());
            System.out.println(p1.getHabilidades().get(i).getDescricao());
            System.out.println("Dano: " + p1.getHabilidades().get(i).getDano());
            System.out.println("Custo de mana: " + p1.getHabilidades().get(i).getCusto() + "\n");
        }
        System.out.printf("Habilidade: ");
        opcao = scanner.nextInt();
        System.out.println("");
        scanner.nextLine();
        switch(opcao){
            case 1:
                if(p1.getMana() >= p1.getHabilidades().get(opcao - 1).getCusto()){
                    p1.setMana(p1.getMana() - p1.getHabilidades().get(opcao - 1).getCusto());
                    switch(p1.getNome()){
                        case "Thomas Holycups":
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " e causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano!\n");
                            if(inim.getVida() <= 0){
                                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
                            }
                            else{
                                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
                            }                            
                            break;
                        case "Melissa Goldwharf":
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " e causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano!\n");
                            if(inim.getVida() <= 0){
                                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
                            }
                            else{
                                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
                            }   
                            break;
                        case "Kenai Treeclubs":
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " e causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano!\n");
                            if(inim.getVida() <= 0){
                                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
                            }
                            else{
                                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
                            }   
                            break;
                        case "Cassandra Snowblade":
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " e causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano!\n");
                            if(inim.getVida() <= 0){
                                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
                            }
                            else{
                                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
                            }   
                            break;
                    }
                    return 1;
                }
                else{
                    System.out.println("Você não tem mana o suficiente!\n");
                    return 0;
                }
            case 2:
                if(p1.getMana() >= p1.getHabilidades().get(opcao - 1).getCusto()){
                    p1.setMana(p1.getMana() - p1.getHabilidades().get(opcao - 1).getCusto());
                    switch(p1.getNome()){
                        case "Thomas Holycups":
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(1).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(1).getNome() + " e causou " + 
                                               p1.getHabilidades().get(1).getDano() + " de dano!\n");
                            if(inim.getVida() <= 0){
                                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
                            }
                            else{
                                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
                            }   
                            break;
                        case "Melissa Goldwharf":
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(1).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(1).getNome() + " e causou " + 
                                               p1.getHabilidades().get(1).getDano() + " de dano!\n");
                            if(inim.getVida() <= 0){
                                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
                            }
                            else{
                                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
                            }   
                            break;
                        case "Kenai Treeclubs":
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(1).getNome() + "\n");
                            p1.setAtaque();
                            System.out.println(p1.getNome() + " aumentou o ataque em mais 10 pontos até o fim da batalha!\n");
                            break;
                        case "Cassandra Snowblade":
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(1).getNome());
                            for(int i = 0; i < 3; i++){
                               inim.setVida(inim.getVida() - p1.getAtaque());
                                System.out.println(p1.getNome() + " causou " + p1.getAtaque() + " de dano!\n");
                            }
                            if(inim.getVida() <= 0){
                                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
                            }
                            else{
                                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
                            }   
                            break;
                    }
                    return 1;
                }
                else{
                    System.out.println("Você não tem mana o suficiente!\n");
                    return 0;
                }
            default:
                return 0;
        }
    }
    
    public int menuP1AtacaPrimeiro(){
        while(inim.getVida() > 0 && p1.getVida() > 0){
            int i = 0;
            int opcao = 0;
            while(i == 0){
                System.out.println(p1.getNome() + " Vida: " + p1.getVida() + "/" + 
                        p1.getVidaMaxima() + " Mana: " + p1.getMana() + "/" + p1.getManaMaxima() + "\n");
                System.out.println("[1] Atacar     [2] Defender");
                System.out.println("[3] Habilidade [4] Usar Poção\n");
                System.out.print("Ação: ");
                opcao = scanner.nextInt();
                System.out.println("");
                scanner.nextLine();
                   switch(opcao){
                        case 1:
                            i = atacarInim();
                            break;
                        case 2:
                             i = 2;
                            break;
                        case 3:
                            i = usarHabilidades();
                            break;
                        case 4:
                            i = usarPocao();
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }                      
            }
            if(inim.getVida() > 0){
                atacarP1(opcao);
            }    
        }
        p1.kenai(p1.getNome());
        return 5;
    }
    
    public int menuInimAtacaPrimeiro(){
        int opcao = 0;
        while(inim.getVida() > 0 && p1.getVida() > 0){
            int i = 0;
            atacarP1(opcao);
            if(p1.getVida() > 0){
                while(i == 0){
                System.out.println(p1.getNome() + " Vida: " + p1.getVida() + "/" + 
                        p1.getVidaMaxima() + " Mana: " + p1.getMana() + "/" + p1.getManaMaxima() + "\n");
                System.out.println("[1] Atacar     [2] Defender");
                System.out.println("[3] Habilidade [4] Usar Poção\n");
                System.out.print("Ação: ");
                opcao = scanner.nextInt();
                System.out.println("");
                scanner.nextLine();
                   switch(opcao){
                        case 1:
                            i = atacarInim();
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = usarHabilidades();
                            break;
                        case 4:
                            i = usarPocao();
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }                      
                }
            }        
        }
        p1.kenai(p1.getNome());
        return 5;
    }
    
    public int usarPocao(){
        System.out.println("Você possui " + p1.getPocao() + " poções de vida\n");
        System.out.println("Você possui " + p1.getPocaoMana() + " poções de mana\n");
        System.out.println("Escolha a poção desejada ou aperte qualquer outra tecla para trocar a sua ação\n");
        System.out.println("[1] Poção de Vida  [2] Poção de Mana\n");
        System.out.print("Poção: ");
        int opcao = scanner.nextInt();
        System.out.println("");
        scanner.nextLine();
        switch(opcao){
            case 1:
                if(p1.getPocao() >= 1){
                    if((p1.getVida() + (p1.getVidaMaxima() * 0.5)) >= p1.getVidaMaxima()){
                        System.out.println(p1.getNome() + " curou " + (p1.getVidaMaxima() - p1.getVida()) + " ponto de vida\n");
                        p1.setVida(p1.getVidaMaxima());
                        p1.usarVida();
                    }
                    else{
                        System.out.println(p1.getNome() + " curou " + (p1.getVidaMaxima() * 0.5) + " ponto de vida\n");
                        p1.setVida((int)(p1.getVida() + (p1.getVidaMaxima() * 0.5)));
                        p1.usarVida();
                    }
                    return 1;
                }
                else{
                    System.out.println("Você não tem poções disponiveis");
                    return 0;
                }
            case 2:
                if(p1.getPocaoMana() >= 1){
                    if((p1.getMana() + (p1.getManaMaxima() * 0.2)) >= p1.getManaMaxima()){
                        System.out.println(p1.getNome() + " curou " + (p1.getManaMaxima() - p1.getMana()) + " ponto de mana\n");
                        p1.setMana(p1.getManaMaxima());
                        p1.usarMana();
                    }
                    else{
                        System.out.println(p1.getNome() + " curou " + (p1.getManaMaxima() * 0.2) + " ponto de mana\n");
                        p1.setMana((int)(p1.getMana() + (p1.getManaMaxima() * 0.2)));
                        p1.usarMana();
                    }
                    return 1;
                }
                else{
                    System.out.println("Você não tem poções disponiveis\n");
                    return 0;
                }
            default:
                return 0;
        }        
    }
    
    
        
}

