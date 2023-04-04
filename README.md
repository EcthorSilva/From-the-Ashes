# souls.txt  

###### Um jogo de ficção interativa em texto desenvolvido em Java.

O objetivo do projeto é produzir um RPG Textual para a disciplina PROJETO INTEGRADOR: DESENVOLVIMENTO DE LÓGICA, presente no 1° Semestre do curso superior em Tecnologia em Analise e Desenvolvimento de Sistemas, que demonstre os principais mecanismos da linguagem Java estudados em sala de aula.

## Descrição

Em Souls.txt, os personagens possuem diversos atributos caracterizantes, como vida, força, defesa e destreza, que definem o que eles podem fazer na aventura e de que forma. Eles interagem com o cenário na forma de diálogo, seguindo padrões de fala predefinidos, ou na forma de combate, onde a cada turno, os personagens combatentes escolhem uma forma de atacar, defender ou fugir, e causam a diminuição dos pontos de vida do adversário dependendo dos já mencionados atributos.

Na versão atual, o jogo é uma aventura em texto ao estilo do clássico Dunnet.

### Funcionalidades

- Seleção da classe do personagem;
- Exploração;
- Combate por turno.

## Como utilizar
Para utilizar o jogo, é necessário ter instalado uma IDE para a linguagem Java, como Eclipse ou IntelliJ IDEA. Após clonar ou baixar o repositório, abra o projeto na IDE e execute a classe __"Game.java"__ para iniciar o jogo.

## Updates
- Alterei o script de cada um dos personagens para que os danos sejam aleatórios, mas com base nos status predefinidos;
- Criei um menu principal onde temos as opções de _Introdução_, _Jogar_, _Créditos_ e _Sair_;
- Adicionei uma função com o objetivo de limpar o console e auxiliar na leitura das informações;
- Adicionei uma função que adiciona um pequeno atraso nos textos apresentados no console para dar impressão de jogo antigo;
- Adicionei um atributo de destreza para ser usado posteriormente;
- Refiz todo a aventura para dar mais opções ao jogador e deixar o jogo dinâmico;
- Após alguns testes realizei um balanceamento básico para igualar os monstros e o personagem principal.
- Corrigido o bug em que o monstro tomava dano, mas o personagem principal não (criei o godmode sem querer);
- Limpei algumas partes do código e adicionei comentários para facilitar a manutenção do mesmo;
- Criei uma função que contém o loop da batalha para poder repeti-la mais vezes no futuro;
- Durante a revisão do código percebi que o `getDestreza()` estava retornando para a vida, corrigi e agora o sistema de fuga esta funcionando como deveria;
- Alterei a função `atacar()` do monstro para que funcione da mesma forma que o personagem (Ataque aleatório com base nos status predefinidos);
- Alterei a condicional do Ataque do Monstro para caso o valor do dano for igual ou menor que zero ele exiba uma mensagem informando `"O " + monstro.getNome() + " não conseguiu te atacar!"`;
- Fiz um novo balanceamento nos status dos monstros para dar uma dificuldade elevada ao jogo;
- Deixei algumas saídas comentadas temporariamente para facilitar a visualização das informações no console enquanto termino de ajustar alguns pontos do jogo;
- Alterei o sistema de defesa para o personagem só tomar metade do dano quando estiver defendendo;
- Iniciei o processo de refatoração do código começando com a classe personagem;
- Fiz algumas alterações na classe `Game.Java` adicionando a função a função `clearConsole()` e `delay()` com o intuito de facilitar a leitura do jogador durante o jogo;
- Criei uma função para exibir a vida do personagem e do monstro, assim podemos tomar melhores decisões durante a batalha;
- Adicionei um status de defesa para o personagem, agora é exibido o dano pela metade caso o status de defesa seja verdadeiro;
- Troquei alguns `println` para `printf`;
- Criei uma função para saber se o personagem ainda esta vivo; 
- No momento fiz uma função para criar o personagem, assim posso usar o mesmo personagem em varias funções diferentes;
- Estou alterando completamente a historia do jogo, acho que já é a terceira vez, e separando cada parte em Atos;
- Cada um dos Atos será composto por algumas funções para que eu possa reaproveitalas em outros momentos do jogo e conseguir definir uma boa narrativa;
- Fiz pequenas alterações no menu principal e alterei algumas outras funções para funcionar melhor nesta nova estrutura.
## Contribuição
Este projeto foi desenvolvido para fins educacionais, portanto, não aceitamos contribuições para o mesmo. No entanto, sugestões e feedbacks são bem-vindos.

## Licença
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.