class Aula:
    def __init__(self, nombre="", capacidad=0, nro_pupitres=0):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nro_pupitres = nro_pupitres

    def __str__(self):
        return f"Nombre: {self.nombre}\nCapacidad: {self.capacidad}\nNro Pupitres: {self.nro_pupitres}"

    def cantidad_muebles(self):
        return self.nro_pupitres


class Laboratorio:
    def __init__(self, nombre="", capacidad=0, nro_mesas=0, nro_sillas=0):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nro_mesas = nro_mesas
        self.nro_sillas = nro_sillas

    def __str__(self):
        return f"Nombre: {self.nombre}\nCapacidad: {self.capacidad}\nNro Mesas: {self.nro_mesas}\nNro Sillas: {self.nro_sillas}"

    def cantidad_muebles(self):
        return self.nro_mesas + self.nro_sillas


class Oficina:
    def __init__(self, nro_sillas=0, nro_escritorios=0, nro_estanterias=0):
        self.nro_sillas = nro_sillas
        self.nro_escritorios = nro_escritorios
        self.nro_estanterias = nro_estanterias

    def __str__(self):
        return f"Nro Sillas: {self.nro_sillas}\nNro Escritorios: {self.nro_escritorios}\nNro Estanterias: {self.nro_estanterias}"

    def cantidad_muebles(self):
        return self.nro_sillas + self.nro_escritorios + self.nro_estanterias


def main():
    oficina1 = Oficina(12, 6, 3)
    oficina2 = Oficina(6, 6, 2)
    aula1 = Aula("5to c", 40, 20)
    aula2 = Aula("6to c", 30, 15)
    laboratorio1 = Laboratorio("quimica1", 50, 4, 45)

    print(oficina1)
    print("\n")
    print(laboratorio1)
    print("\n")
    print(aula1)

    print(f"Cantidad de muebles en Oficina 1: {oficina1.cantidad_muebles()}")
    print(f"Cantidad de muebles en Laboratorio 1: {laboratorio1.cantidad_muebles()}")
    print(f"Cantidad de muebles en Aula 1: {aula1.cantidad_muebles()}")


if __name__ == "__main__":
    main()