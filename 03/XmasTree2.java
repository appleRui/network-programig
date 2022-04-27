public class XmasTree2 {

    public static void main(String[] args) {

      for(int i=0; i<6; i++){
        for(int j=0; j<=20-i; j++){
          String a = " ";
          if((j == 10) || (j == 11)){
            a = "*";
          }
          System.out.print(a);
        }
        System.out.println();
      }
    }
}