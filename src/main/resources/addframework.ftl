<html xmlns="http://www.w3.org/1999/html">
<head>
<meta charset="UTF-8">

<link
	href="http://rural-payments-styleguide.herokuapp.com/assets/stylesheets/main.css"
	media="all" rel="stylesheet">

<link href="/assets/stylesheets/bootstrap/css/bootstrap.min.css"
	type="text/css" rel="stylesheet" />

<link rel="stylesheet" type="text/css"
	href="/assets/stylesheets/datatables.min.css" />

<script type="text/javascript"
	src="/assets/javascripts/datatables.min.js"></script>

</head>
<div class="container">
	<main id="content" role="main" class="">
	<p>
		<a href="/frameworks">Back to framework list</a>
	</p>

	<h1>Add a framework</h1>

	<form action="/processAddFramework" method="POST">

		<div class="form-group">
			<label class="form-label" for="framework-name">Framework name</label>
			<input class="form-control" id="framework-name" type="text" name="framework-name"
				placeholder="Enter the name of the framework">
		</div>

		<div class="form-group">
			<label class="form-label" for="framework-language">Framework
				language</label> 
			<select class="form-control-select" id="framework-language" name="framework-language">
				<option>Select a language</option>
				
				<#list languages as language>
				<option value="${language.languageId}">${language.languageName}</option>
				</#list>
			</select>
		</div>

		<!--
		<div class="form-group">
			<label class="form-label" for="expert-name">Expert's name
				(optional)</label> <input class="form-control" id="expert-name" type="text"
				placeholder="Enter full name">
		</div>
		-->

		<div class="form-group">
			<button id="submit" class="button" type="submit">Add
				framework</button>
		</div>
		 

	</form>
	</main>
</div>
</html>