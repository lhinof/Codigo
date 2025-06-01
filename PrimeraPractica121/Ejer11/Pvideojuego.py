class Videojuego:
    def __init__(self, nombre="", plataforma="", cantidad_jugadores=0):
        self.nombre = nombre
        self.plataforma = plataforma
        self.cantidad_jugadores = cantidad_jugadores

    def mostrar(self):
        print("VIDEOJUEGO:")
        print(f"Nombre: {self.nombre}")
        print(f"Plataforma: {self.plataforma}")
        print(f"Cantidad de Jugadores: {self.cantidad_jugadores}")

    def aumentar(self, cantidad=1):
        self.cantidad_jugadores += cantidad


def main():
    juego1 = Videojuego("Left 4 Dead", "Steam", 10)
    juego2 = Videojuego("Repo", "Steam", 9)
    
    juego1.mostrar()
    juego2.mostrar()
    
    juego1.aumentar()  
    juego2.aumentar()  
    
    juego1.aumentar(3)  
    juego2.aumentar(5)  
    
    
    print("\nDespués de aumentar jugadores:")
    juego1.mostrar()
    juego2.mostrar()


if __name__ == "__main__":
    main()