class Fibonacci {
 public static void main(String[]args) {
     int current = 0;
     int prev1 = 1;
     int prev2 = 0;
     int total = 0;
     
     while (current < 4000000) {
         current = prev1 + prev2;
         if (current % 2 == 0) {
             total = total + current;
            }
            prev2 = prev1;
            prev1 = current;
        }
        System.out.println(total);
    }
}