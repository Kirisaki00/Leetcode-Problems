# 1768. Merge Strings Alternately

**Difficulty:** Easy
**Language:** Java
**LeetCode:** [1768. Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/)

---

## 📝 Problem

Given two strings `word1` and `word2`, merge them by adding their characters in alternating order, starting with `word1`.

If one string is longer than the other, append the remaining characters to the end of the merged string.

### Example 1

```text
Input:
word1 = "abc"
word2 = "pqr"

Output:
"apbqcr"
```

### Example 2

```text
Input:
word1 = "ab"
word2 = "pqrs"

Output:
"apbqrs"
```

### Example 3

```text
Input:
word1 = "abcd"
word2 = "pq"

Output:
"apbqcd"
```

---

## 💡 Approach

The solution uses a single loop to traverse both strings simultaneously.

1. Find the length of the longer string using `Math.max()`.
2. Start from index `0`.
3. If the current index exists in `word1`, append that character.
4. If the current index exists in `word2`, append that character.
5. Continue until all characters from both strings have been processed.
6. Convert the `StringBuilder` into a `String` and return it.

### Why `StringBuilder`?

Java `String` objects are immutable. Repeatedly using:

```java
newWord = newWord + character;
```

can create many temporary `String` objects.

`StringBuilder` is mutable, so characters can be appended efficiently:

```java
newWord.append(word1.charAt(i));
```

Finally:

```java
return newWord.toString();
```

converts the `StringBuilder` into the required `String`.

---

## 💻 Java Solution

```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int maxwrd = Math.max(word1.length(), word2.length());
        StringBuilder newWord = new StringBuilder();

        int i = 0;

        while (i < maxwrd) {
            if (i < word1.length()) {
                newWord.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                newWord.append(word2.charAt(i));
            }

            i++;
        }

        return newWord.toString();
    }
}
```

---

## ⏱️ Complexity Analysis

Let:

* `n` = length of `word1`
* `m` = length of `word2`

### Time Complexity

**O(n + m)**

Each character from both strings is processed exactly once.

### Space Complexity

**O(n + m)**

The `StringBuilder` stores the final merged string.

---

## 🔑 Key Concepts

* `StringBuilder`
* `charAt()`
* `length()`
* `Math.max()`
* String traversal
* Conditional indexing
* Time and space complexity

---

## 📌 Key Takeaway

The important optimization is using `StringBuilder` instead of repeatedly concatenating immutable `String` objects.

```java
StringBuilder result = new StringBuilder();

result.append(character);

return result.toString();
```

This provides an efficient **O(n + m)** solution.

---

### Tags

`Java` `String` `StringBuilder` `Two Pointers` `LeetCode` `Easy`
