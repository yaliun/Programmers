package net.yaliun.lvl_1;

import java.util.Arrays;

public class GetMinMaxString {

    public String getMinMaxString(String str) {
    	  
        String[] array = str.split(" ");
        
        int[] nums = new int[array.length];
        
        for(int i = 0; i < array.length; i++){
        	nums[i] = Integer.parseInt(array[i]);
        }
        
        Arrays.sort(nums);
        
        int min = nums[0];
        int max = nums[nums.length -1];
       
        return min + " " + max;
  
    }

    public static void main(String[] args) {
        String str = "-1 -2 -3 -4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
