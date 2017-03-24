# Example: Watson Developer Cloud-Java SDK with unreleased okhttp

Build portions of the `master` branch of `okhttp`,
installing the built artifacts into your local Maven repository.

    git clone git@github.com:square/okhttp.git
    ( cd okhttp/okhttp ; mvn install -DskipTests=true )
    ( cd okhttp/okhttp-logging-interceptor ; mvn install -DskipTests=true )
    ( cd okhttp/okhttp-urlconnection ; mvn install -DskipTests=true )

Once you have builds of these okhttp modules available locally,
you can build and run this example code.

    mvn package
    java -jar target/j9experiment-1.0.0-SNAPSHOT-jar-with-dependencies.jar username password

Even if you do not have a username and password for Watson Text to
Speech, this example will indicate if the basic HTTPS connection
works. The following error means the HTTPS connection was successful,
which is goal of this code, even though the login to Watson Text to
Speech failed.

    SEVERE: GET https://stream.watsonplatform.net/text-to-speech/api/v1/voices, status: 401, error: Not Authorized
