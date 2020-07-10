Implements an endpoint which when given country code should return country information
Example  GET- http:/localhost:8080/BHR should return:
{
"name": "Bahrain"
"continent": "Asia"
"population":617000
"life_expectancy":73
"country_language":"Arabic"
}


uses this database https://github.com/ghusta/docker-postgres-world-db

Java8, Spring, PostgreSQL, Maven, Mockito, JUnit