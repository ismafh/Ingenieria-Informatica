iSort :: [Int] -> [Int]
iSort []= []
iSort (x : xs) = insert x (iSort xs)
    where insert a [] = [a]
        insert a (x : xs) = if a<=x
                            then a : x : xs
                            else x : (insert a xs)
ins :: Int -> [Int] -> [Int]
ins a xs = x xs ==> x (insert a xs)