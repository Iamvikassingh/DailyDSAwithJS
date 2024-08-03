// write a program to check if a string or word or numbere is palindrom?

const isPalindrome =(inputchar)=>{
    let str = inputchar.toString();  //here we change all the datatype weathe it number or character value
    let resultWord = '';
    for(let i=str.length-1 ; i>=0;i-- ){
        resultWord += str[i];               // reverse the input-value 
    }
    return (resultWord == str)? true :false;
}

console.log(isPalindrome("racecar"));
console.log(isPalindrome("abc"));
console.log(isPalindrome("121"));

