<h2>ExploreMore Startup</h2

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 14.0.1.

##Getting started with the program in VScode

Copy HTTPS code from frontend project and in the command line type `git clone <HTTPS link>`
Open file in your VSCode and open a terminal in the project with “Ctrl + ` ”
In the terminal run the line `npm install` to install the npm packages or `npm install -force`
If an update is needed run the line `npm update`

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.
Optionally run `ng serve -o` for VScode to open the server for you.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Docker Compose YML File and Dockerfile configurations for Dockerizing the project on Angular

```Dockerfile:
FROM nginx:latest
COPY dist/project3-frontend /usr/share/nginx/html
#COPY dist/frontend /usr/share/nginx/html
```

```docker- compose.yml file:
version: '3'
services:
  angular-service:
    image: exploremore-frontend
    build: .
    ports:
      - 5200:80
```

## To Run The Docker Container in a development or production server:

In a command line / terminal of the project directory root run:

```
docker-compose down
docker-compose up -d 
```
