

public class Example {

    static void print(int n) {
        //base condition
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + ", ");
        print(n - 1);
        System.out.print(n + ", ");
    }

    public static void main(String[] args) {
        print(5);
    }
}
