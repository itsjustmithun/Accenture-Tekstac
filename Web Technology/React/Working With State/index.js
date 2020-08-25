import React from 'react';
import ReactDOM from 'react-dom';
//ADD THE REQUIRED IMPORT STATEMENT
import * as serviceWorker from './serviceWorker';
import Counter from '.';


//IMPLEMENT THE REQUIRED CODE TO RENDER THE COMPONENT IN, document.getElementById('root')
ReactDOM.render(<Counter/>,document.getElementById('root'));

serviceWorker.unregister();