--Practica realizada por Enrique Pérez Bernabeu e Ismael Fernández Herreruela

{-Ejercicio 1-}
resto :: Integer -> Integer -> Integer
resto x y
    |x < y = x
    |otherwise = resto (x - y) y

{-Ejercicio 2-}
sumatorio :: Integer -> Integer -> Integer
sumatorio a b
    |a < b = a + sumatorio (a + 1) b
    |a == b = b
    |otherwise = error "Imposible realizar la operación"

{-Ejercicio 3-}
inversa :: [a] -> [a]
inversa [] = []
inversa (x:xs) = inversa xs ++ [x]

{-Ejercicio 4-}
divisible ::  Int -> Int -> Bool
divisible x y = mod x y == 0

{-Ejercicio6-}
aux :: Int -> Bool
aux x = divisores x == [1,x]

primos :: Int -> [Int]
primos x = [y | y <- [1..x], aux y]

{-Ejercicio7-}
decBin :: Int -> [Int]
decBin 0 = [0]

decBin n | mod n 2 == 1 = decBin (div n 2) ++ [1]

        | mod n 2 == 0 = decBin (div n 2) ++ [0]

{-Ejercicio 8-}
binDec :: Integral i => i -> i
binDec 0 = 0
binDec i = 2 * binDec (div i 10) + (mod i 10)

{-Ejercicio 9-}
sinRep :: (Eq a) => [a] -> [a]
sinRep [] = []
sinRep (x:xs) = x : sinRep (filter (/= x) xs)

{-Ejercicio 5-}
divisores :: Int -> [Int]
divisores x = [y | y <- [1..x], divisible x y]


