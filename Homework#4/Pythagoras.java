class Pythagoras {
 public static void main(String[]args) {
    int a = 0;
    int b = 0;
    int c = 0;
     
     
      
         for (a = 0; a < 1000; a++) {
             for (b = 0; b < 1000; b++) {
                 for (c = 0; c < 1000; c++) {
                     if (a < b && b < c && a + b + c == 1000 && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                     System.out.print(a*b*c);
                    }
                    }
                }
            }
        
    }
}