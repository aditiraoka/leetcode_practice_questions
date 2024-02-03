# Q1
[Valid Parentesis Problem](https://leetcode.com/problems/valid-parentheses/)

## Learnings:
Python:
* 

Java:
* use s.charAt(i) instead of s[i]
* 

## Python:  
        
### Brute force:
```python
class Solution:
    def isValid(self, s: str) -> bool:
        brackets = {')': '(', '}': '{', ']': '['}
        stack=[]
        for char in s:
            if char in brackets.values():
                stack.append(char)
            elif char in brackets.keys():
                if stack==[] or brackets[char]!=stack.pop():
                    return False
            else:
                return False
        return stack==[]
```

### Optimized:
```python
class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        for char in s:
            if char in "([{":
                stack.append(char)
            else:
                if not stack or (char in ")" and stack[-1] != "(") or \
                    (char in "]" and stack[-1] != "[") or \
                    (char in "}" and stack[-1] != "{"):
                    return False
                stack.pop()
        return not stack
``` 


## Java
### Brute force
```java

```

### Optimized
```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();        
    }
}
```

## To learn:
1. Hash Table ([Link](https://www.youtube.com/watch?v=FsfRsGFHuv4))
2. 
