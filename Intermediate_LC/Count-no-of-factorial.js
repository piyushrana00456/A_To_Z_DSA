const n = 7;

const countNoOFFactorial = (n) => {
   let count = 0;
   for(let i=1; i*i <= n; i++) {
    if(n % i === 0) {
        if(i === (n / i)) count++
        else count += 2
    }
   }
  return count
}

let c = countNoOFFactorial(n)
console.log({c})