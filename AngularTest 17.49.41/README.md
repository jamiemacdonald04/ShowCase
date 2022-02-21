# Project
This project was set up using Docker and docker compose.  This allows angular to be run/developed on a docker machine rather than installing ng on my mac.  This is pretty clever.

docker-compose up 
or
docker compose up 

# Tests
To run tests I needed to include docker in the docker file and the env var for CHROME_BIN.  I then needed add the following to the karma.conf.js. 
```
    customLaunchers: {
      ChromeHeadlessNoSandbox: {
        base: 'ChromeHeadless',
        flags: ['--no-sandbox']
      }
    },
```

The unit test i have defined are in the clock component.

# Component
The clock component is the component added by my self and has a clock with different times.  Each time-zone has its own style sheet. Each time is tested and outputed on the page.  

# DevEnvTest

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 13.0.1.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.
