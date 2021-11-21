import random

tableroMaquina=[['-', '-', '-', '-', '-', '-', '-', '-', '-', '-'],
['-', '-', '-', '-', '-', '-', '-', '-', '-', '-'],
['-', '-', '-', '-', '-', '-', '-', '-', '-', '-'],
['-', '-', '-', '-', '-', '-', '-', '-', '-', '-'],
['-', '-', '-', '-', '-', '-', '-', '-', '-', '-'],
['-', '-', '-', '-', '-', '-', '-', '-', '-', '-'],
['-', '-', '-', '-', '-', '-', '-', '-', '-', '-'],
['-', '-', '-', '-', '-', '-', '-', '-', '-', '-'],
['-', '-', '-', '-', '-', '-', '-', '-', '-', '-'],
['-', '-', '-', '-', '-', '-', '-', '-', '-', '-']]


def ColocarAuto(tamaño,tableroMaquina):
    opCorrecta=0
    fila=0 
    columna=0 
    while(opCorrecta==0):
        voh = random.randint(0,1)
        fila=fila1(tamaño,voh)
        columna=columna1(tamaño,voh)
        reservarEspacio=ReservarEspacio(tableroMaquina,fila,columna,tamaño,voh)
        if(pos in reservarEspacio):
                tableroMaquina=MarcarBarco(pos)
                opCorrecta=1
        else:
                opCorrecta=0
    return tableroMaquina
def ReservarEspacio(tableroMaquina,fila, columna,tamaño,voh):
    aux=[]
    if(voh==0):
        if(fila==0 and columna==0):
            tamaño=tamaño+1
            columna=columna+1
            for i in range(tamaño):
                aux.append(tableroMaquina(fila,columna))
                columna=columna-1 
        elif(fila==0 and columna==10):
            tamaño=tamaño+1
            columna=columna-1
            for i in range(2):
                aux=(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                columna=columna+1
        elif(fila==0):
            tamaño=tamaño+1
            columna=columna+1
            for i in range (3):
                aux=(Pos1(tamaño,tableroMaquina,voh,fila,columna)) 
                columna=columna-1    
    else:
        if(fila==0 and columna==0):

        elif(fila==10 and columna==0):
        
        elif(fila==0):

def fila1(tamaño,voh):
    if(voh==0):
        fila=random.randint(0,10-tamaño)
    else:
        fila=random.randint(0,9)
    return fila
        
def columna1(tamaño,voh):
    if(voh==0):
        columna=random.randint(0,9)
    else:
        columna=random.randint(0,10-tamaño)
    return columna