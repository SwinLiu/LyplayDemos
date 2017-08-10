# 1. Introduction

Apache ActiveMQ ™ is the most popular and powerful open source messaging and Integration Patterns server.
Apache ActiveMQ is fast, supports many Cross Language Clients and Protocols, comes with easy to use Enterprise Integration Patterns and many advanced features while fully supporting JMS 1.1 and J2EE 1.4. Apache ActiveMQ is released under the Apache 2.0 License

Url: [http://activemq.apache.org/](http://activemq.apache.org/)
Getting Start : [http://activemq.apache.org/getting-started.html](http://activemq.apache.org/getting-started.html)

# 2. Installation

## 2.1 Installation for Windows

### 1.) Download the latest release
download latest releases : [http://activemq.apache.org/download.html](http://activemq.apache.org/download.html)
download past releases: [http://activemq.apache.org/download-archives.html](http://activemq.apache.org/download-archives.html)
(see Download -> "The latest stable release" -> "apache-activemq-x.x.x-bin.zip")

### 2.) Extract the files from the ZIP file into a directory of your choice.

## 2.2 Installation for Windows

same as Windows system.

# 3. Starting ActiveMQ

## On Windows:

From a console window, change to the installation directory and run ActiveMQ:

```
cd [activemq_install_dir]
```

where activemq_install_dir is the directory in which ActiveMQ was installed, e.g., c:\Program Files\ActiveMQ-5.x.
Then type:

```
bin\activemq start
```

## On Linux:

From a command shell, change to the installation directory and run ActiveMQ as a foregroud process:

```
cd [activemq_install_dir]/bin
./activemq console
```

From a command shell, change to the installation directory and run ActiveMQ as a daemon process:

```
cd [activemq_install_dir]/bin
./activemq start
```


# 4. Testing the Installation

http://localhost:8161/admin


# 5. Configuring

## 1.) use username & password.

open `[activemq_install_dir]/conf/jetty.xml` to edit it:

```
    <bean id="securityConstraint" class="org.eclipse.jetty.http.security.Constraint">
        <property name="name" value="BASIC" />
        <property name="roles" value="admin" />
        <property name="authenticate" value="false" />
    </bean>
```
change the `authenticate` to 'true'.

the username & password setup in `[activemq_install_dir]/conf/jetty-realm.properties`:

```
# username: password [,rolename ...]
admin: admin, admin
```


## 2.) change the ActiveMQ ports


### 2-1 .) change the ActiveMQ admin console port

open `[activemq_install_dir]/conf/jetty.xml` to edit it:
```xml
        <property name="connectors">
            <list>
                <bean id="Connector" class="org.eclipse.jetty.server.nio.SelectChannelConnector">
                    <property name="port" value="8161" />
                </bean>
            </list>
        </property>
```
change the port to others.




### 2-2 .) change the ActiveMQ transport

open `[activemq_install_dir]/conf/jetty.xml` to edit it:
```xml
        <transportConnectors>
            <transportConnector name="openwire" uri="tcp://0.0.0.0:61616"/>
        </transportConnectors>
```
change the port `61616` to others.



