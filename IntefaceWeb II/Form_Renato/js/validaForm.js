function validaTexto() {
    if (document.getElementById("nome").value == "" || document.getElementById("telefone").value == "" || document.getElementById("endereco").value == "") {
        alert('Campos Obrigatórios');
        return false;
    } else {
        var n, t, e, resp;
        n = document.getElementById('nome').value;
        t = document.getElementById('telefone').value;
        e = document.getElementById('endereco').value;

        resp = document.getElementById('caixaResposta');
        resp.innerHTML = 'Nome ' + n + 'Telefone ' + t + '\n Endereço ' + e;
    }

}

function validaCheck() {
    var check, qtdCheck, i, qtdSelecionado = 0,
        ling = "";
    check = document.getElementsByName('linguagem');
    qtdCheck = check.length;
    for (i = 0; i < qtdCheck; i++) {
        if (check[i].checked)
            qtdSelecionado++;
    }
    if (qtdSelecionado == 0) {
        alert('Escolha pelo menos uma linguagem');
        return false;
    } else {
        check = document.getElementsByName("linguagem");
        qtdCheck = check.length;
        for (i = 0; i < qtdCheck; i++)
            if (check[i].checked)
                ling = ling + ' ' + check[i].value;
    }
    resp = document.getElementById('caixaResposta');
    resp.innerHTML = 'Linguagens Selecionadas:' < br > +ling;
}