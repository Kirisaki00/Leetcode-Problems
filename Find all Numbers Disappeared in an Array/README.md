# 448. Find All Numbers Disappeared in an Array

🔗 Problem Link:
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

Difficulty: **Easy**
Topic: **Array**

---

# Problem Statement

Given an array `nums` of `n` integers where `nums[i]` is in the range `[1, n]`, return an array of all the integers in the range `[1, n]` that do **not appear** in `nums`.

---

# Examples

### Example 1

Input

```
nums = [4,3,2,7,8,2,3,1]
```

Output

```
[5,6]
```

---

### Example 2

Input

```
nums = [1,1]
```

Output

```
[2]
```

---

# Constraints

* `n == nums.length`
* `1 ≤ n ≤ 10^5`
* `1 ≤ nums[i] ≤ n`

---

# Approach

This solution uses a **helper array** to track which numbers appear in the input array.

### Steps

1. Create an auxiliary array `arr` of size `n + 1`.
2. Traverse the input array `nums`.
3. For each number `x`, mark its presence using:

```
arr[x] = x
```

4. Traverse the helper array from `1` to `n`.
5. If `arr[i] == 0`, the number `i` did not appear in the original array.
6. Add such numbers to the result list.

---

# Java Solution

```java
import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int arr[] = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++){
            arr[nums[i]] = nums[i];
        }

        List<Integer> res = new ArrayList<>();

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 0){
                res.add(i);
            }
        }

        return res;
    }
}
```

---

# Complexity Analysis

| Type             | Complexity |
| ---------------- | ---------- |
| Time Complexity  | **O(n)**   |
| Space Complexity | **O(n)**   |

Explanation:

* The array is traversed twice.
* An additional helper array of size `n` is used.

---

# Key Idea

Since every value should be within the range `[1, n]`, we can use an auxiliary array to mark which numbers appear.

Indices that remain **0** represent the missing numbers.

---

# Result

The solution was accepted on LeetCode.

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/208c8304-f191-416b-88fd-004fcadb20b6" />


---

# Follow Up

The problem also asks whether it can be solved:

* in **O(n) time**
* **without extra space**

This can be done by modifying the input array itself and marking visited indices using negative values.

---
