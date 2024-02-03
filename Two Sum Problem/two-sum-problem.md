# Q1
[The Two Sum Problem](https://leetcode.com/problems/two-sum/)

## Learnings:
Python:
* nums.index(i)
Java:
* [Arrays in java](https://www.w3schools.com/java/java_arrays.asp)
* System.out.println(Arrays.toString(res));
* [Arrays vs ArrayList](https://www.stechies.com/difference-between-array-arraylist-java/)
* to find the type of variable do variable.getClass().getName()

## Python:
### Brute force:
```python
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        res=[]
        for i in range(0,len(nums)):
            for j in range(0,len(nums)):
                if i!=j and nums[i]+nums[j] == target:
                    res =  [i,j]
        return res
```     
        
### Optimized:
```python
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(0,len(nums)):
            rem=target-nums[i]
            if rem in nums and nums.index(rem)!=i:
                return [i,nums.index(rem)]
        return []
```

## Java
### Brute force
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i< nums.length;i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
```

### Optimized
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toList());
        ArrayList<Integer> newNums = new ArrayList<>(list);
        for(int i=0;i< nums.length;i++) {
            if(newNums.contains(target-nums[i]) && newNums.indexOf(target-nums[i])!=i){
                return new int[]{i, newNums.indexOf(target-nums[i])};
            }
        }
        return new int[0];
    }
}
```

## To learn:
1. Hash Table ([Link](https://www.youtube.com/watch?v=FsfRsGFHuv4))
2. 
