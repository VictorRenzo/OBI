# Montanha #
Um sistema de informações geográficas computadorizado está representando o perfil de uma montanha através de uma sequência de números inteiros, na qual não há dois números consecutivos iguais, como ilustrado na figura abaixo para três montanhas. Os números representam a altura da montanha ao longo de uma certa direção.

<p align = "center">
    <img src = "montanha.png" width = "128"/>
</p>

O gerente do sistema de informações geográficas pesquisou e encontrou uma maneira de identificar se uma sequência de números inteiros representa uma montanha com mais de um pico, ou com apenas um pico. Ele observou que, como não há números consecutivos iguais, se houver três números consecutivos na sequência, tal que o número do meio é menor do que os outros dois números, então a montanha tem mais de um pico. Caso contrário, a montanha tem apenas um pico. De forma mais rigorosa, se a sequência é A=[A1, A2, A3, …, AN-2, A_N-1, AN], ele quer saber se há uma posição i, para 2 ≤ i ≤ N-1, tal que Ai-1 > Ai e Ai < Ai+1.

> **Observação:** o enunciado parece dar a condição errada para determinar o que é um pico dada uma posição *i*.

Para ajudar o gerente, seu programa deve determinar, dada a sequência de números inteiros representando a montanha, se ela tem mais de um pico, ou se tem um pico apenas.

### Entrada ###
A primeira linha da entrada contém um inteiro N, representando o tamanho da sequência. A segunda linha contém N inteiros Ai, 1 ≤ i ≤ N, representando a sequência de alturas da montanha.

### Saída ###
Seu programa deve imprimir uma linha contendo o caractere "S" se há mais de um pico, ou o caractere "N" se há apenas um pico.

### Restrições ###
- 3 ≤ N ≤ 1000
- 1 ≤ Ai ≤ 1000, para 1 ≤ i ≤ N