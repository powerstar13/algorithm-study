/*
 https://www.hackerrank.com/test/4ckjkji3bql/questions/8mm86pb43bk

 <div class="ps-content-wrapper-v0">
<p>Company X has a record of its customers and their orders. Find the customer(s) with the highest order price for orders placed within 10 years of the first order (earliest order_date) in the database. Print the customer name and order price. If multiple records are returned, they can be in any order.</p>

<p>&nbsp;</p>

<details open=""><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Schema</span></summary>

<div class="collapsable-details">
<p>There are 2 tables: <em>CUSTOMERS</em>, <em>ORDERS</em>.</p>

<table class="database-table">
	<tbody>
		<tr>
			<th colspan="100">CUSTOMERS</th>
		</tr>
		<tr>
			<td>Name</td>
			<td>Type</td>
			<td>Description</td>
		</tr>
		<tr>
			<td>ID</td>
			<td>STRING</td>
			<td class="description">ID of the customer. This is the primary key.</td>
		</tr>
		<tr>
			<td>NAME</td>
			<td>STRING</td>
			<td class="description">Name of the customer.</td>
		</tr>
		<tr>
			<td>ORDER_ID</td>
			<td>STRING</td>
			<td class="description">ID of the customer's order.</td>
		</tr>
	</tbody>
</table>

<table class="database-table">
	<tbody>
		<tr>
			<th colspan="100">ORDERS</th>
		</tr>
		<tr>
			<td>Name</td>
			<td>Type</td>
			<td>Description</td>
		</tr>
		<tr>
			<td>ID</td>
			<td>STRING</td>
			<td class="description">ID of the order.</td>
		</tr>
		<tr>
			<td>PRICE</td>
			<td>INTEGER</td>
			<td class="description">Price of the order.</td>
		</tr>
		<tr>
			<td>ORDER_DATE</td>
			<td>DATE</td>
			<td class="description">Date of the order.</td>
		</tr>
	</tbody>
</table>
</div>
</details>

<details open=""><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Sample Data Tables</span></summary>

<div class="collapsable-details">
<h4>Sample Input</h4>

<table class="database-table">
	<tbody>
		<tr>
			<th colspan="100">CUSTOMERS</th>
		</tr>
		<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>ORDER_ID</td>
		</tr>
		<tr>
			<td>0a66e2bba8d5401b8d707ad9fc35394a</td>
			<td>Jennifer Palmer</td>
			<td>3223c7dfda384470aed77b1db46fe29b</td>
		</tr>
		<tr>
			<td>57bc0e2554ea4dd1910b11ee1131f4cb</td>
			<td>Susan Gonzalez</td>
			<td>eb173d2bc0214cfc8727c00fe62ac96d</td>
		</tr>
		<tr>
			<td>d880a48bf4844c99a3bafac53612119e</td>
			<td>Judith Smith</td>
			<td>65b36940385a40fcaa13ecb9c8394150</td>
		</tr>
	</tbody>
</table>

<table class="database-table">
	<tbody>
		<tr>
			<th colspan="100">ORDERS</th>
		</tr>
		<tr>
			<td>ID</td>
			<td>PRICE</td>
			<td>ORDER_DATE</td>
		</tr>
		<tr>
			<td>3223c7dfda384470aed77b1db46fe29b</td>
			<td>100</td>
			<td>1987-10-02</td>
		</tr>
		<tr>
			<td>65b36940385a40fcaa13ecb9c8394150</td>
			<td>5</td>
			<td>1987-08-01</td>
		</tr>
		<tr>
			<td>eb173d2bc0214cfc8727c00fe62ac96d</td>
			<td>500</td>
			<td>1998-08-01</td>
		</tr>
	</tbody>
</table>

<h4>&nbsp;</h4>

<h4>Sample Output</h4>

<pre>Jennifer Palmer 100</pre>
</div>
</details>
</div>
 */
SELECT c.NAME, MAX(o.PRICE)
FROM CUSTOMERS c
         JOIN ORDERS o ON c.ORDER_ID = o.ID
WHERE o.ORDER_DATE <= (
    SELECT DATE_ADD(MIN(ORDER_DATE), INTERVAL 10 YEAR)
    FROM ORDERS
)
GROUP BY c.NAME
    LIMIT 1;
