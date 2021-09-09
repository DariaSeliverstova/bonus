public class Main {
        public static void main(String[] args) {
            int balance = 500;
            int refill = 500;
            int total = balance + refill + refill/100;
            if (refill >= 1000) {
            System.out.println(total);
            } else  {
                System.out.println(balance + refill);
            }
        }
}


