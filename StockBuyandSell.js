//you are given an array of prices where prices[i] is the price of a given stock on an ith day.
//you want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//return the maximum profit you can achieve from this transaction. if you cannot achieve any profit, return 0


const maxPrice = (prices)=>{
    let maxProfit = 0;
    let minPrice = prices[0];
    for(let i = 1; i < prices.length; i++){
        let currentPrice = prices[i];
        let profit = currentPrice - minPrice;
        if(profit > maxProfit){
            maxProfit = profit;
        }
        if(currentPrice < minPrice){
            minPrice = currentPrice;
        }
    }
    return maxProfit;
}

console.log(maxPrice([7, 1, 5, 3, 6, 4])); // Output: 5

