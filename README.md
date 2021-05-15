# Number Increase
Asynchronously  increase the number in database.

JMX File Name: `jmeter.jmx`

## Requirements
-   Java
-   MySql
-   Apache Tomcat
-   Maven
-   Jmeter

##Configuration
In `src/main/resources/application.properties` replace `DB_NAME`, `DB_USERNAME` & `DB_PASSWORD` with your database details. You may also replace `localhost` with your database hostname, `3306` with your database port number and `8081` with desired port where you want to run this application.

##Run
1) Clone or download the repository.

```
git clone https://github.com/anantjain6/num-inc
```

2) On Terminal or Command Prompt change directory to that of this project.

```
cd num-inc
```

3) Run with maven

```
./mvnw spring-boot:run
```

4) By default application will run at `http://localhost:8081`

## Contribution Guildlines
-    Raise an issue for enhancement, new feature, bug report etc.
-    Folk this repository
-    Create new branch in your folked repository
-    Do changes in that new branch
-    Raise a pull request to master branch. Do mention the respective issue in the pull request.

## License

This project is licensed under the MIT License
