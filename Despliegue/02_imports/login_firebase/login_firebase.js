import { initializeApp } from "https://www.gstatic.com/firebasejs/11.9.1/firebase-app.js";
import { getAuth, signInWithEmailAndPassword, onAuthStateChanged, signOut } from "https://www.gstatic.com/firebasejs/11.9.1/firebase-auth.js";
import { firebaseConfig } from "./firebaseConfig.js";

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const auth = getAuth(app);

const cabecera = document.getElementById("main-header");
const contenedor = document.getElementById("contenido");

// Escuchar cambios en el estado de autenticación
onAuthStateChanged(auth, (user) => {
  // comprobamos si hay usuario
  if (user) {
    // Usuario autenticado → mostramos saludo
    const displayName = user.displayName || user.email;
    cabecera.innerHTML = `¡Bienvenido, ${displayName}!`;
    contenedor.innerHTML="";

    const logoutButton = document.createElement("button");
    logoutButton.id="logout";
    logoutButton.textContent="Cerrar Sesion";
    contenedor.appendChild(logoutButton);

    logoutButton.addEventListener("click", async()=>{
      try{
        await signOut(auth);
      }catch(error){
        console.error("Error al cerrar sesión");
      }
    })
  } else {
    // No hay usuario → mostrar formulario de login
    mostrarFormularioLogin();
  }
});

function mostrarFormularioLogin(){

  contenedor.innerHTML=`
  <form id="loginForm">
      <input type="email" id="email" placeholder="Email" required>
      <input type="password" id="password" placeholder="Contraseña" required>
      <button type="submit">Entrar</button>
      <button type="submit" id="logout">
    </form>
    `

  document.getElementById("loginForm").addEventListener("submit", async (e) => {
    e.preventDefault();
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    try {
      await signInWithEmailAndPassword(auth, email, password);
      console.log(`El usuario ${email} ha accedido correctamente`);
    } catch (error) {
      alert("Error al iniciar sesión: " + error.message);
    }
  });
}