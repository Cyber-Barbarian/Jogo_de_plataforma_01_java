# Jogo_de_plataforma_01_java
Um primeiro jogo de plataforma usando a tecnologia java

# 01 - início

- A classe [Main.java](jogo%2Fsrc%2Fmain%2FMain.java) é a responsável pela execução do jogo.
- A classe [Game.java](jogo%2Fsrc%2Fmain%2FGame.java) será responsável por todos os proessos de orquestração de nosso jogo.
- A classe [GameWnindow.java](jogo%2Fsrc%2Fmain%2FGameWnindow.java) será nossa janela do jogo. É criada usando JFRAME.
- A janela GameWnindow entretando é somente uma tela em branco. Por ser JFrame, é um contêiner de nível superior que representa a janela principal de um aplicativo Java. Ele fornece uma janela com barra de título, bordas e botões para fechar, minimizar e maximizar a janela
- Para rodar as "fases" e menus precisamos de um JPanel: um contêiner leve usado para organizar e agrupar componentes dentro de uma janela.
- É aí que entra a classe [GamePanel.java](jogo%2Fsrc%2Fmain%2FGamePanel.java). Nela, apenas para fins de exercício, ao invés de criar uma variável com JPanel, resolvemos extender a classe. Dá no mesmo.
- Nela além do construtor criamos o método `paintComponent`para lidar com os elementos gráficos (`Graphics`)
- JFrame é como se fosse a moldura, JPanel a tela, e Graphics o desenho
- Dentro de `paintComponent` temos uma chamada `super.paintComponent` para chamar o método `paintComponent` que está dentro da super classe, ou seja, JPanel. Esse método limpa a tela e evita glitches
- Desenhamos dentro de `paintComponent` usando `Graphics` um simples elemento
- Para esse elemento aparecer, devemos adicionar no construtor de `GameWindow` um argumento `GamePanel` e adicionar ele no JFrame para que seja renderizado.  
- Devemos também ajustar a classe `Game` para receber os parâmetros. `GameWindow` e `GamePanel` precisam ser chamados dentro de `Game`, e `GamePanel` é parâmetro de `GameWindow`.
- Um ponto de atenção: no `JPanel` e `JFrame` as referências xy (0,0) começam no canto superior esquerdo. 
- Neste caso, o valor xy (0,0) é o canto superior esquerdo da janela. E o valor xy (800, 500) é o canto inferior direito da janela. 