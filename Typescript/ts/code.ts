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
// function f1() {
//     console.group("Group 1");
//     console.groupCollapsed();
//     console.info("Getting Started");
//     console.error("Something went wrong");
//     console.log("logging this");
//     console.groupEnd();
//     console.info("Bye");
// }
// f1();


// function f1(){
//     console.log('f1()');
// }
// f1();
// var f2 = function(){
//     console.log('f2()');
// }
// f2();
// var f3 = ()=>console.log('f3()');
// f3();



        // function execution example

function execute(operation: (num1: number, num2: number) => number) {
    console.log(operation(2,4));
}

execute((num1,num2) => {return num1 + num2;});

execute((num1,num2) => {return (num1 + num2)/2;});


// method 1: using type annotation
let numbers: number[] =[1,2,3,,4,5];
numbers.push(6);
console.log(numbers);

let fruits: Array<string>=["apple","banana","orange"];
fruits.push("mango");
console.log(fruits);

const colors: readonly string[]=['red','green','blue']

let mixed: (string | number)[]=['hello',42,"world",100];
mixed.push(200);
mixed.push('typescript');
