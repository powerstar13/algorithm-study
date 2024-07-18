/**
  https://www.hackerrank.com/test/eifqae4ll0f/questions/8i50d4dm339

  <div id="8i50d4dm339-instruction"><p>The data for the number&nbsp;employed at several famous IT companies is maintained in the <em>COMPANY</em>&nbsp;table. Write a query to print the <em>ID</em>s of the companies that have more than <em>10000</em> employees, in ascending order of <em>ID</em>.</p>

    <p style="font-weight:bold;" title="The schemas of any data tables needed to solve this challenge.">&nbsp;</p>

    <p style="font-weight:bold;" title="The schemas of any data tables needed to solve this challenge.">Input Format</p>

    <div style="display:inline-block;">
        <table style="float:left;margin:4px;">
            <tbody>
            <tr>
                <th colspan="100">COMPANY</th>
            </tr>
            <tr>
                <th>Name</th>
                <th>Type</th>
                <th>Description</th>
            </tr>
            <tr>
                <td align="center" style="font-family:monospace;white-space:nowrap;">ID</td>
                <td align="center" style="font-family:monospace;white-space:nowrap;">Integer</td>
                <td>A company ID in the inclusive range <em>[1, 1000]</em>. This is the primary key.</td>
            </tr>
            <tr>
                <td align="center" style="font-family:monospace;white-space:nowrap;">NAME</td>
                <td align="center" style="font-family:monospace;white-space:nowrap;">String</td>
                <td>A company name. This field contains between <em>1</em> and <em>100</em> characters (inclusive).</td>
            </tr>
            <tr>
                <td align="center" style="font-family:monospace;white-space:nowrap;">EMPLOYEES</td>
                <td align="center" style="font-family:monospace;white-space:nowrap;">Integer</td>
                <td>The total number of employees in the company.</td>
            </tr>
            </tbody>
        </table>
    </div>

    <p style="clear:both;">&nbsp;</p>

    <p style="font-weight:bold;" title="The desired result of the query.">Output Format</p>

    <p>The result should contain the <em>ID</em>s of all the companies that have more than <em>10000</em> employees, in ascending order in the following format:</p>

    <p>&nbsp;</p>

    <pre>COMPANY.ID</pre>

    <p>&nbsp;</p>

    <p style="clear:both;" data-a11y="p-str" role="heading" aria-level="4"><strong>Sample Input</strong></p>

    <div style="width:100%;display:inline-block;">
        <table style="float:left;margin:4px;width:48%;">
            <tbody>
            <tr>
                <th colspan="100">COMPANY</th>
            </tr>
            <tr>
                <th style="font-family:monospace;white-space:nowrap;">ID</th>
                <th style="font-family:monospace;white-space:nowrap;">NAME</th>
                <th style="font-family:monospace;white-space:nowrap;">EMPLOYEES</th>
            </tr>
            <tr>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">1</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">Adobe</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">28085</td>
            </tr>
            <tr>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">2</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">Flipkart</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">35543</td>
            </tr>
            <tr>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">3</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">Amazon</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">1089</td>
            </tr>
            <tr>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">4</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">Paytm</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">9982</td>
            </tr>
            <tr>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">5</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">BookMyShow</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">5589</td>
            </tr>
            <tr>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">6</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">Oracle</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">4003</td>
            </tr>
            <tr>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">7</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">NIIT</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">57782</td>
            </tr>
            <tr>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">8</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">Samsung</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">2000</td>
            </tr>
            <tr>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">9</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">TCS</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">10046</td>
            </tr>
            <tr>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">10</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">Wipro</td>
                <td style="text-align:center;font-family:monospace;white-space:nowrap;">3500</td>
            </tr>
            </tbody>
        </table>
    </div>

    <p>&nbsp;</p>

    <p style="font-weight:bold;">Sample Output</p>

    <pre>1
2
7
9</pre>

    <p>&nbsp;</p>

    <p style="font-weight:bold;">Explanation</p>

    <p><em>Adobe, </em><em>Flipkart</em><em>, NIIT</em>, and <em>TCS</em> have greater than <em>10000</em> employees, so their <em>ID</em>s are printed.</p>
</div>
 */
SELECT ID
FROM COMPANY
WHERE EMPLOYEES > 10000
ORDER BY ID ASC;
