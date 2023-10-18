function validaTudo() {
	//validacao de caixa de texto
	if (document.getElementById("nome").value == "" ||
		document.getElementById("telefone").value == "" ||
		document.getElementsByName("linguagem").value == "") {
		alert("Campos obrigatórios");
		return false;
	}

	//validacao de checkbox	  
	var check, qteCheck, i, qteSelecionado = 0,
		ling = "";
	check = document.getElementsByName("idioma");
	qteCheck = check.length;
	for (i = 0; i < qteCheck; i++) {
		if (check[i].checked)
			qteSelecionado++;
	}
	if (qteSelecionado == 0) {
		alert("Escolha pelo menos um idioma");
		return false;
	}

	//validacao de radio periodo
	if (document.getElementById("horario1").checked == false &&
		document.getElementById("horario2").checked == false &&
		document.getElementById("horario3").checked == false) {
		alert("Escolha um período");
		return false;
	}

	//validacao de radio sexo
	if (document.getElementById("sexo1").checked == false &&
		document.getElementById("sexo2").checked == false &&
		document.getElementById("sexo3").checked == false) {
		alert("Escolha seu sexo");
		return false;
	}



	//validacao de select		  
	var combo;
	combo = document.getElementById("cidade");
	if (combo.selectedIndex == 0) {
		alert("Indique sua cidade");
		return false;
	}

	//pegando os dados da caixa de texto
	var n, f, resp;
	n = document.getElementById("nome").value;
	f = document.getElementById("telefone").value;

	//pegando os dados do radio
	var horario;
	if (document.getElementById("horario1").checked)
		horario = document.getElementById("horario1").value;

	else if (document.getElementById("horario2").checked)
		horario = document.getElementById("horario2").value;

	else
		horario = document.getElementById("horario3").value;

	//pegando os dados do radio sexo
	var sexo;
	if (document.getElementById("sexo1").checked)
		sexo = document.getElementById("sexo1").value;

	else if (document.getElementById("sexo2").checked)
		sexo = document.getElementById("sexo2").value;

	else
		sexo = document.getElementById("sexo3").value;


	//pegando os dados do checkbox linguagem
	var check, qteCheck, i, ling = "";
	check = document.getElementsByName("idioma");
	qteCheck = check.length;
	for (i = 0; i < qteCheck; i++) {
		if (check[i].checked)
			ling = ling + ", " + check[i].value;
	}

	// pegando o select selecionada 
	var cid, indiceCidadeSelecionada, cidadeSelecionada;
	cidadeSelecionada = document.getElementById("cidade");
	indiceCidadeSelecionada = cidadeSelecionada.selectedIndex;
	cid = cidadeSelecionada.options[indiceCidadeSelecionada].value;


	var resp;
	resp = document.getElementById("caixaResposta");
	resp.innerHTML = "Nome: " + n +
		"<br>Fone: " + f +
		"<br>Horário: " + horario +
		"<br>Linguagens: " + ling +
		"<br>Sexo: " + sexo +
		"<br>Cidade: " + cid;

}

function limparCaixaResposta() {
	var resp;
	resp = document.getElementById("caixaResposta");
	resp.innerHTML = "";


} //fim do limparResposta