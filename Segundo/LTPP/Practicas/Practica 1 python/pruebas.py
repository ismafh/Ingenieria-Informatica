import random
#Introducción y creacion de lista
print('Hola campeón. Vamos a jugar.\nDéjame que piense... humm... ya he elegido la lista de números\nAdivínala:')
lst=[]
i=0
while i<5:
    lst=lst+[random.randint(1,10)]
    i=i+1
print(lst)
#Creación de la lista introducida por el usuario
for j in range(0, 5):
        numeros=str(input())
        z=0
        n=0
        aux=' '
        listnumeros=[0,0,0,0,0]
        
        while z<len(numeros):    #Asignacion de cada posicion de la lista
            for i in numeros:
                if i ==' ':
                    listnumeros.append(aux)
                    aux = ''
                else:
                    aux += i
            if aux:
                listnumeros.append(aux)
            print(listnumeros)
        else:
            aux2=[0,0,0,0,0]
            while v<int(len(listnumeros)):
                aux[v]=int(listnumeros[v])
                v=v+1
        print(aux)
        #Comparacion y final del juego
        j=0
        aux3=[0,0,0,0,0]
        while j<5:
            if lst[j]==listnumeros[j]:
                aux3[j]=1
                j=j+1
            else:
                aux3[j]=0
                j=j+1
        print (aux3)
        if aux==[1,1,1,1,1]:
            print('Has ganado')
            break
        else: 
            print('Sigue intentandolo')
            print(lst)
        
        


            
            
                
            
        
        
        




        

        
        
    
   
    



    
        
        
        

    

        
    
        
    
    
        
    
    









