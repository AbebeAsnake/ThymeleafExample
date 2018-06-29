#Simple conditions with Thymeleaf
This project takes a 'value' parameter in the default route. 
Depending on the value provided, the user sees values. 


The format of the request: 
http://localhost:8082/addvalue?value=
The value of value should be numeric for best results in this example.

Strings can also be entered:  

http://localhost:8082/addvalue?text=  

or 
http://localhost:8082/value=&text=  

Do not forget to assign values for value and text in the URL! 

Ternary operators are included. 
