length’ :: [a] -> Int
length’ [] = 0
length’ (_:xs) = 1 + length’ xs

sumLength' :: (Num a) => [a] -> a
sumLength' [] = 0
sumLength' (x:xs) = length' x + sumLength' xs