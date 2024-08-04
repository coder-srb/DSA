// 42. i.find ith bit,
// ii. set the ith bit to 1
// iii. clear the ith bit or set the ith bit to 0
// iv. update the ith bit to given bit.

public class ith_bit {

    // find ith bit
    static int get_ith_Bit(int num, int i){
        int bitMask = 1 << i;
        if((num & bitMask) == 0){
            return 0;
        }else return 1;
    }

    // set the ith bit to 1
    static int set_ith_Bit(int num, int i){
        int bitMask = 1<<i;
        return num | bitMask;
    }

    // clear the ith bit or set the ith bit to 0
    static int clear_ith_Bit(int num, int i){
        int bitMask = 1<<i;
        return num & ~bitMask;
    }

    // update the ith bit to given bit.
    static int update_ith_Bit(int num, int i, int newBit){
        if(newBit == 0) return clear_ith_Bit(num, i);
        else return set_ith_Bit(num, i);

//        num = clear_ith_Bit(num, i);
//        int bitMask = newBit << i;
//        return num | bitMask;
    }

    public static void main(String[] args) {
        int num = 17;
        int i = 1;
        System.out.println(get_ith_Bit(num,i));
        System.out.println(set_ith_Bit(num, i));
        System.out.println(clear_ith_Bit(num,0));
        System.out.println(num + " "+ i);
        System.out.println(update_ith_Bit(num, i, 1));
    }
}
