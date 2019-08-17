<%-- 
    Document   : operacoes
    Created on : 28/09/2018, 16:02:27
    Author     : Luan.Castro
--%>

<%@page import="Classes.Pedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<!-- Mirrored from bowstudios.uphero.com/livrosfiscais/gerenciar-registro-fiscal-entrada.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 15 Sep 2018 15:00:53 GMT -->
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=UTF-8" /><!-- /Added by HTTrack -->
<head>
    <meta charset="utf-8">
    <title>Operaçoes de Caixa</title>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.dataTables.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/dataTables.bootstrap4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/scripts.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/all.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" ></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Grupo 3 - Caixa" />

    <link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
    <%
         String cod = "Codigo da Venda";
         String kil = "Valor da Venda";
         String kil2 = "Forma de Pagamento";
         if(request.getParameter("resp")!=null ){
             kil = request.getParameter("resp");
         }if(request.getParameter("resp2")!=null ){
             kil2 = request.getParameter("resp2");
         }if(request.getParameter("resp3")!=null ){
             cod = request.getParameter("resp3");
         }
         
         
    %>
    <script>
        var popo = 1;
        
  function abertura(){
      if(popo === 1){
        popo = 0;
         
      }else{
          
          alert("ta louco");
      }
}
function fecharam(){
      if(popo === 0){
        popo = 1;
        alert("NAOAO");
      }else{
          
          alert("Operaçoes já Fechado");
      }
    
}
    function troquinho() {
        
        var o = <%=kil%>;
        var y = document.getElementById("valorrecebido").value;
        console.log("Valordavenda",o);
        console.log("Valorrecebido",y);
        if(y > o){
            var x = document.getElementById("tuco");
                x.value = y - o;
            console.log(x.value);
        }
        
}

    </script>
</head>

<body >
    
    <header>

        <%@include file="../include/logotipo.jsp" %>
        <%@include file="../include/navegacao.jsp" %>
        

    </header>

        <%@include file="../include/menu.jsp" %>
        <div class="cont">
           
            <form name="" action="../sModuloCaixa" method="post" >
                    <div class="card">
                            <div class="card-header" style="font-size: 20pt">
                                Pagamento
                              </div>
                    <div class="card-body">
                            <div class="form-group col-md-5">
                                <input id="codvenda" type="number" name="codvenda"class="form-control"  value="<%=cod%>" placeholder="<%=cod%>"style="font-size: 10pt" required="required">
                            </div>
                            <div class="form-group col-md-5">
                                <input id="valorvenda" type="number" name="valordavenda" class="form-control"  value="<%=kil%>" placeholder="<%=kil%>" style="font-size: 20pt" readonly="readonly">
                            </div>
                            <div class="form-group col-md-5">
                                <input id="formapaga" type="number" name="formapagamento"class="form-control" placeholder="<%=kil2%>" style="font-size: 10pt" readonly="readonly">
                            </div>
                            <div class="form-group col-md-5">
                                <input id="valorrecebido" type="number" name="valorrecebido" onkeyup="troquinho()" value="" class="form-control" placeholder="Valor Recebido" style="font-size: 20pt">
                            </div>
                            <div class="form-group col-md-5">
                                <input id="tuco" type="number" name="troco"class="form-control" placeholder="TROCO" style="font-size: 10pt" readonly="readonly">
                            </div>
                        <button id="btnteste" name="btnAcao" value="pagamento" type="submit" class="btn btn-success float-right" style="width: 95px; height: 50px; font-size: 12pt">Finalizar</button>
                        <button id="btnteste" name="btnAcao" value="consulta" type="submit" class="btn btn-info float-right" style="width: 95px; height: 50px; font-size: 12pt">Consultar</button>
                    </div>
                    </div>
                </form>
            <div class="card">
                            <div class="card-header" style="font-size: 20pt">
                                Abertura / Fechamento
                              </div>
                    <div class="card-body">
                        <button id="btnAbertura"  onclick="abertura()"  class="btn btn-primary " style="width: 30%; height: 50px; font-size: 12pt">Abrir Operaçoes</button>
                        <button id="btnFecharam" onclick="fecharam()" class="btn btn-danger float-right " style="width: 30%; height: 50px; font-size: 12pt">Fechar Operaçoes</button>
                    </div>
                    </div>
<div id="popup"></div></div>
 

<div class="modal fade" id="Modalsucesso" tabindex="-1" role="dialog">
      <div class='modal-dialog' role='document' style='height: 50%; width:50%;'>
            <div class='modal-content'>
              <div class='modal-header' style="background-color: #357ca5; color:#fff">
                    <button type='button' class='close' data-dismiss='modal' aria-label='Close'><span aria-hidden='true'>&times;</span></button>
                    <h4 class='modal-title'>Alerta</h4>
              </div>
              <div class='modal-body' style='max-height: 80vh; overflow: auto'>
                <table class="table table-bordered table-hover">
                  <tr>
                      <td class="text-center">Usuário ou senha inválidos!</td>
                  </tr>
                  <tr>
                      <td colspan="2"><button type="button" class="btn btn-danger" data-dismiss="modal">Fechar</button></td>
                  </tr>
                </table>
              </div>
            </div>
      </div>
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






</html>
