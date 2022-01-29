public class CreateAccount {
  public static void main(String[] args) {
    Account firstAccount = new Account(1997, 13081997);
    firstAccount.deposit(200);

    System.out.println("Primeira Conta: R$ " + firstAccount.getBalance());

    firstAccount.deposit(100);
    System.out.println("Primeira Conta: R$ " + firstAccount.getBalance());

    Account secondAccount = new Account(1997, 13081997);
    secondAccount.deposit(50);
    System.out.println("Segunda Conta: R$ " + secondAccount.getBalance());

    System.out.println(firstAccount.getHolder());
    System.out.println(firstAccount.getBankBranch());
    System.out.println(firstAccount.getNumber());

    System.out.println(secondAccount.getBankBranch());
  }
}