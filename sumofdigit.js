// write a program to print the sum of digit of a number
// means if i have a number like 12345 = 1+2+3+4+5 = 15


const sumOfDigitofNumber = (digitofnumber) => {
    let sum = 0;
    while (digitofnumber > 0) {
        sum = sum + digitofnumber % 10;
        digitofnumber = Math.floor(digitofnumber / 10);
    }
    return sum
}

console.log(sumOfDigitofNumber(12345))