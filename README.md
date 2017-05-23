# first-reactive-server
A hello-world example of a reactive HTTP server which uses the reactor libraries. Fore more background, check out: projectreactor.io

## Starting it up
This is a standard maven project using Spring Boot and can be imported in any IDE of your choice. Once imported, resolve the maven dependencies. Finally, start the `FirstReactiveServer` class.

The server end-point should be available at:

    http://localhost:8080/api/helloWorld
    
## Live Demo:

This is deployed on Heroku and can be viewed at:

    https://first-reactive-server.herokuapp.com/api/helloWorld

## Viewing Reactive Streams in the browser
When a REST call is made to this server, this is how the network access looks like:

Note how the entire response is returned in only one HTTP call: 

![](http://g.recordit.co/NXwRi8GPPz.gif)
