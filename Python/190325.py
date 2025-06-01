class Cuaderno:
  def __init__(self,m,t,ta,n):
    self.marca=m
    self.tipo=t
    self.tamano=ta
    self.nrohojas=n
  def __invert__(self):
    print(self.marca,self.tipo,self.tamano,self.nrohojas)
    return Cuaderno(self.marca,self.tipo,self.tamano,self.nrohojas)
  def __str__(self):
    return f"{self.marca} , {self.tipo} , {self.tamano} , {self.nrohojas}"
  def __eq__(self,cua):
    if self.marca==cua.marca:
      return True
    return False
#Verificar si un cuaderno tiene mas hojas que otro cuaderno --> Binario
#Incrementar 10 hojas a un cuaderno --> Unario
#incrementa x hojas a un cuaderno--> Binario
#mostrar al i-esimo integrante de un grupo
  #Agregar k nuevos integrantes a un grupo


def __str__(self):
    cad="" 
    for i in range(self.n):
      cad=cad+"\n"+self.nom[i]+" "+str(self.e[i])
    return f"{cad}"
A=GrupoN(3,["Ana","Pedro","Juan"],[4,2,8])
A.mostrar()
print(A)