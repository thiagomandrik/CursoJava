public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        /*
        Crie uma variavel salario e imprima o seu imposto
        Tabela de impostos:
        Salario menor que 1000 = 5%
        Salario maior ou igual a 1000 e menor que 2000 = 10%
        Salario maior ou igual a 2000 e menor que 4000 = 15%
        Salario maior que 4000 = 20%
         */
        float salario = 3500;
        double imposto = 0;
        if (salario < 1000) {
            imposto = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000) {
            imposto = salario * 0.1;
        } else if (salario >= 2000 && salario < 4000) {
            imposto = salario * 0.15;
        } else {
            imposto = salario * 0.20;
        }
        System.out.println("O imposto para o salario de " + salario + " eh de: " + imposto);
    }
}
