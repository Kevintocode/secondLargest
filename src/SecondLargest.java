public class SecondLargest {
    public SecondLargest(){


    }

    public int secLar(int[] nums){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                secondMax = max;
                max = nums[i];
            }
        }

    return secondMax;
    }

    public static void main(String[] args){

        int[] mynums = new int[]{1,2,3,4,5,8};
        SecondLargest mylar = new SecondLargest();
        System.out.println(mylar.secLar(mynums));



    }


}
