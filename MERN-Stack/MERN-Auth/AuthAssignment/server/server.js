const express = require("express")
const cors = require("cors");
const app = express();
const port = 8000;
require("./config/mongoose.config");
require('dotenv').config();
const myFirstSecret = process.env.SECRET_KEY;
const cookieParser = require('cookie-parser');
app.use(cookieParser());
// Change the app.use(cors()) to the one below
app.use(cors({credentials: true, origin: 'http://localhost:3000'}));
app.use(express.json());
app.use(express.urlencoded({extended: true}));
require("./routes/auth.routes")(app);
app.listen(port,() => console.log("The server is running on port: "+ port));