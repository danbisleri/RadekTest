
public class StringUtil {

   public int CalcLength(String text) {
      String[] arrayText = text.split("");
      String charTest;
      int count = 0;

      for (int i = 0; i < 40000; i++) {
         try {
            charTest = arrayText[i];
            count++;
         } catch (Exception e) {
            break;
         }
      }

      return count;
   }

}
