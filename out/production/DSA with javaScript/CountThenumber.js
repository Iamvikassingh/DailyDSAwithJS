//count the number of digits of a number

const CountNumber = (number) => {
    let count = 0;
    number = Math.abs(number);
    do {
        count++;
        number = Math.floor(number / 10)
    } while (number > 0);
    return count;
}

console.log(CountNumber(454545))