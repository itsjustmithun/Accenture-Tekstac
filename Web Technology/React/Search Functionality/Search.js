import React, { Component } from 'react';

var cityList=["Dallas","Austin","Seatle","Memphis","Detroit","Miami"];


class Search extends Component {
    
    constructor(props){
             super(props);
            this.state = { city: "" };
        }
       handleBlur(event){
          this.setState({city: event.target.value});
      }
       render(){
           return(
               <div>
                   <input type="search" onBlur={this.handleBlur.bind(this)} />
                   <Display city={this.state.city}></Display>
                </div>
            );
       }
    }
    
    class Display extends Component {
        render(){
            var cityList = ["Dallas", "Austin", "Seatle", "Memphis"];
            var city = this.props.city;
            var val = cityList.indexOf(city);
            if(val > -1){
                return(
                    <div>{this.props.city}</div>
                );
            }
            else{
                return(
                   <div>No matching city found</div>
              );
          }
       }		
    }
export {Display}
export default Search

