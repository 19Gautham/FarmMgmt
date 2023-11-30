import Navbar from "./components/Navbar/Navbar";
import { Route, Routes } from "react-router-dom";
import Home from "./components/Home/Home";
import SignUp from "./components/Signup/Signup";
import Login from "./components/Login/Login";
import About from "./components/About/About";

function App() {
  let component;
  switch (window.location.pathname) {
    case "/":
      component = <Home />;
      break;

    case "/sign-up":
      component = <SignUp />;
      break;

    case "/login":
      component = <Login />;
      break;

    case "/about":
      component = <About />;
      break;

  }

  return (
    <>
      <Navbar />
      { component }
    </>
  );
}

export default App;
