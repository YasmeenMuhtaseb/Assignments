const express = require("express");
const app = express();
const faker = require('faker');

class User{
    constructor(){
        this.firstName=faker.name.firstName();
        this.lastName=faker.name.lastName();
        this.phoneNumber=faker.phone.phoneNumber();
        this.email=faker.internet.email();
        this.password=faker.internet.password();
    }
}
const users =[];
class Company{
    constructor(){
        this.name=faker.company.companyName();
        this.address=[{"street":faker.address.streetName()},{"city":faker.address.city()},{"state":faker.address.state()},{"zipCode":faker.address.zipCode()},{"country":faker.address.country()}];
    }
}
const companies=[];
app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );
app.post("/api/users/new", (req, res) => {
    users.push(new User());
    res.json( { status: "ok" } );
});

app.get("/api/users", (req, res) => {
    res.json(users);
});
app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );
app.post("/api/companies/new", (req, res) => {
    companies.push(new Company());
    res.json( { status: "ok" } );
});

app.get("/api/companies", (req, res) => {
    res.json(companies);
});

app.use( express.json() );
app.use( express.urlencoded({ extended: true }) );
app.post("/api/user/company", (req, res) => {
    users.push(new User());
    companies.push(new Company());
    res.json( { status: "ok" } );
});

app.get("/api/user/company", (req, res) => {
    res.json([companies,users]);
});

const server = app.listen(8000, () =>
    console.log(`Server is locked and loaded on port ${server.address().port}!`)
);
