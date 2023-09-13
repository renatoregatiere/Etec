<%-- 
    Document   : cadastrarautor
    Created on : 31 de ago. de 2023, 22:17:01
    Author     : renat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="cadastrarlivroestilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="form-body">
            <div class="row">
                <div class="form-holder">
                    <div class="form-content">
                        <div class="form-items">
                            <h3>Cadastrar Livro</h3>
                            <p>Preencha os dados do livro.</p>
                            <form class="requires-validation" novalidate>

                                <div class="col-md-12">
                                    <input class="form-control" type="text" name="idlivro" placeholder="Id Livro" required>                                   
                                </div>

                                <div class="col-md-12">
                                    <input class="form-control" type="text" name="genero" placeholder="Genero" required>
                                </div>

                                <div class="col-md-12">
                                    <input class="form-control" type="text" name="autor" placeholder="Autor" required>
                                </div>

                                <div class="col-md-12">
                                    <input class="form-control" type="text" name="resumo" placeholder="Resumo" required>
                                </div>

                                <div class="col-md-12">
                                    <input class="form-control" type="text" name="preco" placeholder="Preço" required>
                                </div>

                                <div class="col-md-12">
                                    <input class="form-control" type="text" name="isbn" placeholder="ISBN" required>
                                </div>

                                <div class="form-button mt-3">
                                    <button id="submit" type="submit" class="btn btn-primary">Cadastrar</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
