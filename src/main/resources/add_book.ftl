
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Kainos book store</title>
    <!-- Bootstrap -->
    <link href="assets/stylesheets/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- JQuery -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!--Overwrites-->
    <link href="assets/stylesheets/styles.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <header>
        <nav class="navbar  main-nav">
            <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                <img alt="Brand" src="assets/img/kbooks_logo.png" width="120px">
                </a>
            </div>
            <ul class="nav nav-pills pull-right">
              <li role="presentation"><a href="index.html">Home</a></li>
              <li role="presentation" class="active"><a href="addbook.html">Add a book</a></li>
            </ul>
            </div>
        </nav>
      </header>
      <section>
          
                    <div class="headline">
              
              <div class="container">

                  <div class="row">

                      <div class="col-lg-12 col-mg-12">

                            <h1>Add a book</h1>

                      </div>

                   </div>
              
              </div>  
          
          </div>
          
          
          <div class="container">
              
              <div class="row">
                  
                  <div class="col-md-12 col-lg-12">
                      
                        <form action="add-book" method="POST" role="form">
                      <div class="form-group">
                          <label for="title">Book title &#42;</label>
                          <input type="title" class="form-control medium" id="title" name="title" required>
                         
                      </div>
                      <div class="form-group">
                          <label for="author">Author &#42;</label>
                          <input type="author" class="form-control small" id="author" name="author" required>
                        
                      </div> 
                      <div class="form-group">
                          <label for="category">Category &#42;</label>
                          <select id="catId" name="catId" class="form-control medium" required>
                              <option disabled selected>Please Select Category</option>
                              <option value="1">Leadership & Management</option>
                              <option value="2">Project Execution</option>
                              <option value="3">Technical</option>                          
                          </select>
                      </div>
                      <div class="form-group">
                          <label for="date">Publish year</label>
                          <input type="title" class="form-control small" name="year" id="year" minlength="4" maxlength="4" pattern="[0-9.]+">
                      </div>
                            
                      <div class="button-group">
                          <button type="submit" class="btn btn-default">Reset</button>
                          <button type="submit" class="btn btn-primary">Add book </button> 
                      </div>
                   
                      
                  </form>
                  
                  </div>
                  
                
                  
                  
                  
                  
              
              </div>
      
          </div>
      </section>
    
    <script src="assets/stylesheets/bootstrap/js/bootstrap.min.js"></script>
    
  </body>
