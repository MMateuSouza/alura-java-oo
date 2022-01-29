public class NegativeAmountTest {
  public static void main(String[] args) {
    Account account = new Account(1997, 13081997);
    account.deposit(100);
    System.out.println(account.withdraw(200));
    System.out.println(account.getBalance());

    // Não será permitido
    // account.balance -= 101;
    System.out.println(account.getBalance());
  }
}
