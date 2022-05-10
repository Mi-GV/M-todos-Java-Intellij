package Exercicio1;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcular (double valor, int parcelas){

        if (parcelas == 2) {

            double valorfinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println(" Valor final de emprestimo para 2 parcelas: R$ "  + valorfinal);

        } else if (parcelas == 3) {

            double valorfinal = valor + (valor * getTaxaTresParcelas());

            System.out.println(" Valor final do emprestimo para 3 parcelas: R$ "  + valorfinal);
        } else {
            System.out.println(" Quantidade de parcelas não aceita. ");
        }
    }

}
