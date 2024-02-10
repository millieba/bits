// https://leetcode.com/problems/candy/description

int candy(int* ratings, int ratingsSize) {
    int candy = ratingsSize;
    int candys[ratingsSize];
    memset(candys, 0, ratingsSize*sizeof(int));
    
    for (int i = 1; i < ratingsSize; i++) {
        if (ratings[i-1] < ratings[i]) {
            candys[i] = candys[i-1]+1;
        }
    }
    for (int i = ratingsSize-1; i > 0; i--) 
    {
        if ((ratings[i-1] > ratings[i]) && (candys[i-1] <= candys[i]+1)) {
            candys[i-1] = candys[i]+1;
        }
    }

    for (int i = 0; i < ratingsSize; i++) {
        candy += candys[i];
    }

    return candy;
}