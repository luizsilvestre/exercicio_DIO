import java.util.Scanner;
public class ContaTerminal {
        public static void main(String[] args) throws Exception {
        //Todo: "conhecer e importar a classe scanner"
        // todo exibir as mensagem para usuario
        // TODO obter os valores digitados no terminal
        // Exibir as mensagens finais


        // Campo de declaracão das variaveis
        int numero = 1021;
        String agencia ="067-8";
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

         // Criação do obeto scanner
         Scanner scanner = new Scanner(System.in);

        //Entradas dos dados e exibicão de mensagem ao usuário

        System.out.print("Digite o numero da sua Agencia: ");
        String inputAgencia = scanner.nextLine();

        // Verifica se a agência digitada é a mesma que a definida
        if (inputAgencia.equals(agencia)) {
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco." +
                    "Sua agência é " + agencia + ", conta " + numero +
                    " e seu saldo de R$" + saldo + " já está disponível para saque.");
        } else {
            System.out.println("A agência informada não corresponde à agência da conta.");
        }
        // Fechamento do Scanner para evitar memory leaks
        scanner.close();
   

        


    }
}
