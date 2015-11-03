<html
    xmlns="http://www.w3.org/1999/html">
    <head>
        <meta charset="UTF-8">
        <link href="http://rural-payments-styleguide.herokuapp.com/assets/stylesheets/main.css" media="all" rel="stylesheet">
          
        </head>
        <div class="container">
            <main id="content" role="main" class="">
                <h1>Framework list</h1>
                <table class="table table-condensed">
 
                    <tr>
                        <th>Framework</th>
                        <th>Implementation Language</th>
                    </tr>
                   <#list frameworks as framework>
                    <tr>
            			<td><a href="/framework/${framework.frameworkId}">${framework.frameworkName}</a></td>
                        <td>${framework.frameworkLanguage}</td>
                    </tr>
                  </#list>
                </table>
            </main>
        </div>
        <!-- /.container -->
    </html>