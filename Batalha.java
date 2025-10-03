/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mirari;
/**
 *
 * @author Augusto Luiz Marim e Geilson Lucas de Souza Silva - CC3M
 */
import java.util.Scanner;
import java.util.Random;

public class Batalha {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private Personagem p1;
    private Inimigo inim;
    private int turno;
    private int turno2;
    
    public Batalha(Personagem a, Inimigo b){
        this.p1 = a;
        this.inim = b;
        this.turno = 0;
        this.turno2 = 0;
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
        int i = random.nextInt(100) + 1;
        if(i >= 1 && i <=5){
            inim.setVida((int) (inim.getVida() - (p1.getAtaque() * 1.5)));
            System.out.println(p1.getNome() + " acertou um ataque crítico e causou " + (p1.getAtaque() * 1.5) + " de dano!\n");
            if(inim.getVida() <= 0){
                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
            }
            else{
                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
            }
        }
        else{
            inim.setVida(inim.getVida() - p1.getAtaque());
            System.out.println(p1.getNome() + " causou " + p1.getAtaque() + " de dano!\n");
            if(inim.getVida() <= 0){
                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
            }
            else{
                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
            }
        }         
        return 1;
    }
    
    public void atacarP1(int opcao){
        int i = random.nextInt(100) + 1;
        if(inim.getFogo() || inim.getVeneno()){
               if(inim.getFogo()){
                   inim.setVida((int) (inim.getVida() - (inim.getVidaMaxima() * 0.05)));
                   System.out.println(inim.getNome() + " sofreu dano de queimadura e recebeu " + ((int) inim.getVidaMaxima() * 0.05) + " pontos de dano!\n");
               }
               else{
                   switch(turno){
                       case 1:
                           inim.setVida((int) (inim.getVida() - (inim.getVidaMaxima() * 0.02)));
                           System.out.println(inim.getNome() + " sofreu dano de envenenamento e recebeu " + ((int) inim.getVidaMaxima() * 0.02) + " pontos de dano!\n");
                           break;
                       case 2:
                           inim.setVida((int) (inim.getVida() - (inim.getVidaMaxima() * 0.04)));
                           System.out.println(inim.getNome() + " sofreu dano de envenenamento e recebeu " + ((int) inim.getVidaMaxima() * 0.04) + " pontos de dano!\n");
                           break;
                       case 3:
                           inim.setVida((int) (inim.getVida() - (inim.getVidaMaxima() * 0.06)));
                           System.out.println(inim.getNome() + " sofreu dano de envenenamento e recebeu " + ((int) inim.getVidaMaxima() * 0.06) + " pontos de dano!\n");
                           break;
                       case 4:
                           inim.setVida((int) (inim.getVida() - (inim.getVidaMaxima() * 0.08)));
                           System.out.println(inim.getNome() + " sofreu dano de envenenamento e recebeu " + ((int) inim.getVidaMaxima() * 0.08) + " pontos de dano!\n");
                           break;
                       case 5:
                           inim.setVida((int) (inim.getVida() - (inim.getVidaMaxima() * 0.1)));
                           System.out.println(inim.getNome() + " sofreu dano de envenenamento e recebeu " + ((int) inim.getVidaMaxima() * 0.1) + " pontos de dano!\n");
                           break;
                   }
               }
           }
        if(inim.getGelo() || inim.getLuz()){
            if(inim.getGelo()){
                System.out.println(inim.getNome() + " está congelado e não consegue atacar\n");
            }
            else{
                System.out.println(inim.getNome() + " está cego e errou o ataque\n");
            }    
        }
        
           else{
           
           if(i >= 1 && i <= 5){
            if(opcao == 2){
                p1.setVida((int) (p1.getVida() - (inim.getAtaque() * 0.8)));
                System.out.println(inim.getNome() + " acertou um ataque crítico e causou " + ((int)(inim.getAtaque() * 0.8)) + " de dano!\n");
                if(p1.getVida() <= 0){
                    System.out.println(p1.getNome() + " possui " + 0 + " pontos de vida\n");
                }
                else{
                    System.out.println(p1.getNome() + " possui " + p1.getVida() + " pontos de vida\n");
                }
            }else{
                p1.setVida(p1.getVida() - inim.getAtaque());
                System.out.println(inim.getNome() + " acertou um ataque crítico e causou " + inim.getAtaque() + " de dano!\n");
                if(p1.getVida() <= 0){
                    System.out.println(p1.getNome() + " possui " + 0 + " pontos de vida\n");
                }
                else{
                    System.out.println(p1.getNome() + " possui " + p1.getVida() + " pontos de vida\n");
                }
            }
        }
        else{
            if(opcao == 2){
                p1.setVida((int) (p1.getVida() - (inim.getAtaque() * 0.4)));
                System.out.println(inim.getNome() + " causou " + ((int)(inim.getAtaque() * 0.4)) + " de dano!\n");
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
    }        
    }
    
    public int usarHabilidades(){
        int opcao = 0;
        System.out.println("Escolha a habilidade desejada ou aperte qualquer outro número para trocar a sua ação\n");
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
        int x = (p1.getNivel() - 1) / 3 + 1;
        switch(opcao){
            case 1:
                if(p1.getMana() >= p1.getHabilidades().get(opcao - 1).getCusto()){
                    p1.setMana(p1.getMana() - p1.getHabilidades().get(opcao - 1).getCusto());
                    switch(p1.getNome()){
                        case "Thomas Holycups":
                            inim.setFogo(true);
                            turno2 = 0;
                            inim.setDebuff2(x);
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " e causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano e causou queimadura no inimigo por " + (x + 1) + 
                                    " turnos!\n");
                            if(inim.getVida() <= 0){
                                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
                            }
                            else{
                                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
                            }                            
                            break;
                        case "Melissa Goldwharf":
                            for(int i = 0; i < x; i++){
                                inim.setAtaque();
                            }
                            inim.setDebuff(x);
                            turno = 0;
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " e causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano e reduziu o ataque do inimigo em " 
                                    + (inim.getAtaqueMaximo() - inim.getAtaque()) + " pontos!\n");
                            if(inim.getVida() <= 0){
                                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
                            }
                            else{
                                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
                            }   
                            break;
                        case "Kenai Treeclubs":
                            inim.setVeneno(true);
                            turno = 0;
                            inim.setDebuff(x);
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano e envenou o inimigo por " + (x + 1) + " turnos!\n");
                            if(inim.getVida() <= 0){
                                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
                            }
                            else{
                                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
                            }   
                            break;
                        case "Cassandra Snowblade":
                            inim.setGelo(true);
                            turno = 0;
                            inim.setDebuff(x);
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(0).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(0).getNome() + " e causou " + 
                                               p1.getHabilidades().get(0).getDano() + " de dano e congelou o inimigo por " + (x + 1) + " turnos!\n");
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
                            inim.setLuz(true);
                            turno = 0;
                            inim.setDebuff(x);
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
                            inim.setDinheiro(x); 
                            inim.setVida(inim.getVida() - p1.getHabilidades().get(1).getDano());
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(1).getNome() + " e causou " + 
                                               p1.getHabilidades().get(1).getDano() + " de dano e aumentou o dinheiro recebido por este inimigo!\n");
                            if(inim.getVida() <= 0){
                                System.out.println(inim.getNome() + " possui " + 0 + " pontos de vida\n");
                            }
                            else{
                                System.out.println(inim.getNome() + " possui " + inim.getVida() + " pontos de vida\n");
                            }   
                            break;
                        case "Kenai Treeclubs":
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(1).getNome() + "\n");
                            for(int i = 0; i < x; i++){
                                p1.setAtaque();
                            }           
                            System.out.println(p1.getNome() + " aumentou o ataque em mais " + (p1.getAtaque() - p1.getAtaqueMaximo()) + " pontos até o fim da batalha!\n");
                            break;
                        case "Cassandra Snowblade":
                            System.out.println(p1.getNome() + " usou " + p1.getHabilidades().get(1).getNome());
                            for(int i = 0; i < (x + 1); i++){
                               inim.setVida((int) (inim.getVida() - (p1.getAtaque() * 0.75)));
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
                turno ++;
                turno2 ++;
                if(turno2 >= 2 && turno2 <= 5 && turno2 == inim.getDebuff2() + 1){
                    if(inim.getFogo()){
                        inim.curaFogo();
                    }
                    inim.setDebuff2(0);
                    turno2 = 0;
                }
                if(turno >= 2 && turno <= 5 && turno == inim.getDebuff() + 1){
                    if(inim.getVeneno()){
                        inim.curaVeneno();
                    }
                    if(inim.getGelo()){
                        inim.curaGelo();
                    }
                    if(inim.getLuz()){
                        inim.curaCegueira();
                    }
                    if(inim.getFraco()){
                        inim.resetarAtaque();
                    }
                    inim.setDebuff(0);
                    turno = 0;
                }
                int i = 0;
                int opcao = 0;
                while(i == 0){
                    System.out.println(inim.getNome() + "\nVida: " + inim.getVida() + "/" + inim.getVidaMaxima() + "\n");
                    System.out.println(p1.getNome() + " Lv." + p1.getNivel() + "\nVida: " + p1.getVida() + "/" + 
                            p1.getVidaMaxima() + "\nMana: " + p1.getMana() + "/" + p1.getManaMaxima() + "\n");
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
                                System.out.println("Opção inválida\n");
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
            if(turno >= 2 && turno <= 5 && turno == inim.getDebuff() + 1){
                if(inim.getVeneno()){
                    inim.curaVeneno();
                }
                if(inim.getGelo()){
                    inim.curaGelo();
                }
                if(inim.getLuz()){
                    inim.curaCegueira();
                }
                if(inim.getFogo()){
                    inim.curaFogo();
                }
                if(inim.getFraco()){
                    inim.resetarAtaque();
                }
                inim.setDebuff(0);
                turno = 0;
            }
            turno ++;    
            int i = 0;
            atacarP1(opcao);
            if(p1.getVida() > 0){
                while(i == 0){
                System.out.println(inim.getNome() + "\nVida: " + inim.getVida() + "/" + inim.getVidaMaxima() + "\n");
                System.out.println(p1.getNome() + " Lv." + p1.getNivel() + "\nVida: " + p1.getVida() + "/" + 
                        p1.getVidaMaxima() + "\nMana: " + p1.getMana() + "/" + p1.getManaMaxima() + "\n");
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
                            System.out.println("Opção inválida\n");
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
        System.out.println("Escolha a poção desejada ou aperte qualquer outro número para trocar a sua ação\n");
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
    
    public void ganhaDinheiroBatalha(){
        p1.setDinheiro(inim.getDinheiro());
    } 
    
}



