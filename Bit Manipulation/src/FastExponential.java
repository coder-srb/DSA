// 47. Calculate fast Exponential

public class FastExponential {

    static int fastExpo_method1(int num, int expo) {
        int ans = 1;
        while (expo > 0) {
            if (expo % 2 == 1) {
                ans = ans * num;
                expo = expo-1;
            } else {
                expo= expo/ 2;
                num *= num;
            }
        }
        return ans;
    }

    static int fastExpo_method2(int n, int x){
        int ans = 1;
        while(x > 0){
            if((x & 1) != 0){
                ans = ans * n;
            }
            n = n*n;
            x = x>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo_method1(5, 3));
        System.out.println(fastExpo_method2(5, 3));
    }
}
