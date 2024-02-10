// https://leetcode.com/problems/is-subsequence/description
#include <stdbool.h>

bool isSubsequence(char* s, char* t) {
    int size_t = strlen(t);
    int size_s = strlen(s);
    int j = 0;
    for (int i = 0; i < size_t; i++) {
        if (t[i] == s[j]) {
            j++;
        }
    }
    if (j == size_s) {
        return true;
    } else {
        return false;
    }
}