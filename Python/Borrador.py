class FeriaDeSalud:
    def __init__(self, nombre, fecha, lugar, tipo):
        self.nombre = nombre
        self.fecha = fecha
        self.lugar = lugar
        self.tipo = tipo
        self.usuarios = []

    def registrar_usuario(self, usuario):
        self.usuarios.append(usuario)

    def registrar_servicio(self, usuario, servicio):
        print(f"\nEl usuario {usuario.nombre} ha sido asignado al servicio '{servicio.nombre}'")

    def quitar_usuario(self, usuario):
        self.usuarios.remove(usuario)

    def mostrar_usuarios(self):
        print(f"\nLista de participantes registrados en '{self.nombre}':\n")
        for usuario in self.usuarios:
            usuario.mostrar_info()
            print("---")

class PuestoDeTrabajo:
    def __init__(self, nombre, tipo_de_enfermedades, numero_de_puesto, capacidad):
        self.nombre = nombre
        self.tipo_de_enfermedades = tipo_de_enfermedades
        self.numero_de_puesto = numero_de_puesto
        self.capacidad = capacidad
        self.personas_dentro = 0
    def mostrar_datos(self):
        print(f"\nPuesto de trabajo: {self.nombre}")
        print(f"Tipo de enfermedades: {self.tipo_de_enfermedades}")
        print(f"Número de puesto: {self.numero_de_puesto}")
        print(f"Capacidad: {self.capacidad}")

    def determinar_concurrencia(self):
        return self.personas_dentro
    def consultar_capacidad(self):
        return self.capacidad - self.personas_dentro

class Consulta:
    def __init__(self, diagnostico, descripcion, tratamientos, medico, usuario):
        self.diagnostico = diagnostico
        self.descripcion = descripcion
        self.tratamientos = tratamientos
        self.medico = medico
        self.usuario = usuario

    def ejecutar_consulta(self):
        print("\nConsulta ejecutada")
    def mostrar_diagnostico(self):
        print(f"Diagnóstico: {self.diagnostico}")
    def tratamiento_correspondiente(self):
        print(f"Tratamiento correspondiente: {self.tratamientos[0].nombre}")

class Tratamiento:
    def __init__(self, nombre, descripcion):
        self.nombre = nombre
        self.descripcion = descripcion

    def ejecutar_tratamiento(self):
        print(f"Tratamiento '{self.nombre}' ejecutado. Descripción: {self.descripcion}")

class Persona:
    def __init__(self, nombre, edad, genero):
        self.nombre = nombre
        self.edad = edad
        self.genero = genero

    def mostrar_info(self):
        print(f"Nombre: {self.nombre}")
        print(f"Edad: {self.edad}")
        print(f"Género: {self.genero}")

class Usuario(Persona):
    def __init__(self, nombre, edad, genero, vacunas=None):
        super().__init__(nombre, edad, genero)
        self.vacunas = vacunas if vacunas else []

    def inquietudes(self):
        print("Inquietudes del usuario")
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Vacunas: {self.vacunas}")

class Paciente(Usuario):
    def __init__(self, nombre, edad, genero, vacunas=None, historial_medico=None):
        super().__init__(nombre, edad, genero, vacunas)
        self.historial_medico = historial_medico if historial_medico else []

    def agregar_historial_medico(self, entrada):
        self.historial_medico.append(entrada)
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Historial médico: {self.historial_medico}")

class Medico(Usuario):
    def __init__(self, nombre, edad, genero, especialidad):
        super().__init__(nombre, edad, genero)
        self.especialidad = especialidad

    def atender_paciente(self, paciente):
        print(f"Atendiendo al paciente {paciente.nombre}")
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Especialidad: {self.especialidad}")

feria = FeriaDeSalud(
    nombre="Feria de Salud UMSA",
    fecha="2025-06-10",
    lugar="Municipio de Sapahaqui",
    tipo="Feria Estudiantil Universitaria"
)


puesto_embarazo = PuestoDeTrabajo(
    nombre="Control de pruebas de embarazo",
    tipo_de_enfermedades="Prueba de embarazo por sangre y orina",
    numero_de_puesto=1,
    capacidad=30
)


tratamiento_1 = Tratamiento(
    nombre="Reposo de 3 días",
    descripcion="El paciente debe guardar reposo absoluto y tomar abundante agua."
)

medico_1 = Medico(
    nombre="Dra. Ana Pérez",
    edad=35,
    genero="Femenino",
    especialidad="Ginecología"
)

paciente_1 = Paciente(
    nombre="Lucía Quispe",
    edad=22,
    genero="Femenino",
    vacunas=["COVID-19", "Influenza"],
    historial_medico=["Dolor abdominal"]
)

feria.registrar_usuario(paciente_1)

feria.registrar_servicio(paciente_1, puesto_embarazo)

puesto_embarazo.mostrar_datos()

consulta_1 = Consulta(
    diagnostico="Posible infección urinaria",
    descripcion="Paciente con dolor abdominal bajo",
    tratamientos=[tratamiento_1],
    medico=medico_1,
    usuario=paciente_1
)

consulta_1.ejecutar_consulta()
consulta_1.mostrar_diagnostico()
consulta_1.tratamiento_correspondiente()


tratamiento_1.ejecutar_tratamiento()

feria.mostrar_usuarios()