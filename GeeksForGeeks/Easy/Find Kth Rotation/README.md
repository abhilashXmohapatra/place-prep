# Find Kth Rotation

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/rotation4723/1?utm=codolio)

## Solved On
07 Aug 2026 at 08:52 am

<h2><a href="https://www.geeksforgeeks.org/problems/rotation4723/1?utm=codolio">Find Kth Rotation</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">Given an increasing sorted rotated array <strong>arr[] </strong>of distinct integers. The array is right-rotated&nbsp;<strong>k</strong>&nbsp;times. Find the value of&nbsp;<strong>k</strong>.<br>Let's suppose we have an array arr[] = [2, 4, 6, 9], if we rotate it by 2 times it will look like this:<br>After 1st Rotation : [9, 2, 4, 6]<br>After 2nd Rotation : [6, 9, 2, 4]</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [5, 1, 2, 3, 4]
<strong>Output:</strong> 1
<strong>Explanation:</strong> The given array is [5, 1, 2, 3, 4]. The original sorted array is [1, 2, 3, 4, 5]. We can see that the array was rotated 1 times to the right.<br></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr = [1, 2, 3, 4, 5]
<strong>Output:</strong> 0
<strong>Explanation:</strong> The given array is not rotated.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ arr.size() ≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>7</sup></span></p>