takeWhile' :: (a -> Bool) -> [a] -> [a]
takeWhile' p [] = []
takeWhile' p (x:xs)
| p x = x : takeWhile' p xs
| otherwise = []

elemIndex' :: Eq a => a -> [a] -> Int
elemIndex' x xs = head [ i | (x',i) <- posiciones xs, x' == x ]