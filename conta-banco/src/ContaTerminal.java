public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        public static void main(String[] args) {
            int numero;
            String agencia;
            String nomeCliente;
            double saldo;
    
            Scanner ipt = new Scanner(System.in);
    
            System.out.println("Por favor, digite o Número da sua Conta !");
            numero = ipt.nextInt();
    
            System.out.println("Por favor, digite o número da Agência !");
            ipt.nextLine();
            agencia = ipt.nextLine();
    
            System.out.println("Por favor, digite o seu Nome Completo !");
            nomeCliente = ipt.nextLine();
    
            System.out.println("Por favor, digite o saldo da sua Conta!");
            saldo = ipt.nextDouble();
    
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                    " conta %d e seu saldo %.3f já está disponível para saque." ,nomeCliente,agencia,numero,saldo);
        }    }
}
