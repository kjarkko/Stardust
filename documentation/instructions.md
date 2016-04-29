- Start the program
- Enter the location of the file you want to read*, leave empty if you do not want to read anything
- Main program will now start
- Press the create button to create a new planet(after filling all the fields)
- Press speed up/down to make the simulation go faster/slower (number displayed below is the current speed)

Currently the program does not have a zoom function and the default zoom is meant for the earth and the moon

File 'test' in the root of the project generates the earth and the moon.

* Format of the file should be like this: p; a ; b ; c1,c2 ; d1,d2 ; e ; f;
Where:
a = radius(integer)
b = mass(double), in kilograms
c = x,y location (double)
d = x,y vector (double), in m/s
e = color, integer (example: 16000 is blue(ish))
f = name of the planet(string)

example:
p;50;73240000000000000000000;384399000,0;0,1022;16000;moon;
p;100;5972370000000000000000000;0,0;0,0;16000;earth;
