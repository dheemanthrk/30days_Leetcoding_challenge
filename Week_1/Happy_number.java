import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public boolean isHappy(int n) {
		//keeps track of all previously recorded sums
        ArrayList<Integer> previous = new ArrayList<>();
        while (true){
            int sum = 0;
            while (n>9){
                sum+=Math.pow(n%10, 2);
                n /= 10;
                n = (int)n;
            }
			//add the ones digit's square
            sum+=Math.pow(n, 2);
            if (sum==1){
                return true;
			//return false if the sum is already in the list, as that means there is a cycle
            }else if (previous.contains(sum)){
                return false;
            }
			//add the sum to the list
            previous.add(sum);
            n=sum;
        }
    }
}