{-Lo ultimo que se pone es el tipo de dato que va a devolver-}
division :: Int -> Int -> Int
division x y = x `div` y

cuadrado :: Int -> Int
cuadrado x = x*x

mul :: Int -> Int -> Int
mul x y= x*y

{-Ejercicios de la practica hechos por mi cuenta-}
--Ejercicio 1
resto :: Int -> Int -> Int
resto x y
    |x<y=x
    |otherwise = resto (x-y) y

--Ejercicio 2
sumatorio :: Integer -> Integer -> Integer
sumatorio a b
    |a < b = a + sumatorio (a + 1) b
    |a == b = b
    |otherwise = error "Imposible realizar la operación"

--Ejercicio 3
reverso :: [a] -> [a]
reverso []=[]
reverso (x:xs) = reverso xs ++ [x]

--Ejercicio 4
divisible ::  Int -> Int -> Bool
divisible x y = mod x y == 0
--Ejercicio 6
aux :: Int -> Bool
aux x = divisores x == [1,x]

primos :: Int -> [Int]
primos x = [y | y <- [1..x], aux y]


--Lista infinita
repite :: Int -> [Int]
repite x= x : repite x

--Funcion length
length' :: [a] -> Int
length' []=0
length' x = 1 + length'(tail x)






--Ejercicio 5
divisores :: Int -> [Int]
divisores x = [y|y<-[1..x], divisible x y]


    
    