# Flight Gear Simulation - Anomaly-Detector

### <img width="1149" alt="gui p" src="https://user-images.githubusercontent.com/61715620/128372124-96efbaf7-90a4-41df-8ae2-82d75e5ba914.png">
 Main Details
* JavaFX desktop application.
* GUI interface while simulating a flight with FlightGear simulator.
* Implemented MVVC architecture.
* Multi threaded development for performance optimization.


#### The project is defined as a collection of user stories.
* The user entres flight files - CSV files that constitute time-series
data of various flight data.
* The app displays the flight data in
the GUI that presents a control panel, a
scroll bar, a virtual joystick that
moves according to the
current time step, and clocks
dashboard of selected data
from the aircraft.

#### The user can choose feature from the features list - the app will show:
In the two top charts you can see:
* the value of the feature from the begging of the flight up to the current point in time.
* the value of the the best coraltion feature to the one the user choosed (if there is one).

#### The app demonstrates how different algorithms detected different deviation moments on different flights.
There are three diffrent algorithm:
* Line regression 
* Hybrid algorithm
* Zscore algorithm
Each algorithm work diffrently

By selecting feature the bottom graph show:
* The created point from the selected feature and his best coraltion.
* The app learn when there is a anomaly point 
* The app alart the user that anomaly point founded.
* the bottom graph show trail of the last 20 points.

#### The application displays the flight file visually by projecting the data using the "FlightGear" simulator.
The application

The app also using plug-in
which allows uploading diffrent class
files on run-time, that
represent an anomaly
detection algorithm.

You can see in the picture below the line regression algorithem compared to the circle algorithm that showm in the first picture.

<img width="618" alt="linepic" src="https://user-images.githubusercontent.com/61715620/128828493-70697db8-4117-46d6-b72e-4752c1370a21.png">
