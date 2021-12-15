public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s8 = new Galaxy("S8",100,"AT&T","Ring Ring Ring");
        IPhone x = new IPhone("X",78,"Verizon","Samsung Galaxy is better!");

        s8.displayInfo();
        System.out.println(s8.ring());
        System.out.println(s8.unlock());

        x.displayInfo();
        System.out.println(x.ring());
        System.out.println(x.unlock());
    }
}
