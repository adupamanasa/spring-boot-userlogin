Run Application with different application-xxx.propeties files

Run As > Run Configurations > Arguments > -Dspring.profiles.active=dev or -Dspring.profiles.active=qa



Run Test Cases with different application-xxx.propeties files


       

Maven Install to build jar with different application-xxx.propeties

Run As > Maven Build..


--------------------------------
POST http://localhost:8080/userlogin

{
	"userName" : "admin",
	"password" : "password"
}



