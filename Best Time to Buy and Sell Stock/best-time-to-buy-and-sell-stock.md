# Q121
[Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/)

## Learnings:
Python:
*
* 

Java:
* 
* 

## Python:  
        
### Brute force:
```python
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0
        i=0
        j=1
        while j<len(prices):      
            if prices[i] < prices[j]:
                    maxP = max( maxP, prices[j]-prices[i])
            else:
                i=j
            j+=1
            
        return maxP
```

### Optimized:
```python
``` 


## Java
### Brute force
```java

```

### Optimized
```java
```

## To learn:
1. 
2. 
