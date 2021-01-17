/*
Escreva um programa que imprime cada n�mero de 1 at� 100 em uma nova linha.

Para cada m�ltiplo de 3, imprima "Foo", ao inv�s do n�mero.
Para cada m�ltiplo de 5, imprima "Baa", ao inv�s do n�mero.
Para n�meros m�ltiplos simultaneamente de 3 e 5, imprima "FooBaa", ao inv�s do n�mero.

A sua solu��o dever� ser utilizando o menor n�mero de linhas de c�digo poss�vel por�m deve produzir um c�digo eficiente.
*/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Start");
		FooBar fb = new FooBar();		
		for (int i = 1; i <= 100; i++) 
        {
			System.out.println(fb.FooBarReturn(i));
        }
		System.out.println("End");
	}
}
