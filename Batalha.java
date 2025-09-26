/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mirari;
import java.util.HashSet;
import java.util.Scanner;
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
    
    public void Batalha(){
        while(true){
            if(p1.getVelocidade() >= inim.getVelocidade()){
      
            }
            else{
                
            }
        }
    }
    
    public void atacarInim(){
        inim.setVida(inim.getVida() - p1.getAtaque());
    }
    
    public void atacarP1(){
        p1.setVida(p1.getVida() - inim.getAtaque());
    }
    
    public void defender(){
        p1.setVida(p1.getVida() - (p1.getDefesa() - inim.getAtaque()));
    }
    
    public void mostrarHabilidades(){
        for(Habilidade i: p1.getHabilidades()){
            System.out.println(i.getNome());
            System.out.println(i.getDescricao());
            System.out.println("Dano: " + i.getDano());
            System.out.println("Custo de Mana: " + i.getCusto() + "\n");
        }
    }
    
    public int menu(){
        while(true){
            System.out.println("[1] Atacar     [2] Defender");
            System.out.println("[3] Habilidade [4] Usar Poção\n");
            System.out.print("Ação: ");
            int opcao = scanner.nextInt();
            System.out.println("");
            scanner.nextLine();
            if(opcao >= 1 && opcao <= 4 ){
                return opcao;
            }
            else{
                System.out.println("Opção invalida\n"); 
            }  
        } 
    }
    
    public void usarPocao(){
        if(p1.getPocao() >= 1){
           if((p1.getVida() + (p1.getVidaMaxima() * 0.5)) > p1.getVidaMaxima()){
               p1.setVida(p1.getVidaMaxima());         
           }
           else{
               p1.setVida((int)(p1.getVida() + (p1.getVidaMaxima() * 0.5)));
           }   
        }
        else{
            System.out.println("Você não tem poções disponiveis");
        }
        
        
    }
    
    public void usarHabilidade(){
        System.out.println("");
        inim.setVida(inim.getVida()); 
    }
}
    
