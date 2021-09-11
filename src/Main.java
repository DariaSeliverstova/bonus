public class Main {
        public static void main(String[] args) {
            int balance = 500;
            int refill = 1000;
            int total = balance + refill;
            if (refill >= 1000) {
            System.out.println(total + refill/100);
            } else  {
                System.out.println(balance + refill);
            }
        }
}


