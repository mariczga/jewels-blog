import React from "react";
import ReactDOM from "react-dom";
import Main from "./components/Main";
import {Provider} from "react-redux";
import store from "./redux/store";
import {HashRouter, NavLink, Route, Switch} from "react-router-dom";
import Platform from "./containers/Platform";
import About from "./components/About";
import NotFound from "./components/NotFound";


const activeStyle = {
    color: 'red',
    fontWeight: 'bold'

};


const App = () => (


    <Provider store={store}>
        <HashRouter>


            <>
                <ul>
                    <li><NavLink exact to="/" activeStyle={activeStyle}>Strona główna</NavLink></li>
                    <li><NavLink to="/zaloguj" activeStyle={activeStyle}>Zaloguj sie</NavLink></li>
                    <li><NavLink to="/zaloguj" activeStyle={activeStyle}>Zaloguj sie</NavLink></li>
                    <li><NavLink to="/o-nas" activeStyle={activeStyle}>O Nas</NavLink></li>
                </ul>
            </>
            <Switch>
                <Route exact path="/" component={Main}/>
                <Route path="/platform" component={Platform}/>
                <Route path="/about" component={About}/>
                <Route component={NotFound}/>
            </Switch>
        </HashRouter>
    </Provider>
)




ReactDOM.render(<App />, document.getElementById("app"));
