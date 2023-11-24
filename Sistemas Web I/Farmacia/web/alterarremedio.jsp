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
        
        <form name="alterarremedio" action="AlterarRemedio" method="POST">
            
            <h5>Alterar Remedio</h5>
            
            <label>Id</label>
            <input type="text" name="nomeRemedio" value="${remedio.idRemedio}"/>
            
             <label>Categoria</label>
             <select name="categoriaRemedio">
                 <option value="${remedio.categoriaRemedio}">${remedio.categoriaRemedio}</option>
                 <option value="generico">Genérico</option>
                 <option value="similar">Similar</option>
                 <option value="outros">Outros</option>
                 
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
