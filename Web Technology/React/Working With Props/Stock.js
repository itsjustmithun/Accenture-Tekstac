import React, { Component } from 'react';

class Stock extends Component {
  
  //IMPLEMENT YOUR CODE HERE. "stockName" and "stockQty" is sent through one props data (i.e) as JSON
  constructor(props){
      super(props);
      this.state={
          stockName:'stockName',
          stockQty:'stockQty'
      };
  }
  render(){
      return(<div><p>{this.props.dashValues.stockName}</p>
      <p>{this.props.dashValues.stockQty}</p></div>);
  }
}
export default Stock;
