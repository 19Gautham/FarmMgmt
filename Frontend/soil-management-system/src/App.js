import Dashboard from "./Components/Dashboard/Dashboard";
import Footer from "./Components/Footer/Footer";
import Header from "./Components/Header/Header";
import IrrigationControl from "./Components/IrrigationControl/IrrigationControl";
import Navbar from "./Components/Navbar/Navbar";
import Home from "./Components/Home/Home";
// import LoginPage from "./Components/LoginPage/LoginPage";
// import { BrowserRouter as Router, Route } from "react-router-dom";

// const Login = () => <LoginPage />;

function App() {
  return (
    <div className="App">
      <Navbar />
      <div className="content">
        <Home />
        <div className="rowA">
          <Header />
          {/* <Router>
            <Route path="/login" component={Login} />
          </Router> */}
        </div>

        <div className="rowB">
          <Dashboard />
        </div>

        <div className="rowC">
          <IrrigationControl />
        </div>

        <div className="rowD">
          <Footer />
        </div>
      </div>
    </div>
  );
}

export default App;
