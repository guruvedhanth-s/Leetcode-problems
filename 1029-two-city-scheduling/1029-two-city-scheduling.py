class Solution:
  def twoCitySchedCost(self, costs):
        # Calculate the difference between costs for city A and city B
        costs.sort(key=lambda x: x[0] - x[1])
        
        total_cost = 0
        n = len(costs) // 2
        
        # Send the first n people to city A and the rest to city B
        for i in range(n):
            total_cost += costs[i][0]  # Cost for city A
        for i in range(n, 2 * n):
            total_cost += costs[i][1]  # Cost for city B
        
        return total_cost
