public class ValuesTest {
  public static void main(String[] args) {
    Account firstAccount = new Account(1997, 13081997);
    Account secondAccount = new Account(1995, 12091995);

    System.out.println("Contas Instanciadas: " + Account.getAccountsQuantity());
  }
}
