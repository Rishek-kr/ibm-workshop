import "./App.css";
import ExpenseEntryItem from "./components/ExpenseEntryItem";

interface GreetingsProp {
  name: string;
  city: string;
}

interface ActionButtonProps{
  title: string;
  disabled: boolean;
}

function handleClick(){
  alert('Button Clicked');
}

function ActionButton({title,disabled}:ActionButtonProps){
  return(
    <>
        <button disabled={disabled} onClick={handleClick} >{title}</button>
    </>
  )
}

function Greeting({ name, city }: GreetingsProp) {
  return (
    <h2>
      Hello, {name} from {city}
    </h2>
  );
}
function App() {
  return (
    <>
      <Greeting name="I am a IBMer" city="Bengaluru" />
      <ExpenseEntryItem/>
      <ActionButton title="This is button" disabled={false}/>
    </>
  );
}

export default App;
