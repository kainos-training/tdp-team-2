<#-- @ftlvariable name="" type="com.kainos.librarysystem.views.Home" -->
<head>
<title>Home</title>
</head>
<main id="content" role="main" xmlns="http://www.w3.org/1999/html">
<body>
<h2>Search</h2>
<table>
<th>Book List</th>

<#list books as b>
<tr>
<td>${b}</td>
</tr>
</#list>
</table>
</body>
</main>