class Solution(object):
    def isPathCrossing(self, path):
        """
        :type path: str
        :rtype: bool
        """
        visited = set()
        curr = [0,0]
        visited.add(tuple(curr))
        for i in path:
            if i == 'N':
                curr[1] += 1
            elif i == 'E':
                curr[0] += 1
            elif i == 'S':
                curr[1] -= 1
            else:
                curr[0] -= 1
            if tuple(curr) in visited:
                return True
            visited.add(tuple(curr))
        return False
        