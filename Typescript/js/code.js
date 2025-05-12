// Variable scope example
// firstFuction();
// secondFuction();
// let firstName : string | undefined;
// function firstFuction(){
//     let firstName="Rishek";
//     console.log(firstName);
// }
// function secondFuction(){
//     let firstName="Aniket";
//     console.log(firstName);
// }
// console.log(firstName);
// Block scope example
var x = 22;
{
    // const x = 90;
    console.log(x);
    {
        var x_1 = 77;
        console.log(x_1);
    }
    {
        var x_2 = 45;
        console.log(x_2);
    }
}
console.log(x);
// Prompt and alert example
var userInput = window.prompt("Please Enater your Input");
if (userInput !== null) {
    window.alert("Hello, ".concat(userInput, "!"));
}
else {
    window.alert("You clicked Cancel or closed the prompt.");
}
