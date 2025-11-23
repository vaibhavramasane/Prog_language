"""Q 5. Write a java program to enter radius of a circle and find its diameter,area and circumference.
Formula :-
diameter=2 * radius;
circumference = 2 * 3.14 * radius; area = 3.14 * radius * radius;
"""

rad = float(input("enter radius:"));

d = 2 * rad;
circum = 2 * 3.14 * rad * rad;
print("Diameter of circle: ", d);
print("circumfernce of circle:",circum);