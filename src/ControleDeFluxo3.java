import java.sql.SQLOutput;

public class ControleDeFluxo3 {
    public static void main(String[] args) {
        byte diaNumero = 8;
        /*
        String dia = "";

        if (diaNumero == 1) {
            dia = "Domingo";
        } else if (diaNumero == 2) {
            dia = "Segunda-Feira";
        } else if (diaNumero == 3) {
            dia = "Terça-Feira";
        } else if (diaNumero == 4) {
            dia = "Quarta-Feira";
        } else if (diaNumero == 5) {
            dia = "Quinta-Feira";
        } else if (diaNumero == 6) {
            dia = "Sexta-Feira";
        } else if (diaNumero == 7) {
            dia = "Sábado";
        } else {
            System.out.println("O número informado não equivale a nenhum dia da semana.");
            System.exit(0);
        }
        System.out.println("O dia "+diaNumero+" equivale a "+dia);

    Tudo isso pode ser substituido por um switch:
    */
        switch (diaNumero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
