class Celular:
    def __init__(self, modelo=None, bateria=100.0):
        self.modelo = modelo if modelo else "Desconocido"
        self.bateria = bateria
        self.espacio = [0] * 20  # Lista inicializada con 20 ceros

    def instalar(self, app_size):
        """Instala una aplicación en el primer espacio disponible"""
        for i, valor in enumerate(self.espacio):
            if valor == 0:
                self.espacio[i] = app_size
                return True
        return False  # No hay espacio disponible

    def usar(self, posicion, tiempo):
        """Usa una aplicación y consume batería"""
        if 0 <= posicion < 20:
            app_size = self.espacio[posicion]
            
            if app_size <= 100:
                consumo = tiempo * 0.1
            elif app_size <= 250:
                consumo = tiempo * 0.2
            else:
                consumo = tiempo * 0.5
                
            self.bateria = max(self.bateria - consumo, 0)

    def mostrar_bateria(self):
        print(f"Batería restante: {self.bateria:.1f}%")

    def estado(self):
        """Verifica el estado del dispositivo"""
        if self.bateria > 0:
            print("El dispositivo está encendido")
            return True
        print("El dispositivo está apagado")
        return False


def main():
    celular1 = Celular("nsoe", 77)
    celular2 = Celular("note 25", 89)
    celular3 = Celular("traka", 88)
    
    celular1.instalar(150)
    celular1.usar(0, 30)
    celular1.mostrar_bateria()
    celular1.estado()


if __name__ == "__main__":
    main()