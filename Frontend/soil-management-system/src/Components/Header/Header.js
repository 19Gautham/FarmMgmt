import React from 'react';
import './Header.css';

const Header = () => {
  return (
    <header>
      <div className="logo">
        {/* You can place your logo or application title here */}
        <h1>Farm Management System</h1>
      </div>
      
      <button class="navbar-toggler navopen" type="button" data-toggle="collapse" data-target="#gcSiteNav" aria-controls="gcSiteNav" aria-expanded="true" aria-label="Toggle navigation">
        <span></span>
        <span></span>
        <span></span>
      </button>
      {/* Add any additional header content or navigation elements */}
    </header>
  );
};



export default Header;