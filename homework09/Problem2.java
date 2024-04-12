public class Problem2 {
    //Reverse subarray recursively
    public static void main(String[] args) {
        char[] testB = {'a', 'b', 'c', 'd', 'e'};

        reverse(testB, 0, 3);
        System.out.println(testB);
    }

    static void reverse(char[] s, int begin, int end){
        //Base case
        if(begin >= end) return;
        if(begin < 0 || begin > s.length-1 ||
           end > s.length) return;

        //Swap current
        char temp = s[begin];
        s[begin] = s[end-1];
        s[end-1] = temp;

        //Recursive call
        reverse(s, begin+1, end-1);
    }
}
