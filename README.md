# JUnit5-Assertions-example

### Introduction
> JUnit5- JUnit is a unit test framework. It is opensource java library.
  To test our code (class), we need to define one class that is called 
  as Test case (Test class).

### To define one Test case we should use
- JUnit 5 Annotation <br>
- JUnit 5 Assert API

### Required Tools & Applications
- XAMPP or MYSQL server -[XAMPP](https://www.apachefriends.org/download.html)
- Editor or IDE - [STS Ide](https://spring.io/blog/2019/06/20/spring-tool-suite-3-9-9-released)


<details><summary>Application Configurations & Dependecies</summary>
<p>
    
- POM.xml
```xml
    
  <project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>in.nit</groupId>
	<artifactId>JUnit5AssertEx</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	
	
	<properties>
		<maven.compiler.source>1.8</maven.compiler.source>
		<maven.compiler.target>1.8</maven.compiler.target>
	</properties>


	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine -->
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.7.1</version>
			<scope>test</scope>
		</dependency>
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>6.0.4</version>
</dependency>

	</dependencies>
	
</project>
    
```
</p>  
