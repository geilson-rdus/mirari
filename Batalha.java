/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

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
        System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida");
        return 1;
    }
    
    public void atacarP1(int opcao){
        if(opcao == 2){
            p1.setVida((int) (p1.getVida() - (inim.getAtaque() * 0.3)));
            System.out.println(inim.getNome() + " causou " + (inim.getAtaque() * 0.3) + " de dano!\n");
            System.out.println(p1.getNome() + " possui " + p1.getVida() + " pontos de vida");
        }else{
            p1.setVida(p1.getVida() - inim.getAtaque());
            System.out.println(inim.getNome() + " causou " + inim.getAtaque() + " de dano!\n");
            System.out.println(p1.getNome() + " possui " + p1.getVida() + " pontos de vida");
        }
    }
    
    public int defender(){
        /*
        double dano = inim.getAtaque() * 0.3;
        p1.setVida((int) (p1.getVida() - dano));
        System.out.println(inim.getNome() + " causou " + dano + " de dano!\n");
        System.out.println(p1.getNome() + " possui " + p1.getVida() + " pontos de vida");
        */
        return 2;
    }
    
    public int usarHabilidades(){
        int opcao = 0;
        System.out.println("Escolha a habilidade desejada ou aperte qualquer outra tecla para trocar a sua ação");
        for(int i = 0; i < p1.getHabilidades().size(); i++){
            System.out.println("[" + (i + 1) + "] " + p1.getHabilidades().get(i).getNome());
            System.out.println(p1.getHabilidades().get(i).getDescricao());
            System.out.println("Dano: " + p1.getHabilidades().get(i).getDano());
            System.out.println("Custo de mana: " + p1.getHabilidades().get(i).getCusto());
        }
        opcao = scanner.nextInt();
        scanner.nextLine();
        switch(opcao){
            case 1:
                if(p1.getMana() >= p1.getHabilidades().get(opcao - 1).getCusto()){
                    p1.setMana(p1.getMana() - p1.getHabilidades().get(opcao - 1).getCusto());
                    switch(p1.getNome()){
                        case "Thomas Holycups":
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " e causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano!");
                            System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida");
                            break;
                        case "Melissa Goldwharf":
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " e causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano!");
                            System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida");
                            break;
                        case "Kenai Treeclubs":
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " e causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano!");
                            System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida");
                            break;
                        case "Cassandra Snowblade":
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " e causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano!");
                            System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida");
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
                                               p1.getHabilidades().get(1).getDano() + " de dano!");
                            System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida");
                            break;
                        case "Melissa Goldwharf":
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(1).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(1).getNome() + " e causou " + 
                                               p1.getHabilidades().get(1).getDano() + " de dano!");
                            System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida");
                            break;
                        case "Kenai Treeclubs":
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(1).getNome());
                            p1.setAtaque();
                            System.out.println(p1.getNome() + " aumentou o ataque em mais 10 pontos até o fim da batalha!");
                            break;
                        case "Cassandra Snowblade":
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(1).getNome());
                            for(int i = 0; i < 3; i++){
                               inim.setVida(inim.getVida() - p1.getAtaque());
                                System.out.println(p1.getNome() + " causou " + p1.getAtaque() + " de dano!\n");
                            }
                            System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida");
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
                             i = defender();
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
            atacarP1(opcao);
            
        }
        return 5;
    }
    
    public int menuInimAtacaPrimeiro(){
        int opcao = 0;
        while(inim.getVida() > 0 && p1.getVida() > 0){
            int i = 0;
            atacarP1(opcao);
            while(i == 0){
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
                             i = defender();
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
        return 5;
    }
    
    public int usarPocao(){
        System.out.println("Você possui " + p1.getPocao() + " poções de vida");
        System.out.println("Você possui " + p1.getPocaoMana() + " poções de mana");
        System.out.println("Escolha a poção desejada ou aperte qualquer outra tecla para trocar a sua ação");
        System.out.println("[1] Poção de Vida  [2] Poção de Mana");
        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch(opcao){
            case 1:
                if(p1.getPocao() >= 1){
                    if((p1.getVida() + (p1.getVidaMaxima() * 0.5)) > p1.getVidaMaxima()){
                        p1.setVida(p1.getVidaMaxima());         
                    }
                    else{
                        p1.setVida((int)(p1.getVida() + (p1.getVidaMaxima() * 0.5)));
                    }
                    return 1;
                }
                else{
                    System.out.println("Você não tem poções disponiveis");
                    return 0;
                }
            case 2:
                if(p1.getPocaoMana() >= 1){
                    if((p1.getMana() + (p1.getManaMaxima() * 0.2)) > p1.getManaMaxima()){
                        p1.setMana(p1.getManaMaxima());
                    }
                    else{
                        p1.setMana((int)(p1.getMana() + (p1.getManaMaxima() * 0.2)));
                    }
                    return 1;
                }
                else{
                    System.out.println("Você não tem poções disponiveis");
                    return 0;
                }
            default:
                return 0;
        }        
    }
    
    
        
}


