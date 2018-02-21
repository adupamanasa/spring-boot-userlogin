Run Application with different application-xxx.propeties files

Run As > Run Configurations > Arguments > -Dspring.profiles.active=dev or -Dspring.profiles.active=qa

![capture](https://user-images.githubusercontent.com/16677013/36504803-b604fdf4-171f-11e8-8a15-8b24026dada0.PNG)

Run Test Cases with different application-xxx.propeties files

![capture1](https://user-images.githubusercontent.com/16677013/36504804-b6172c90-171f-11e8-9568-0f995ec93277.PNG)

![capture2](https://user-images.githubusercontent.com/16677013/36504805-b62a766a-171f-11e8-9fcf-941cb694402f.PNG)
       
Maven Install to build jar with different application-xxx.propeties

Run As > Maven Build..

![capture4](https://user-images.githubusercontent.com/16677013/36504807-b647fb36-171f-11e8-986e-aa6e10a11761.PNG)

![capture3](https://user-images.githubusercontent.com/16677013/36504806-b63947b2-171f-11e8-8950-f36e3ca26f94.PNG)

--------------------------------
POST http://localhost:8080/userlogin

{
	"userName" : "admin",
	"password" : "password"
}



