# SpringBootJPA
RESTapi zapisujące i odczytujące książki do bazy danych MySQL.

# Wymagania
- Docker
- JDK 11
- Maven

# Uruchomienie bazy danych
`
docker-compose up
`

# Uruchomienie aplikacji
`
mvn spring-boot:run
`

# Przykład użycia

## Dodanie książki
`
curl -d @example.json -H "Content-Type: application/json" -X POST http://localhost:8080/books
`

## Pobranie książek
`
curl --request GET http://localhost:8080/books
`