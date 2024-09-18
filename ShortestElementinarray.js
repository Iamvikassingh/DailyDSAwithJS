const shortElementArray = (arr) => {
    // for (i = 0; i <= arr.length; i++) {
    //     for (j = i + 1; j <= arr.length; j++) {
    //         if (arr[i] < arr[j]) {
    //             console.log(`${arr[i]} : is the largest number`)
    //         } else {
    //             console.log(`${arr[j]} : is the smallest number`)
    //         }
    //     }
    // }
    const ans = Math.min(...arr);
    console.log(`${ans} : is the smallest number`)
}

shortElementArray([2, 5, 1, 3, 0])