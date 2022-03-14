class Heeroe:
    def __init__(self,nombre,arma):
        self.nombre=nombre
        self.arma=arma

    def __str__(self) :
        return self.nombre

class Arma:

    def __init__(self,tipo,nombre):
        self.tipo=tipo
        self.nombre=nombre
    def __str__(self):
        return self.tipo

espada = Arma("Hacha","ola")
isma = Heeroe("isma",espada)

print(isma.arma)
