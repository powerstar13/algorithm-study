package com.example.study.hackkerrank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/*
https://www.hackerrank.com/test/4ckjkji3bql/questions/18e5jjhf3

<div class="ps-content-wrapper-v0">
<div class="preheader" style="display:none;">Determine a pixel's proximity to pure colors</div>

<p>A pixel color RGB is defined as a 24 bit integer. Each 8 bit integer (1 byte) represents either red, green or blue color. Each 8 bit integer has an integer value between 0 (Low intensity) and 255 (High intensity) .</p>

<p>&nbsp;</p>

<p>For the distance between two pixels having RGB values <em>(r<sub>1</sub>, g<sub>1</sub>, b<sub>1</sub>)</em> and <em>(r<sub>2</sub>, g<sub>2</sub></em>, b<sub>2</sub>), it is calculated as follows:</p>

<p>&nbsp;</p>

<p><math style="font-size:1.5em;" xmlns="http://www.w3.org/1998/Math/MathML"> <mi>d</mi> <mo> = </mo> <msqrt> <mrow> <msup> <mrow> <mo>(</mo> <msub> <mi>r</mi> <mn>1</mn> </msub> <mo>-</mo> <msub> <mi>r</mi> <mn>2</mn> </msub> <mo>)</mo> </mrow> <mn>2</mn> </msup> </mrow> <mo>+</mo> <mrow> <msup> <mrow> <mo>(</mo> <msub> <mi>g</mi> <mn>1</mn> </msub> <mo>-</mo> <msub> <mi>g</mi> <mn>2</mn> </msub> <mo>)</mo> </mrow> <mn>2</mn> </msup> </mrow> <mo>+</mo> <mrow> <msup> <mrow> <mo>(</mo> <msub> <mi>b</mi> <mn>1</mn> </msub> <mo>-</mo> <msub> <mi>b</mi> <mn>2</mn> </msub> <mo>)</mo> </mrow> <mn>2</mn> </msup> </mrow> </msqrt> </math></p>

<p>&nbsp;</p>
<!--
<p><em>d = ( (r<sub>1</sub> - r<sub>2</sub>)<sup>2</sup> + (g<sub>1</sub> - g<sub>2</sub>)<sup>2</sup> + (b<sub>1</sub> - b<sub>2</sub>)<sup>2)</sup>)<sup>1/2</sup></em></p>
 -->

<p>For reference, the RGB values are defined as follows:</p>

<table align="center" border="1" cellpadding="1" cellspacing="1" style="width:500px;">
	<thead>
		<tr>
			<th scope="row">Pure Color</th>
			<th scope="col">R</th>
			<th scope="col">G</th>
			<th scope="col">B</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th scope="row">Black</th>
			<td>0</td>
			<td>0</td>
			<td>0</td>
		</tr>
		<tr>
			<th scope="row">White</th>
			<td>255</td>
			<td>255</td>
			<td>255</td>
		</tr>
		<tr>
			<th scope="row">Red</th>
			<td>255</td>
			<td>0</td>
			<td>0</td>
		</tr>
		<tr>
			<th scope="row">Green</th>
			<td>0</td>
			<td>255</td>
			<td>0</td>
		</tr>
		<tr>
			<th scope="row">Blue</th>
			<td>0</td>
			<td>0</td>
			<td>255</td>
		</tr>
	</tbody>
</table>
<!--<table class="challenge-params">
	<tbody>
		<tr>
			<th class="right">Pure Color Name</th>
			<td>Black</td>
			<td>White</td>
			<td>Red</td>
			<td>Green</td>
			<td>Blue</td>
		</tr>
		<tr>
			<th class="right">RGB Value</th>
			<td>(0, 0, 0)</td>
			<td>(255, 255, 255)</td>
			<td>(255, 0, 0)</td>
			<td>(0, 255, 0)</td>
			<td>(0, 0, 255)</td>
		</tr>
	</tbody>
</table>
--><!--
<ul>
	<li><em>Pure Black: (0, 0, 0)</em></li>
	<li><em>Pure White: (255, 255, 255)</em></li>
	<li><em>Pure Red: (255, 0, 0)</em></li>
	<li><em>Pure Green: (0, 255, 0)</em></li>
	<li><em>Pure Blue: (0, 0, 255)</em></li>
</ul>
 -->

<p>&nbsp;</p>

<p>Given a <em>24</em>-bit binary string describing a pixel, identify which of these five colors the pixel is closest to using the Euclidean distance calculation. Then return the closest pure color: <em>Red, Green, Blue, Black, White</em>. If there is more than one closest color, return <em>Ambiguous</em>.</p>

<p>&nbsp;</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Example</strong></p>

<p>n = 1</p>

<p><em>pixels = ["000000001111111100000110"]</em></p>

<p>&nbsp;</p>

<p>The pixel's RGB value is <em>(0, 255, 6) :</em></p>

<ol>
	<li><em>red = (00000000)<sub>2</sub> = (0)<sub>10</sub></em></li>
	<li><em>green = (11111111)<sub>2</sub> = (255)<sub>10</sub></em></li>
	<li><em>blue = (00000110)<sub>2</sub> = (6)<sub>10</sub></em></li>
</ol>

<p>Calculate its Euclidean distance to each color:</p>
<!--
<ul>
	<li><em>Pure Black: d = ( (0 &minus;   0)<sup>2</sup> + (255 &minus;   0)<sup>2</sup> + (6 &minus;   0)<sup>2</sup> )<sup>1/2</sup> = 65061<sup>1/2</sup> = 255.0705785</em></li>
	<li><em>Pure White: d = ( (0 &minus; 255)<sup>2</sup> + (255 &minus; 255)<sup>2</sup> + (6 &minus; 255)<sup>2</sup> )<sup>1/2</sup> = 127026<sup>1/2</sup> = 356.4070706</em></li>
	<li><em>Pure Red: d = ( (0 &minus; 255)<sup>2</sup> + (255 &minus;   0)<sup>2</sup> + (6 &minus;   0)<sup>2</sup> )<sup>1/2</sup> = 130086<sup>1/2</sup> = 360.6743684</em></li>
	<li><em>Pure Green: d = ( (0 &minus;   0)<sup>2</sup> + (255 &minus; 255)<sup>2</sup> + (6 &minus;   0)<sup>2</sup> )<sup>1/2</sup> = 36<sup>1/2</sup> = 6</em></li>
	<li><em>Pure Blue: d = ( (0 &minus;   0)<sup>2</sup> + (255 &minus;   0)<sup>2</sup> + (6 &minus; 255)<sup>2</sup> )<sup>1/2</sup> = 127026<sup>1/2</sup> = 356.4070706</em></li>
</ul>
-->

<pre>	Pure Black: d = ((0 -   0)<sup>2</sup> + (255 -   0)<sup>2</sup> + (6 -   0)<sup>2</sup>)<sup>1/2</sup> =  65061<sup>1/2</sup> = 255.0705785
	Pure White: d = ((0 - 255)<sup>2</sup> + (255 - 255)<sup>2</sup> + (6 - 255)<sup>2</sup>)<sup>1/2</sup> = 127026<sup>1/2</sup> = 356.4070706
	Pure Red:   d = ((0 - 255)<sup>2</sup> + (255 -   0)<sup>2</sup> + (6 -   0)<sup>2</sup>)<sup>1/2</sup> = 130086<sup>1/2</sup> = 360.6743684
	Pure Green: d = ((0 -   0)<sup>2</sup> + (255 - 255)<sup>2</sup> + (6 -   0)<sup>2</sup>)<sup>1/2</sup> =     36<sup>1/2</sup> = 6
	Pure Blue:  d = ((0 -   0)<sup>2</sup> + (255 -   0)<sup>2</sup> + (6 - 255)<sup>2</sup>)<sup>1/2</sup> = 127026<sup>1/2</sup> = 356.4070706
</pre>

<p>The color with the smallest distance to the pixel is <em>Pure Green</em>, so the answer is <em>Green</em>.</p>

<p>&nbsp;</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Function Description </strong></p>

<p>Complete the function <em>closestColor</em> in the editor below.</p>

<p>&nbsp;</p>

<p>closestColor has the following parameter(s):</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;<em>string pixels[n]:</em>&nbsp; an array of 24-bit binary strings representing pixels as described</p>

<p>Returns:</p>

<p>&nbsp;&nbsp;&nbsp;<em>&nbsp;string[n]: </em>each element <em>i</em> represents the closest color for its associated <em>pixels[i]</em></p>
<!--

<p>Complete the function in the editor below. It has one parameter:</p>

<table class="challenge-params">
	<tbody>
		<tr>
			<th>Name</th>
			<th>Type</th>
			<th class="description">Description</th>
		</tr>
		<tr>
			<td class="code">pixels</td>
			<td class="code">string array</td>
			<td class="left">An array of <em>24</em>-bit binary strings describing the pixel&#39;s respective <em>8</em>-bit <em>red</em>, <em>green</em>, and <em>blue</em> values.</td>
		</tr>
	</tbody>
</table>
-->

<p>&nbsp;</p>

<p class="section-title" title="Guarantees about the test case dataset." data-a11y="p-s-t" role="heading" aria-level="4">Constraints</p>

<ul>
	<li><em>1 ≤ n ≤ 100</em></li>
</ul>

<p>&nbsp;</p>
<!--       <StartOfInputFormat> DO NOT REMOVE THIS LINE-->

<details><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Input Format for Custom Testing</span></summary>

<div class="collapsable-details">
<p>Input from stdin will be processed as follows and passed to the function.</p>

<p>&nbsp;</p>

<p>The first line contains an integer <em>n</em>, the size of the array <em>pixels</em>.</p>

<p>Each of the next <em>n</em> lines contains a 24 character bit-string <em>pixels[i]</em> where <em>0 ≤ i &lt; n</em>.</p>
</div>
</details>

<details open="open"><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Sample Case 0</span></summary>

<div class="collapsable-details">
<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Input 0</p>

<pre>STDIN                       Function
-----                       --------
5                        →  pixels[] size n = 5
101111010110011011100100&nbsp;→  pixels= ["101111010110011011100100", "110000010101011111101111", "100110101100111111101101", "010111011010010110000011",
110000010101011111101111&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; "000000001111111111111111"]
100110101100111111101101
010111011010010110000011
000000001111111111111111</pre>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Output 0</p>

<pre>White
White
White
Green
Ambiguous</pre>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Explanation 0</p>

<p>Process the following <em>n = 5</em> binary strings:</p>

<ol start="0">
	<li>
<em>101111010110011011100100</em> → <em>(189, 102, 228)</em> is closest to <em>White</em>:

	<ul>
		<li>The distance to pure <em>White</em> is 168.80165875962237.</li>
		<li>The distance to pure <em>Blue</em> is 216.45784809056934.</li>
		<li>The distance to pure <em>Red</em> is 258.3486016993318.</li>
		<li>The distance to pure <em>Black</em> is 313.22356233208257.</li>
		<li>The distance to pure <em>Green</em> is 333.33766663850037.</li>
	</ul>
	</li>
	<li>
<em>110000010101011111101111</em> → <em>(193, 87, 239)</em> is closest to <em>White</em>:
	<ul>
		<li>The distance to pure <em>White</em> is 179.78876494375282.</li>
		<li>The distance to pure <em>Blue</em> is 212.30638238168913.</li>
		<li>The distance to pure <em>Red</em> is 261.7899921692959.</li>
		<li>The distance to pure <em>Black</em> is 319.2788749666974.</li>
		<li>The distance to pure <em>Green</em> is 350.13425996323184.</li>
	</ul>
	</li>
	<li>
<em>100110101100111111101101</em> → <em>(154, 207, 237)</em> is closest to <em>White</em>:
	<ul>
		<li>The distance to pure <em>White</em> is 113.26517558367179.</li>
		<li>The distance to pure <em>Blue</em> is 258.62907802488104.</li>
		<li>The distance to pure <em>Green</em> is 286.6862396418775.</li>
		<li>The distance to pure <em>Red</em> is 330.4829798945779.</li>
		<li>The distance to pure <em>Black</em> is 350.334126228091.</li>
	</ul>
	</li>
	<li>
<em>010111011010010110000011</em> → <em>(93, 165, 131)</em> is closest to <em>Green</em>:
	<ul>
		<li>The distance to pure <em>Green</em> is 184.14668066516975.</li>
		<li>The distance to pure <em>White</em> is 222.97981971469974.</li>
		<li>The distance to pure <em>Blue</em> is 226.38462845343543.</li>
		<li>The distance to pure <em>Black</em> is 230.2932912613826.</li>
		<li>The distance to pure <em>Red</em> is 265.7630523605567.</li>
	</ul>
	</li>
	<li>
<em>000000001111111111111111</em> → <em>(0, 255, 255)</em> is equidistant from <em>White</em>, <em>Green</em>, and <em>Blue</em>, so it is&nbsp;<em>Ambiguous</em>:
	<ul>
		<li>The distance to pure <em>White</em> is 255.0.</li>
		<li>The distance to pure <em>Green</em> is 255.0.</li>
		<li>The distance to pure <em>Blue</em> is 255.0.</li>
		<li>The distance to pure <em>Black</em> is 360.62445840513925.</li>
		<li>The distance to pure <em>Red</em> is 441.6729559300637.</li>
	</ul>
	</li>
</ol>

<p>Return the array <em>["White", "White", "White", "Green", "Ambiguous"]</em> as the answer.</p>
</div>
</details>
</div>
 */
@Component
class ClosestColor {
    /*
     * Complete the 'closestColor' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY pixels as parameter.
     */
    private final String[] COLORS = {"Black", "White", "Red", "Green", "Blue"};
    private final int[][] RGB_VALUES = {{0, 0, 0}, {255, 255, 255}, {255, 0, 0}, {0, 255, 0}, {0, 0, 255}};

    public List<String> closestColor(List<String> pixels) {
        List<String> result = new ArrayList<>();
        for (String pixel : pixels) {
            int r = Integer.parseInt(pixel.substring(0, 8), 2);
            int g = Integer.parseInt(pixel.substring(8, 16), 2);
            int b = Integer.parseInt(pixel.substring(16, 24), 2);
            result.add(getClosestColor(r, g, b));
        }
        return result;
    }

    private String getClosestColor(int r, int g, int b) {
        double minDistance = Double.MAX_VALUE;
        String closestColor = "Ambiguous";
        for (int i = 0; i < COLORS.length; i++) {
            double distance = calculateDistance(r, g, b, RGB_VALUES[i]);
            if (distance < minDistance) {
                minDistance = distance;
                closestColor = COLORS[i];
            } else if (distance == minDistance) {
                closestColor = "Ambiguous";
            }
        }
        return closestColor;
    }

    private double calculateDistance(int r1, int g1, int b1, int[] rgb) {
        int r2 = rgb[0], g2 = rgb[1], b2 = rgb[2];
        return Math.sqrt(Math.pow(r1 - r2, 2) + Math.pow(g1 - g2, 2) + Math.pow(b1 - b2, 2));
    }
}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int pixelsCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> pixels = IntStream.range(0, pixelsCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine();
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .collect(toList());
//
//        List<String> result = Result.closestColor(pixels);
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
