# souls.txt  

###### Um jogo de ficção interativa em texto desenvolvido em Java.

O objetivo do projeto é produzir um RPG Textual para a disciplina PROJETO INTEGRADOR: DESENVOLVIMENTO DE LÓGICA, presente no 1° Semestre do curso superior em Tecnologia em Analise e Desenvolvimento de Sistemas, que demonstre os principais mecanismos da linguagem Java estudados em sala de aula.

## Descrição

Em Souls.txt, os personagens possuem diversos atributos caracterizantes, como vida, força e defesa, que definem o que eles podem fazer na aventura e de que forma. Eles interagem com o cenario na forma de diálogo, seguindo padrões de fala predefinidos, ou na forma de combate, onde a cada turno, os personagens combatentes escolhem uma forma de atacar ou defender, e causam a diminuição dos pontos de vida do adversário dependendo dos já mencionados atributos.

Na versão atual, o jogo é uma aventura em texto ao estilo do clássico Dunnet.

### Funcionalidades

- Seleção da classe do personagem;
- Exploração;
- Combate por turno.

## Como utilizar
Para utilizar o jogo, é necessário ter instalado uma IDE para a linguagem Java, como Eclipse ou IntelliJ IDEA. Após clonar ou baixar o repositório, abra o projeto na IDE e execute a classe __"Game.java"__ para iniciar o jogo.

## Updates & Bugs
#### Updates

- Alterei o script de cada um dos personagens para que os danos sejam aleatorios, mas com base nos status pré definidos;
- Criei um menu principal onde temos as opções de _Introdução_, _Jogar_, _Créditos_ e _Sair_;
- Adicionei uma função com o objetivo de limpar o console e auxiliar na leitura das informações;
- Adicionei uma função que adiciona um pequeno atraso nos textos apresentados no console para dar impressão de jogo antigo;
- Adicionei um atributo de destreza para ser usado posteriormente;
- Refiz todo a aventura para dar mais opções ao jogador e deixar o jogo dinâmico;
- Após alguns testes realizei um balanceamento básico para igualar os monstros e o personagem principal.
- Corrigido o bug em que o monstro tomava dano, mas o personagem principal não (criei o godmode sem querer);
- Limpei algumas partes do codigo e adicionei comentarios para facilitar a manutenção do mesmo;
- Criei uma função que contém o loop da batalha para poder repeti-lá mais vezes no futuro;
- Durante a revisão do código percebi que o `getDestreza()` estava retornando para a vida, corrigi e agora o sistema de fuga esta funcionando como deveria. 

#### Bugs

- ~~O personagem consegue aplicar dano aos monstros, mas os monstros não conseguem tirar dano do personagem;~~
- O sistema de defesa não esta funcionando corretamente.
## Contribuição
Este projeto foi desenvolvido para fins educacionais, portanto, não aceitamos contribuições para o mesmo. No entanto, sugestões e feedbacks são bem-vindos.

## Licença
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.