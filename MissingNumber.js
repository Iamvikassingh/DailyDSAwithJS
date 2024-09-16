// program to find the missing number in the array

// 1+0+3 = 4   and finding missing number = 1+2+3+0 = 6 after that actual number subtracting 
// 1+2+3+0 = 6 - 4 = 2

const MissingNumber = (n) => {
    let sum = 0; 
    for(let i = 0 ; i<=n.length ; i++){
        sum += n[i];
    }
    return n.length*(n.length+1)/2-sum
}

console.log(MissingNumber([0,1,3,4]))