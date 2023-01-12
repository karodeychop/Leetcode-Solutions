class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] output = new int[2]; //hold output indices

        //if only 2 possible choices then they must be valid
        if(nums.length == 2){
            output[0] = 0;
            output[1] = 1;
        }else{

            boolean found = false; //jump out of loops

            for(int i = 0; i < nums.length && found != true; i++) {

                for(int j = 0; j < nums.length && found != true; j++) {
                    //if j == i skip
                    //else check if nums[i] + nums[j] == target if so return [i,j]
                    if(j != i){
                        if((nums[i] + nums[j]) == target) {
                            found = true;
                            output[0] = i;
                            output[1] = j;
                            }
                        } 
                    }
                }
            }
            return output;
        }
    }