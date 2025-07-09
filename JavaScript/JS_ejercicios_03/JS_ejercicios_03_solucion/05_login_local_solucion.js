// Comprobamos si ya hay datos guardados
const user = JSON.parse(localStorage.getItem("usuario"));;

const cabecera = document.getElementById("main-header");
const contenedor = document.getElementById("contenido");

if (user) {
  // Ya tenemos datos → mostramos saludo
  cabecera.innerHTML = `¡Bienvenido, ${user.nombre} ${user.apellido}!`;
  contenedor.innerHTML = `<button id="logout">Cerrar sesión</button>`;
  document.getElementById("logout").addEventListener("click", () => {
    localStorage.removeItem("usuario");
    location.reload(); // Recargar para volver al estado inicial
  });
} else {
  // No hay datos → estamos pendientes de login
  
  document.getElementById("loginForm").addEventListener("submit", (e) => {
    e.preventDefault();
    const email = document.getElementById("em<email").value;
    const password = document.getElementById("password").value;

    const usuario = {
      email: email,
      password: password
    }
    localStorage.setItem("usuario", JSON.stringify(usuario));
    location.reload(); // Recargar para mostrar bienvenida
  });
}