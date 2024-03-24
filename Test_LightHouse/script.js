
let squareId = 1;
function addSquare() {
  const container = document.getElementById('container');
  const newSquare = document.createElement('div');
  newSquare.classList.add('square');
  newSquare.id = 'square-' + squareId++;

  container.insertBefore(newSquare, container.firstChild);
}



