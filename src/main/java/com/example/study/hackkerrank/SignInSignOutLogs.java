package com.example.study.hackkerrank;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/test/4ckjkji3bql/questions/bn58r9354t6
 */
@Component
class SignInSignOutLogs {
    /*
    <div class="ps-content-wrapper-v0">
<p>Application logs are used in analysis of&nbsp;interactions with an application and may be used to detect specific actions.&nbsp;</p>

<p>&nbsp;</p>

<p>A log file is provided as a string array where each entry is in the form "<em>user_id timestamp action</em>". Each of the values is separated by a space.</p>

<ul>
	<li>Both&nbsp;<em>user_id</em>&nbsp;and&nbsp;<em>timestamp</em> consist only of digits, are&nbsp;at most 9 digits long and start&nbsp;with a non-zero digit.</li>
	<li>
<em>timestamp&nbsp;</em>represents the time in seconds since the application was last launched</li>
	<li>
<em>action</em>&nbsp;will be either "sign-in" or "sign-out"</li>
</ul>

<p><br>
Given a log with entries in no particular order, return an array of strings that denote <em>user_id</em>'s of users who signed out in <em>maxSpan</em>&nbsp;seconds or less after signing in.&nbsp;</p>

<p>&nbsp;</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Example</strong></p>

<p><em>n = 7</em></p>

<p><em>logs = ["30 99 sign-in",&nbsp;"30 105 sign-out",&nbsp;"12 100 sign-in",&nbsp;"20 80 sign-in",&nbsp;"12 120 sign-out",&nbsp;"20 101 sign-out", "21 110 sign-in"]</em></p>

<p><em>maxSpan = 20</em></p>

<p>&nbsp;</p>

<pre>ID  Sign in  Sign out  Time delta
--&nbsp;&nbsp;-------  --------  ----------
30  99       105&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 6
12  100&nbsp;&nbsp;&nbsp;&nbsp;  120&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;20
20&nbsp;&nbsp;80&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;101&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;21
21&nbsp;&nbsp;110

</pre>

<p>&nbsp;</p>

<p>The&nbsp;users with id's 30 and 12 were not signed in for more than <em>maxSpan = 20</em>&nbsp;seconds.&nbsp; In sorted numerical order, the return array is<em> ["12", "30"]</em>.</p>

<p>&nbsp;</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Function Description </strong></p>

<p>&nbsp;</p>

<p>Complete the function <em>processLogs</em> in the editor below.</p>

<p>&nbsp;</p>

<p>The function has the following parameter(s):</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;string <em>logs[n]</em>: each <em>logs[i]</em> denotes the i<sup>th</sup> entry in the logs</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;<em>int maxSpan</em>: the maximum difference in seconds between when a user logs in and logs out for the user to be included in the result</p>

<p>Returns:</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;<em>string[]: </em>a string array of user id's, sorted ascending by numeric value</p>

<p>&nbsp;</p>

<p>&nbsp;</p>

<p class="section-title" data-a11y="p-s-t" role="heading" aria-level="4">Constraints</p>

<ul>
	<li>1 ≤ <em>n, maxSpan</em>&nbsp;≤ 10<sup>5</sup>
</li>
	<li>1 ≤ <em>maxSpan</em> ≤ n</li>
	<li>
	<p>Each <em>user_id</em> contains only characters in the range ascii['0'-'9'], is at most <em>9</em>&nbsp;digits long and starts with a non-zero digit.</p>
	</li>
	<li>
	<p>Each <em>timestamp</em> contains only characters in the range ascii['0'-'9'] and begins with a non-zero digit</p>
	</li>
	<li>
	<p>0 &lt; <em>timestamp </em>≤ 10<sup>9</sup></p>
	</li>
	<li>Each <em>action</em>&nbsp;is either "sign-in" or "sign-out".</li>
	<li>Each&nbsp;<em>user_id</em>'s&nbsp;<em>sign-in timestamp &lt; sign-out timestamp</em>
</li>
	<li>Each user signs in for only 1 session.&nbsp;</li>
	<li>
	<p>The result will contain at least one element.<!--       <StartOfInputFormat> DO NOT REMOVE THIS LINE--></p>
	</li>
</ul>

<details><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Input Format Format for Custom Testing</span></summary>

<div class="collapsable-details">
<p>Input from stdin will be processed as follows and passed to the function<em>.</em></p>

<p>&nbsp;</p>

<p>The first line contains an integer, <em>n, </em>the size of<em> </em><em>logs</em>.</p>

<p>Each of the next <em>n</em>&nbsp;lines contains a log file entry, <em>logs[i].</em></p>

<p>The last line contains a single integer, maxSpan.</p>
</div>
</details>
<!--        </StartOfInputFormat> DO NOT REMOVE THIS LINE-->

<details open="open"><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Sample Case 0</span></summary>

<div class="collapsable-details">
<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Input</p>

<pre>STDIN&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;Function
-----&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;--------
6&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;→&nbsp;&nbsp;&nbsp;&nbsp;logs[] size n = 6
99 1 sign-in&nbsp;&nbsp;&nbsp;&nbsp;→&nbsp;&nbsp;&nbsp;&nbsp;logs = ["99 1 sign-in","100 10 sign-in","50 20 sign-in","100 15 sign-out","50 26 sign-out","99 2 sign-out"]
100 10 sign-in
50 20 sign-in
100 15 sign-out
50 26 sign-out
99 2 sign-out
5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;→&nbsp;&nbsp;&nbsp;&nbsp;maxSpan = 5
</pre>

<p>&nbsp;</p>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Output</p>

<pre>99
100
</pre>

<p>&nbsp;</p>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Explanation</p>

<pre>ID  Sign in  Sign out  Time delta
--&nbsp;&nbsp;-------  --------  ----------
50  20       26&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  6
99  1  &nbsp;&nbsp;&nbsp;&nbsp;  2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   1
100&nbsp;10&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;15&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  5


</pre>

<p>The&nbsp;users with id's 99 and 100 were not signed in for more than <em>maxSpan = 5</em>&nbsp;seconds.&nbsp; In sorted numerical order, the return array is<em> ["99", "100"]</em>.</p>

<p>&nbsp;</p>
</div>
</details>

<details><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Sample Case 1</span></summary>

<div class="collapsable-details">
<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Input</p>

<pre>STDIN&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  Function
-----&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  --------
4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;→&nbsp;&nbsp;logs[] size n = 4
60 12 sign-in&nbsp; &nbsp;→&nbsp;&nbsp;logs = ["60 12 sign-in","80 20 sign-out","10 20 sign-in","60 20 sign-out"]
80 20 sign-out
10 20 sign-in
60 20 sign-out
100&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; →&nbsp;&nbsp;maxSpan = 100
</pre>

<p>&nbsp;</p>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Output</p>

<pre>60</pre>

<p>&nbsp;</p>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Explanation</p>

<pre>ID  Sign in  Sign out  Time delta
--&nbsp;&nbsp;-------  --------  ----------
10  20       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
60  12  &nbsp;&nbsp;&nbsp;&nbsp;  20&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 8
80&nbsp; 20&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


</pre>

<p>Only user id <em>60</em>&nbsp;has signed out and was not signed in for more than <em>maxSpan = 100</em>&nbsp;seconds.&nbsp; The return array is<em> ["60"]</em>.</p>

<p>&nbsp;</p>
</div>
</details>
</div>

     * Complete the 'processLogs' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY logs
     *  2. INTEGER maxSpan
     */
    public List<String> processLogs(List<String> logs, int maxSpan) {
        // Write your code here
        Map<Integer, Integer> signInTimes = new HashMap<>();
        Map<Integer, Integer> signOutTimes = new HashMap<>();

        logs.forEach(log -> {
            String[] parts = log.split(" ");
            int userId = Integer.parseInt(parts[0]);
            int timestamp = Integer.parseInt(parts[1]);
            String action = parts[2];

            if (action.equals("sign-in")) {
                signInTimes.put(userId, timestamp);
            } else {
                signOutTimes.put(userId, timestamp);
            }
        });

        return signInTimes.entrySet().stream()
                .filter(entry -> signOutTimes.containsKey(entry.getKey()) && signOutTimes.get(entry.getKey()) - entry.getValue() <= maxSpan)
                .map(Map.Entry::getKey)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }
}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int logsCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> logs = IntStream.range(0, logsCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine();
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .collect(toList());
//
//        int maxSpan = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> result = Result.processLogs(logs, maxSpan);
//
//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
