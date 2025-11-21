#Max Value from List
a = [];#this is infinite array
size = int(input("Enter array size or list: "));

print("\nEnter Values in array\n");
i =0;
while i<size:
    val = int(input(" "));
    a.append(val);
    i+=1;
    
i=0;
max =a[0];
while i<size:
    
    if(a[i]>max):
        max =a[i];
        
    i+=1;
    
print("Max value is: ",max);
