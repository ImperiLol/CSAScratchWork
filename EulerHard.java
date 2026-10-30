public class EulerHard {
   
   public static int problem273() {
      int a = 1;
      int b = 1;
      int N = 2;
      String javaList = " ";
      int finalSum = 0;
      
      while (N <= 150) {
        if (N % 4 == 1) {
            
            boolean isPrime = true;
            int d = 2;
            
            while (d < N) {
               if (N % d == 0) {
                  isPrime = false;
               }
               ++d;
            }
            
            if (isPrime) {
               javaList += N + " ";
               
               a = 1;
               while ((a * a) < N) {
                  int bb = N - (a * a);
                  b = (int) Math.sqrt(bb);
                  
                  if ((b * b) == bb) {
                     if (a <= b) {
                        finalSum += a;
                     }
                  }
                  ++a;
               }
            }
         }
         ++N; 
      }
      System.out.println(javaList);
      System.out.println("The calculated sum is: " + finalSum);
      return finalSum;
   }

   public static void main(String[] args) {
      //added this useless line so i can update my github
      System.out.println("The answer to problem 273 is: " + problem273());
   }  
}
