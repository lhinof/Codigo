import time

class Computadora:
    def __init__(self, estado=False, monitor="", teclado="", procesador="", mouse="", tarjeta_madre="", parlantes="", ram=0, rom=0):
        self.tipodeMonitor = monitor
        self.teclado = teclado
        self.procesador = procesador
        self.mouse = mouse
        self.tarjetaMadre = tarjeta_madre
        self.parlantes = parlantes
        self.memoria_ram = ram
        self.memoria_rom = rom
        self.estado = estado

    def mostrar(self):
        print(f"Monitor: {self.tipodeMonitor}")
        print(f"Teclado: {self.teclado}")
        print(f"Procesador: {self.procesador}")
        print(f"Mouse: {self.mouse}")
        print(f"Tarjeta Madre: {self.tarjetaMadre}")
        print(f"Parlantes: {self.parlantes}")
        print(f"RAM: {self.memoria_ram} GB")
        print(f"ROM: {self.memoria_rom} GB")

    def estado(self):
        print(f"Estado: {'Encendido' if self.estado else 'Apagado'}")

    def encender_apagar(self):
        if self.estado:
            print("Encendido")
            respuesta = input("¿Apagar equipo? (s/n): ")
            if respuesta.lower() == "s":
                for _ in range(3):
                    print("*****")
                    time.sleep(1)
                print("Apagado")
                self.estado = False
        else:
            print("Apagado")
            respuesta = input("¿Encender equipo? (s/n): ")
            if respuesta.lower() == "s":
                for _ in range(3):
                    print("*****")
                    time.sleep(1)
                print("Encendido")
                print("Bienvenido")
                self.estado = True


def main():
    computadora1 = Computadora(True, "Xiaomi", "Mecánico 100%", "Intel Core i9", "HP", "MICRO-ATX", "Edifier R1280T", 16, 500)
    computadora2 = Computadora(False, "Dell", "Mediacenter", "Ryzen 7", "HP", "FLEXATX", "Edifier R1280T", 32, 256)
    
    computadora1.mostrar()
    computadora2.mostrar()
    
    computadora1.encender_apagar()
    computadora2.encender_apagar()
    
    computadora2.estado()


if __name__ == "__main__":
    main()