package com.example.study.hackkerrank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
https://www.hackerrank.com/test/4ckjkji3bql/questions/6rb1l94ha7o

<div id="6rb1l94ha7o-instruction"><p>The developers of Hackerland have designed a new algorithm that inputs an array&nbsp;<em>arr</em> and returns a new sorted array:</p>

<ul>
	<li>Select any two indices&nbsp;<em>i&nbsp;</em>and&nbsp;<em>j</em>&nbsp;such that&nbsp;1 ≤ <em>i</em>,&nbsp;&nbsp;<em>j&nbsp;</em>≤ length of(arr)</li>
	<li>Remove the elements&nbsp;<em>arr[i]&nbsp;</em>and&nbsp;<em>arr[j]</em>&nbsp;from the array</li>
	<li>Insert&nbsp;<em>arr[i] + arr[j]&nbsp;</em>at any position in the array</li>
</ul>

<p>&nbsp;</p>

<p>We repeat the above steps until a sorted array is obtained. Given an array <em>arr</em>&nbsp;of <em>n&nbsp;</em>integers, find the minimum number of iterations of the above algorithm required to make a sorted array.</p>

<p>
<style type="text/css">.ps-content-wrapper-v0 div { margin: 0 auto; overflow: auto; } .ps-content-wrapper-v0 div.preheader { display: none; } .ps-content-wrapper-v0 p { white-space: pre-wrap; padding-left: 4px; padding-right: 4px; padding-top: 0px; padding-bottom: 2px; } .ps-content-wrapper-v0 p.section-title { font-weight: bold; padding-bottom: 0px; } .ps-content-wrapper-v0 ol.plain-list, .ps-content-wrapper-v0 ul.plain-list { list-style-type: none; padding: 4px; } .ps-content-wrapper-v0 li { white-space: normal; margin-top: 4px; margin-bottom: 4px; } .ps-content-wrapper-v0 code { color: black; } .ps-content-wrapper-v0 pre { background-color: #f4faff; border: 0; border-radius: 2px; margin: 8px; padding: 10px; } .ps-content-wrapper-v0 pre.scrollable-full-json { overflow-x: scroll; white-space: pre; } .ps-content-wrapper-v0 pre.scrollable-json { height: 300px; overflow-y: scroll; display: inline-grid; white-space: pre-wrap; padding-left: 8px; padding-right: 8px; padding-top: 4px; padding-bottom: 4px; } .ps-content-wrapper-v0 div.equation-parent { width: 400px; text-align: center; border: 1px solid #000; padding: 8px; } .ps-content-wrapper-v0 div.equation-parent.equation { width: 100%; display: inline-block; } .ps-content-wrapper-v0 figure { background-color: transparent; display: table; margin-top: 8px; margin-bottom: 8px; text-align: center; margin-left: auto; margin-right: auto; } .ps-content-wrapper-v0 figcaption { text-align: center; display: table-caption; caption-side: bottom; margin-top: 4px; margin-bottom: 4px; } .ps-content-wrapper-v0 img { width: auto; max-width: 100%; height: auto; } .ps-content-wrapper-v0 details { background-color: transparent; padding-left: 4px; padding-right: 4px; padding-top: 0px; padding-bottom: 2px; } .ps-content-wrapper-v0 details details { padding-left: 8px; padding-right: 8px; } .ps-content-wrapper-v0 details summary { background-color: #39424e; color: white; font-weight: bold; margin-top: 4px; margin-bottom: 4px; padding: 8px; } .ps-content-wrapper-v0 details details summary code { color: black; font-weight: bold; padding-left: 2px; padding-right: 2px; padding-top: 4px; padding-right: 4px; margin-left: 4px; } .ps-content-wrapper-v0 details div.collapsable-details { margin: 0 auto; padding-left: 4px; padding-right: 4px; padding-top: 0px; padding-bottom: 2px; overflow: auto; } .ps-content-wrapper-v0 details div.collapsable-details pre { margin-left: 4px; margin-right: 4px; margin-top: 4px; margin-bottom: 4px; } .ps-content-wrapper-v0 table.normal { border: 1px solid black; border-collapse: collapse; border-color: darkgray; margin: 0 auto; margin-top: 8px; margin-bottom: 8px; padding: 8px; width: 96%; table-layout: fixed; } .ps-content-wrapper-v0 table.normal tbody { display: block; overflow-x: auto; overflow-y: hidden; } .ps-content-wrapper-v0 table.normal tbody tr:first-child th { font-weight: bold; white-space: normal; } .ps-content-wrapper-v0 table.normal tbody tr th, .ps-content-wrapper-v0 table.normal tbody tr td { font-weight: normal; white-space: nowrap; text-align: center; vertical-align: middle; border: 1px solid black; border-color: darkgray; padding: 8px; } .ps-content-wrapper-v0 table.database-table { border-collapse: collapse; border-color: darkgray; border: 1px solid black; width: auto; margin-left: 4px; margin-top: 8px; margin-bottom: 8px; padding: 8px; } .ps-content-wrapper-v0 table.database-table tbody { overflow-x: auto; overflow-y: hidden; border: none; } .ps-content-wrapper-v0 table.database-table tbody tr th, .ps-content-wrapper-v0 table.database-table tbody tr td { font-weight: normal; white-space: nowrap; text-align: center; vertical-align: middle; border: 1px solid black; border-color: darkgray; padding: 8px; } .ps-content-wrapper-v0 table.database-table tbody tr th { font-weight: bold; border: 1px solid black; } .ps-content-wrapper-v0 table.database-table tbody tr:nth-child(2) td { border: 1px solid black; } .ps-content-wrapper-v0 table.database-table tbody tr:nth-child(n+2) td:first-child { border-left-color: black; } .ps-content-wrapper-v0 table.database-table tbody tr:nth-child(n+2) td:last-child { border-right-color: black; } .ps-content-wrapper-v0 table.database-table tbody tr:last-child td { border-bottom-color: black; } .ps-content-wrapper-v0 table.database-table tbody tr td.description { text-align: left; white-space: pre-wrap; } .ps-content-wrapper-v0 table.normal tbody tr th.description { width: 60%; } .ps-content-wrapper-v0 table.function-params tbody tr:first-child td.headers { border-bottom-width: 2px; } .ps-content-wrapper-v0 table.function-params tbody tr:last-child td { border-top-width: 2px; border-top-color: darkgray; } .ps-content-wrapper-v0 table.function-params tbody tr td.headers { width: 25%; font-weight: bold; text-align: center; border: 1px solid black; border-right-width: 2px; border-color: darkgray; } .ps-content-wrapper-v0 table.function-params tbody tr td.params-table-cell { width: 100%; height: 100%; padding: 0px; } .ps-content-wrapper-v0 table.function-params tbody tr td.params-table-cell table.params-table { width: 100%; height: 100%; padding: 0px; margin: 0px; border: 0; } .ps-content-wrapper-v0 table.function-params tbody tr td.params-table-cell table.params-table tbody tr td.code { white-space: normal; } .ps-content-wrapper-v0 table.function-params tbody tr td.params-table-cell table.params-table tbody tr th { border-top: 0; } .ps-content-wrapper-v0 table.function-params tbody tr td.params-table-cell table.params-table tbody tr th:first-child { border-left: 0; } .ps-content-wrapper-v0 table.function-params tbody tr td.params-table-cell table.params-table tbody tr th:last-child { border-right: 0; } .ps-content-wrapper-v0 table.function-params tbody tr td.params-table-cell table.params-table tbody tr:last-child td { border-bottom: 0; border-top-width: 1px; } .ps-content-wrapper-v0 table.function-params tbody tr td.params-table-cell table.params-table tbody tr td:first-child { border-left: 0; } .ps-content-wrapper-v0 table.function-params tbody tr td.params-table-cell table.params-table tbody tr td:last-child { border-right: 0; } .ps-content-wrapper-v0 table.sudoku { border-collapse: collapse; border-color: darkgray; margin: 0 auto; margin-top: 8px; margin-bottom: 8px; padding: 8px; } .ps-content-wrapper-v0 table.sudoku colgroup, tbody { border: 3px solid black; } .ps-content-wrapper-v0 table.sudoku td { border: 1px solid black; height: 25px; width: 25px; text-align: center; padding: 0; } .ps-content-wrapper-v0 .left { text-align: left; } .ps-content-wrapper-v0 .right { text-align: right; } .ps-content-wrapper-v0 .code { font-family: monospace; white-space: nowrap; } .ps-content-wrapper-v0 .json-object-array ol, .ps-content-wrapper-v0 .json-object-array ol ul { margin-top: 0px; padding-left: 14px; } .json-object-array li { float: left; margin-right: 30px; margin-left: 10px; } .json-object-array pre { padding: 4px; margin-left: 0px; }
</style>
</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Example</strong></p>

<div class="ps-content-wrapper-v0">
<p>Given <em>n = 5,</em> <em>arr </em>=[2, 4, 1, 3, 5].</p>

<p>In this case, the answer is 1.</p>

<p>We can pop elements 1 and 3 from the array and put their 4 just after the 2nd element. Thus, the array becomes [2, 4, 4, 5] which is sorted. It can be shown that the answer cannot be less than 1.</p>

<p>&nbsp;</p>

<p class="section-title" data-a11y="p-s-t" role="heading" aria-level="4">Function Description</p>

<p>Complete the function <em>getMinIterations</em> in the editor below.</p>

<p><em>getMinIterations</em><em> </em>has the following parameter:</p>

<p><em>&nbsp;&nbsp;&nbsp;&nbsp;arr[n]:</em>&nbsp;An array of integers</p>

<p>&nbsp;</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Returns</strong></p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;<em>int: </em>the minimum number of iterations required to create a sorted array</p>

<p>&nbsp;</p>

<p class="section-title" data-a11y="p-s-t" role="heading" aria-level="4">Constraints</p>

<ul>
	<li>1 ≤ <em>n</em>&nbsp;≤ 2 x 10<sup>5</sup>
</li>
	<li>1 ≤ arr<em>[i]</em>&nbsp;≤ 10<sup>9</sup>
</li>
</ul>

<p>&nbsp;</p>
<!-- <StartOfInputFormat> DO NOT REMOVE THIS LINE-->

<details><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Input Format For Custom Testing</span></summary>

<div class="collapsable-details">
<p>The first line contains an integer, <em>n</em>, denoting the length of the array <em>arr.</em><br>
Each line<em> </em><em>i</em> of the <em>n</em> subsequent lines (where <em>0 ≤ i &lt; n</em>) contains an integer denoting <em>arr<sub>i</sub>.</em></p>
</div>
</details>
<!-- </StartOfInputFormat> DO NOT REMOVE THIS LINE-->

<details open="open"><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Sample Case 0</span></summary>

<div class="collapsable-details">
<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Input For Custom Testing</p>

<pre>STDIN&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FUNCTION
-----&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--------
4        <b id="docs-internal-guid-b5ab89fb-7fff-6a74-1971-a670fee6b4ff">→    n = 4</b>
1        <b id="docs-internal-guid-b5ab89fb-7fff-6a74-1971-a670fee6b4ff">→    arr = [1, 3, 3, 4]</b>
3
3
4
</pre>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Output</p>

<pre>0</pre>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Explanation</p>

<p>Here <em>n </em>= 4, <em>arr </em>= [1, 3, 3, 4]. In this case, the minimum number of moves required is 0 as the array is already sorted.</p>
</div>
</details>

<details><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Sample Case 1</span></summary>

<div class="collapsable-details">
<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Input For Custom Testing</p>

<pre>STDIN&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FUNCTION
-----&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--------
6        <b id="docs-internal-guid-b5ab89fb-7fff-6a74-1971-a670fee6b4ff">→    n = 6</b>
6        <b id="docs-internal-guid-b5ab89fb-7fff-6a74-1971-a670fee6b4ff">→    arr = [6, 5, 4, 3, 1, 2]</b>
5
4
3
1
2
</pre>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Output</p>

<pre>2</pre>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Explanation</p>

<p>Given <em>n = 6,</em> <em>arr</em><em> </em>=[6, 5, 4, 3, 1, 2]. In this case, the answer is 2.</p>

<ul>
	<li>We can pop 6 and 5 from the array and put their sum i.e. 11 at the last position. The new array is [4, 3, 1, 2, 11].</li>
	<li>We can pop the first two elements i.e. 4 and 3 from the array and put their sum i.e. 7 at the last second position. The new array is [1, 2, 7, 11] which is sorted.&nbsp;</li>
</ul>

<p>It can be shown that the answer cannot be less than 2.</p>
</div>
</details>
</div>
</div>
 */
@Component
class SortedReduction {

    /*
     * Complete the 'getMinIterations' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public int getMinIterations(List<Integer> arr) {
        List<Integer> list = new ArrayList<>(arr);
        int iterations = 0;

        while (list.size() > 1) {
            Collections.sort(list, Collections.reverseOrder());
            int sum = list.get(0) + list.get(1);
            list.remove(0);
            list.remove(0);
            list.add(sum);
            iterations++;
        }

        return iterations;
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
//        int result = Result.getMinIterations(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
