import React from "react";
import Sidebar from "./Sidebar";
import "./css/header.css";


function Header() {
  return (
    <header>
      <div>
        <Sidebar/>
        <h1>Head</h1>
      </div>
    </header>
  );
}

export default Header;
