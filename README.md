# SlidingWindowDSA
Java implementations of sliding window algorithms: baseline sums and maximum average subarrays.
# Sliding Window DSA Solutions

This repository contains Java implementations of **sliding window techniques** for array problems. It demonstrates both the **basic sliding window** and the **maximum average subarray** approach, helping to understand how baseline logic can be adapted for real-world problems.

## Files

### 1. SlidingWindowBaseline.java
- Calculates the sum of each subarray of size `k`
- Demonstrates the **basic sliding window concept**
- Prints each window's sum for clarity

### 2. SlidingWindowMaxAverage.java
- Finds the **maximum average subarray** of size `k`
- Tracks the **maximum sum** using `Math.max`
- Computes average by dividing max sum by `k`
- Shows how to extend the baseline sliding window logic for optimization problems

## Skills Demonstrated
- Sliding window algorithm  
- Array manipulation  
- Tracking and comparing values efficiently  
- Problem-solving for subarray optimization  
- Writing clean, readable Java code

## Example Usage

```java
int[] nums = {1, 12, -5, -6, 50, 3};
int k = 4;
