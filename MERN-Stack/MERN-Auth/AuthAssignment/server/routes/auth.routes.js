const UserController = require("../controllers/auth.controller");
module.exports = app => {
    app.post('/api/register',UserController.register);
    app.post('/api/login',UserController.login);
    app.get('/api/logout',UserController.logout);

}
