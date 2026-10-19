class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        visited = set()
        target = image[sr][sc]
        image[sr][sc] = color
        self.adjacent(image, sr-1, sc, color, visited, target)
        self.adjacent(image, sr, sc-1, color, visited, target)
        self.adjacent(image, sr+1, sc, color, visited, target)
        self.adjacent(image, sr, sc+1, color, visited, target)

        return image

    def adjacent(self, image: List[List[int]], sr: int, sc: int, color: int, visited: set[tuple[int, int]], target: int) -> None:
        if (sr, sc) in visited or sr < 0 or sc < 0 or sr >= len(image) or sc >= len(image[0]) or image[sr][sc] != target:
            return None

        image[sr][sc] = color
        visited.add((sr, sc))

        self.adjacent(image, sr-1, sc, color, visited, target)
        self.adjacent(image, sr, sc-1, color, visited, target)
        self.adjacent(image, sr+1, sc, color, visited, target)
        self.adjacent(image, sr, sc+1, color, visited, target)

        return None

