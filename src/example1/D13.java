package example1;
// continue örneği
public class D13 {
    public static void main(String[] args) {
        for (int i = 0 ; i < 20 ; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
