# Data Demo

## goal

- to demonstrate a data flow from a structured RDBMS to MongoDB via NIFI
- to demonstrate visualization and discovery on top of MongoDB
- to demonstrate the use of docker as a container base for the datasets

## components

| component | description |
|-----------|-------------|
| mysql | source emulation |
| nifi | etl emulation |
| mongodb | target emulation |
| redash | visualization emulation |
| docker | container emulation |
| vagrant | host standup |
| virtualbox | vm emulation |

## process

- establish docker host via vagrant
  - use vagrant up
  - specify a "local" box to load from
- pull necessary components into the docker host environment
- establish sample scripts into the docker host environment
- start up the containers using docker-compose
- populate source
- expose for use
