
- https://mohitdtumce.medium.com/getting-started-with-dropwizard-44317b4b41be

- Having empty run method will start the server. Need to add `server src/main/resources/config.yml` in run configuration.
- To run the jar file, use the `com.gradleup.shadow` plugin and run `shadowJar` task to create the jar file. `java -jar build/libs/your-jar-name.jar server src/main/resources/config.yml` will start the server.
