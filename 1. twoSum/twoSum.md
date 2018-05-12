# Two Sum

## 题目介绍

给一组int，如果其中两个数的和=target，返回两个数的序号。

```
Given nums = [2, 7, 11, 15], target = 9,
因为 nums[0]+nums[1]=2+7=9,
retrun[0,1]
```

## 思路

因为只有两个数的和，即x+y =target，可以让x=target-y, 这样求出两者相等时候的x和y的序号。

## 答案

```java
class solution{
    public int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length, i++){
            for(int j =i+1; j <nums.length; j++){
                if(nums[j]=target - nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two Sum solution");
    }
}
```

