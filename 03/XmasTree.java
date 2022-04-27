public class XmasTree {

    public static void main(String[] args) {

      System.out.println("Draw your own xmas tree with multi-loop!");
      // 枝
      for(int i=0; i<10; i++){ // row
        for(int j=0; j<=10-i; j++){
            if((i+j)%2==0) {
              System.out.print("+");
            }else {
              System.out.print(" ");
            }
        }
        System.out.print(" ");
        for(int j=0; j<+2*i; j++){
          System.out.print("*");
        }
        System.out.println();
      }

      // 足
      for(int i=0; i<3; i++){
        for(int j=0; j<=20-i; j++){
          String a = " ";
          if((j == 11) || (j == 12)){
            a = "*";
          }
          System.out.print(a);
        }
        System.out.println();
      }

    }
}