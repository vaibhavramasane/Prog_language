#Basic Array Methods

#append() : at items at end of list
"""

a=[];
a.append(10);
a.append(20);
a.append(30);
a.append(40);
a.append(50);
print(a);


a = []  #infinite array

size = int(input("Set array Size"));

print("Enter values in array: ");
for i in range(0,(size)):
    val = int(input(""));
    a.append(val);
    
print("Display Array: ");
for i in range(0,size):
    print(a[i]);
    
    
"""
