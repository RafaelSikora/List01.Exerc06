import java.util.Scanner;
//Exercicio 06: Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
class Main {
public static void main(String[] args){
//Declaração de variáveis
double raio;
double area;
//Fazer a entrada dos dados
  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite o raio do circulo: ");
  raio = teclado.nextDouble();
//Fazer o calculo
  area = 3.14159 * (raio * raio);
//Mostrar o resultado pro usuário
  System.out.println("Um circulo com " + raio + " de raio " + " tem uma area equivalente a " + area);
  }
}
  