FROM python:3

# copy run
COPY run.sh /app

# make it executable
RUN chmod 0755 run.sh

# set the entry point 
ENTRYPOINT ["./run.sh"]