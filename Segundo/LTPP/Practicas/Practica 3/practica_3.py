import random

tableroMaquina=['-', '-', '-', '-', '-', '-', '-', '-', '-', '-'
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-']

'''lst= ['   ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
      '1 :', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
      '2 :', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
      '3 :', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
      '4 :', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
      '5 :', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
      '6 :', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
      '7 :', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
      '8 :', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
      '9 :', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
      '10:', '-', '-', '-', '-', '-', '-', '-', '-', '-','-']
'''

def Pos1(tamaño,tableroMaquina,voh,fila,columna):
    pos=[]
    if(voh==0):
        for i in range(tamaño):
            pos.append(PosenArray(fila, columna))
            fila=fila+1         
    else:    
        for i in range(tamaño):
            pos.append(PosenArray(fila, columna))
            columna=columna+1
    return pos
def PosenArray(fila,columna):
    if(fila!=0):
        pos=(fila)*10+(columna-1)
    else:
        pos=columna-1
    return pos

def BarcosMaquina(tableroMaquina):
    for i in range(4):
        tableroMaquina=ColocarAuto(1,tableroMaquina)        
    for i in range(3):
        tableroMaquina=ColocarAuto(2,tableroMaquina)
    for i in range(2):
        tableroMaquina=ColocarAuto(3,tableroMaquina)
    for i in range(1):
        tableroMaquina=ColocarAuto(4,tableroMaquina)

def ColocarAuto(tamaño,tableroMaquina):
    opCorrecta=0
    fila=0 # type: int
    columna=0 # type: int
    while(opCorrecta==0):
        voh = random.randint(0,1)
        fila=fila1(tamaño,voh)
        columna=columna1(tamaño,voh)
        pos=Pos1(tamaño,tableroMaquina,voh,fila,columna)
        reservarEspacio=ReservarEspacio(tableroMaquina,fila,columna,tamaño,voh)
        if(pos in reservarEspacio):
                tableroMaquina=MarcarBarco(pos)
                opCorrecta=1
        else:
                opCorrecta=0
    return tableroMaquina

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
        

def ReservarEspacio(tableroMaquina,fila, columna,tamaño,voh):
    aux=[]
    if(voh==0):
        if(fila==0 and columna==0):
            tamaño=tamaño+1
            columna=columna+1
            for i in range(2):
                aux.append(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                columna=columna-1 
        elif(fila==0 and columna==10):
            tamaño=tamaño+1
            columna=columna-1
            for i in range(2):
                aux.append(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                columna=columna+1
        elif(fila==0):
            tamaño=tamaño+1
            columna=columna+1
            for i in range (3):
                aux.append(Pos1(tamaño,tableroMaquina,voh,fila,columna)) 
                columna=columna-1 
        else:
            tamaño=tamaño+2
            columna=columna+1
            fila=fila+1
            for i in range (3):
                aux.append(Pos1(tamaño,tableroMaquina,voh,fila,columna)) 
                columna=columna-1
                fila=fila-1
    else:
        if(fila==0 and columna==0):
            tamaño=tamaño+1
            fila=fila+1
            for i in range (2):
                aux.append(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                fila=fila-1       
        elif(fila==10 and columna==0):
            tamaño=tamaño+1
            fila=fila-1
            for i in range (2):
                aux.append(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                fila=fila+1 
        elif(columna==0):
            tamaño=tamaño+1
            fila=fila-1
            for i in range (3):
                aux.append(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                fila=fila+1
        else:
            tamaño=tamaño+2
            columna=columna+1
            fila=fila+1
            for i in range (3):
                aux.append(Pos1(tamaño,tableroMaquina,voh,fila,columna)) 
                columna=columna-1
                fila=fila-1              
    return aux
   




def MarcarBarco(pos,tamaño,tableroMaquina):
    for i in pos:
        tableroMaquina[i]="X"       
   
#def introducirValor(tamaño,tableroMaquina,posarray):
    
 
'''def CrearTablero(tablero,size):
    for i in range(size):
        for j in range(size):
            tableroMaquina.append('-')
'''
print(BarcosMaquina(tableroMaquina)) 




