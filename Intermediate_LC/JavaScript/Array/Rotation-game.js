let input = `10 -2 3 1 4 6 2 8 7 9 3
4`;

let testCases = input.trim().split('\n');
let testCase0 = testCases[0].trim().split(' ').map(Number);
let n = testCase0[0];
let arr = testCase0.splice(1, n);
let k = +testCases[1]

const RotateN = (arr, n, k) => {
    k = k % n; 
    reverseArr(arr, 0, n - 1);
    reverseArr(arr, 0, k - 1);
    reverseArr(arr, k, n -1);

    return arr
}

const reverseArr = (arr, start, end) => {
    while(start < end){
        [arr[start], arr[end]] = [arr[end], arr[start]]
        start++;
        end--;
    } 
}


const rotatedArrByK = RotateN(arr, n, k);
console.log(rotatedArrByK);
