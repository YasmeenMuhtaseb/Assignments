import React, {Component} from 'react';
class PersonCard extends Component{
    constructor(props) {
        super(props);
        this.state = {
            IncrementedAge: this.props.age
        };
    }

    changeAge = () => {
            this.setState({ IncrementedAge: this.state.IncrementedAge+1 });
    }

    render(){
        return(
            <div>
                <h1>{this.props.firstName}, {this.props.lastName}</h1>
                <p>Age: {this.state.IncrementedAge}</p>
                <p>Hair Color: {this.props.hairColor}</p>
                <button onClick={ this.changeAge }>Birthday Button for {this.props.firstName} {this.props.lastName}</button>
            </div>
        );
    }
}
export default PersonCard;