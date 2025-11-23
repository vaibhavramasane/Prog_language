#Q 3. Write a java program to enter two numbers and perform all arithmetic operations. 


print("1.Addition");   
print("2.Multiplication");   
print("3.Substraction");   
print("4.Division");   
print("Enter two values");

a = int(input("Enter first value\n"));   
b = int(input("Enter Second value\n"));
choice  = int(input("Enter your choice: "));   

match choice: 
    case 1:
        print("Addition is " ,(a+b));
       
    case 2:
        print("Multiplication is " ,(a*b));
    
    case 3:
        print("Substraction is " ,(a-b));
        
    case 4:
        print("Division is " ,(a/b));
        
    case _:
        print("Wrong choice");
       