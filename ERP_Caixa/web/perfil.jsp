<%-- 
    Document   : perfil
    Created on : 25/09/2018, 11:39:25
    Author     : Luan.Castro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<!-- Mirrored from bowstudios.uphero.com/livrosfiscais/perfil.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 15 Sep 2018 15:00:48 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
    <meta charset="utf-8">
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery.dataTables.min.js"></script>
    <script src="js/dataTables.bootstrap4.min.js"></script>
    <script src="js/scripts.js"></script>
    <title>Caixa</title>

    <link rel="stylesheet" href="css/all.css">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Grupo 3 - Caixa" />

    <link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
</head>

<body>

    <header>

        <%@include file="include/logotipo.jsp" %>
        <%@include file="include/navegacao.jsp" %>

    </header>

    <%@include file="include/menu.jsp" %>

    <div class="cont">

        <div class="col-md-12">
            <div class="border-titulo pb-20 pb-0-mob">

                <h2>Meu perfil</h2>

                <br><br>

                <div class="col-md-2">
                    <img src="img/icon-perfil.jpg" style="width:100%;" />
                </div>

                <div class="col-md-4 mt-30-mob">
                    <p><strong>Nome:</strong> Teste de teste</p>
                    <p><strong>Data de Nascimento:</strong> 00/00/0000</p>
                    <p><strong>Cargo:</strong> X</p>
                    <p><strong>...</strong></p>
                </div>

                <div class="clearfix"></div>
        
            </div>
        </div>

    </div>
    <div id="popup"></div>
</body>



</html>
