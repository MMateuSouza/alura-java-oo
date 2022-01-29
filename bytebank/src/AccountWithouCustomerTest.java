public class AccountWithouCustomerTest {
  public static void main(String[] args) {
    Account account = new Account(1997, 13081997);
    System.out.println(account.getBalance());

    // Exception in thread "main" java.lang.NullPointerException
    // account.holder.name = "Mateus";

    account.setHolder(new Customer());
    account.getHolder().setName("Mateus");

    System.out.println(account.getHolder().getName());
  }
}
