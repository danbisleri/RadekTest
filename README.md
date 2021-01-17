# RadekTest

Teste de capacitação da Radek

Separado por pasta:
<br>
ALUNO: with para montar uma tabela fake a ser consultada listando as notas e os alunos conforme descrito.
<br>
ANIMAIS: with para montar uma tabela fake, Distinct do nome de duas tabelas em UNION 
<br>
CONCATANDREMOVE: transforma uma string em outra com número limite de movimentos por caracteres.
<br>
COUNTCHARINSTRING: retorna o tamanho da frase ou palavra em número de caracteres.
<br>
FOOBAR: simples teste de números entre 1 a 100 são divisíveis por 3 e 5.
<br>
Listagem de Notas e Alunos:
Criado uma tabela fake utilizando with para executar a query.
Notei que a ordenação do exemplo entre Julia e Marcela não estava conforme solicitado.
Ambas apresentam a mesma nota, porém não estava ordenando alfabeticamente pelos seus nomes.
Utilizado union all para ordenar as notas maiores ou igual a 8 decrescente e outro select para order as notas menores que 8 crescentes.
 
<br>
<br>
Distinct de Nome de Animais:
<br>
Da mesma forma que a anterior, para teste, criei um with com duas tabelas fakes, dogs e cats.
No select foi utilizado um Union, com o select para cada e um select externo com o distict do nome.

<br>
<br>
Concatenar e Remover:
<br>
Este foi desenvolvido em Java, utilizando o Eclipse.
Utilizando uma palavra controle, onde se os caracteres entre a strig inicial e a final forem igual, esse caractere é adicionado a string de controle.
Quando o caractere for diferente, para o primeiro teste deste, verifica quantos movimentos serão necessários para remover os caracteres, somando na variável de controle de movimentos.
Para cada movimento de adição, é adicionado um movimento ao controle.
Assim, quando a string controle for igual a final, e o número de movimentos efetuados for menor que o indicado, retorna Sim, caso contrário retorna não.

<br>
<br>
Contador de Caracteres:
<br>
Transformado a string em vetor, após é executado um loop sobre este vetor.
Quando não conseguir carregar a informação, via try catch, é que o vetor acabou, finalizando o contador.
Retornado com a quantidade de caracteres que o loop conseguiu carregar. 
Podendo ler todos os caracteres presentes em uma frase ou palavra.

<br>
<br>
FooBar:
<br>
Teste simples de resto se divisão.
Se for divisível por 3 e for divisível por 5 = foobar 
Se for divisível por 3 apenas = foo
Se for divisível por 5 apenas = bar
