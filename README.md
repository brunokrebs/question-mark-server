Runs a dockerized instance of postgres:

```bash
docker run --name questionmark-psql \
    -p 5432:5432 \
    -v /tmp/postgresql:/var/lib/postgresql \
    -e POSTGRES_PASSWORD=mysecretpassword \
    -e POSTGRES_DB=questionmark \
    -d postgres
```