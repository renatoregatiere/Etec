function atualizarLista() {
    var nome, rm, curso;

    nome = document.getElementById("nome").value;
    rm = document.getElementById("rm").value;
    curso = document.getElementById("curso").value;

    //console.log(nome);

    var listaAlunos = document.getElementById("listaAlunos");
    var qtdLinhas = listaAlunos.rows.length;
    var linha = listaAlunos.insertRow(qtdLinhas);
    var celNome = linha.insertCell();
    var celRm = linha.insertCell();
    var celCurso = linha.insertCell();
    var celApagar = linha.insertCell();

    celNome.innerHTML = nome;
    celRm.innerHTML = rm;
    celCurso.innerHTML = curso;
    celApagar.innerHTML = "<button onclick='removeLinha(this)'>Remover</button>";
}

function removeLinha(linha) {

    var i = linha.parentNode.parentNode.rowIndex;
    document.getElementById('listaAlunos').deleteRow(i);
}