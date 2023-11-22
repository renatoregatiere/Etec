<%-- 
    Document   : alterarlivro
    Created on : 31/10/2023, 21:28:51
    Author     : LABINFO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        ${mensagem}
        
        <form name="alterarlivro" action="AlterarLivro" method="POST">
            
            <h5>Alterar Livro</h5>
            
            <label>Id</label>
            <input type="text" name="nomeLivro" value="${livro.idLivro}"/>
            
             <label>Gêgenro</label>
             <select name="generoLivro">
                 <option value="${livro.generoLivro}">${livro.generoLivro}</option>
                 <option value="ficcao">Ficcão</option>
                 <option value="nao-ficcao">Não Ficcão</option>
                 <option value="romance">Romance</option>
                 <option value="misterio">Mistério</option>
                 <option value="fantasia">fantasia</option>
                 <option value="ciencia">Ciência</option>
                 <option value="historia">História</option>
                 <option value="biografia">Biografia</option>
             </select>
                 
            <label>Autor</label>
            <input type="text" name="autorLivro" value="${livro.autorLivro}"/>
            <label>Resumo</label>
            <input type="text" name="resumoLivro" value="${livro.resumoLivro}"/>
            <label>Preço</label>
            <input type="text" name="precoLivro" value="${livro.precoLivro}"/>
            <label>ISBN</label>
            <input type="text" name="isbnLivro" value="${livro.isbnLivro}"/>
            
            <input type="submit" name="alterar" value="Alterar"/>
            
        </form>
    </body>
</html>
