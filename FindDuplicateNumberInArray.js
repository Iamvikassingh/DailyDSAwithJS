// write a program to find the duplicate number in array

const FindArray = (inputnumber) => {
    let duplicatearry = [];
    let uniquearry = [];
    for (let i = 0; i <= inputnumber.length; i++) {
        if (!uniquearry.includes(inputnumber[i])) {
            uniquearry.push(inputnumber[i]);
        } else {
            duplicatearry.push(inputnumber[i]);
        }
    }
    return duplicatearry;
}

console.log(FindArray([1, 2, 4, 5, 5, 6, 6, 77, 88, 44, 44, 77, 88, 4, 2, 1]))
