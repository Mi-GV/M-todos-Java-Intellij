package Exercicio1;

public class Main {


    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio1 calculadora");
        Calculadora.soma(3, 5);
        Calculadora.subtracao(4, 5);
        Calculadora.divisao(9, 3);
        Calculadora.multiplicacao(5, 2);

        //Mensagem
        System.out.println(" Exercicio1 mensagem");
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(18);
        Mensagem.obterMensagem(22);

        //Emprestimo
        System.out.println ("Exercicio1 emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
Emprestimo.calcular(1000, 5);


    }
}