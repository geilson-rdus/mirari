# ⚔️ Mirari — RPG de Texto em Java

> "O Reino de Mirari está em trevas. Sua jornada decidirá o futuro de Mirari e a esperança de todo o reino."

Mirari é um RPG de turno jogado no terminal, desenvolvido em Java. O jogador escolhe um herói, enfrenta inimigos em batalhas estratégicas, evolui de nível e descobre os segredos por trás da traição da Rainha Angelinna.

👨‍💻 Desenvolvido por: Augusto Luiz Marim e Geilson Lucas de Souza Silva — CC3M

---

## 🧙 Personagens Jogáveis

Ao iniciar o jogo, o jogador pode escolher entre quatro heróis, cada um com habilidades e estilos únicos:

- **Thomas Holycups** — Mago elemental com alto poder de mana, capaz de causar queimadura e cegueira  
- **Kenai Treeclubs** — Ranger veloz especializado em veneno e aumento de ataque  
- **Cassandra Snowblade** — Guerreira versátil com habilidades de congelamento e ataques múltiplos  
- **Melissa Goldwharf** — Personagem de suporte que enfraquece inimigos e aumenta ganhos de ouro  

---

## ⚔️ Sistema de Combate

O combate é baseado em turnos, sendo a **velocidade** o fator determinante para decidir quem ataca primeiro.

A cada turno, o jogador pode escolher entre:

- **Atacar** — Ataque físico básico com 5% de chance de acerto crítico  
- **Defender** — Reduz o dano recebido naquele turno  
- **Habilidade** — Utiliza habilidades especiais consumindo mana  
- **Usar Poção** — Recupera vida (50%) ou mana (20%)  

### 🔥 Efeitos de Status
As habilidades podem aplicar efeitos nos inimigos:

- 🔥 Queimadura  
- ☠️ Veneno  
- ❄️ Congelamento  
- 👁️ Cegueira  
- ⬇️ Enfraquecimento  

Cada efeito possui duração e impacto específicos durante a batalha.

---

## 📈 Sistema de Progressão

- O personagem evolui ao derrotar inimigos (nível máximo: 10)  
- A cada nível, há aumento de atributos  
- Nos níveis **4, 7 e 10**, as habilidades são aprimoradas  
- A cada **3 inimigos derrotados**, a loja é liberada  

---

## 🛒 Sistema de Loja

Durante a jornada, o jogador pode acessar a loja para:

- Comprar itens permanentes (ex: Espada do Rei, Escudo Alado)  
- Adquirir poções de vida e mana  
- Utilizar os Florins obtidos em batalha  

Ao entrar na loja, o personagem tem **vida e mana restauradas**.

---

## 🗺️ Jornada

O jogo possui:

- 10 inimigos distribuídos em diferentes regiões  
- Progressão linear até o confronto final  
- Batalha final contra **Angelinna, Rainha de Mirari**  

Dependendo do desempenho do jogador, o desfecho da história pode variar.

---

## 🚀 Como Executar

### Pré-requisitos
- Java 8 ou superior  

### Execução via terminal

```bash
# Compilar os arquivos
javac com/mycompany/mirari/*.java

# Executar o jogo
java com.mycompany.mirari.Mirari
