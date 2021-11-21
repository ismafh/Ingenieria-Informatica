lst=['-', '-', '-', '-', '-', '-', '-', '-', '-', '-'
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-',
     '-', '-', '-', '-', '-', '-', '-', '-', '-', '-']
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
Pos1(2,lst,0,3,4)