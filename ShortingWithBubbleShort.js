// Custom sorting program in javascript via bubble short



let unShortArr = [4, -1, 8, 2, 6, 45, -50, -24, 100, 25];

const ShortArry = (inputArg) => {
    for (let i = 0; i<=inputArg.length; i++) {
        for (let j = i + 1; j<=inputArg.length; j++) {
            let temp = inputArg[i];
            if (inputArg[i] > inputArg[j]) {
                inputArg[i] = inputArg[j];          //here i perform swaping 
                inputArg[j] = temp;
            }
        }
    }
    return inputArg;
}
console.log(ShortArry(unShortArr));