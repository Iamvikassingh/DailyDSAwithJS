// write a program to print n number of sum of all natural number 

const SumofAllNaturalNumber = (inputvalue)=>{
    let sum = 0;
    for (let i = 1; i <= inputvalue; i++) {
        sum = sum + i
    }
    return sum;
}
console.log(SumofAllNaturalNumber(5))

