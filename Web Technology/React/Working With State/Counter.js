import React, { Component } from 'react';

class Counter extends Component {
    constructor(props){
        super(props);
        this.state={count:0};
    }
	handlerClick(event){
	    this.setState({count:this.state.count + 1});
	}
	render(){
	    return(<div onClick={this.handlerClick.bind(this)}>
	    <h1>Counter</h1>
	    <h2>{this.state.count}</h2></div>);
	}
}

export default Counter;