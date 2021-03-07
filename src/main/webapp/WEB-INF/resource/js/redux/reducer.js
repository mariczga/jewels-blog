import {ADD_ROCKET, REMOVE_ROCKET, ROCKET_LAUNCHED, START_COUNTER} from "./actions";
import {combineReducers} from "redux";

const initState = [
    {
        launched: false,
        counter: 4,
        id: 0
    }
]

const rocketReducer = (state = initState, action) =>  {
    switch(action.type) {
        case ADD_ROCKET:
            let prevIdPlus = state.id
            return {
                ...state,
              id: prevIdPlus + 1
    }
        case REMOVE_ROCKET:
            let prevIdMinus = state.id
            return  {
                ...state,
                id: prevIdMinus- 1
            }
        case START_COUNTER:
            return {
                ...state, counter: action.payload
            }
        case ROCKET_LAUNCHED:
            return{
                ...state,
                launched: true,
                counter: 0
            }
        default:
            return state
    }
}

export default combineReducers({rocketReducer})