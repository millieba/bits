// https://leetcode.com/problems/length-of-last-word/description/

function lengthOfLastWord(s: string): number {
    // Split on whitespace and filter out whitespace substrings
    const words = s.split(" ").filter(i => i !== "") 

    return words[words.length - 1].length
};


function lengthOfLastWord_LF(s: string): number {
    const words = s.trimEnd().split(" ") 
    const lastWord = words.pop()
    return lastWord ? lastWord.length : 0
  };

console.log(lengthOfLastWord("hello world"))
console.log(lengthOfLastWord("hello    world     "))
console.log(lengthOfLastWord_LF("hello world"))
console.log(lengthOfLastWord_LF("hello    world     "))