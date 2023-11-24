<%-- 
    Document   : cadastrarLivro.jsp
    Created on : 5 de set. de 2023, 20:06:15
    Author     : LABINFO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Remedios</title>
        <link href="cadastrarRemedio.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>


        <script>
            function myFunction() {
                alert("${mensagem}");
            }
        </script>
        <div class="container">
            <div class="header">
                <h2>Cadastrar</h2>
            </div>
            <form action="CadastrarRemedio" method="POST"  id="form" class="form">
                <div class="form-control">
                    <label for="username">Nome do remedio</label>
                    <input type="text" placeholder="Nome do remedio" id="Nome do remedio" name="nomeRemedio"/>
                    <i class="fas fa-check-circle"></i>
                    <i class="fas fa-exclamation-circle"></i>

                </div>
                <div class="form-control">
                    <label for="username">Categoria</label>
                    <input type="text" placeholder="Gênero" id="Categoria" name="categoriaRemedio"/>
                    <i class="fas fa-check-circle"></i>
                    <i class="fas fa-exclamation-circle"></i>
               
                </div>
                <div class="form-control">
                    <label for="username">Preço</label>
                    <input type="text" placeholder="Preço" id="Preço" name="precoRemedio"/>
                    <i class="fas fa-check-circle"></i>
                    <i class="fas fa-exclamation-circle"></i>

                
                <button onclick="myFunction()">Cadastrar</button>
            </form>
        </div>

    </body>
</html>
