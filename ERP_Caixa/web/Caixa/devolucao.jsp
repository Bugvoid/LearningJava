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
    <script src="${pageContext.request.contextPath}/js/devolucao.js"></script>
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
<div class="cont mb-120">
    <form action="../sModuloCaixa" method="post">
    <h3>Devolução</h3>
    <div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">Nota</span>
            </div>
            <input type="number" class="form-control" name="descricao" placeholder="Número da nota de devolução" aria-label="Username" aria-describedby="basic-addon1">
        </div>
        <div class="input-group mb-3">
            <div class="input-group-prepend">
                    <span class="input-group-text" id="basic-addon1">R$</span>
            </div>
            <input type="number" class="form-control" name="valor" placeholder="Valor a ser devolvido" aria-label="Username" aria-describedby="basic-addon1">
        </div>
    </div>
    <div class="mt-20">
        <button class="btn btn-primary float-right" name="btnAcao" value="devolucao" type="submit">Registrar Devolução</button>
    </div>
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
