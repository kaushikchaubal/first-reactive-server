# first-reactive-server
A hello-world example of a reactive HTTP server which uses the reactor libraries

## Starting it up
This is a standard maven project using Spring Boot and can be imported in any IDE of your choice. Once imported, resolve the maven dependencies. Finally, start the `FirstReactiveServer` class.

The server end-point should be available at:

    http://localhost:8080/api/helloWorld

## Demo of Reactive Streams in the Browser
This is the expected result of viewing the server end-point in a browser (Note how the entire response is returned in only one HTTP call): 

![](http://g.recordit.co/NXwRi8GPPz.gif)
