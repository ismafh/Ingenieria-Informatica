map' :: (a -> b) -> [a] -> [b]
map' _ [] = []
map' f xs = [ f x | x <- xs ]