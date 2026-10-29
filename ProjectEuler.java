public class ProjectEuler {
   
   public static int problem1() {
      int sum = 0;
      for (int i = 1; i < 1000; i++) {
         if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
         }
      }
      return sum;
   }
   
   public static int problem2() {
      int a = 1;
      int b = 2;
      int sum = 0;
      while (b < 4000 * 1000) {
         if (b % 2 == 0) {
            sum += b;
         }
         int next = a + b;
         a = b;
         b = next;
      }
      return sum;
   }

   public static long problem10() {
      long sum = 0;
      boolean[] isPrime = new boolean[2000 * 1000];
      for (int i = 2; i < isPrime.length; i++) {
         isPrime[i] = true;
      }
      for (int p = 2; p * p < isPrime.length; p++) {
         if (isPrime[p]) {
            for (int i = p * p; i < isPrime.length; i += p) {
               isPrime[i] = false;
            }
         }
      }
      for (int i = 2; i < isPrime.length; i++) {
         if (isPrime[i]) {
            sum += i;
         }
      }
      return sum;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());      
      System.out.println("The answer to problem 10 is: " + problem10());      
   }  
}
