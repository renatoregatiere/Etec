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
        resp.innerHTML = 'Nome ' + n + ' Telefone ' + t + ' Endereço ' + e;
    }

}