a = [10,20,30,40,50];
print("BEfore Change: ",a);
print("Base Address is: ",id(a));
b=a;
b[1] = 1000;
print("Base Address is: ",id(b));
print("After Change: ",b);

