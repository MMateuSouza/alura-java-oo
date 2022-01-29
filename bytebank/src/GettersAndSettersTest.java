public class GettersAndSettersTest {
  public static void main(String[] args) {
    Account account = new Account(1997, 13081997);
    account.setNumber(0001);

    System.out.println(account.getNumber());

    Customer customer = new Customer();
    // customer.name = "Mateus";
    customer.setName("Mateus");

    account.setHolder(customer);

    System.out.println(account.getHolder().getName());

    account.getHolder().setProfession("Developer");

    // Ooou, `customer.setProfession("Developer")`
  }
}
