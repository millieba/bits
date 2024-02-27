// https://leetcode.com/problems/majority-element/description/

function majorityElement(nums: number[]): number {
  const counts: { [key: number]: number } = {};

  for (let num of nums) {
    counts[num] = (counts[num] || 0) + 1;
    if (counts[num] > nums.length / 2) {
      return num;
    }
  }

  // The majority element always exists, so this line should never be reached.
  return -1;
}
