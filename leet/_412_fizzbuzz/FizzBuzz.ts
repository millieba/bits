// https://leetcode.com/problems/fizz-buzz/description/

function fizzBuzz(n: number): string[] {
  let res: string[] = [];
  for (let i = 1; i <= n; i++) {
    if (i % 3 == 0 && i % 5 == 0) {
      res.push("FizzBuzz");
    } else if (i % 3 == 0) {
      res.push("Fizz");
    } else if (i % 5 == 0) {
      res.push("Buzz");
    } else {
      res.push(i.toString());
    }
  }
  return res;
}

// The approach below is easier to extend if additional conditions are needed in the future
function fizzBuzz2(n: number): string[] {
  const res: string[] = [];
  for (let i = 1; i <= n; i++) {
    let str = ""; // Instead of checking for both "Fizz" and "Buzz" in separate conditions, we create an empty string str
    if (i % 3 === 0) {
      str += "Fizz"; // Append "Fizz" to str if divisible by 3
    }
    if (i % 5 === 0) {
      str += "Buzz"; // Append "Fizz" to str if divisible by 5
    }
    res.push(str || i.toString()); // If str is empty, push the number itself
  }
  return res;
}

console.log(fizzBuzz(25));
console.log(fizzBuzz2(25));
