# Cartas #
Um novo game de realidade aumentada tem, dentro dele, um mini-game que aparece em certas situações para aumentar o ganho de pontos do game principal. O mini-game é um joguinho de memória com quatro cartas, formando dois pares de cartas iguais. Quer dizer, duas cartas têm um número inteiro N marcado em uma de suas faces e as outras duas cartas têm um outro número inteiro M, N ≠ M. Neste problema, o jogador já virou três cartas, como mostrado na figura.

<p align = "center">
    <img src = "cartas.png" width = "128"/>
</p>

Claro que, dadas as condições, a carta que falta virar vai formar par com uma das três que já foram viradas. No caso da figura, o número marcado na carta que ainda falta virar é 11. Implemente um programa que, dados os números de três cartas, imprima o número da carta que ainda falta virar!

### Entrada ###

A primeira linha da entrada contém um inteiro A, representando a primeira carta aberta. A segunda linha contém o inteiro B, representando a segunda carta. A terceira linha contém o inteiro C, que é a terceira carta.

### Saída ###
Seu programa deve imprimir uma linha contendo um inteiro representando o número que está na carta que ainda falta virar.

### Restrições ###
- 0 ≤ A,B,C ≤ 100
