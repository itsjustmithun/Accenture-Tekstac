import React from 'react';
import ReactDOM from 'react-dom';
//ADD THE REQUIRED IMPORT STATEMENT
import Article from ".";
import * as serviceWorker from './serviceWorker';


//IMPLEMENT THE REQUIRED CODE TO RENDER THE COMPONENT IN, document.getElementById('root')
ReactDOM.render(<Article />,document.getElementById('root'));

serviceWorker.unregister();