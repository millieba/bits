// https://leetcode.com/problems/palindrome-number/description/

function isPalindrome(x: number): boolean {
  if (x < 0) return false; // Negative numbers cannot be palindromes

  let original = x;
  let reversed = 0;

  // While we have digits left to process
  while (x > 0) {
    const lastDigit = x % 10;
    reversed = reversed * 10 + lastDigit; // Building the reversed number
    x = Math.floor(x / 10); // Remove last digit as it has been processed
  }

  return original === reversed;
}

function isPalindromeStringMethod(x: number): boolean {
  const xString = x.toString();

  // Initialise pointers for the start and end of the number
  let start = 0;
  let end = xString.length - 1;

  // Continue until the start pointer is less than the end pointer
  while (start < end) {
    // If the digits at the current positions are not equal, return false
    if (xString[start] !== xString[end]) {
      return false;
    }
    // Move the pointers towards the center
    start++;
    end--;
  }

  // If the loop completes without returning false, the number is a palindrome
  return true;
}

function isPalindromeFail(x: number): boolean {
  const xString = x.toString();

  if (xString[xString.length - 1] == xString[0]) {
    const xNum = parseInt(xString);
    if (Math.abs(xNum) == xNum) {
      return true;
    }
  }
  return false;
}

console.log(isPalindrome(1000021));
