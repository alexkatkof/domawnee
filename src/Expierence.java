

import java.util.Scanner;

public class Expierence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int top = scanner.nextInt();
        for (int i = 2; i < top; i++){
            if(prostoe(i))
                System.out.println(i);
        }
    }

    public static boolean prostoe(int i){
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i){
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }
}
