# base image and alias to reference in build 2
FROM python:3 as builder

# The working directory
WORKDIR /app

# The incomming arguments
ARG USERNAME
ARG PASSWORD

# install in prerequisite
COPY requirements_grpc.txt /app/requirements.txt

RUN apt-get update && \
    pip install --upgrade pip && \
    pip install -r requirements.txt

# do your artifactory call
RUN pip install [Name of library]==[version] -i "https://${USERNAME}:${PASSWORD}[ARTIFACTOR URL]"
	
# build 2 - main build
FROM python:3

# The working directory
WORKDIR /app

# Local argument variable to reference
ARG python_path="/usr/local/lib/python3.8/site-packages"

# copy app folder here
COPY [BuildFolder] /app
# remove cache
RUN rm -fr /app/__pycache__

# Add the pip install
RUN apt-get update && \
    pip install --upgrade pip && \
    pip install -r requirements.txt

# copy the data accross to your new build
COPY --from=builder "${python_path}/[libraryFolder]" "${python_path}/[LibraryFolder]/"
COPY --from=builder "${python_path}/[libraryFile]" "${python_path}/[libraryFile]"


# build your python.
RUN python setup.py build
