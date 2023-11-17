const Navbar = () => {
  return (
    <nav className="navbar">
      <h1>Farm Management System</h1>
      <div className="links">
        <a href="/" className="homeCSS">Home</a>

        <a
          href="/"
          style={{
            color: "white",
            backgroundColor: "#f1356d",
            borderRadius: "8px",
          }}
        >
          New User? Register
        </a>
      </div>
    </nav>
  );
};

export default Navbar;
