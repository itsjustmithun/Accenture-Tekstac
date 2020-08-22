import React from 'react';
import ReactDOM from 'react-dom';
//ADD THE REQUIRED IMPORT STATEMENT
import * as serviceWorker from './serviceWorker';
import Display from '.';


//IMPLEMENT THE REQUIRED CODE TO RENDER THE COMPONENT IN, document.getElementById('root')
ReactDOM.render(<Stock dashValues={{stockName:"ANYTHING",stockQty:anyNUMBER}}/>)
serviceWorker.unregister();