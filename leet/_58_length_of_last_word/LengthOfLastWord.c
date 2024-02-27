// https://leetcode.com/problems/length-of-last-word/description/

#include <stdio.h>
#include <string.h>

int lengthOfLastWord(char *s)
{
    int found_space = 0;
    int l = 0;
    for (int i = 0; i < strlen(s); i++)
    {
        if (s[i] == ' ')
        {
            found_space = 1;
            continue;
        }
        else if (found_space)
        {
            found_space = 0;
            l = 0;
        }

        l++;
    }
    return l;
};

void main()
{
    char s[] = "hello world     ";
    printf("%d\n", lengthOfLastWord(s));
}