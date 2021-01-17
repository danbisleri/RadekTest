
public class Main {

   public static void main(String[] args) {
      int length;
      String text;

      StringUtil su = new StringUtil();

      text = "Oi tudo bem?";
      length = su.CalcLength(text);
      System.err.println(text);
      System.err.println(length);

      text = "Pneumoultramicroscopicossilicovulcanoconiótico";
      length = su.CalcLength(text);
      System.err.println(text);
      System.err.println(length);

   }

}
