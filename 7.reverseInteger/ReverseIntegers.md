### ReverseIntegers

## 题目介绍

Given a 32-bit signed integer, reverse digits of an integer.

**Example 1:**

```
Input: 123
Output: 321
```

**Example 2:**

```
Input: -123
Output: -321
```

**Example 3:**

```
Input: 120
Output: 21
```

**Note:**
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

## 思路

把输入的数字x先mod，设结果y=0,  y*10+mod, 再把x/10 (去掉最后一位)。 再循环.

题目的难点在于本身要求你对数据的溢出做判断，

思路1: 直接更改int成long，但是这样就就没办法判断溢出了

思路2：reverse之后再反过来看看答案和输入是否一致

## 代码

```java
class Solution {
    public int reverse(int x) {
      int answer = 0;
        
        while(x!=0){           
            int remainder = x %10;
            int newAnswer = answer *10 + remainder;

            if ((newAnswer - remainder) / 10 != answer)
                { return 0; }
           answer = newAnswer;
           x = x/10;
        }   
    return answer;
    }  
}
```

