public class CompositionTest {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setName("Mateus");
    customer.setDocument("000.111.222-33");
    customer.setProfession("Developer");

    Account account = new Account(1997, 13081997);
    account.setHolder(customer);
    account.deposit(100);

    System.out.println(account.getHolder().getName());
    System.out.println(account.getHolder());
    System.out.println(account.getHolder().equals(customer));
  }
}
