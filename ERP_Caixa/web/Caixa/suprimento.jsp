<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Caixa</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/all.css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/dataTables.bootstrap4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/scripts.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Grupo 3 - Caixa" />
    <link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
</head>

<body>
    <header>
        <%@include file="../include/logotipo.jsp" %>
        <%@include file="../include/navegacao.jsp" %>
    </header>

    <%@include file="../include/menu.jsp"%>

<div id="popup"></div>
<div class="cont mb-70">
    <h3>Suprimentos</h3>
    <form action="../sModuloCaixa" method="post">
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text" id="basic-addon1">R$</span>
            </div>
            <input type="number" name="valor" class="form-control" placeholder="Valor do suprimento (exemplo: 23,58)" aria-label="Username" aria-describedby="basic-addon1" required="">
        </div>
        <br/>
        <button class="btn btn-primary float-right" name="btnAcao" value="suprimento" type="submit" >Registrar Suprimentos</button>
    </form>
</div>
<%
    if(request.getParameter("sucesso") != null){
        %>
        <script>
        $(function(){
            popup_sucesso();
        });
        </script>     
        <%
        }
    %>


</body>
</html>
