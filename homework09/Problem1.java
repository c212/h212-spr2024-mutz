public class Problem1 {
    //Finding the maximum in an array
    public static void main(String[] args) {
        int[] testA = {};
        System.out.println(find_maximum(testA));
    }

    static int find_maximum(int[] A){
        int currMax = -1;

        for(int curr : A){
            if(curr >= currMax){
                currMax = curr;
            }
        }

        return currMax;
    }
}
