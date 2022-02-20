FROM node:lts

# Install global npm packages
RUN npm i -g @angular/cli

# Set working directory
WORKDIR /usr/src/app

# Copy and install local npm packages
COPY package.json* package-lock.json* ./
RUN npm install

# update
RUN apt-get update

# get chrome
RUN apt-get install chromium -y

# set chrome to run in container
ENV CHROME_BIN='/usr/bin/chromium'

# Copy the remaining source code
COPY . .
