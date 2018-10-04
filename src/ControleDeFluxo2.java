public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        String status;
        //operador ternario
        /*
        if (idade < 18) {

            status = "Não adulto.";
        } else {
            status = "Adulto.";
        }
        */
        status = idade < 18 ? "Não Adulto." : "Adulto.";
        System.out.println(status);
    }
}
