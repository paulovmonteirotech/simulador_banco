import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
        String contaM = "222";
        String senhap = "paulo";
        Float saldo = 50000F;
        String digitiE = "Digite Valor";
        String extrato = """
                  Conta: 222
                  Nome: Paulo
                 
                  SALDO: TECLE 1
                  ENVIAR: TECLE 2
                  DEPOSITAR: TCLE 3
                  
                  """;
        System.out.printf("Conta:");
        String conta = scanner.nextLine();
        if (contaM.equals(conta)) {
            System.out.println("senha:");
        }
        String senha = scanner.nextLine();
        if (senhap.equals(senha)) {

        } else {
            System.out.println("senha incorreta");
        }
        for(;;) {
            System.out.println(extrato);
        String funcao = scanner.nextLine();
        if (funcao.equals("1")) {
            System.out.println(saldo);
        } else if (funcao.equals("2")) {
            System.out.println(digitiE);
            Float debito = scanner.nextFloat();
            saldo = saldo - debito;
            if (debito < saldo) {
                System.out.println(saldo - debito);}}
                else if (funcao.equals("3")) {
            System.out.println(digitiE);
                    Float deposito = scanner.nextFloat();
                    saldo = saldo + deposito;
            System.out.println(saldo);};
        }

    }}