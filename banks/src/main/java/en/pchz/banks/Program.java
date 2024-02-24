package en.pchz.banks;

public class Program {
    public static void main(String[] args) {
        try {
            var bank = new Bank("A");
            System.out.println("Hello from banks" + bank.toString());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
