import { BrowserRouter, Route, Routes } from "react-router-dom";
import "./App.css";
import NavBar from "./Componentes/NavBar/NavBar.js"
import Home from "./Componentes/Home/Home.js";
import Footer from "./Componentes/Footer/Footer.js";
import Escaners from "./Componentes/Escaners/Escaners.js";
import Portatil from "./Componentes/Portatiles/Portatiles.js";
import PCescritorio from "./Componentes/Pcescritorio/Pcescritorio.js";
import Impresoras from "./Componentes/Impresoras/Impresoras.js";
import Contactanos from "./Componentes/Contactanos/Contactanos.js";
import Ventas from "./Componentes/Escaners/Ventas.js";
function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <NavBar />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/Escaners" element={<Escaners />} />
          <Route path="/Portatiles" element={<Portatil />} />
          <Route path="/Pcescritorio" element={<PCescritorio />} />
          <Route path="/Impresoras" element={<Impresoras />} />
          <Route path="/Contactos" element={<Contactanos />} />
          <Route path="/Ventas" element={<Ventas />} />
        </Routes>
        <Footer />
      </BrowserRouter>
    </div>
  );
}
export default App;