//Given the Number of test cases as T, for each test case, take an integer N as input, have to tell it is a perfect number ot not
//Perfect number is a positive integer that is equal to the sum of its proper postivir divisors(excluding the number itself)

let input = 
`2
4
6`

let testCases = input.trim().split('\n').map(Number);
let T = testCases[0];
let n = testCases.splice(1);

const isItPerfectNum = (num) => {
    if(num === 1) return 'NO';

    let sum = 0;
    for(let i=1; i*i <= num; i++){
        if(num % i === 0) {
           if(i !== num) sum+= i;
           if(num / i !== num) sum += num / i; 
        }
    }
    if(sum === num) return 'YES'
    else return 'NO'
} 

n.forEach(element => {
    console.log({ans: isItPerfectNum(element)});
});