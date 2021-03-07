import React from "react";
import Rocket from "./Rocket";


const Platform = ({add, remove, rocketList}) => {


    return (

        <div className="platform">
            <div className="platform__buttons">
                            <button onClick={() => add()}>Dodaj rakietę</button>
                            <button onClick={() => remove()}>Usuń rakietę</button>


            </div>
            <div className="platform__rockets">
                <Rocket/>
            </div>
        </div>


    );
}

export default Platform;
