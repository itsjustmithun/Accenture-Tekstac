import React from 'react';
import ReactDOM from 'react-dom';
//ADD THE REQUIRED IMPORT STATEMENT
import Welcome from '.';
import * as serviceWorker from './serviceWorker';


//IMPLEMENT THE REQUIRED CODE TO RENDER THE COMPONENT IN, document.getElementById('root')
ReactDOM.render(<Stock dashValues={{stockName:"ANYTHING",stockQty:anyNUMBER}}/>)
serviceWorker.unregister();

