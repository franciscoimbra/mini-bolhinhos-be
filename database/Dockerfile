# Use the official PostgreSQL base image
FROM postgres:latest

# Set environment variables
ENV POSTGRES_DB=mydatabase
ENV POSTGRES_USER=user
ENV POSTGRES_PASSWORD=mypassword

# Expose the PostgreSQL port
EXPOSE 5432

# You can optionally add your own SQL scripts to initialize the database
# COPY init.sql /docker-entrypoint-initdb.d/

# The CMD instruction sets the default command to run when the container starts
CMD ["postgres"]
