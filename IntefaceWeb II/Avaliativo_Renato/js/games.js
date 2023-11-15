p = document.getElementById('imagemPrincipal');

m1 = document.getElementById('miniatura1');
m1.addEventListener('click', trocaImagem1);

function trocaImagem1() {
    p.src = 'img/games2.webp';
    textoProduto.innerHTML = '<h1>Hogwarts Legacy Standard Edition Warner Bros. PS4 Físico</h1>';
}

m2 = document.getElementById('miniatura2');
m2.addEventListener('click', trocaImagem2);

function trocaImagem2() {
    p.src = 'img/games3.webp';
    textoProduto.innerHTML = '<h1>Mario Kart 8 Deluxe Mario Kart Deluxe Edition Nintendo Switch Físico</h1>';
}

m3 = document.getElementById('miniatura3');
m3.addEventListener('click', trocaImagem3);

function trocaImagem3() {
    p.src = 'img/games4.webp';
    textoProduto.innerHTML = '<h1>The Legend of Zelda: Tears of the Kingdom Standard Edition Nintendo Switch Físico</h1>';
}

m4 = document.getElementById('miniatura4');
m4.addEventListener('click', trocaImagem4);

function trocaImagem4() {
    p.src = 'img/games5.webp';
    textoProduto.innerHTML = '<h1>Super Mario Odyssey Super Mario Standard Edition Nintendo Switch Físico</h1>';
}
m5 = document.getElementById('miniatura5');
m5.addEventListener('click', trocaImagem5);

function trocaImagem5() {
    p.src = 'img/games6.webp';
    textoProduto.innerHTML = '<h1>Luigis Mansion 3 Luigis Mansion Standard Edition Nintendo Switch Físico</h1>';
}

function voltarPaginaAnterior() {
    history. back();
    document. getElementById("voltar").addEventListener("click", voltarPaginaAnterior);
}