public class FindMinimum{
   public static int findMin(){
      int minNum = 100;
      for (int i = 0; i < 10; i++){
         int randNum = (int) (Math.random() * 100);
         if (randNum > minNum){
            minNum = randNum;
         }
      }
      return minNum;
   }
   public static void main(String[] args) {
      System.out.println("Results = " + findMin());
   }
}