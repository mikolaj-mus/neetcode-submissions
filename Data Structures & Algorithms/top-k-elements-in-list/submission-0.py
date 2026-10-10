class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq_map = {}
        for num in nums:
            freq_map[num] = freq_map.setdefault(num, 0) + 1

        max_heap = []
        for key, value in freq_map.items():
            heapq.heappush(max_heap, (-value, key))
        
        result = []
        for i in range(k):
            pair = heapq.heappop(max_heap)
            result.append(pair[1])

        return result
        