# Gincana #

As duas turmas do terceiro ano de sua escola realizam anualmente uma gincana. Nessa gincana, a delegação de cada turma é dividida em grupos de K pessoas, de forma que K seja o maior número possível que divida as duas delegações sem que sobre alguém. Depois, os grupos competem uns com os outros, ganhando pontos para determinar a turma vencedora. Sua turma pode levar qualquer número X de pessoas entre 1 e M, a quantidade de alunos na turma, e você sabe que a turma rival levará exatamente N pessoas para a gincana. Os integrantes da sua turma são muito bons em competições individuais, mas não trabalham bem em equipe. Portanto, é sua tarefa encontrar a maior delegação possível que sua turma pode levar à competição para que a gincana aconteça com grupos de K = 1 pessoa. Por exemplo, se N = 9 e M = 6 a sua turma deve levar uma delegação de X = 5 pessoas, já que, para esse valor, a única divisão possível é em grupos de K = 1 pessoa e, para X = 6, os grupos seriam de 3 pessoas.

### Entrada ###
A primeira e única linha contém dois inteiros N e M, representando respectivamente o tamanho da delegação rival e o tamanho da sua turma.

### Saída ###
Seu programa deve produzir uma única linha, contendo um inteiro X, o maior tamanho possível da delegação da sua turma para o qual a gincana aconteça com grupos de uma pessoa.

### Restrições ###
- 1 ≤ N, M ≤ 10^18.

### Informações sobre a pontuação ###
- Em um conjunto de casos de teste equivalente a 40 pontos, N, M ≤ 103.
- Em um conjunto de casos de teste equivalente a 60 pontos, N, M ≤ 105.
- Em um conjunto de casos de teste equivalente a 80 pontos, N, M ≤ 107.