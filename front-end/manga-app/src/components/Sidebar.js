import React, { useState } from "react";
import "./Sidebar.css";

const Sidebar = () => {
  const [isSidebarOpen, setSidebarOpen] = useState(false);

  const toggleSidebar = () => {
    setSidebarOpen(!isSidebarOpen);
  };

  const closeSidebar = () => {
    setSidebarOpen(false);
  };

  return (
    <div className={`app ${isSidebarOpen ? "sidebar-open" : ""}`}>
      <button onClick={toggleSidebar} className="toggle-btn">
        {isSidebarOpen ? "Close Sidebar" : "Open Sidebar"}
      </button>

      <div className={`sidebar ${isSidebarOpen ? "open" : ""}`}>
        <button onClick={closeSidebar} className="close-btn">
          Close
        </button>
        <div className="sidebar-content">con1</div>
        <div className="sidebar-content">con2</div>
        <div className="sidebar-content">con3</div>
        <div className="sidebar-content">con4</div>
      </div>

      <div className="main-content">
        {/* Your main content goes here */}
      </div>
    </div>
  );
};

export default Sidebar;
