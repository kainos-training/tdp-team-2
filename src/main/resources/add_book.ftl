<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add A Book</title>
<h1>Add A Book To The Library</h1>
</head>
<body>
	<form action="addBook" method="POST">
		Author Name: <input type="text" id="author_name" name="author_name" required/>
		<br> Book Title: <input type="text" id="title" name="title" required/> <br>
		Category: <select required>
			<option id="please_select" value="" disabled selected>Please Select a Category</option>
			<option id="technical" value="Technical">Technical</option>
			<option id="leadership_management" value="Leadership & Management">Leadership & Management</option>
			<option id="project_execution" value="Project Execution">Project Execution</option>
		</select> <br>
		Year: <input type="text" id="year" name="year" maxlength="4" pattern="[0-9.]+"/> <br>
		<input type="submit" id="submit" name="submit"/>
	</form>
</body>
</html>