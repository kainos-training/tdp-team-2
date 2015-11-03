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

	<form action="/addframework" method="POST">

		<div class="form-group">
			<label class="form-label" for="framework-name">Framework name</label>
			<input class="form-control" id="framework-name" type="text"
				placeholder="Enter the name of the framework">
		</div>

		<div class="form-group">
			<label class="form-label" for="framework-language">Framework
				language</label> 
			<select class="form-control-select" id="framework-language">
				<option>Select a language</option>
				<option value="1">Option 1</option>
				<option value="2">Option 2</option>
			</select>
		</div>

		<div class="form-group">
			<label class="form-label" for="expert-name">Expert's name
				(optional)</label> <input class="form-control" id="expert-name" type="text"
				placeholder="Enter full name">
		</div>

		<div class="form-group">
			<button id="submit" class="button" type="button">Add
				framework</button>
		</div>

	</form>
	</main>
</div>
</html>