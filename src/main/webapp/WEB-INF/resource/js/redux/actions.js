export const ADD_ROCKET = "ADD_ROCKET"
export const REMOVE_ROCKET = "REMOVE_ROCKET"
export const START_COUNTER = "START_COUNTER"
export const ROCKET_LAUNCHED = "ROCKET_LAUNCHED"

export const rocketAdder = payload => ({
    type: ADD_ROCKET,
    payload
})


export const rocketRemover = payload => ({
    type: REMOVE_ROCKET,
    payload
})


export const counterStarting = payload => ({
    type: START_COUNTER,
    payload
})

export const rocketLaunched = () => ({
    type: ROCKET_LAUNCHED
})

export const rocketLauncher =(dispatch, getState) => {
    const interval = setInterval(()=>{
        const count = getState().rocketReducer.counter
        if (count <=1 ) {
            clearInterval(interval)
            dispatch(rocketLaunched())
        } else {
            dispatch(counterStarting(count - 1 ))
        }
    } , 1000)
}