a1 = document.getElementById('area1');
a1.addEventListener('mousedown', clicouMouse);
a1.addEventListener('mouseup', soltouMouse);

a2 = document.getElementById('area2');
a2.addEventListener('mouseOver', passouMouse);
a2.addEventListener('mouseout', tirouMouse);

function clicouMouse() {
    a1.style.backgroundColor = 'blue';
    a1.innerHTML = 'Solte o clique';
}

function soltouMouse() {
    a1.style.backgroundColor = 'orange';
    a1.innerHTML = 'Valeu!';
}

function passouMouse() {
    a2.innerHTML = 'obrigado!';
}

function tirouMouse() {
    a2.innerHTML = 'Passe o mouse!';
}