p = document.getElementById('imagemPrincipal');

m1 = document.getElementById('miniatura1');
m1.addEventListener('click', trocaImagem1);

function trocaImagem1() {
    p.src = 'img/perfume2.webp';
    textoProduto.innerHTML = '<h1>Perfume Night Caviar 100 Ml - Masculino Paris Elysees Volume Da Unidade 100 Ml</h1>';
}

m2 = document.getElementById('miniatura2');
m2.addEventListener('click', trocaImagem2);

function trocaImagem2() {
    p.src = 'img/perfume3.webp';
    textoProduto.innerHTML = '<h1>Daniela Sabrini Paris Elysees Fem 100 Ml-lacrado Original</h1>';
}

m3 = document.getElementById('miniatura3');
m3.addEventListener('click', trocaImagem3);

function trocaImagem3() {
    p.src = 'img/perfume4.webp';
    textoProduto.innerHTML = '<h1>Billion Paris Elysees Edt - Perfume Masculino 100ml</h1>';
}

m4 = document.getElementById('miniatura4');
m4.addEventListener('click', trocaImagem4);

function trocaImagem4() {
    p.src = 'img/perfume5.webp';
    textoProduto.innerHTML = '<h1>Perfume Feminino Cuté Woman Eau De Parfum 100ml La Rive</h1>';
}
m5 = document.getElementById('miniatura5');
m5.addEventListener('click', trocaImagem5);

function trocaImagem5() {
    p.src = 'img/perfume6.webp';
    textoProduto.innerHTML = '<h1>O Boticário Egeo Bomb Black Deo-colônia 90ml para masculino</h1>';
}