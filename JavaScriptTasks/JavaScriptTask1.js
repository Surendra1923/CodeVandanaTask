const prompt = require("prompt-sync")();
let ans = prompt("Enter the sentence: ");
let rev = "";
for (let i = ans.length - 1; i >= 0; i--) {
	rev += ans[i];
}
console.log(rev);