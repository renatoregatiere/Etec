p = document.getElementById('imagemPrincipal');

m1 = document.getElementById('miniatura1');
m1.addEventListener('click', trocaImagem1);

function trocaImagem1() {
    p.src = 'img/produto2.webp';
    textoProduto.innerHTML = '<h1>Samsung Galaxy A14 4G (MediaTek) Dual SIM 64 GB verde-lima 4 GB RAM</h1>';
}

m2 = document.getElementById('miniatura2');
m2.addEventListener('click', trocaImagem2);

function trocaImagem2() {
    p.src = 'img/produto3.webp';
    textoProduto.innerHTML = '<h1>Samsung Galaxy A03 Core 32gb 2gb Ram Verde Cor Mint</h1>';
}

m3 = document.getElementById('miniatura3');
m3.addEventListener('click', trocaImagem3);

function trocaImagem3() {
    p.src = 'img/produto4.webp';
    textoProduto.innerHTML = '<h1>Moto G23 128 GB azul 4 GB RAM</h1>';
}

m4 = document.getElementById('miniatura4');
m4.addEventListener('click', trocaImagem4);

function trocaImagem4() {
    p.src = 'img/produto5.webp';
    textoProduto.innerHTML = '<h1>Xiaomi Pocophone Poco X5 Pro 5G Dual SIM 256 GB black 8 GB RAM</h1>';
}
m5 = document.getElementById('miniatura5');
m5.addEventListener('click', trocaImagem5);

function trocaImagem5() {
    p.src = 'img/produto6.webp';
    textoProduto.innerHTML = '<h1>Xiaomi Redmi Note 12s 256gb 8gb Ram Lançamento + Nota Fiscal</h1>';
}