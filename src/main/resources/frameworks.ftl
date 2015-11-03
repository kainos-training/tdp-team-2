<html
    xmlns="http://www.w3.org/1999/html">
    <head>
        <meta charset="UTF-8">
            <link href="/assets/stylesheets/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet" />

            <link rel="stylesheet" type="text/css" href="/assets/stylesheets/datatables.min.css"/>

            <script type="text/javascript" src="/assets/javascripts/datatables.min.js"></script>
            <script type="text/javascript" src="/assets/javascripts/frameworks.js"></script>
        <link href="http://rural-payments-styleguide.herokuapp.com/assets/stylesheets/main.css" media="all" rel="stylesheet">
          
        </head>
        <div class="container">
            <main id="content" role="main" class="">
                <h1>Framework list</h1>
                <table id="framework-list" class="display table">
                    <thead>
                        <tr>
                            <th>Framework</th>
                            <th>Implementation Language</th>
                        </tr>
                    </thead>
                   <#list frameworks as framework>
                    <tbody>
                    <tr>
            			<td><a href="/framework/${framework.frameworkId}">${framework.frameworkName}</a></td>
                        <td>${framework.frameworkLanguage}</td>
                    </tr>
                    </tbody>
                  </#list>
                </table>
            </main>
        </div>
        <!-- /.container -->
    </html>
