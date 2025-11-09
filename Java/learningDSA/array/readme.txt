✅ 2. Algorithm skills you must learn for Arrays
✅ 1) Two Pointers Technique

Use when:

The array is sorted

Need to find a pair/triplet

Need to move from both ends

Common problems:

Two Sum II

3Sum

Remove Duplicates from Sorted Array

Container With Most Water

✅ 2) Sliding Window

Use when:

The problem involves subarrays (continuous segments)

Finding maximum/minimum subarray length

Counting subarrays with conditions

Examples:

Longest Substring Without Repeating Characters

Minimum Window Substring

Sliding window maximum (hard)

You should know:

Fixed window

Dynamic window (expand → shrink)

✅ 3) Prefix Sum

Use when:

Need to calculate sum of subarrays fast

Want to reduce nested loops

Key idea:

prefix[i] = prefix[i-1] + nums[i]
subarray sum = prefix[r] - prefix[l-1]


Common problems:

Subarray Sum Equals K

Range Sum Query

Count number of subarrays with sum divisible by k

✅ 4) Sorting + Arrays

You should know:

Built-in sort: Arrays.sort(arr)

How sorting helps:

Two pointers

Removing duplicates

Grouping anagrams