class BloqueCofre:
    def __init__(self, resistencia=0, capacidad=0, tipo=""):
        self.resistencia = resistencia
        self.capacidad = capacidad
        self.tipo = tipo

    def __str__(self):
        return f"Resistencia: {self.resistencia}\nCapacidad: {self.capacidad}\nTipo: {self.tipo}"


class BloqueHorno:
    def __init__(self, color="", capacidad_comida=0):
        self.color = color
        self.capacidad_comida = capacidad_comida

    def __str__(self):
        return f"Color: {self.color}\nCapacidad de comida: {self.capacidad_comida}"


class BloqueTnt:
    def __init__(self, tipo="", danio=""):
        self.tipo = tipo
        self.danio = danio

    def __str__(self):
        return f"Tipo: {self.tipo}\nDaño: {self.danio}"


def main():
    cofre1 = BloqueCofre(100, 50, "Cofre de oro")
    horno1 = BloqueHorno("Rojo", 10)
    tnt1 = BloqueTnt("Explosivo", "Alto")

    print(cofre1)
    print("\n")
    print(horno1)
    print("\n")
    print(tnt1)


if __name__ == "__main__":
    main()
