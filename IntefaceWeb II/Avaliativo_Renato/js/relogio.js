p = document.getElementById('imagemPrincipal');

m1 = document.getElementById('miniatura1');
m1.addEventListener('click', trocaImagem1);

function trocaImagem1() {
    p.src = 'img/relogio2.webp';
    textoProduto.innerHTML = '<h1>Relógio Masculino Technos Executive Dourado Loja Oficial Cor da correia Ouro Cor do bisel Ouro Cor do fundo Preto</h1>';
}

m2 = document.getElementById('miniatura2');
m2.addEventListener('click', trocaImagem2);

function trocaImagem2() {
    p.src = 'img/relogio3.webp';
    textoProduto.innerHTML = '<h1>Relógio Pulso Pulseira Aço Inox Quartzo Curren 8023 Silver Cor Do Bisel Branco/preto</h1>';
}

m3 = document.getElementById('miniatura3');
m3.addEventListener('click', trocaImagem3);

function trocaImagem3() {
    p.src = 'img/relogio4.webp';
    textoProduto.innerHTML = '<h1>Smartwatch Esportivo Feminino À Prova Dágua Q19pro</h1>';
}

m4 = document.getElementById('miniatura4');
m4.addEventListener('click', trocaImagem4);

function trocaImagem4() {
    p.src = 'img/relogio5.webp';
    textoProduto.innerHTML = '<h1>Relógio 45mm Preto Esportivo Inteligente Tela Redonda Ip67</h1>';
}
m5 = document.getElementById('miniatura5');
m5.addEventListener('click', trocaImagem5);

function trocaImagem5() {
    p.src = 'img/relogio6.webp';
    textoProduto.innerHTML = '<h1>Relógio Casio G-shock Tábua De Maré G-7900a-4dr * G-rescue</h1>';
}

function voltarPaginaAnterior() {
    history. back();
    document. getElementById("voltar").addEventListener("click", voltarPaginaAnterior);
}