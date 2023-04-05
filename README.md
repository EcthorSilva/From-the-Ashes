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

> Nota: Estou atualizando o README.md e movendo as informações mais detalhadas para a [Wiki](https://github.com/EcthorSilva/souls.txt/wiki). Dessa forma, apenas as últimas atualizações em que estou trabalhando serão mantidas aqui para facilitar a leitura. 

- Adicionei uma vareavel arma para cada uma das classes, assim posso referenciar a arma de cada um dos personagens ao longo da narrativa;
- Separei a historia do ATO I em três funções, assim consigo transitar pela historia de forma eficiente;
- Durante toda a produção deste jogo eu recebia um alerta referente ao primeiro Scanner que dizia "_Resource leak: 'scanner' is never closed Java(536871799)_", o proprio VS Code orienta a usar um `try-with-resources`, mas não acho uma saida elegante, com um pouco de pesquisa consegui encontrar um methodo chamado `scanner.close();`, agora não temos mais vazamento de recursos.
## Contribuição
Este projeto foi desenvolvido para fins educacionais, portanto, não aceitamos contribuições para o mesmo. No entanto, sugestões e feedbacks são bem-vindos.

## Licença
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.