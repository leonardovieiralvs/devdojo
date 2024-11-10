package academy.devdojo.variaveis;

public class CalcularImposto {
    public static void main(String[] args) {
        double salario = 3000.00f;
        double resultado = salario * 0.3;
        System.out.println("30% de "+salario+" é igual a: "+resultado);

        resultado = salario * 0.15;
        System.out.println("15% de "+salario+" é igual a: "+resultado);

        resultado = salario * 0.05;
        System.out.println("5% de "+salario+" é igual a: "+resultado);
    }
}
