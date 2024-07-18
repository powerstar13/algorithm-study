package com.example.study.hackkerrank;

import org.springframework.stereotype.Component;

import java.util.List;

/*
https://www.hackerrank.com/test/4ckjkji3bql/questions/6tr1flcoeek

<div class="ps-content-wrapper-v0">
<!--
<p>Jack was trying to go up the hill. He does not&nbsp;have any problem in climbing&nbsp;up or coming down&nbsp;the hill if the slope is consistently either increasing or decreasing. Areas where the slope is constant do not bother him in either situation.</p>

<p>&nbsp;</p>

<p>Given a list of heights along his path, find the minimum amount to add or subtract to each offending height to make the <em>slope</em> meet Jack&#39;s requirements.&nbsp; Heights may be increased or decreased as necessary.&nbsp; The value of a change is absolute.&nbsp; In other words, if a height 10 is increased or decreased to 13 or 7, the change, or <em>cost</em>, is 3.&nbsp;</p>

<p>&nbsp;</p>

<p>The following is an example of an array describing a generally increasing set of heights making a slope: [ 0, 1, 2, 5, 6, 5, 7]. The minimum changes required will result from making the slope increasing along its length.&nbsp; Even though the slope varies, it is always increasing over the subarray [0, 1, 2, 5, 6], so no changes are made along that range.&nbsp; The height at array position 5, value = 5,&nbsp;must be raised to at least 6, making the slope flat, so add 1.&nbsp; Now test against the remaining value, position 6, value = 7. The new height 6 &lt; 7 and the rule holds.&nbsp; The cost of the necessary changes is 1.&nbsp;&nbsp;</p>
-->
<p>Given an array of integers, <s>t</s>he cost to change an element is the absolute difference between its initial value and its new value. For example, if the element is initially <em>10</em>, it can be changed to <em>7</em>&nbsp;or <em>13</em>&nbsp;for a cost of <em>3. </em>Determine the minimum cost to sort the array either ascending or descending along its length.</p>

<p>&nbsp;</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Example</strong></p>

<p><em>n = 6</em></p>

<p><em>arr = [0, 1, 2, 5, 6, 5, 7]</em></p>

<p>&nbsp;</p>

<ul>
	<li>Only <em>arr[5] = 5</em>&nbsp;violates the order for an ascending sort.</li>
	<li>If the value 5 is increased to <em>6,</em>the array will be sorted in ascending order: <em>arr' = [0, 1, 2, 5, 6, 6, 7].</em>&nbsp;</li>
	<li>The cost is <em>| arr[5] - arr'[5] | = | 5 - 6 | = 1.</em>
</li>
</ul>

<p>&nbsp;</p>

<p class="section-title" data-a11y="p-s-t" role="heading" aria-level="4">Function Description</p>

<p>Complete the <em>modifyArray</em> function in the editor below.</p>

<p>&nbsp;</p>

<p>modifyArray has the following parameters:</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;<em>int arr[n]:&nbsp;&nbsp;</em>an array of integers</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Returns</strong></p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;<em>int </em>: an integer that denotes the minimum cost required to make the array ascending (non-decreasing) or descending (non-increasing) along its length.</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Constraints</strong></p>

<ul>
	<li><em>1 ≤ n ≤ 10<sup>3</sup> &nbsp;</em></li>
	<li><em>1 ≤ arr[i] ≤ 10<sup>9</sup></em></li>
</ul>

<details title="Click bar to open/close."><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Input Format for Custom Testing</span></summary>

<p>Input from stdin will be processed as follows and passed to the function.</p>

<p>&nbsp;</p>

<p>The first line contains the integer <em>n,</em> the number of elements in <em>arr</em>.</p>

<p>The next <em>n</em> lines each contain an integer, <em>arr[i]</em><em>.</em></p>
</details>

<details open="open"><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Sample Case 0</span></summary>

<p data-a11y="d-p-str" role="heading" aria-level="5"><strong>Sample Input 0</strong></p>

<pre>STDIN&nbsp;&nbsp;&nbsp;&nbsp; Function
-----&nbsp;&nbsp;&nbsp;&nbsp; --------
6 &nbsp;&nbsp;&nbsp;&nbsp;→&nbsp;&nbsp;&nbsp;arr[] size n = 6
9 &nbsp;&nbsp;&nbsp;&nbsp;→&nbsp;&nbsp;&nbsp;arr = [9, 8, 7, 2, 3, 3]
8
7
2
3
3
</pre>

<p>&nbsp;</p>

<p data-a11y="d-p-str" role="heading" aria-level="5"><strong>Sample Output 0</strong></p>

<pre>1</pre>

<p>&nbsp;</p>

<p data-a11y="d-p-str" role="heading" aria-level="5"><strong>Explanation 0</strong></p>
&nbsp;

<ul>
	<li>Only <em>arr[3] = 2</em>&nbsp;violates the array descending order.</li>
	<li>If the value 2 is increased to 3<em>,</em>&nbsp;the array will be sorted in descending order: <em>arr' = [9, 8, 7, 3, 3, 3].</em>
</li>
	<li>The minimum cost to sort it&nbsp; in descending order is&nbsp; <em>| arr[3] - arr'[3] | = | 2- 3 | = 1.</em>
</li>
</ul>

<p>&nbsp;</p>
</details>

<details title="Click bar to open/close the example."><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Sample Case 1</span></summary>

<p data-a11y="d-p-str" role="heading" aria-level="5"><strong>Sample Input 1</strong></p>

<pre>STDIN&nbsp;&nbsp;&nbsp;&nbsp; Function
-----&nbsp;&nbsp;&nbsp;&nbsp; --------
5 &nbsp;&nbsp;&nbsp;&nbsp;→&nbsp;&nbsp;&nbsp;arr[] size n = 5
1 &nbsp;&nbsp;&nbsp;&nbsp;→&nbsp;&nbsp;&nbsp;arr = [1, 2, 3, 3, 4]
2
3
3
4
</pre>

<p>&nbsp;</p>

<p data-a11y="d-p-str" role="heading" aria-level="5"><strong>Sample Output 1</strong></p>

<pre>0</pre>

<p>&nbsp;</p>

<p data-a11y="d-p-str" role="heading" aria-level="5"><strong>Explanation 1</strong></p>
&nbsp;

<ul>
	<li>The array arr is already sorted in ascending order.</li>
	<li>The minimum cost to sort it&nbsp; in ascending order is <i>0.</i>
</li>
</ul>
</details>
</div>
 */
@Component
class ModifyAnArray {
    /*
     * Complete the 'modifyArray' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public long modifyArray(List<Integer> arr) {
        int n = arr.size();
        long[] increasing = new long[n];
        long[] decreasing = new long[n];
        increasing[0] = 0;
        decreasing[0] = 0;
        for (int i = 1; i < n; i++) {
            increasing[i] = increasing[i - 1] + Math.max(0, arr.get(i - 1) - arr.get(i));
            decreasing[i] = decreasing[i - 1] + Math.max(0, arr.get(i) - arr.get(i - 1));
        }
        return Math.min(increasing[n - 1], decreasing[n - 1]);
    }
}
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine().replaceAll("\\s+$", "");
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        long result = Result.modifyArray(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }