# From the Ashes 

###### Um jogo de ficção interativa em texto desenvolvido em Java.

O objetivo do projeto é produzir um RPG Textual para a disciplina PROJETO INTEGRADOR: DESENVOLVIMENTO DE LÓGICA, presente no 1° Semestre do curso superior em Tecnologia em Analise e Desenvolvimento de Sistemas, que demonstre os principais mecanismos da linguagem Java estudados em sala de aula.

## Descrição

Em From the Ashes, os personagens possuem diversos atributos caracterizantes, como vida, força, defesa e destreza, que definem o que eles podem fazer na aventura e de que forma. Eles interagem com o cenário na forma de diálogo, seguindo padrões de fala predefinidos, ou na forma de combate, onde a cada turno, os personagens combatentes escolhem uma forma de atacar, defender ou fugir, e causam a diminuição dos pontos de vida do adversário dependendo dos já mencionados atributos.

Na versão atual, o jogo é uma aventura em texto ao estilo do clássico Dunnet.

### Funcionalidades

- Seleção da classe do personagem;
- Exploração;
- Combate por turno.

## Como utilizar
Para utilizar o jogo, é necessário ter instalado uma IDE para a linguagem Java, como Eclipse ou IntelliJ IDEA. Após clonar ou baixar o repositório, abra o projeto na IDE e execute a classe __"Game.java"__ para iniciar o jogo.

## Updates

> Nota: Estou atualizando o README.md e movendo as informações mais detalhadas para a [Wiki](https://github.com/EcthorSilva/souls.txt/wiki). Dessa forma, apenas as últimas atualizações em que estou trabalhando serão mantidas aqui para facilitar a leitura. 

- Alterei as variáveis das classes personagem e monstro de `public` para `private` após alguma conversa com o Prof. Fernando Almeida da aula de Algoritmos e Programação I;
- Removi algumas linhas de código que estavam ali desnecessariamente e alterei alguns comentários;
- Removi a frase de ataque da função `loopBatalha()` e coloquei uma diferente na função `atacar()` na classe de cada um dos personagens;
- Removi a função defender das classes dos personagens pois eu não esta utilizando.

- Tirei o calculo da chance de cura e transformei ele em uma função chamada `fugir();` presente nas classes dos personagens para funcionar da mesma forma que a função `atacar();`;
- Fiz um pequeno balanceamento nos status dos personagens e monstros;
- Criei uma função `acharCura();` e outra `usarCura();`, e adicionei elas a classe Personagem;
- Criei uma classe Clérigo como referencia ao Patches do Dark Souls;
- Movi todos as Funções Auxiliares para a classe Metodos e as Funções da Historia para a classe Atos seguindo a dica do professor Fernando de *Algoritmos e Programação I*.


## Contribuição
Este projeto foi desenvolvido para fins educacionais, portanto, não aceitamos contribuições para o mesmo. No entanto, sugestões e feedbacks são bem-vindos.

## Licença
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.
