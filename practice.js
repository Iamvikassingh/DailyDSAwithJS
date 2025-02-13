const obj =  {
    a : 1,
    b : 2,
    c : 3,
    "a":6,
    "b":7

}
for (var key in obj){
    console.log(typeof key)
}