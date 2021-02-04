import React,{useState} from 'react'


const TodoCompanent = () => {
    const [todoList,setTodoList]=useState([
        {name: "This is my first task", checked:false},
        {name: "This is my second task", checked:false}]);
    
        const clickHandler =() =>{
            let name = document.getElementById("text").value;
            setTodoList(todoList.concat({name : name, checked:false}));
            document.getElementById("text").value = "";
        }

        const changeStatus =(e,index) =>{
            setTodoList(todoList.map((item,i) => i === index?
            {name: item.name, checked:e.target.checked}:
            {name: item.name, checked:item.checked}
            ))
        }
        const deleteToDo=(index)=>{
            setTodoList(todoList.filter((item,i)=>i!==index))
        }
    
    return (
        <div>
            {
                todoList.map((item,index) => {
                    return <div key={index}>
                                {item.checked?
                                <del>{item.name}</del>:
                                <span>{item.name}</span>}
                                <input type="button" id ={index} value="DELETE" onClick = {() => deleteToDo(index)}/>
                                <input type="checkbox" id ={index} checked={item.checked} onClick = {(e) => changeStatus(e,index)}/>
                            </div>
                })
            }
            <div>
                <textarea id="text"/>
                <input type="button" value="ADD" onClick={clickHandler}/>
            </div>
        </div>
    )
}

export default TodoCompanent
