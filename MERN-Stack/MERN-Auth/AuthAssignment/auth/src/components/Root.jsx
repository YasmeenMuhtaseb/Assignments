import React,{useEffect,useState} from 'react'
import axios from 'axios';
import { navigate } from '@reach/router';
const Root = () => {
    const[user,setUser] = useState("");
    const[firstName,setFirstName] = useState("");
    const[lastName,setLastName] = useState("");
    const[email,setEmail] = useState("");
    const[password,setPassword] = useState("");
    const[error,setError] = useState("");
    const submitHandler = () =>{
        axios.post('http://localhost:8000/api/register',{
            firstName,lastName,email,password
        })
        .then(response => setUser(response.data), navigate('/successs'))
        .catch(err =>{
            const errorResponse = err.response.data.error;
            const errorArr =[];
            for ( const key of Object.keys(errorResponse)){
                errorArr.push(errorResponse[key].message)
            }
            setError(errorArr);
        })
    };
    return (
        <div>
            <form onSubmit ={submitHandler}>
                <div><lable>First Name:<input type="text" onChange ={(e) => setFirstName(e.target.value)}/></lable></div>
                <div><lable>Last Name:<input type="text" onChange ={(e) => setLastName(e.target.value)}/></lable></div>
                <div><lable>Email:<input type="text" onChange ={(e) => setEmail(e.target.value)}/></lable></div>
                <div><lable>Password:<input type="text" onChange ={(e) => setPassword(e.target.value)}/></lable></div>
                <button>Register</button>
            </form>

        </div>
    )
}

export default Root
