import java.util.Scanner;
public class EXERCICIO_1{


public static void main(String[] args) {
Scanner entrada = new Scanner (System.in);
double h,b,B,area;

System.out.println("Digite o valor da altura");
h = entrada.nextDouble();

System.out.println("Digite o valor da base menor");
b = entrada.nextDouble();

System.out.println("Digite o valor da base maior");
B = entrada.nextDouble();

area = (h * (b + B)) / 2;

System.out.println("O valor da área é:" + area); 


