""" Wap to create array of list of size 5 and reverse it"""
a = []; #this is infinite array
size = int(input("Enter Size of Array: "));
i=0;
while i<size:
    a.append(int(input("")));
    i+=1;
    
print("Before Reverse:");
i=0;
while i<size:
    print(a[i],end=" ");
    i =i+1;
    
    
end =(len(a)-1);
start=0;

while(start<end):
    
    temp = a[start];
    a[start] = a[end];
    a[end] = temp;
    end = end-1;
    start = start+1;
    
print("After Reverse:");
i=0;
while i<size:
    print(a[i],end=" ");
    i =i+1;  