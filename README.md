# Java-Projects

This project purpose is for creating a account for user where detail are stored in database.

> Details which are entered in UserRegister.jsp will be transfered to UserServlet page.
> UserServlet page will send details to User page by an object where User page have getters and setters.
> so details which are sent by UserServlet to User are assigned by setters.
> UserDao page is crucial one which have connection to database and a method to register details to database.
> so after UserServlet page sending details to User page, UserServlet access UserDao and transfers user details to UserDao page which are saved to database.
> And at last response is redirected to UserDone.jsp page which shows successful message. 
