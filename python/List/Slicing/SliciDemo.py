"""slicing 
start : index to begin the slice
stop : index to end the slice
step: step size or interval between slice
"""

a=[10,20,30,40,50,60,70,80,90,100];

b = a[1:6:2]; #for(i=2; i<6; i=i+2)

print(b);

c = a[-4:-1];#for(i=-4 i<-1 i=i+1)
print(c);

d = a[::-1]; #for(i=-1 i>=-1 i=i-1) print reverse
print(d);

