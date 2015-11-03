<html xmlns="http://www.w3.org/1999/html">
	<head>
		<meta charset="UTF-8">
		<link href="/assets/stylesheets/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
		<script src="/assets/javascripts/hello.js"></script>
	</head>
	
	<main id="content" role="main" class="container">
	
	<br>
	
	<a href="/frameworks">Back to framework list</a>
		
	<#list> 	
	<h1 class="heading-xlarge">${Expert.frameworkName[0]}</h1>
    <h3 class="heading-medium">Language: ${Expert.frameworkLanguage[0]}</h3>
	</#>
	<br>
	<table id="framework-summary" class="display table">
   	     <thead>
         	<tr>
            	<th>Experts who used this framework</th>
            </tr>
         </thead>
         <tbody>
         	<#list userList as Expert>
                    <tr>
                        <td>${Expert.userName}</td>
                    </tr>
             </#list>
          </tbody>
     </table>
    
	</main>
</html>
