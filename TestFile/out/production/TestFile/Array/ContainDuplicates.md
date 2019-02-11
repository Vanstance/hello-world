ContainDuplicates

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

**Example 1:**

```java
Input: [1,2,3,1]
Output: true
```

**Example 2:**

```java
Input: [1,2,3,4]
Output: false
```

**Example 3:**

```java
Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
```

解法：

先排序，排序之后看是否存在相同的值