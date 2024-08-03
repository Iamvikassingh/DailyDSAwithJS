// write a program to  print factorial of any number



const factorial = (intupvalue) => {
    let resutlvalue = 1;

    for (let i = 1; i <= intupvalue; i++) {
        resutlvalue = resutlvalue*i  // resutlvalue *= i
    }
    return resutlvalue
}

console.log(factorial(5))

//
// 1*1=1
// 1*2=2
// 2*3=6
// 6*4=24
// 24*5=120