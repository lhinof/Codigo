// === DICHOS ALEATORIOS ===
const dichos = [
    "Al mal tiempo, buena cara.",
    "Más vale tarde que nunca.",
    "Camarón que se duerme, se lo lleva la corriente.",
    "Haz bien sin mirar a quién.",
    "El que madruga, Dios lo ayuda.",
    "No hay mal que por bien no venga.",
    "A palabras necias, oídos sordos."
  ];
  
  const dichoTexto = document.getElementById('dicho-dia');
  const actualizarBtn = document.createElement('button');
  actualizarBtn.textContent = "Actualizar dicho";
  actualizarBtn.classList.add('boton-actualizar');
  
  // Insertar el botón justo después del texto del dicho
  document.getElementById('dicho-section').appendChild(actualizarBtn);
  
  // Evento para cambiar dicho aleatoriamente
  actualizarBtn.addEventListener('click', () => {
    const aleatorio = Math.floor(Math.random() * dichos.length);
    dichoTexto.textContent = `"${dichos[aleatorio]}"`;
  });
  
  // === CARRUSEL DE MENÚ ===
  const menuItems = [
    "Pan de elote - $25",
    "Rebanada de pastel tres leches - $35",
    "Concha rellena - $20",
    "Capuchino - $30",
    "Chocolate caliente - $28",
    "Café americano - $20",
    "Galletas de mantequilla (6 piezas) - $18"
  ];
  
  const menuContainer = document.querySelector('.menu');
  menuContainer.innerHTML = `
    <h2>Menú de la Cafetería-Pastelería</h2>
    <div class="carrusel">
      <button id="anterior">⟨</button>
      <div id="item-menu">${menuItems[0]}</div>
      <button id="siguiente">⟩</button>
    </div>
  `;
  
  let indiceActual = 0;
  
  document.getElementById('anterior').addEventListener('click', () => {
    indiceActual = (indiceActual - 1 + menuItems.length) % menuItems.length;
    actualizarCarrusel();
  });
  
  document.getElementById('siguiente').addEventListener('click', () => {
    indiceActual = (indiceActual + 1) % menuItems.length;
    actualizarCarrusel();
  });
  
  function actualizarCarrusel() {
    document.getElementById('item-menu').textContent = menuItems[indiceActual];
  }
  