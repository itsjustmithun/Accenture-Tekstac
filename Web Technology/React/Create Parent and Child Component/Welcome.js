import React, { Component } from 'react';


class Welcome extends Component {
  
    // IMPLEMENT YOUR CODE HERE
 
render(){
    return(
        <div>
            <h1>Welcome User</h1>
            <p>What is React? React is a declarative, efficient, and flexible JavaScript library for building user interfaces. It lets you compose complex UIs from small and isolated pieces of code called "components".</p>
            <DateComp />
        </div>
        );
}
}

class DateComp extends Component{
     constructor(){
      super();
      let d=new Date();
      let dat="Dated:"+d.getDate()+"/"+(d.getMonth()+1)+"/"+d.getFullYear();
      this.state={dat:dat};
    }
    render(){
        return(
            <div>
            {this.state.dat}
            </div>
            );
    }
}

export {DateComp}
export default Welcome;
