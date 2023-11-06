a1 = document.getElementById('area1');
a1.addEventListener('mousedown', clicouMouse);
a1.addEventListener('mouseup', soltouMouse);

function clicouMouse() {
    a1.style.backgroundColor = 'blue';
    a1.innerHTML = 'Solte o clique';
}