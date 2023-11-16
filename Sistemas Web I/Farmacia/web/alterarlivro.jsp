<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Projeto Livro</title>
        <link href="estilo.css" rel="stylesheet" type="text/css"/>
        <link href="menu.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>
        <header class="header">
            <a href="index.jsp" class="logo">Controle de Livros</a>
            <input class="menu-btn" type="checkbox" id="menu-btn" />
            <label class="menu-icon" for="menu-btn"><span class="navicon"></span></label>
            <ul class="menu">
                <li><a href="cadastrarlivro.jsp">Cadastrar Livro</a></li>
                <li><a href="ListarLivros">Listar Livro</a></li>
            </ul>
        </header>

        ${mensagem}


        <form name="alterarlivro" action="AlterarLivro" method="GET">

            <br /><br />
            <h5 id="logo">Alterar Livro</h5>

            <label for="id">Id</label>
            <input type="text" id="username" name="idLivro" value="${livro.idLivro}" autocomplete="off" />
            
             <label for="nome">Nome</label>
            <input type="text" id="username" name="nomeLivro" value="${livro.nomeLivro}" autocomplete="off"/>

            <label for="genero">Gênero</label>
            <select name="generoLivro" id="username">
                <option value="${livro.generoLivro}">${livro.generoLivro}</option>
                <option value="ficcao">Ficção</option>
                <option value="nao-ficcao">Não Ficção</option>
                <option value="romance">Romance</option>
                <option value="misterio">Mistério</option>
                <option value="fantasia">Fantasia</option>
                <option value="ciencia">Ciência</option>
                <option value="historia">História</option>
                <option value="biografia">Biografia</option>
            </select>


            <label for="autor">Autor</label>
            <input type="text" id="username" name="autorLivro" value="${livro.autorLivro}" placeholder="Digite o autor do livro" autocomplete="off" required />

            <label for="resumo">Resumo</label>
            <input type="text" id="username" name="resumoLivro" value="${livro.resumoLivro}" placeholder="Digite o resumo do livro" autocomplete="off" required />

            <label for="preco">Preço</label>
            <input type="number" id="username" name="precoLivro" value="${livro.precoLivro}" placeholder="Digite o preço do livro" step="0.01" autocomplete="off" required />

            <label for="isbn">ISBN</label>
            <input type="text" id="username" name="isbnLivro" value="${livro.isbnLivro}" placeholder="Digite o ISBN do livro" autocomplete="off" required />

          
                    <input type="submit" name="alterar" value="Alterar"> 
     
    </form>

</body>
</html>
