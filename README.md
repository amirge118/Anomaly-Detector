# Flight Gear Simolation - Anomaly-Detector

### <img width="1149" alt="gui p" src="https://user-images.githubusercontent.com/61715620/128372124-96efbaf7-90a4-41df-8ae2-82d75e5ba914.png">
 
* JavaFX desktop application.
* GUI interface while simulating a flight with FlightGear simulator.
* Implemented MVVC architecture.
* Multi threaded development for performance optimization.


The project is defined as a collection of user stories. The user
receives flight files - CSV files that constitute time-series
data of various flight data. Before starting to run all sorts of
machine learning algorithms, it is necessary to visualize the
information in order to understand what is actually
happening on each flight. The app displays the flight data in
the GUI and FlightGear from the data it received. The app
demonstrates how different algorithms detected different
deviation moments on different flights.


The user load a configuration
file which defines the simulator
interface data, and the
location of the GUI features in
the flight csv file that will be
loaded as well. In addition the
program checks if there is any
error in the uploaded settings
file and csv files. If so, the
program will send an
appropriate alert.



The application displays the
flight file visually by projecting
the data using the "FlightGear"
simulator. The application
presents a control panel, a
scroll bar, a virtual joystick that
moves according to the
current time step, and clocks
dashboard of selected data
from the aircraft.


The app displays a list of flight
features, and according to the
current flight time,
synchronously presents on
graphs each feature that
selected by the user, and the
correlative feature to it.
The app also using plug-in
which allows uploading class
files on run-time, that
represent an anomaly
detection algorithm, and
reports for detection.
you can see in the picture below the line chart algorithem
<img width="618" alt="linepic" src="https://user-images.githubusercontent.com/61715620/128828493-70697db8-4117-46d6-b72e-4752c1370a21.png">
