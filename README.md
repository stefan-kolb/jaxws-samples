# JAX-WS Samples

*Sample projects using JAX-WS technologies.*

The build files use the [Gradle Cargo plugin](https://github.com/bmuschko/gradle-cargo-plugin) for auto-deployment to Glassfish 4.
For the available Gradle tasks see [the documentation](https://github.com/bmuschko/gradle-cargo-plugin#tasks). 
The plugin will download and install the server automatically for each project. The admin interface can be found at `http://admin:adminadmin@localhost:4848`. If not used in conjunction with `gradle cargoRunLocal`, make sure all deployment artifacts were created before starting the server.
When Gradle is installed on your system all tasks can be run directly from the sub-project's root folder, e.g. `gradle war`. Otherwise you can use the Gradle wrapper from the root and use an absolute path like `gradlew java-first:minimal:war`.

## Java-first
Simple bottom-up JAX-WS example. The Web service returns German chancellors that reigned in a given period of time.

### Minimal
Minimal example for exposing a Web service with JAX-WS annotations.
The Web service should be available at `http://localhost:8080/minimal/HistoryService`.

### Custom
In this example more annotations are used to override default conventions of JAX-WS, e.g. the naming of parameters or return types.
The Web service should be available at `http://localhost:8080/custom/HistoryService`.

## Deployment-styles
Demonstrates several JAX-WS deployments on JSR 109-compatible application servers (e.g. Glassfish), Tomcat and as a standalone application.

### JSR 109
To deploy the sample to Glassfish just run `gradle cargoRunLocal`.
The Web service should be available at `http://localhost:8080/jsr109/GreetingsService`.

### Tomcat
Tomcat needs additional deployment descriptors and the JAX-WS implementation in order to run JAX-WS Web services.
Build with `war` and manually deploy to a Tomcat instance.

### Standalone
The standalone project uses `javax.xml.ws.Endpoint` to run a server instance. It is the simplest way to expose an experimental JAX-WS Web service. The Web service should be available at `http://localhost:8080/standalone/GreetingsService`.

## Wsimport-client
Demonstrates the usage of the *wsimport* tool to generate Web Services interfaces and clients using a top-down approach. First run the [*java-first:custom*](#java-first) project in order to be able to access the service with the wsimport client. Use `gradle run` to run the web services test client.

### Wrapper-style vs. Plain-style
See [this blog](http://myarch.com/wrappernon-wrapper-web-service-styles-things-you-need-to-know/) for an explanation.

## Type-mapping
Demonstrates type mappings from Java to WSDL/XSD and vice versa.

### Java2Wsdl
The mapped WSDL should be available at `http://localhost:8080/java2wsdl/Java2WsdlService?wsdl`.

### Wsdl2Java
The Java artifacts can be generated via `gradle wsimport`.

## Method-overloading
Demonstrates the custom WSDL mapping of overloaded Java methods.

## Exceptions
Demonstrates the mapping of standard Java exceptions and soap-style exceptions with JAX-WS.

## Wsdl-styles
Demonstrates the several WSDL styles rpc-encoded, rpc-literal, document-literal and document-literal wrapped.