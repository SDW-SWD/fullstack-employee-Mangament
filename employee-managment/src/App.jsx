import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import ListEmployee from './components/ListEmployee';
import AddEmployee from './components/addEmployee';
import Contact from './pages/contact';
import Home from './pages/home';
function App() {
  return (
    <>
      <BrowserRouter>
        <Routes>
                <Route path="/" element={<Home/>} />
                <Route path="/add" element={<AddEmployee/>} />
                <Route path="/list" element={<ListEmployee/>} />
                <Route path="/contact" element={<Contact/>} />
        </Routes>
      </BrowserRouter>
    </>
    
  )
}

export default App
