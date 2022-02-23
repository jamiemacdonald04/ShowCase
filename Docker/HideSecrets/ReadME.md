# Two dev process to hide secrets

This technique is used to stop secrets from being leaked into the resulting container.  Arguments are not immediately available after a build which is intentional.  They do however remain in the container and if someone was able to get hold of that they could manipulate that container and retrieve those details.

To avoid this create a first container that takes your kuberneties secrets as arguments and then copy the what you where trying to achieve into the second build.  The example below is trying to achieve getting an Artifactory library down using authentication.  Authentication aside we are really after those libraries to proceed.
We then move those libraries over into the next build using the copy command and the first build is just discarded.  The first build should be as light as possible, including only the goal to get the Artifactory libraries.

# Finding files

To find files in a system you are not able to replicate perhaps cause the build is locked then use.  Never leave thsi code lying around.
```
    RUN cd /usr/local/lib/python3.8/site-packages/ && echo $(ls)
```
# Create docker image 
Use the following argument from this location to create the docker image pass in the password.

```
export PASSWORD=fila
export USERNAME=joeblogs@twister.au
docker build -t arg-demo --build-arg USERNAME=$USERNAME  --build-arg PASSWORD=$PASSWORD .
```