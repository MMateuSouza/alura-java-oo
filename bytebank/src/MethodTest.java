public class MethodTest {
  public static void main(String[] args) {
    Account firstAccount = new Account(1997, 13081997);
    firstAccount.deposit(100);

    System.out.println(firstAccount.getBalance());

    boolean success = firstAccount.withdraw(20);

    System.out.println(firstAccount.getBalance());
    System.out.println(success);

    Account secondAccount = new Account(1997, 12091995);
    secondAccount.deposit(1000.5);

    if (secondAccount.transfer(firstAccount, 500.5)) {
      System.out.println("Transferência realizada com sucesso!");
    } else {
      System.out.println("Faltou saldo!");
    }

    System.out.println(secondAccount.getBalance());
    System.out.println(firstAccount.getBalance());
  }
}
