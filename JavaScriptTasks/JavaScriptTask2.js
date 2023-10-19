const prompt = require("prompt-sync")();
let  ans= prompt("Enter the array: ");
let arr=ans.split(" ").map(Number);
arr.sort().reverse();
console.log(arr);