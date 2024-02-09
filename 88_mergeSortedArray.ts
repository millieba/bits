// https://leetcode.com/problems/merge-sorted-array/description/
/**
 Do not return anything, modify nums1 in-place instead.
 
 Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 Output: [1,2,2,3,5,6]
 */

function merge(nums1: number[], m: number, nums2: number[], n: number): void {
    while (nums1.length > m) {
        nums1.pop()
    }
    nums1.push(...nums2)
    nums1.sort((a, b) => a - b)
    console.log(nums1)
};

function merge2(nums1: number[], m: number, nums2: number[], n: number): void {
    nums1.splice(m, n, ...nums2)
    nums1.sort((a, b) => a - b);
    console.log(nums1)
};

function merge3(nums1: number[], m: number, nums2: number[], n: number): void {
    // This solution was not accepted as it does not modify nums1 in place!
    const nums1_filter = nums1.filter(i => i !== 0)
    const result = nums1_filter.concat(nums2)
    result.sort((a, b) => a - b)
    nums1 = result
    console.log(nums1)
};

merge([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3)
merge2([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3)
merge3([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3)