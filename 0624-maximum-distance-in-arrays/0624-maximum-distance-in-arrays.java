class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int globalMin = arrays.get(0).get(0);
        int globalMax = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            int currentMin = arrays.get(i).get(0);
            int currentMax = arrays.get(i).get(arrays.get(i).size() - 1);

            // Calculate max distance with current array
            maxDistance = Math.max(maxDistance, Math.abs(currentMax - globalMin));
            maxDistance = Math.max(maxDistance, Math.abs(globalMax - currentMin));

            // Update global min and max
            globalMin = Math.min(globalMin, currentMin);
            globalMax = Math.max(globalMax, currentMax);
        }

        return maxDistance;
    }
}
