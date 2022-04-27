public class sample {
    public static void main(String[] main) {
        // クリスマスツリーを自由に大きくしたり小さくしたりできる。
        int len = 100;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                if (j % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int k = 0; k < 4; k++) {
            for (int i = 1; i <= len * 2; i++) {
                if (i == len - 2) {
                    System.out.print("****");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}