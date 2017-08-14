Runs a dockerized instance of postgres:

```bash
docker run --name questionmark-psql \
    -p 5432:5432 \
    -v /tmp/postgresql:/var/lib/postgresql \
    -e POSTGRES_PASSWORD=mysecretpassword \
    -e POSTGRES_DB=questionmark \
    -d postgres
    
docker start questionmark-psql
```

```bash
# issues a get request to exams endpoint
curl http://localhost:8080/exams

# add a new exam
curl -X POST -H "Content-Type: application/json" -d '{
    "title": "First exam",
    "description": "Just a test" 
}' http://localhost:8080/exams

# update first exam
curl -X PUT -H "Content-Type: application/json" -d '{
    "title": "First exam!",
    "description": "Just a test" 
}' http://localhost:8080/exams/2

curl -X PUT -H "Content-Type: application/json" -H "Accept-Language: pt-BR" -d '{
    "title": "First exam!",
    "description": "Just testing edit feature" 
}' http://localhost:8080/exams/1
```