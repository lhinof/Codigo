class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hacer_sonido(self):
        raise NotImplementedError("Método no implementado")

    def moverse(self):
        raise NotImplementedError("Método no implementado")


class Perro(Animal):
    def __init__(self, nombre, raza, edad):
        super().__init__(nombre)
        self.raza = raza
        self.edad = edad

    def hacer_sonido(self):
        print(f"{self.nombre} hace: ¡¡guau!!")

    def moverse(self):
        print(f"{self.nombre} corre")


class Gato(Animal):
    def __init__(self, nombre, color):
        super().__init__(nombre)
        self.color = color

    def hacer_sonido(self):
        print(f"{self.nombre} hace: ¡¡miau!!")

    def moverse(self):
        print(f"{self.nombre} camina, te ve, te lame")


class Pajaro(Animal):
    def __init__(self, nombre, tipo):
        super().__init__(nombre)
        self.tipo = tipo

    def hacer_sonido(self):
        print(f"{self.nombre} hace: ¡¡coco!!,¡¡coco!!")

    def moverse(self):
        print(f"{self.nombre} vuela")


def main():
    perro1 = Perro("Rambo", "Husky", 5)
    gato1 = Gato("Tomas", "Blanco")
    pajaro1 = Pajaro("Suma", "Colibri")

    perro1.hacer_sonido()
    gato1.hacer_sonido()
    pajaro1.hacer_sonido()

    perro1.moverse()
    gato1.moverse()
    pajaro1.moverse()


if __name__ == "__main__":
    main()