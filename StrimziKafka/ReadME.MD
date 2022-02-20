# Check to see what minikube you are using 
kubectl config current-context
should be: jamietest

# Commands  
Here I will put the commands i will use when calling the strimzi yaml files.

https://www.youtube.com/watch?v=4bKSPrENDQQ

https://strimzi.io/docs/operators/in-development/configuring.html

kubectl config get-contexts

kubectl config use-context jamietest

 # Write to file 
curl -L0 https://strimzi.io/install/latest -o Kafka.yaml

# Change the namespace and then write to file 
curl -L0 https://strimzi.io/install/latest | sed 's/namespace: .*/namespace: strimz/' > kafka.yaml 

# change the namespace and then write directly to kubectl 
curl -L0 https://strimzi.io/install/latest | sed 's/namespace: .*/namespace: default/' | kubectl apply -f -

---------------------------------------------------------------------
# Persistant storage 
curl -L0 https://strimzi.io/examples/latest/kafka/kafka-persistent.yaml > PersistentStorageKafkaCluster.yaml

external:
    name: loadbalancers
    type: external
    tls: false

kubectl apply -f PersistentStorageKafkaCluster.yaml

# Dashboard 
minikube dashboard
 

# Minikube tunnel 
minikube tunnel
machines password 

# get the address to contact kafka
kubectl get kafka harvey -o yaml 
harvey-kafka-bootstrap.default.svc:9093

------------------------------------

# Set Up Minikube
minikube start -p jamietest 

minikube tunnel -p jamietest 
user machine password and must run when you are runnning minikube to get load balancers to work.

kubectl config current-context

kubectl config use-context jamietest

# install kafka
kubectl create namespace ckafka

kubectl create -f 'https://strimzi.io/install/latest?namespace=ckafka' -n ckafka

download and add listeners so that you can get external access 
curl -L0  https://strimzi.io/examples/latest/kafka/kafka-persistent-single.yaml > PersistentStorageKafkaCluster.yaml

kubectl apply -f PersistentStorageKafkaCluster.yaml -n ckafka

kubectl get pods -n ckafka
kubectl get kafka -n ckafka

# edit config files 
kubectl edit kafka "new-test-cluster" -n ckafka
i=edit 
esc=finished edit 
:wq=save
:q!=quit

here is set tls to true for loadbalancer

# getting the cert and the password
kubectl get secret jamie-cluster-cluster-ca-cert -n ckafka -o jsonpath='{.data.ca\.p12}' | base64 -d > ca.p12
kubectl get secret jamie-cluster-cluster-ca-cert -n ckafka -o jsonpath='{.data.ca\.password}' | base64 -d

kubectl get secret jamie-cluster-clients-ca-cert -n ckafka -o jsonpath='{.data.ca\.p12}' | base64 -d > ca.p12
kubectl get secret jamie-cluster-clients-ca-cert -n ckafka -o jsonpath='{.data.ca\.password}' | base64 -d


