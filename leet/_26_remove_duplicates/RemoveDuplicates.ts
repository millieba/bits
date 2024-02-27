// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

function removeDuplicates(nums: number[]): number {
  if (nums.length === 0) return 0; // If the array is empty, return 0

  let uniqueCount = 1; // Initialize unique count to 1, as the first element is always unique

  // Iterate through the array starting from the second element
  for (let i = 1; i < nums.length; i++) {
    // If the current element is different from the previous element, increment uniqueCount
    if (nums[i] !== nums[i - 1]) {
      nums[uniqueCount] = nums[i]; // Overwrite the next unique position with the current element
      uniqueCount++; // Increment uniqueCount
    }
  }

  return uniqueCount; // Return the number of unique elements
}

function removeDuplicatesFail(nums: number[]): number[] {
  const result: number[] = [];
  nums.map((num: number) => {
    if (!result.includes(num)) {
      result.push(num);
    }
  });
  return result;
}

const res = removeDuplicates([1, 1, 2]);
console.log(res);
