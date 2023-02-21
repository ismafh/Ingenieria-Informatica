
import random

tableroMaquina=['_', '_', '_', '_', '_', '_', '_', '_', '_', '_',
     '_', '_', '_', '_', '_', '_', '_', '_', '_', '_',
     '_', '_', '_', '_', '_', '_', '_', '_', '_', '_',
     '_', '_', '_', '_', '_', '_', '_', '_', '_', '_',
     '_', '_', '_', '_', '_', '_', '_', '_', '_', '_',
     '_', '_', '_', '_', '_', '_', '_', '_', '_', '_',
     '_', '_', '_', '_', '_', '_', '_', '_', '_', '_',
     '_', '_', '_', '_', '_', '_', '_', '_', '_', '_',
     '_', '_', '_', '_', '_', '_', '_', '_', '_', '_',
     '_', '_', '_', '_', '_', '_', '_', '_', '_', '_']



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
        pos=(fila)*10+(columna) 
    else:
        pos=columna
    return int(pos)

def BarcosMaquina(tableroMaquina):  
    posbarcos1=[]
    posbarcos2=[]
    posbarcos3=[]
    posbarco4=[]
    for i in range(4):
        aux=[]
        aux=ColocarAuto(1,tableroMaquina)    
        for i in aux[1]:
            posbarcos1.append(i)
        tableroMaquina=aux[0]   
    for i in range(3):
        aux=[]
        aux=ColocarAuto(2,tableroMaquina)
        for i in aux[1]:
            posbarcos2.append(i)
        tableroMaquina=aux[0]
    for i in range(2):
        aux=[]
        aux=ColocarAuto(3,tableroMaquina)
        for i in aux[1]:
            posbarcos3.append(i)
        tableroMaquina=aux[0]
    aux=[]
    aux=ColocarAuto(4,tableroMaquina)
    for i in aux[1]:
            posbarco4.append(i)
    tableroMaquina=aux[0] 
    return posbarcos1,posbarcos2,posbarcos3,posbarco4 

def ColocarAuto(tamaño,tableroMaquina):
    opCorrecta=0
    fila=0 
    columna=0 
    espacio=[]
    while(opCorrecta==0):
        voh = random.randint(0,1)
        fila=fila1(tamaño,voh)
        columna=columna1(tamaño,voh)
        pos=Pos1(tamaño,tableroMaquina,voh,fila,columna)
        espacio=ReservarEspacio(tableroMaquina,fila,columna,tamaño,voh)
        if ((comprobarvacio(tableroMaquina,espacio))==True):
                tableroMaquina=MarcarBarco(pos,tableroMaquina,tamaño)
                opCorrecta=1
        else:
                opCorrecta=0
    return (tableroMaquina,pos)
    

def comprobarvacio(tableroMaquina,espacio):
    for i in espacio: 
        if(tableroMaquina[i]!="_"):
            return False
    return True

def fila1(tamaño,voh):
    if(voh==0):
        fila=random.randint(0,9-tamaño)
    else:
        fila=random.randint(0,9)
    return fila    
  
def columna1(tamaño,voh):
    if(voh==0):
        columna=random.randint(0,9)
    else:
        columna=random.randint(0,9-tamaño)
    return columna
        
def ReservarEspacio(tableroMaquina,fila, columna,tamaño,voh):
    aux=[]
    if(voh==0):
        if(fila==0 and columna==0):
            tamaño=tamaño+1
            columna=columna+1
            for i in range(2):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                columna=columna-1 
        elif(fila==0 and columna==9):
            tamaño=tamaño+1
            columna=columna-1
            for i in range(2):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                columna=columna+1
        elif(columna==0):
            tamaño=tamaño+2
            fila=fila-1
            columna=columna+1
            for i in range(2):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                columna=columna-1
        elif(fila==0):
            tamaño=tamaño+1
            columna=columna+1
            for i in range (3):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna)) 
                columna=columna-1
        elif(columna==9):
            tamaño=tamaño+2
            fila=fila-1
            columna=columna-1
            for i in range (2):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna)) 
                columna=columna+1
        else:
            fila=fila-1
            tamaño=tamaño+2
            columna=columna+1
            for i in range (3):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna)) 
                columna=columna-1
    else:
        if(fila==0 and columna==0):
            tamaño=tamaño+1
            columna=columna+1
            fila=fila+1
            for i in range (2):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                fila=fila-1       
        elif(fila==9 and columna==0):
            tamaño=tamaño+1
            fila=fila-1
            for i in range (2):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                fila=fila+1 
        elif(fila==0 and columna==9):
            tamaño=tamaño+1
            fila=fila+1
            for i in range (2):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                fila=fila-1
        elif(columna==0):
            tamaño=tamaño+1
            fila=fila-1
            for i in range (3):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                fila=fila+1
        elif(fila==0):
            tamaño=tamaño+2
            columna=columna-1
            fila=fila+1
            for i in range (2):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                fila=fila-1
        elif(fila==9):
            tamaño=tamaño+2
            columna=columna-1
            fila=fila-1
            for i in range (2):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                fila=fila+1
        elif(columna+tamaño==9):
            tamaño=tamaño+1
            columna=columna-1
            fila=fila-1
            for i in range (3):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna))
                fila=fila+1
        else:
            tamaño=tamaño+2
            fila=fila+1
            columna=columna-1
            for i in range (3):
                aux=aux+(Pos1(tamaño,tableroMaquina,voh,fila,columna)) 
                fila=fila-1              
    return aux

def MarcarBarco(pos,tableroMaquina,tamaño):
    for i in pos:
        tableroMaquina[i]='X'
    return tableroMaquina  
    
x=BarcosMaquina(tableroMaquina)
def imprimirTablero(tableroMaquina):
    lst=[]
    for j in range(10):
        for i in range(10):
            lst.append(tableroMaquina[j*10+i])           
        print(lst)
        lst=[]
        
imprimirTablero(tableroMaquina)

def recibirdisparo(posY,posX):
    pos=PosenArray(posY,posX)
    lst=[0,False]
    if(tableroMaquina[pos]!='_'):
        x=comprobarHundido(pos,tableroMaquina)
        tableroMaquina[pos]='*'
        return x
    else:
        tableroMaquina[pos]=" " 
        print("Agua")
        return lst
def comprobarHundido(pos,tableroMaquina):
    lst=[0,False]
    if tableroMaquina[pos]=="X" and (tableroMaquina[pos+1]=="_" or tableroMaquina[pos+1]==None) and (tableroMaquina[pos-1]=='_'or tableroMaquina[pos-1]==None):
        if ((tableroMaquina[pos+10]=="_" or tableroMaquina[pos+10]==None) and (tableroMaquina[pos-10]=='_'or tableroMaquina[pos-10]==None)):
            print("Hundido")  
            lst[0]=2
            lst[1]=True
            return lst
        elif (tableroMaquina[pos+10]=="X" or tableroMaquina[pos+10]==None) or (tableroMaquina[pos-10]=='X'or tableroMaquina[pos-10]==None): 
            print("Tocado")
            lst[0]=0
            lst[1]=True
            return lst
        else:
            lst[1]=True
            lst[0]=2
            print("Hundido")
            return lst
    elif tableroMaquina[pos]=="X" and (tableroMaquina[pos+10]=="_" or tableroMaquina[pos+10]==None) and (tableroMaquina[pos-10]=='_' or tableroMaquina[pos-10]==None):
        if (tableroMaquina[pos+1]=="_" or tableroMaquina[pos+1]==None) and (tableroMaquina[pos-1]=="_" or tableroMaquina[pos-1]==None):
            lst[1]=True
            lst[0]=2
            print("Hundido")
            return lst
        elif tableroMaquina[pos-1]=="X" or tableroMaquina[pos+1]=="X":
            print("Tocado")
            lst[0]=0
            lst[1]=True
            return lst
        else:
            lst[1]=True
            lst[0]=2
            print("Hundido")
            return lst
    return lst

def barcosRestantes(barcosrestantes):
    barcosRestantes=barcosrestantes-1
    return barcosRestantes

def efectuardisparo():
    y=random.randint(0,9)
    x=random.randint(0,9)
    adevolver=[0,1]
    print("Las coordenadas elegidas son "+ str(x)+" "+str(y))
    print("Como ha resultado el disparo:")
    print("1:Tocado, 2:Hundido,3:Agua")
    f=int(input())
    if (f==1):
        print("BOOOOOOOOM")
        adevolver[0]=f
        adevolver[1]=False
    elif (f==2):
        print("TOOOOOOOOOOOMA VAS A PERDER")
        adevolver[0]=f
        adevolver[1]=False
    else:
        print("VAYA! NO HA HABIDO SUERTE")
        adevolver[0]=f
        adevolver[1]=True
    return adevolver
 
    
barcosrestantesMaquina=10
barcosrestantesUsuario=10
while(barcosrestantesUsuario>=0 or barcosrestantesMaquina>=0):
    x=[0,True]
    while(x[1]==True):
        print("Indique las cooordenadas a disparar")
        posY=int(input())
        posX=int(input())
        x=recibirdisparo(posY,posX)
        if(x[0]==2):
            barcosrestantesMaquina=barcosRestantes(barcosrestantesMaquina)
        imprimirTablero(tableroMaquina)
    while(x[1]!=True):
        x=efectuardisparo()
        if(x[0]==2):
            barcosrestantesUsuario=barcosRestantes(barcosrestantesUsuario)
        else:
            x[1]==True
'''
def nuevoTablero(tableroMaquina):
    j=0
    lst=[]
    for i in range(11): 
        if i<1 or i==10:
            for i in range(12):
                lst.append("_")
        else:
            for i in range(11):
                if i <1 or i==11:
                    lst.append("_")
                else:
                    lst.append(tableroMaquina[i+j*10])
            j=j+1
    return lst


print(nuevoTablero(tableroMaquina))
'''