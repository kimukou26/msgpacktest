def eventClosure1 = binding.variables.containsKey('eventSetClasspath') ? eventSetClasspath : {cl->}
eventSetClasspath = { cl ->
    eventClosure1(cl)
    if(compilingPlugin('msgpack')) return

    def manager = griffonSettings.dependencyManager
    manager.parseDependencies {
           repositories {
                griffonPlugins()
                griffonHome()
                griffonCentral()

                mavenLocal()
                mavenCentral()

                mavenRepo "http://msgpack.org/maven2/"
                mavenRepo "http://download.java.net/maven/2/"
                mavenRepo "http://repository.jboss.org/maven2/"
                mavenRepo "http://repository.jboss.org/nexus/content/groups/public-jboss"
           }
           dependencies  {
               //runtime name:"easy", classifier:"plugin", version:"latest.integration"
                // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
                // runtime 'mysql:mysql-connector-java:5.1.5'
                compile group: 'commons-cli', name : 'commons-cli', version: '1.2'
                compile group: 'org.msgpack', name: 'msgpack', version: '0.5.2-devel'

                //Å°need 1.5.1 upper place into http://repository.jboss.org/maven2/
                compile 'org.slf4j:slf4j-api:1.5.8'
                compile 'org.slf4j:slf4j-log4j12:1.5.8'
                compile 'javassist:javassist:3.12.1.GA'
                // runtime 'mysql:mysql-connector-java:5.1.13'

                compile "org.msgpack:msgpack-rpc:0.6.1-devel"
                runtime "org.msgpack:msgpack-rpc:0.6.1-devel"

           }
     }
}

