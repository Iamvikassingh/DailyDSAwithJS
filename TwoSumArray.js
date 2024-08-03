//Give an array of integer nums and an integer target , return indices of the two numbers such that they add up to the target 
// you may assume that each input would have exactly one solution, and you may not use the same element twice.


//You can return the answer in any order. 

const indices = (inputnum) => {
    let target = 10;
   
    for (let i = 0; i <= inputnum.length; i++) {
        for (let j = i + 1; j <= inputnum.length; j++) {
            if (inputnum[i] + inputnum[j] == target) {
                return [i, j];
            }
        }
    }
}

console.log(indices([7, 2, 4, 5, 8, 1]))