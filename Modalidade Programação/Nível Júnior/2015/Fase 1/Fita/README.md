# Fita Colorida #

Roberto tem um conjunto de lápis com 10 tons diferentes de uma mesma cor, numerados de 0 a 9. Numa fita quadriculada, alguns quadrados foram coloridos inicialmente com o tom 0. Roberto precisa determinar, para cada quadrado Q não colorido, qual é a distância dele para o quadrado mais próximo de tom 0. A distância entre dois quadrados é definida com o número mínimo de movimentos para a esquerda, ou para a direita, para ir de um quadrado para o outro. O quadrado Q, então, deve ser colorido com o tom cuja numeração corresponde à distância determinada. Se a distância for maior ou igual a 9, o quadrado deve ser colorido com o tom 9. Seu programa deve colorir e imprimir a fita quadriculada dada na entrada.

### Entrada ###
A primeira linha da entrada contém apenas um inteiro N, indicando o número de quadrados da fita. A segunda linha contém N números inteiros: "-1" se o quadrado não está colorido, e "0" se está colorido com o tom 0.

### Saída ### 
Seu programa deve escrever na saída a fita totalmente colorida, de acordo com a regra definida acima.

### Restrições ###
- 3 ≤ N ≤ 10000;
- Sempre existe pelo menos um "0" inicialmente na fita.
- Informações sobre a pontuação
- Em um conjunto de casos de teste somando 80 pontos, N ≤ 1000