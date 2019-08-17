<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Caixa</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/all.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" ></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
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
<div class="cont">
    <form>
    <div class="card">
                            <div class="card-header" style="font-size: 20pt">
                                Extrato Caixa
                            </div>
                    <div class="card-body">
                        
                        <div class="input-group col-md-5">
                            <div class="input-group-prepend">
                                <span class="input-group-text fa fa-calendar" id="basic-addon1"></span>
                            </div>
                            <input type="date" class="form-control" placeholder="Data inicial" style="font-size: 10pt">
                          </div>
                        
                        <div class="input-group col-md-5">
                            <div class="input-group-prepend">
                                <span class="input-group-text fa fa-calendar" id="basic-addon1"></span>
                            </div>
                            <input type="date" class="form-control" placeholder="Data Final" style="font-size: 10pt">
                          </div>
                        
                        <div class="float-right">
                        <button type="submit" name="btnAcao" class="btn btn-primary" style="height: 50px; font-size: 10pt;">Gerar Relatorio</button>
                          
                            </div>
                    </div>
        <div class="card">
                            <div class="card-header" style="font-size: 20pt">
                                DRE
                            </div>
                    <div class="card-body">
                        
                        <div class="input-group col-md-5">
                            <div class="input-group-prepend">
                                <span class="input-group-text fa fa-calendar" id="basic-addon1"></span>
                            </div>
                            <input type="date" class="form-control" placeholder="Data inicial" style="font-size: 10pt">
                          </div>
                        
                        <div class="input-group col-md-5">
                            <div class="input-group-prepend">
                                <span class="input-group-text fa fa-calendar" id="basic-addon1"></span>
                            </div>
                            <input type="date" class="form-control" placeholder="Data Final" style="font-size: 10pt">
                          </div>
                        
                        
                        <div class="float-right">
                        <button type="submit" name="btnAcao" class="btn btn-primary" style="height: 50px; font-size: 10pt;">Gerar Relatorio</button>
                          
                            </div>
                          </div>
                    </div>
    </form>
</div>

<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/js/dataTables.bootstrap4.min.js"></script>
<script src="${pageContext.request.contextPath}/js/scripts.js"></script>

</body>
</html>
