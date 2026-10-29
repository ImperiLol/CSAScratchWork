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
      while (b <= 4000000) {
         if (b % 2 == 0) {
            sum += b;
         }
         int next = a + b;
         a = b;
         b = next;
      }
      return sum;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());      
   }  
}
