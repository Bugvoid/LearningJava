<%-- 
    Document   : perfil
    Created on : 25/09/2018, 11:39:25
    Author     : Luan.Castro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<!-- Mirrored from bowstudios.uphero.com/livrosfiscais/modulos.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 15 Sep 2018 15:00:32 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
    <meta charset="utf-8">
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery.dataTables.min.js"></script>
    <script src="js/dataTables.bootstrap4.min.js"></script>
    <script src="js/scripts.js"></script>
    <title>Modulos</title>

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

    <div id="btnMenu"><img src="img/btn-menu.png"></div>

    <nav class="some-pc">
        <ul>
            <li><a href="perfil.jsp">Meu Perfil</a></li>
            <li><a href="modulos.jsp">Alterar Módulo</a></li>
            <li><a onClick="popup_sair()">Sair</a></li>
        </ul>
    </nav>

    

    <div id="popup"></div>
    
    <%@include file="include/modulos_erp.jsp"%>

</body>
    
    
    
</html>
