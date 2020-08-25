import React, { Component } from 'react';

var data=[    
		{"id":"RA100", "name":"Keyan Zhang", "title":"Introducing React's Error Code System", "date":"Mon Jul 1 2018"},    
		{"id":"RA101", "name":"Dan Abramov", "title":"Mixin Considered Harmful", "date":"Wed Sep 21 2018"},
		{"id":"RA102", "name":"Scott Holds ", "title":"Create Higher Order Component", "date":"Fri Nov 20 2018"},
		{"id":"RA103", "name":"Kurt Lee", "title":"React Best Practices", "date":"Tue Nov 10 2018"}
	];  
const styles={
	article: {
		paddingBottom: 10,
		borderBottomStyle: 'solid',
		borderBottomColor: '#aaa',
		borderBottomWidth: 1,
		marginBottom: 10
	},
	title: {
		fontWeight: 'bold'
	}
};	
class Article extends Component {
	//IMPLEMENT YOUR CODE HERE
	constructor()
	{
	    super()
	    this.state={articles:data}
	}
	render()
	{
	    return(
	        <div>
	        {this.state.articles.map((infe) => <Display key={infe.id} article ={infe} />)}
	        </div>);
	}
}

class Display extends Component {
	//IMPLEMENT YOUR CODE HERE
	render()
	{
	    return(
	        <div style={styles.article}>
	        <div>{this.props.article.id}</div>
	        <div>{this.props.article.name}</div>
	        <div style={styles.title}>{this.props.article.title}</div>
	        <div>{this.props.article.date}</div>
	        </div>);
	}
}

export {Display}
export default Article

