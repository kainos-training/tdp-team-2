<#-- @ftlvariable name="" type="com.kainos.librarysystem.views.Home" -->
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Kainos book store</title>
    <!-- Bootstrap -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
    <!--Overwrites-->
    <link href="css/styles.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
<main id="content" role="main" xmlns="http://www.w3.org/1999/html">
<body>
     <header>
        <nav class="navbar navbar-default main-nav">
            <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                <img alt="Brand" src="...">
                </a>
            </div>
            <ul class="nav nav-pills pull-right">
              <li role="presentation" class="active"><a href="#">Home</a></li>
              <li role="presentation"><a href="#">Add a book</a></li>
            </ul>
            </div>
        </nav>
      </header>


 <section>
          <div class="container">
              <div class="row">
                  <div class="col-md-12">
                      <h1>Current books</h1>
                  </div>
              </div>
              <div class="row">  
                  <div class="col-md-12">   
                      <div class="table-responsive">
                          <table class="table table-striped bookTable">
                              <thead>
                                  <tr>
                                      <th>Title</th>
                                      <th>Author</th>
                                      <th>Category</th>
                                      <th>Date</th>
                                      <th>Actions</th>             
                                  </tr>
                              </thead>
                              <tbody>
                                  
                                  <#list books as b>
                                  <tr>
                                      <td>${b.title}</td>
                                      <td>${b.author}</td>
                                      <td>Category</td>
                                      <td>${b.yearPublished}</td>
                                      <td><a href="#">View</a></td>
                                  </tr>
                                  </#list>
                              </tbody>
                          </table> 
                      </div>  
                  </div>
              </div>
          </div>
      </section>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</main>