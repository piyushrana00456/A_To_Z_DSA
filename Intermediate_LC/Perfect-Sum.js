//Give N a perfect square fint Square root of n

const n = 13;

const findSqrt = n => {
   for(let i=1; i<=n; i++) {
    if(i * i === n) return i;
   }
}

const ans = findSqrt(n);

// Now given n is not perfect square then find greatest possible nearby root :- floor(sqrt(n));


const nearRestPossibleSqrt = (n) => {
    let ans = 1, i = 1;

    while(i * i <= n) {
        ans = i;
        i++
    }

    return ans
}

const res = nearRestPossibleSqrt(n)

console.log({res});

