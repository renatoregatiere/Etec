function atualizarLista() {
    var nome, rm, curso;

    nome = document.getElementById("nome").value;
    rm = document.getElementById("rm").value;
    curso = document.getElementById("curso").value;

    //console.log(nome);

    var listaAlunos = document.getElementById("listaAlunos");
    var qtdLinhas = listaAlunos.rows.length;
    var linha = listaAlunos.insertRow(qtdLinhas);
    var celNome = linha.insertCell(0);
    var celRm = linha.insertCell(1);
    var celCurso = linha.insertCell(2);
    var celApagar = linha.insertCell(3);

    celNome.innerHTML = nome;
    celRm.innerHTML = rm;
    celCurso.innerHTML = curso;
    celApagar.innerHTML = "<button onclick='removeLinha(this)'>Remover</button>";
}

function removeLinha(linha) {

    var i = linha.parentNode.parentNode.rowIndex;
    document.getElementById('listaAlunos').deleteRow(i);
}