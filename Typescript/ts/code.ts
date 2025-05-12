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
const x = 22;
{
    // const x = 90;
    console.log(x);
    {
        const x = 77;
        console.log(x);
    }
    {
        const x = 45;
        console.log(x);
    }
}
console.log(x);

        // Prompt and alert example
let userInput: string | null = window.prompt("Please Enater your Input");
if(userInput!==null){
    window.alert(`Hello, ${userInput}!`);
}else{
     window.alert("You clicked Cancel or closed the prompt.");
}