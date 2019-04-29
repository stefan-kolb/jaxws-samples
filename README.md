# JAX-WS Samples

*Sample projects using JAX-WS technologies.*

Almost all sample projects can be run as standalone projects using `gradle run` and are ready to use with JDK 11 or higher.
This is also the recommended way.

Furthermore, the build files use the [Gradle Cargo plugin](https://github.com/bmuschko/gradle-cargo-plugin) for auto-deployment to Glassfish 4.
For the available Gradle tasks see [the documentation](https://github.com/bmuschko/gradle-cargo-plugin#tasks).
Please see the [cargo documentation](https://codehaus-cargo.github.io/cargo/Glassfish+4.x.html) for the default configuration of the used application server.
The plugin will download and install the server automatically for each project. The admin interface can be found at `http://admin:adminadmin@localhost:4848`.
However, the plugin currently works reliably only with JDK 8.

When Gradle is installed on your system all tasks can be run directly from the sub-project's root folder, e.g. `gradle war`. Otherwise you can use the Gradle wrapper from the root and use an absolute path like `gradlew java-first:minimal:war`.

Use `gradlew eclipse` to generate Eclipse project files for all of the modules.
This also works for IntelliJ IDEA with `gradlew idea`.

## Contents
- [Java-first Web Services](#java-first)
- [Deployment Styles](#deployment-styles)
- [WSDL-first Web Services & Client Generation](#ws-client)
- [Data Type Mapping](#type-mapping)
- [Method Overloading](#method-overloading)
- [Exceptions](#exceptions)
- [WSDL Styles](#wsdl-styles)

## Java-first
Simple bottom-up JAX-WS example. The Web service returns German chancellors that reigned in a given period of time.

### Minimal
Minimal example for exposing a Web service with JAX-WS annotations.
The project can be run as a standalone service via `gradlew java-first:minimal:run`.
The Web service should be available at `http://localhost:8080/minimal/HistoryService`.

### Custom
In this example more annotations are used to override default conventions of JAX-WS, e.g. the naming of parameters or return types.
The project can be run as a standalone service via `gradlew java-first:custom:run`.
The Web service should be available at `http://localhost:8080/custom/HistoryService`.


## Deployment-styles
Demonstrates several JAX-WS deployments as a standalone application, on JSR 109-compatible application servers (e.g. Glassfish) and Tomcat.

### Standalone
The standalone project uses `javax.xml.ws.Endpoint` to run a server instance. It is the simplest way to expose an experimental JAX-WS Web service.
Run the project via `gradlew deployment-styles:standalone:run`.
The Web service should be available at `http://localhost:8080/standalone/GreetingsService`.

### JSR 109
**Notice**: The plugin used in this example only runs reliably with JDK 8. With a newer JDK, there might be problems.  
To deploy the sample to Glassfish run `gradle cargoRunLocal`.
The Web service should be available at `http://localhost:8080/jsr109/GreetingsService`.

### Tomcat
Tomcat needs additional deployment descriptors and the JAX-WS implementation in order to run JAX-WS Web services.
Build with `gradle war` and manually deploy to a Tomcat instance.


## WS-client
Demonstrates the usage of the *wsimport* tool to generate Web Services interfaces and clients using a top-down approach. First run the [*java-first:custom*](#java-first) project in order to be able to access the service with the wsimport client. Use `gradle run` to run the web services test client.

### Dynamic WS Client
Demonstrates the creation of a Web service client without additional code generation.

### Wrapper-style vs. Plain-style
See [this blog](http://myarch.com/wrappernon-wrapper-web-service-styles-things-you-need-to-know/) for an explanation.


## Type-mapping
Demonstrates type mappings from Java to WSDL/XSD and vice versa.

### Java2Wsdl
The project can be run as a standalone service via `gradlew type-mapping:java2wsdl:run`.
The mapped WSDL should be available at `http://localhost:8080/wsdl2java/Wsdl2JavaService?wsdl`.

### Wsdl2Java
The Java artifacts can be generated via `gradle wsimport`.


## Method-overloading
Demonstrates the mapping of overloaded Java methods via custom mappings.
The project can be run as a standalone service via `gradlew method-overloading:run`.
The Web service should be available at `http://localhost:8080/method-overloading/VolumeService`.


## Exceptions
Demonstrates the mapping of standard Java exceptions and soap-style exceptions with JAX-WS. Each Exception type has a corresponding client project to demonstrate the WSDL mapping to Java stubs.

### Java Exception & Java Exception client
Demonstrates the problem of mapping a standard-like Java Exception to SOAP faults.
If the Exception does not follow this style, JAX-WS will generate a wrapper class and the Exception will be put in the FaultBean class.
The project can be run as a standalone service via `gradlew exceptions:java-exception:run`.
The Web service should be available at `http://localhost:8080/java-exception/FaultService`.
The Java artifacts can be generated via `gradle wsimport`.

### Custom fault & Custom fault client
Demonstrates a custom Java Exception implementation that maps the SOAP fault structure.
The project can be run as a standalone service via `gradlew exceptions:custom-fault:run`.
The Web service should be available at `http://localhost:8080/custom-fault/FaultService`.
The Java artifacts can be generated via `gradle wsimport`.

### SOAP fault
Uses the `SOAPFaultException` implementation. More information about SOAP faults can be found [here](http://docs.oracle.com/cd/E19159-01/819-3669/bnbin/index.html).


## Wsdl-styles
Demonstrates the several WSDL styles rpc-encoded, rpc-literal, document-literal and document-literal wrapped.
See [this blog](http://www.ibm.com/developerworks/library/ws-whichwsdl/) for a detailed explanation.

### Document-literal
The Web service should be available at `http://localhost:8080/document-literal/GreetingsService`.

### Document-literal-wrapped
The Web service should be available at `http://localhost:8080/document-literal-wrapped/GreetingsService`.

### Rpc-encoded
No longer supported by JAX-WS 2.

### Rpc-literal
The Web service should be available at `http://localhost:8080/rpc-literal/GreetingsService`.
