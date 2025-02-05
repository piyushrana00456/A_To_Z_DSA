//Given a number Find is it Prime or not return YES if prime else NO
//Constraint will 1 <= n <= 10^6

const n = 1000004;

const isPrime = n => {
  if(n === 1) return 'YES';

  for(let i=2; i*i <= n; i++){
      if(n % i === 0) return 'NO';
  }
  return 'YES';
}

let ans = isPrime(n);
console.log({ans})
