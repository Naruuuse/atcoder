import java.util.*;
import static java.lang.System.*;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();

    int num = 0;
    for (int i = 0; i <= a; i++) {
      for (int j = 0; j <= b; j++) {
        for (int k = 0; k <= c; k++) {
          if (500 * i + 100 * j + 50 * k == x)
            num++;
        }
      }
    }
    out.println(num);
  }
}