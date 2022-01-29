public class ReferenceTest {
  public static void main(String[] args) {
    Account firstAccount = new Account(1997, 13081997);
    firstAccount.deposit(300);

    System.out.println("Saldo da Primeira Conta: R$ " + firstAccount.getBalance());

    // Segunda Conta está recebendo o mesmo endereço de memória que Primeira Conta.
    Account secondAccount = firstAccount;

    System.out.println("Saldo da Segunda Conta: R$ " + secondAccount.getBalance());

    secondAccount.deposit(100);

    System.out.println("Saldo da Segunda Conta: R$ " + firstAccount.getBalance());
    System.out.println("Saldo da Segunda Conta: R$ " + secondAccount.getBalance());

    if (firstAccount.equals(secondAccount)) {
      System.out.println("São as mesmas contas!");
    }
  }
}
