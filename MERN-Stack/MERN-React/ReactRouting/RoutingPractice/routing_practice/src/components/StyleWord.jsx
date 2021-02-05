import React from 'react'

const StyleWord = (props) => {
    return (
        <div style={{backgroundColor:props.bgcolor,color:props.wordcolor,width:"50%",padding:"20px",margin:"1% 25%"}}> 
            <h3>This word is: {props.input}</h3>
        </div>
    )
}

export default StyleWord
