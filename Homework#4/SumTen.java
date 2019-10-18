class SumTen {
 public static void main(String[]args) {
     double sum1 = 0;
     double sum2 = 0;
     double total = 0;
     for (int i = 1; i <= 100; i++) {
         sum1 = sum1 + Math.pow(i, 2);
        }
        
        for (int j = 1; j <= 100; j++) {
         sum2 = sum2 + j;  
        }
        sum2 = Math.pow(sum2, 2);
       //System.out.println(sum1);
       //System.out.println(sum2);
        total = sum2 - sum1;
        System.out.print(total);
    }
}