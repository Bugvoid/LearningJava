<%-- 
    Document   : index
    Created on : 09/10/2018, 22:08:21
    Author     : Alexander
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Utilizando Ajax</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
        
        <script>
            $(function(){
                $("#remedio").keyup(function(){
                    var remedio = $("#remedio").val();
                    
                    $.ajax({
                        url:"Remedios",
                        type:"GET",
                        data: "pesq=" + remedio,
                        success: function(data){
                            $("#listamedicamentos").html(data);
                        },
                        error: function(er){
                            $("#listamedicamentos").html(er.responseText);
                        }
                    });
                });
            });
        </script>
    </head>
    <body>
        <div class="jumbotron text-center">
            <h1>Medicamentos</h1>
            <p>Consulta medicamentos por meio da tecnologia ajax</p> 
        </div>
        <div class="container">
            <div class="row">
                <div class="col-sm-4"></div>
                <div class="col-sm-4">
                    <div class="form-group">
                        <label for="remedio">Medicamento:</label>
                        <input type="text" class="form-control" id="remedio">
                    </div>                  
                </div>
                <div class="col-sm-4"></div>
            </div>
            
            <div class="row">
                <div class="col-sm-2"></div>
                <div class="col-sm-8">
                    <div id="listamedicamentos"></div>
                </div>
                <div class="col-sm-2"></div>
            </div>
        </div>
         
            
    </body>
</html>
