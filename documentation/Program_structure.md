###GUI
- StartWindow
Only used to read a file (using the FileReader class) if one is given, after that closes and starts the main program.
- PlanetCanvas
A window used to draw the planets held within the Planets singleton, updates the screen at the rate specified in the Settings class
- ControlPanel
Used to control the simulation, for now the only functionality it has is adding new planets and modifying the speed of the simulation.
###Logic
- Planet
As the class name suggests, a planet with variables such as mass, location, velocity and such.
- Planets
A singleton class that contains the planets created by the program.
- Scheduler 
Calls the Planets class at a set interval to update the location of each planet, does not interact with PlanetCanvas.
- Settings
Static class that holds useful variables like screen update frequency and simulation speed multiplier.
###Util
- Coordinate
Coordinate with an x and y component
- FileReader
Reads a file and generates new planets from that, created planets must be manually retrieved from the class as they are not automatically added to the planets class.
- Vector
A vector class with x and y components, planet class uses this for the velocity and temporary force variables
