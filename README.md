# BogoSort Algorithm in Java

A simple implementation of the BogoSort (permutation sort) algorithm in Java.

## How It Works

BogoSort repeatedly shuffles the array randomly until it happens to be sorted. It is one of the most inefficient sorting algorithms and is mainly used for educational purposes.

1. Check if the array is sorted.
2. If sorted, print the result and stop.
3. If not, randomly shuffle the array using Fisher-Yates shuffle.
4. Repeat from step 1.

## Time Complexity

| Case    | Complexity |
|---------|------------|
| Best    | O(n)       |
| Average | O(n * n!)  |
| Worst   | O(∞)       |

## Usage

Compile and run:

```bash
javac src/BogoSort.java
java -cp src BogoSort
```
