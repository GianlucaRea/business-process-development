# business-process-development
University Project for the course of Business Process Development at the University of L'Aquila for the Master's Degree in Advanced Software Engineering.

## Description
The project consists of a Camunda Application with the Logic implemented in Java. It simulates the Message Exachange as a Choreografy between entities about the registration of a new Farm. 

## Getting Started

### Dependencies

- Apache Tomcat 8.5.12 
- Camunda Modeler
- Eclipse Neon 4.6.3

### Installing
1. Run git clone for this repository
2. Import all the folders as Maven projects.
3. Maven clean and Update on all projects
4. Maven Build on LocalHealthcareCompany, RegistryOffice, User, Veterinary
5. Define the server and add the Municipaly and Veterinary Regional Register Jars using the add/remove defined in Eclipse
6. Change the port of the server as:
    - Tomcat Admin Port : 6005
    - Http/1.1 : 6060
    - AJP/1.3 : 6009


### Executing program
1. Run as Java Application LocalHealthcareCompany, RegistryOffice, User, Veterinary
2. Open /User/User/src/main/resources/User.bpmn using Camunda
3. Change Deploy port of Camunda Modeler to 7060 and then deploy
4. Start instance in Camunda Modeler
5. Check The Process in the Camunda Dashboard

## Authors
- Gianluca Rea - [gianlucarea](https://gianlucarea.github.io)
- Michele Intrevado - [micheleintrevado](https://github.com/micheleintrevado)


## Version History

- Final
    * The project was delivered as the final exam of the cours


## License

This project is licensed under the MIT License - see the LICENSE.md file for details
