// example 0112358


const fabonaccinumber = (number) => {  //5  
    if(number <2){
        return number
    }
    
    let a = 0; 
    let b = 1;
    for(let i=2 ; i<=number;i++){
        let c = a + b ;
        a = b;
        b = c;
    }
   return b;
}

console.log(fabonaccinumber(6))