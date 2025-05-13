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
var john = {
    name: "Rishek Kumar",
    age: 30,
    greet: function () {
        console.log("Hello, my name is ".concat(this.name, "!"));
    },
};
john.greet();
var Employee = /** @class */ (function () {
    function Employee(name, age, jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }
    Employee.prototype.greet = function () {
        console.log("Hi, I'm ".concat(this.name, ", a ").concat(this.jobTitle, "."));
    };
    return Employee;
}());
var sarah = new Employee("Sarah Smith", 28, "Developer");
sarah.greet();
var book1 = { titel: "TS Basics", author: "Jane Doe" };
var book2 = { titel: "Advanced TS", author: "John Smith", pages: 100 };
var Manager = /** @class */ (function () {
    function Manager() {
        this.name = "Bob";
        this.id = 123;
    }
    return Manager;
}());
