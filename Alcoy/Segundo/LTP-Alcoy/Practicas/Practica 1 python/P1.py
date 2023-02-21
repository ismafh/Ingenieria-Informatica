import random
#Introducción y creacion de lista
print('Hola campeón. Vamos a jugar.\nDéjame que piense... humm... ya he elegido la lista de números\nIntroduce el numero de intentos deseados:')
lst=[]
i=0
v=int(input())
numintentos=0
maxintentos=v
print('Ahora adivina la lista :D')
while i<5:
    lst=lst+[random.randint(1,10)]
    i=i+1
#Creación de la lista introducida por el usuario
for j in range(0, 5):
        numeros=str(input())
        z=0
        n=0
        if numeros=='respuesta':
            print(lst)
        else:    
            length=len(numeros)
            listnumeros=[0,0,0,0,0]
            while z<len(numeros):    #Asignacion de cada posicion de la lista
                if numeros[z]!=' ':
                    if numeros[z-1]=='1' and numeros[z]=='0':
                        listnumeros[n-1]=10
                        z=z+3
                        n=n+1     
                    else:
                        listnumeros[n]=int(numeros[z])
                        z=z+1
                        n=n+1
                elif z==length and numeros[z]=='1':
                    listnumeros[n]=1
                else:
                    z=z+1
            v=0
            if listnumeros[v]==' ':
                v=v+1
            else:
                aux=[0,0,0,0,0]
                while v<int(len(listnumeros)):
                    aux[v]=int(listnumeros[v])
                    v=v+1
        #Comparacion y final del juego
            j=0
            aux2=[0,0,0,0,0]
            while j<5:
                if lst[j]==listnumeros[j]:
                    aux2[j]=1
                    j=j+1
                else:
                    aux2[j]=0
                    j=j+1
            print (aux2)
            if aux2==[1,1,1,1,1]:
                print('Has ganado')
                print('Intentos totales: '+ str(numintentos))
                break
            else: 
                print('Sigue intentandolo')
                numintentos=numintentos+1
                
                print('Intentos: ' + str(numintentos))
            if numintentos==maxintentos:
                print('Ya has utilizado todos los intentos')
                break
        
        


            
            
                
            
        
        
        




        

        
        
    
   
    



    
        
        
        

    

        
    
        
    
    
        
    
    









