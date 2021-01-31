import React, { useState } from  'react';
    
    
const UserForm = (props) => {
    const [firstName, setFirstName] = useState("");
    const [firstNameError, setFirstNameError] = useState("");
    const [lastName, setLastName] = useState("");
    const [lastNameError, setLastNameError] = useState("");
    const [email, setEmail] = useState("");
    const [emailError, setEmailError] = useState("");
    const [password, setPassword] = useState(""); 
    const [passwordError, setPasswordError] = useState("");
    const [confirmPassword, setConfirmPassword] = useState(""); 
    const [confirmPasswordError, setConfirmPasswordError] = useState(""); 

    const handleFirstName = (e) => {
        setFirstName(e.target.value);
        if(e.target.value.length < 2 && e.target.value.length!==0) {
            setFirstNameError("First Name must be at least 2 characters");
        }
        else{
            setFirstNameError("");
        }
    }

    const handleLastName = (e) => {
        setLastName(e.target.value);
        if(e.target.value.length < 2 && e.target.value.length!==0) {
            setLastNameError("Last Name must be at least 2 characters");
        }
        else{
            setLastNameError("");
        }
    }

    const handleEmail = (e) => {
        setEmail(e.target.value);
        if(e.target.value.length < 2 && e.target.value.length!==0) {
            setEmailError("Last Name must be at least 2 characters");
        }
        else{
            setEmailError("");
        }
    }

    const handlePassword = (e) => {
        setPassword(e.target.value);
        if(e.target.value.length < 8 && e.target.value.length!==0) {
            setPasswordError("Password must be at least 8 characters");
        }
        else{
            setPasswordError("");
        }
    }

    const handlePasswordConfirm = (e) => {
        setConfirmPassword(e.target.value);
        if(password !== e.target.value) {
            setConfirmPasswordError("Passwords must matched");
        }
        else{
            setConfirmPasswordError("");
        }
    }
    
    const createUser = (e) => {
        e.preventDefault();
        const newUser = { firstName, lastName, email, password, confirmPassword};
        console.log("Welcome", newUser);
    };

    
    return(
        <div>
            <form onSubmit={ createUser }>
                <div>
                    <label>First Name </label> 
                    <input type="text" onChange={handleFirstName} />
                {
                    firstNameError ?
                    <p style={{color:'red'}}>{ firstNameError }</p> :
                    ''
                }
                </div>
                <div>
                    <label>Last Name </label> 
                    <input type="text" onChange={handleLastName} />
                    {
                    lastNameError ?
                    <p style={{color:'red'}}>{ lastNameError }</p> :
                    ''
                    }
                </div>
                <div>
                    <label>Email </label> 
                    <input type="text" onChange={handleEmail} />
                    {
                    emailError ?
                    <p style={{color:'red'}}>{ emailError }</p> :
                    ''
                    }
                </div>
                <div>
                    <label>Password </label>
                    <input type="password" onChange={handlePassword} />
                    {
                    passwordError ?
                    <p style={{color:'red'}}>{ passwordError }</p> :
                    ''
                    }
                </div>
                <div>
                    <label>Confim Password </label>
                    <input type="password" onChange={handlePasswordConfirm} />
                    {
                    confirmPasswordError ?
                    <p style={{color:'red'}}>{ confirmPasswordError }</p> :
                    ''
                    }
                </div>
                <input type="submit" value="Create User" />
            </form>
        </div>
    );
};
    
export default UserForm;