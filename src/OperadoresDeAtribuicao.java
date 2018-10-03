public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        //= += -= *= /= %=
        int salario = 1800;
        salario += 1000;
        System.out.println(salario);

        salario -= 2000;
        System.out.println(salario);

        salario *= 2;
        System.out.println(salario);

        salario /= 2;
        System.out.println(salario);

        salario %= 2;
        System.out.println(salario);
    }
}
