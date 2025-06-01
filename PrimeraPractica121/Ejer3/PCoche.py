class Coche:
    def __init__(self, marca=None, modelo=None, velocidad=0):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self, x):
        y = 10 * x
        self.velocidad += y

    def frenar(self, x):
        y = 5 * x
        self.velocidad -= y
        # Asegurarse de que la velocidad no sea negativa
        if self.velocidad < 0:
            self.velocidad = 0

    def mostrar(self):
        print(f"La velocidad de {self.modelo} es {self.velocidad}")


def main():
    A = Coche("Suzuki", "XL7", 15)
    B = Coche("Ferrari", "Portofino", 100)
    A.acelerar(3)
    B.acelerar(2)
    A.frenar(1)
    B.frenar(2)
    A.mostrar()
    B.mostrar()


if __name__ == "__main__":
    main()