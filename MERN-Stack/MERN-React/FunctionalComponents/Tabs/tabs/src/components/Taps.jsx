import React,{useState} from 'react'
import styled,{keyframes} from 'styled-components'

const theme = {
    red: {
        default: "#900D09",
        hover: "#60100B"
    },
    };

const Button = styled.button`
    background-color: ${(props) => theme[props.theme].default};
    color: white;
    padding: 5px 15px;
    border-radius: 5px;
    outline: 0;
    text-transform: uppercase;
    margin: 10px 0px;
    cursor: pointer;
    box-shadow: 0px 2px 2px lightgray;
    transition: ease background-color 250ms;
    &:hover {
        background-color: ${(props) => theme[props.theme].hover};
    }
    &:disabled {
        cursor: default;
        opacity: 0.7;
    }
    `;

Button.defaultProps = {
    theme: "red"
};

const rotate = keyframes`
    from {
        transform: rotate(0deg);
    }

    to {
        transform: rotate(360deg);
    }
`;

const Rotate = styled.div`
    display: inline-block;
    animation: ${rotate} 15s linear infinite;
    padding: 12% 1%;
    font-size: 200%;
`;


const taps =["Yasmeen","Abdusalam","Kamal","Aseel","Loay","Dalia"];

const Taps = () => {
    const [msg,setMsg] =useState("");
    const onClickHandler = (e, value) => {
        setMsg(value +" content is showing here.");
    }
    return (
        <>
        {taps.map((item, index) => {
            return <Button onClick={(e) => onClickHandler(e,item)}>{item}</Button>
        })}
        <p><Rotate>{msg}</Rotate> </p>
        </>
    )
}

export default Taps
