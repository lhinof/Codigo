#diccionarios 
user = {
    "name": "Cody",
    "age" : 10, 
    "active" : True,
    "courses" : [ 
        "python",  "Django", "Redis"
    ],
    "setings" : (123, True),
}

print("name" in user)

user_name = user.get("name")   #user["name"]   get("name", parecido a un if 
print(user_name)

user["name"] = "codigo" # asi de facil se añade o se actualiza 

print( 
    tuple(user.keys())   #Esta funcion lo combierte al diccionarioo
)

print(
    list(user.values())   #funcion devuelve Solo los Valores 
)

print(
    list(user.items())      #esta funcion lo vuelve en objeto a un diccionario
)
#len devuelve el numero de valores en el diccionario
user.update( {
        "name" : "codigo",
        "settings" : None, 
        "last_name" : "facilito"
        "courses" : courses
    }
)
#cuando quieras actualizar o añandir mas de un valor 
user.setdefault("id", 100) #añade una nueva llave si existe solo retorna su valor parecido al .get


courses = user.get("coures", []) # si no existe me devuelve una lista vacia
courses.append("ruby Rails")
courses.append("rust") # añade con el user.update


del user["courses"]
value = user.pop("settings") # .poop elimina el valor
print(value)

user.clear()   #Borra absolutamente todo

# True   (" ", 'a', 1, -1, 1.0, [1], (1), {'a':1})  or  False("",'', 0, 0.0, False, [], (), {}, None)

# condiciones 2daparte 

value = "cody"

if value:
    print("<<< Variable ")

score = 5
match score:
    case 10:
        print("muchas felicidadees por tu 10")
    case 9 | 8:
        print("Felicidadees por tu aprobacion de la materia")
    case 6 | 7:
        print("Aprobaste la materia")
    case _: # default 
        print( "Lo siento no aprobaste ")
# recuerda que es equivalente para un elif o tambien un swich case

#one line o operador ternario 
variable = "hola prueba" if 15 < 10 else "no sirve":
