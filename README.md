
To activate specific application-xxx.properties
_________________________________________________
Run As > Run Configurations > Arguements > -Dspring.profiles.active=dev or -Dspring.profiles.active=qa


--------------------------------
GET http://localhost:8080/userlogin

Body - Raw Json

{
	"userName" : "admin",
	"password" : "password"
}


