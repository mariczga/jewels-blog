import { connect } from "react-redux";
import Platform from "../components/Platform";
import {rocketAdder, rocketLauncher, rocketRemover} from "../redux/actions";

const mapState = ({rocketReducer}) => ({
    rocketList: rocketReducer
})

const mapDispatch = dispatch => ({
    add: (rocket)=> dispatch(rocketAdder(rocket)),
    remove: (rocket)=> dispatch(rocketRemover(rocket)),
    launched: (rocket) => dispatch (rocketLauncher(rocket))

})

export default connect(mapState, mapDispatch)(Platform);
