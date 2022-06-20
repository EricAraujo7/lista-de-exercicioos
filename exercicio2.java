import java.util.Scanner;

public class exercicio2 {
 
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

        System.out.println("O valor em ponto flutuante da área é: "+ area);
        System.out.println("O valor inteiro é: " + (Math.round(area)));
        
        
        //Faça o programa acima calcular utilizando valores de ponto flutuante e depois imprima na tela
        //duas informações:
        //Valor exato da área:
        //Valor arredondado para inteiro:
    }   
}
