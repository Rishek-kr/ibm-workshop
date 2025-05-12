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
// const x = 22;
// {
//     // const x = 90;
//     console.log(x);
//     {
//         const x = 77;
//         console.log(x);
//     }
//     {
//         const x = 45;
//         console.log(x);
//     }
// }
// console.log(x);



        // Prompt and alert example
// let userInput: string | null = window.prompt("Please Enater your Input");
// if(userInput!==null){
//     window.alert(`Hello, ${userInput}!`);
// }else{
//      window.alert("You clicked Cancel or closed the prompt.");
// }

        // DOM manipulation example
// const demoElement = document.getElementById("demo");
// if(demoElement){
//     demoElement.style.fontSize="35px";
//     demoElement.style.color="blue";
// }


        // console example
// console.info("You are awesome");
// console.log("IBM Technologies");
// console.log({
//     name:"Rishek Kumar",
//     age:23,
// });
// console.log(["Apple", "Orange", "Banana"]);
// console.error("Something is wrong");
// console.table(["Apple", "grape", "Banana"])
// console.assert(2>3,"It cannot be");
// console.clear();
// console.warn("I usually grt ignored");
// console.time();
// console.timeEnd();


        // Grouping console logs
function f1() {
    console.group("Group 1");
    console.groupCollapsed();
    console.info("Getting Started");
    console.error("Something went wrong");
    console.log("logging this");
    console.groupEnd();
    console.info("Bye");
}
f1();