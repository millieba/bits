void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    for (int j = 0; j < n; j++) {
        nums1[j+m] = nums2[j];
    }
    int temp=0;
    uint8_t right = 0;
    for (uint8_t i = 0; i < m+n; i++){
        for (uint8_t i = 0; i < m+n-1; i++){
            if (nums1[i] >= nums1[i+1]){
                right = 0;
                temp = nums1[i];
                nums1[i] = nums1[i+1];
                nums1[i+1] = temp;
            }
            else {
                right++;
            }
        }
        if (right >= m+n){
            break;
        }
    }
}