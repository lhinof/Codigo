class Administrativo:
    def __init__(self, nombre="", cargo="", sueldo_mes=0.0):
        self.nombre = nombre
        self.cargo = cargo
        self.sueldo_mes = sueldo_mes

    def __str__(self):
        return f"Nombre: {self.nombre}\nCargo: {self.cargo}\nSueldo Mensual: {self.sueldo_mes}"


class Cocinero:
    def __init__(self, nombre="", sueldo_mes=0, horas_extra=0, sueldo_hora=0.0):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora

    def calcular_sueldo_total(self):
        return self.sueldo_mes + (self.horas_extra * self.sueldo_hora)

    def __str__(self):
        return f"Nombre: {self.nombre}\nSueldo Mensual: {self.sueldo_mes}\nHoras Extra: {self.horas_extra}\nSueldo Hora: {self.sueldo_hora}"


class Mesero:
    def __init__(self, nombre="", sueldo_mes=0, horas_extra=0, sueldo_hora=0.0, propina=0.0):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def calcular_sueldo_total(self):
        return self.sueldo_mes + (self.horas_extra * self.sueldo_hora) + self.propina

    def __str__(self):
        return f"Nombre: {self.nombre}\nSueldo Mensual: {self.sueldo_mes}\nHoras Extra: {self.horas_extra}\nSueldo Hora: {self.sueldo_hora}\nPropina: {self.propina}"


def main():
    admin = Administrativo("Juan", "Gerente", 5000.0)
    cocinero = Cocinero("Pedro", 3000, 10, 20.0)
    mesero = Mesero("Luis", 2500, 5, 15.0, 500.0)

    print(admin)
    print("\n")
    print(cocinero)
    print(f"Sueldo Total Cocinero: {cocinero.calcular_sueldo_total()}")
    print("\n")
    print(mesero)
    print(f"Sueldo Total Mesero: {mesero.calcular_sueldo_total()}")


if __name__ == "__main__":
    main()