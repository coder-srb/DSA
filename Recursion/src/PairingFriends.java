/* 62.
    Given n friends, each one can remain single or can be paired up with some other friend.
    Each friend can be paired only once. Find out the total number of ways
    in which friends can remain single or can be paired up.
*/

public class PairingFriends {

    static int friendsPairing(int n) {
        // base condition
        if (n == 1 || n == 2) {
            return n;
        }

        // single
        int fnm1 = friendsPairing(n - 1);

        // pairs
        int fnm2 = friendsPairing(n - 2);
        int pairsWays = (n - 1) * fnm2;

        int totalWays = fnm1 + pairsWays;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
