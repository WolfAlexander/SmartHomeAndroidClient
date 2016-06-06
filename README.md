# Smart Home Android Client

# Background
This app is a part of a project that started as a assigment during "Project and project method" course at KTH. 
Goal with this project was to study and practice working in a Scrum project.

Our group's assigment was using Raspberry PI for server and Tellstick Duo for communication with different devices 
create a simple Smart Home system to controll different devices from an Android application.

![Deployment diagram](https://cloud.githubusercontent.com/assets/16079780/15835352/dc2c5d4c-2c2f-11e6-86eb-3dee60238078.PNG "Deployment diagram")

Primary functionality of this AndroidClient: 
* To list and controll devices
* To add new devices
* To see schedule of scheduled controll events
* To add new scheduled events

Due to limited time that all that was nessesary for this cource, but a lot more work to be done. Server for this system can be found here: https://github.com/WolfAlexander/SmartHomeServer 

# Details 
Structure: Model-View-Controller
With Android app it is not possible to follow MVC strictly (as I understood) because Activities is kind of Views and Controllers in same
box, but we tried to create some kind MVC to simplify our work - so we see each Activity as View and its own Controller and then we have
a general controller for the functional part of the app.

Other patterns:
* Singleton - there is not need for many object to have multiple instances, for example UIFactory
* Factory - factory pattern is used for creation of different GUI object that had to be created programatically since the depended on data recieve from sever
* Observer - to display and update data recieved from server, for example list of devices

Connection to server:
The idea from the beginning was to user SSL Sockets, but some problem of occured with sertificates on client side so that was 
putted away for now since other functionality is more crucial for this cource. So we user usual Sockets. We communicate with server
using our own DTO:s so we have a kind of our own "protocol".

This app is my and Ulrika Lageström's(teammate) first attempt to create Android applications, but it went well.
