import React from "react";

const imgSrc = "https://www.raletta.in/images/rocket.gif";

const Rocket = ({ launched, counter }) =>
  <div className="rocket">
    <img
      alt="rocket"
      src={imgSrc}
      className={`rocket__image ${launched ? 'launched': ''}`}
    />
    <button  onClick={()=> launched()} className="rocket__button">{ counter < 5 ? counter : "Launch"}</button>
  </div>;

export default Rocket;
