# Q125
[Valid Palindrome Problem](https://leetcode.com/problems/valid-palindrome/description/)

## Learnings:
Python:
* Pattern matching for alpha neumeric: 
	pattern = r'[^A-Za-z0-9]+'
	re.sub(pattern, '', string)
* 

Java:
* 
* 

## Python:  
        
### Brute force:
```python
class Solution:
    def isPalindrome(self, s: str) -> bool:
        pattern = r'[^A-Za-z0-9]+'
        new_s = re.sub(pattern, '', s)
        rev_s = ''
        i=len(new_s)-1
        for x in range(0, len(new_s)):
            rev_s=rev_s+new_s[i]
            i=i-1
        return new_s.lower()==rev_s.lower()
```

### Optimized:
```python
class Solution:
    def isPalindrome(self, s: str) -> bool:
        if s=='': return True
        pattern = r'[^A-Za-z0-9]+'
        new_s = re.sub(pattern, '', s).lower()
        last=len(new_s)-1
        first=0

        while first<=last:
            if new_s[first]!=new_s[last]:
                return False
            else:
                first+=1
                last-=1
        return True
``` 


## Java
### Brute force
```java
class Solution {
    public boolean isPalindrome(String s) {
        String new_s = s.replaceAll("\\p{Punct}|\\p{Space}", "").toLowerCase();
        //System.out.println(new_s);
        int len = new_s.length();
        String rev = "";
        for(int i=len-1;i>=0;i--){
            rev+=new_s.charAt(i);
        }
        //System.out.println("new_s: "+new_s);
        //System.out.println("rev  : "+rev);
        return new_s.equals(rev);
    }
}
```

### Optimized
```java
class Solution {
    public boolean isPalindrome(String s) {
        String new_s = s.replaceAll("\\p{Punct}|\\p{Space}", "").toLowerCase();
        if (new_s.isEmpty()){
            return true;
        }
        int start=0;
        int last=new_s.length()-1;

        while(start <= last){
            char currFirst = new_s.charAt(start);
            char currLast = new_s.charAt(last);
            if (currFirst!=(currLast)){
                return false;
            }
            else{
                start++;
                last--;
            }
        }
        
        return true;
    }
}
```

## To learn:
1. 
2. 
