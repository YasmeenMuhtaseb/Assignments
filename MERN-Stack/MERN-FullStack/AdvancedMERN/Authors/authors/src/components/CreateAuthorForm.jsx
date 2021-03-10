import React, { useState } from "react"
import axios from "axios"
import { navigate, Link } from "@reach/router"
import 'bootstrap/dist/css/bootstrap.min.css';

const CreateAuthorForm = props => {

    const [question, setQuestion] = useState("")
    const [options,setOptions] = useState([])
    const [errors, setErrors] = useState([])

    const onSubmit = e => {
        e.preventDefault()
        axios.post("http://localhost:8000/api/polls/new", {
            question: question,
            options: options,

        })
            .then(() => navigate("/"))
            .catch(err =>{
                const errorResponse = err.response.data.errors; // Get the errors from err.response.data
                const errorArr = []; // Define a temp error array to push the messages in
                for (const key of Object.keys(errorResponse)) { // Loop through all errors and get the messages
                    errorArr.push(errorResponse[key].message)
                }
                // Set Errors
                setErrors(errorArr);
            })
    }
    return(
        <div className="container">
            <div className="row">
                <div className="col-12">
                    <p><Link to="/">Home</Link></p>
                    <p>Add a new author:&nbsp;
                        {
                            errors.map((err, index) => <small key={index} style={{color:"red"}}>{err}</small>)
                        }
                    </p>
                </div>
            </div>
            <div className="row">
                <div className="col-6">
                    <form onSubmit={ onSubmit }>
                        <div className="form-group">
                            <label>Your question:</label>
                            <textarea onChange={(e)=>setQuestion(e.target.value)} type="text" className="form-control"/>
                        </div>
                        <div>
                            <label>Option 1:</label>
                            <input onChange={(e)=>setOptions(e.target.value)} type="text" className="form-control"/>
                            <label>Option 2:</label>
                            <input onChange={(e)=>setOptions(e.target.value)} type="text" className="form-control"/>
                            <label>Option 3:</label>
                            <input onChange={(e)=>setOptions(e.target.value)} type="text" className="form-control"/>
                            <label>Option 4:</label>
                            <input onChange={(e)=>setOptions(e.target.value)} type="text" className="form-control"/>
                        </div>
                        <div className="form-group text-right">
                            <button onClick={()=>navigate("/")} type="button" className="btn btn-secondary btn-sm">Cancel</button>
                            <button className="btn btn-primary btn-sm" style={{marginLeft: "10px"}}>Submit Poll</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    )
}
export default CreateAuthorForm