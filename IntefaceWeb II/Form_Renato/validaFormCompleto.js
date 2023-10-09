function validaTudo(){
	//validacao de caixa de texto
	if(document.getElementById("nome").value==""||
	   document.getElementById("fone").value==""||
	   document.getElementById("endereco").value==""){
       alert("Campos obrigatórios");
	   return false;
	}
	
	//validacao de radio
	if(document.getElementById("horario1").checked==false &&
		  document.getElementById("horario2").checked==false &&
		  document.getElementById("horario3").checked==false)
		  {
		   alert("Escolha um período");
		   return false;
		  }
		  
	//validacao de checkbox	  
	var check, qteCheck, i, qteSelecionado=0, ling="";
		   check = document.getElementsByName("linguagem");
		   qteCheck=check.length;
		   for(i=0;i<qteCheck; i++){
			 if(check[i].checked)  
				qteSelecionado++;  
		  }
  		  if (qteSelecionado==0){
			  alert("Escolha pelo menos uma linguagem");
			  return false;
		  }
		  
    //validacao de select		  
     var combo;
			combo=document.getElementById("cidade")	;
			if(combo.selectedIndex==0){
			  alert("Indique sua cidade");
			 return false;		  
			}
	
	
	
	//pegando os dados da caixa de texto
       var  n, f, e,resp;
        n=document.getElementById("nome").value;
        f= document.getElementById("fone").value;
        e=document.getElementById("endereco").value;
		
    //pegando os dados do radio
	   var horario;
		if(document.getElementById("horario1").checked)
    	 horario=document.getElementById("horario1").value;
	  
        else if(document.getElementById("horario2").checked)
	      horario=document.getElementById("horario2").value;
	  
        else 
		  horario=document.getElementById("horario3").value;
	  

     //pegando os dados do checkbox
	  var check, qteCheck, i, ling="";
	   check=document.getElementsByName("linguagem");
       qteCheck=check.length;
       for(i=0;i<qteCheck;i++){
         if(check[i].checked)
           ling=ling+ " "+ check[i].value;
       }
	   
	// pegando o select selecionada 
    var cid, indiceCidadeSelecionada, cidadeSelecionada;
      cidadeSelecionada=document.getElementById("cidade");
      indiceCidadeSelecionada=cidadeSelecionada.selectedIndex;
      cid=cidadeSelecionada.options[indiceCidadeSelecionada].value;	
	  
	  
	var resp;  
	resp= document.getElementById("caixaResposta");
    resp.innerHTML="Nome: "+n + 
                   "<br>Fone: "+ f +
                   "<br>Endereco: "+ e +
				   "<br>Horário: "+ horario +
				   "<br>Linguagens: "+ ling +
				   "<br>Cidade: "+ cid;
	  
}  

function limparCaixaResposta(){
	var resp;
	resp= document.getElementById("caixaResposta");
	resp.innerHTML="";
	
	
}//fim do limparResposta

	
	
	
      
   