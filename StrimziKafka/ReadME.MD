# Check to see what minikube you are using 
kubectl config current-context
should be: jamietest

# Commands  
Here I will put the commands i will use when calling the strimzi yaml files.

https://www.youtube.com/watch?v=4bKSPrENDQQ



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