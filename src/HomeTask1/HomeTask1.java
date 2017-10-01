package HomeTask1;

public class HomeTask1 {

    public Cortege findMaxCrossSubArray (int[] array, int low, int mid, int high){
        int leftSum = array[mid];
        int sum = leftSum;
        int maxLeftIndex = mid;
        for (int i = mid - 1; i >= low; i--){
            sum +=array[i];
            if (sum > leftSum){
                leftSum = sum;
                maxLeftIndex = i;
            }
        }

        int rightSum = array[mid + 1];
        sum = rightSum;
        int maxRightIndex = mid + 1;
        for (int j = mid + 2; j <= high; j++){
            sum += array[j];
            if (sum > rightSum){
                rightSum = sum;
                maxRightIndex = j;
            }
        }

        return new Cortege(maxLeftIndex, maxRightIndex , leftSum + rightSum);
    }

    public Cortege findMaxSubArray (int[] array, int low, int high){

        if (low == high)
            return new Cortege(low, high, array[low]);
        else{
            int mid = (high + low) / 2;
            Cortege leftCortege = findMaxSubArray(array,low, mid);
            Cortege rightCortege = findMaxSubArray(array,mid + 1, high);
            Cortege crossCortege = findMaxCrossSubArray(array, low, mid, high);

            if ((leftCortege.sum >= rightCortege.sum) && (leftCortege.sum > crossCortege.sum)){
                return leftCortege;
            }
            if ((rightCortege.sum >= leftCortege.sum) && (rightCortege.sum > crossCortege.sum)){
                return rightCortege;
            }
            else
                return crossCortege;

        }
    }
}
