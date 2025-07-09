// Obtenemos las referencias a los elementos
const modal = document.getElementById('discountModal');
const openModalBtn = document.getElementById('openModal');
const closeBtn = document.querySelector('.close'); // Ahora busca el elemento con clase "close"
const modalContent = document.querySelector('.modal-content');

// Al hacer clic en el botón de abrir, mostramos el modal
openModalBtn.addEventListener('click', (event) => {
event.stopPropagation();
modal.style.display = 'block';
});

// Al hacer clic en la "X" se cierra el modal
closeBtn.addEventListener('click', () => {
modal.style.display = 'none';
});

// Evitamos que los clics dentro del contenido del modal se propaguen al overlay
modalContent.addEventListener('click', (event) => {
event.stopPropagation();
});

// Si se hace clic en el overlay (fuera del contenido), se cierra el modal
modal.addEventListener('click', () => {
modal.style.display = 'none';
});