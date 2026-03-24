⚔️ Mirari — RPG de Texto em Java

"O Reino de Mirari está em trevas. Sua jornada decidirá o futuro de Mirari e a esperança de todo o reino."

Mirari é um RPG de turno por turno jogado no terminal, desenvolvido em Java. O jogador escolhe um herói, enfrenta inimigos em batalhas estratégicas, evolui de nível e descobre os segredos por trás da traição da Rainha Angelinna.
Desenvolvido por: Augusto Luiz Marim e Geilson Lucas de Souza Silva — CC3M

🧙 Personagens Jogáveis
Ao iniciar, escolha um dos quatro heróis — cada um tem atributos, estilo de jogo e habilidades únicas:

Thomas Holycups — Mago elemental com alto poder de mana e habilidades que causam fogo e cegueira.
Kenai Treeclubs — Ranger veloz especializado em veneno e buffs de ataque.
Cassandra Snowblade — Guerreira versátil que congela inimigos e ataca múltiplas vezes.
Melissa Goldwharf — Suporte que enfraquece inimigos e ganha bônus de ouro nas batalhas.


⚔️ Sistema de Combate
O combate é por turnos. A velocidade determina quem ataca primeiro. A cada turno, o jogador escolhe uma ação:

Atacar — Ataque físico básico com 5% de chance de acerto crítico.
Defender — Reduz o dano recebido pela metade naquele turno.
Habilidade — Usa uma habilidade especial consumindo mana.
Usar Poção — Consome uma poção de vida (50% da vida máxima) ou de mana (20% da mana máxima).

As habilidades podem aplicar efeitos de status nos inimigos: 🔥 Queimadura, ☠️ Veneno, ❄️ Congelamento, 👁️ Cegueira e ⬇️ Enfraquecimento — cada um com duração e impacto diferentes.

📈 Progressão
O herói sobe de nível a cada inimigo derrotado (máximo nível 10), ganhando atributos e evoluindo suas habilidades. Nos níveis 4, 7 e 10, as habilidades são aprimoradas com novos nomes e efeitos mais poderosos.
A cada 3 inimigos derrotados, a Loja abre — o herói entra com vida e mana restauradas e pode comprar itens permanentes (como Espada do Rei e Escudo Alado) ou poções de vida e mana com os Florins ganhos em batalha.

🗺️ Jornada
O jogo conta com 10 inimigos distribuídos em três regiões, culminando no confronto com Angelinna, a Rainha de Mirari. Mas dependendo de como você vencer, a história pode não terminar aí...

🚀 Como Executar
Pré-requisitos: Java 8 ou superior.
bash# Compile todos os arquivos
javac com/mycompany/mirari/*.java

# Execute o jogo
java com.mycompany.mirari.Mirari
Ou abra o projeto no NetBeans e execute diretamente.
