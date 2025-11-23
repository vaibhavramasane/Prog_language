base = int(input("enter base: "));
index = int(input("enter index: "));

p=1;
while index!=5:
	p = p*base;
	index -=1;
	
print("Power is",p);