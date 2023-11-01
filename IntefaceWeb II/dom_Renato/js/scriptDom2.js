function atualizarDados() {
    var nome, peso, altura, sexo;

    nome = document.getElementById("nome").value;
    peso = document.getElementById("peso").value;
    altura = document.getElementById("altura").value;

    if (document.getElementById("sexo1").checked == true)
        sexo = document.getElementById("sexo1").value;
    else if (document.getElementById("sexo2").checked == true)
        sexo = document.getElementById("sexo2").value;

    //console.log(nome);

    var listaPacientes = document.getElementById("listaPacientes");
    var qtdLinhas = listaPacientes.rows.length;
    var linha = listaPacientes.insertRow(qtdLinhas);
    var celNome = linha.insertCell(0);
    var celPeso = linha.insertCell(1);
    var celAltura = linha.insertCell(2);
    var celSexo = linha.insertCell(3);
    var celPesoIdeal = linha.insertCell(4);
    var celSituacao = linha.insertCell(5);
    var celRemover = linha.insertCell(6);

    celNome.innerHTML = nome;
    celPeso.innerHTML = peso;
    celAltura.innerHTML = altura;
    celSexo.innerHTML = sexo;
    celPesoIdeal.innerHTML = calcularPesoIdeal(sexo, altura);
    celSituacao.innerHTML = verSiacao(calcularPesoIdeal(sexo, altura), peso);
    celRemover.innerHTML = "<button onclick='removeLinha(this)'>Remover</button>";
}

function removeLinha(linha) {
    var i = linha.parentNode.parentNode.rowIndex;
    document.getElementById('listaPacientes').deleteRow(i);
}

function calcularPesoIdeal(sexo, altura) {
    var pesoIdeal;
    if (sexo == "f")
        pesoIdeal = 62.1 * altura - 44.7;
    else
        pesoIdeal = 72.7 * altura - 58;
    return pesoIdeal.toFixed(2);
}

function verSiacao(pesoIdeal, PesoAtual) {
    if (PesoAtual < pesoIdeal)
        return "Tudo Ok"
    else
        return "Precisa Emagracer"
}