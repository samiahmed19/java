// Given an array of non-negative integers representing an elevation map,
// compute how much water it can trap after raining.

// Define a method called trapWater that takes an array of non-negative integers
// (heights) as input and returns an integer representing the total amount of
// water trapped.
// Inside the trapWater method, initialize two variables: totalWater to keep
// track of the accumulated water and leftMax and rightMax to store the maximum
// heights on the left and right sides, respectively. Initialize them to 0.
// Define two pointers, left and right, pointing to the start and end of the
// heights array.
// While left is less than or equal to right, do the following:
// Check if heights[left] is less than or equal to heights[right]:
// If true, compare heights[left] with leftMax:
// If heights[left] is greater than leftMax, update leftMax to heights[left].
// If heights[left] is less than or equal to leftMax, calculate the water
// trapped at the current position (left) as leftMax - heights[left] and add it
// to totalWater.
// Increment left by 1.
// If false, do the same steps as above, but with heights[right] instead of
// heights[left].
// Finally, return the totalWater calculated.
class trapWater{
    public static int trapWater(int heights[]){
        int totalWater,leftMax,rightMax,left,right;
        leftMax=0;rightMax=0;totalWater=0;left=0;right=heights.length-1;
        // while(left<=right){
        //     if(height[left]<=height[right]){
        //         height[left]=leftMax;
        //     }
        //     else if(height[left]>leftMax){
        //         leftMax=height[left];
        //     }
        //     else if(height[left]<=leftMax){
        //         int currPos=leftMax-height[left]+totalWater;
        //         left++;
        //     }
        //     else{
        //         if(height[right]<=height[left]){
                
        //     }
        //     else if(height[right]>rightMax){
        //         rightMax=height[right];
        //     }
        //     else if(height[right]<=rightMax){
        //         int currPos=rightMax-height[right]+totalWater;
        //         right++;
        //     }

        //     }
        // }
        // return right;
        while (left <= right) {
            if (heights[left] <= heights[right]) {
                if (heights[left] > leftMax) {
                    leftMax = heights[left];
                } else {
                    totalWater += leftMax - heights[left];
                }
                left++;
            } else {
                if (heights[right] > rightMax) {
                    rightMax = heights[right];
                } else {
                    totalWater += rightMax - heights[right];
                }
                right--;
            }
        }

        return totalWater;
    }
    public static void main(String[] args) {
        // trapWater wt = new trapWater();
        int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater = trapWater(heights);
        System.out.println("Total water trapped: " + trappedWater);
    }
}