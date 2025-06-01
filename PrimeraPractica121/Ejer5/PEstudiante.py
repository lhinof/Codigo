class Estudiante:
    def __init__(self, nombre=None, nota_1=0, nota_2=0):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    def aprobar(self):
        if self.promedio() >= 6:
            return " aprobó"
        else:
            return " reprobó"

    def mostrar(self):
        if self.nombre:
            print(f"El estudiante {self.nombre} tiene un promedio de {self.promedio():.2f}{self.aprobar()}")
        else:
            print("No hay información para mostrar.")


def main():
    estudiante1 = Estudiante("Daniel", 7, 8)
    estudiante2 = Estudiante("William", 4, 5)
    estudiante1.mostrar()
    estudiante2.mostrar()


if __name__ == "__main__":
    main()