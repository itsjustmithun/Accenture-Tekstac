import React, { Component } from 'react';
//Add REQUIRED IMPORTS
import PropTypes from 'prop-types';

class Display extends Component {
	//IMPLEMENT YOUR CODE HERE
	render(){
	    return(
	        <div>
	        <p>{this.props.stockName}</p>
	        <p>{this.props.stockQty}</p>
	        <p>{this.props.currencyList}</p>
	        </div>);
	}
}


//IMPLEMENT PROPTYPES
Display.propTypes={
    stockName:PropTypes.string.isRequired,
    stockQty:PropTypes.number.isRequired,
    currencyList:PropTypes.array,
}
Display.defaultProps={
    stockName:"mobile",
    stockQty:"10",
    currencyList:['dollar','rupee'],
}
export default Display;

