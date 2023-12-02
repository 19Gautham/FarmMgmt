function Navbar() {
  return (
    <>
      <nav className="navbar navbar-expand-lg bg-body-tertiary">
        <div className="container-fluid">
          <a className="navbar-brand" href="/">
            AgriSage
          </a>
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNavAltMarkup"
            aria-controls="navbarNavAltMarkup"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <div
            className="collapse navbar-collapse justify-content-end "
            id="navbarSupportedContent"
          >
            <ul className="navbar-nav">
              <li className="nav-item">
                <a
                  className="nav-link active link-dark link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover"
                  aria-current="page"
                  href="/"
                >
                  Home
                </a>
              </li>
              <a
                className="nav-link active link-dark link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover"
                href="/about"
              >
                About
              </a>

              <a
                className="nav-link active link-dark link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover"
                href="/login"
              >
                Login
              </a>
              <a
                className="nav-link active link-success link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover"
                href="/sign-up"
              >
                Sign Up
              </a>
            </ul>
          </div>
        </div>
      </nav>
    </>
  );
}

export default Navbar;
