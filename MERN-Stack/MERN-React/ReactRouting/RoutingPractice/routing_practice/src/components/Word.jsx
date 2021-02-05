import React from 'react'

const Word = (props) => {
    return (
        <div>
            {
                isNaN(props.input)?
                <h3>This word is: {props.input}</h3>:
                <h3>This Number is: {props.input}</h3>
            }
        </div>
    )
}

export default Word
