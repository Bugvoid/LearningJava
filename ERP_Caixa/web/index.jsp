<%-- 
    Document   : index
    Created on : 25/09/2018, 11:25:33
    Author     : Luan.Castro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<meta http-equiv="content-type" content="text/html;charset=UTF-8" />
<head>
    <script src="js/jquery.min.js"></script>
    <script src="js/jquery.dataTables.min.js"></script>
    <script src="js/dataTables.bootstrap4.min.js"></script>
    <script src="js/scripts.js"></script>
    <meta charset="utf-8">
    <title>ADS</title>

    <link rel="stylesheet" href="css/all.css">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="author" content="Grupo 1 - Livros Fiscais" />

    <link rel="shortcut icon" type="image/x-icon" href="favicon.ico" />
</head>

<body class="bg-login">

    <div class="main">

        <div class="center-height">

            <div class="col-md-1"></div>

            <div class="col-md-5 col-xs-12 logo-login">
                <img src="img/logo-big.jpg">
                <p class="animated infinite pulse mt-20 some-mob">Seja bem-vindo ao painel administrativo da Panela ADS.</p>
            </div>

            <div class="col-md-5 col-xs-12">

                <div class="box-login">

                    <h1>ACESSAR SISTEMA</h1>

                    <div class="form-group" action="" method="post">
                        <input type="text" placeholder="Usuário" class="form-control" />
                    </div>
                    <div class="form-group">
                        <input type="text" placeholder="Senha" class="form-control" />
                    </div>

                    <p class="text-center m-0 p-0">
                        <a href="modulos.jsp">
                            <img src="img/btn-entrar.png" class="btn-hover">
                        </a>
                    </p>

                </div>

                <a href="esqueci-minha-senha.jsp">Esqueci a minha senha</a>

            </div>

            <div class="col-md-1 logo-login"></div>

        </div>

    </div>

    



</body>

</html>
