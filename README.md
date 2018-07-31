To reproduce
============

1. get an instance with libc 2.19, for example:

```
gcloud compute instances create <NAME> --image-family=cos-stable --image-project=cos-cloud --scopes cloud-platform --machine-type=n1-standard-4
```

2. run:

```
docker run --rm docker.io/ravwojdyla/tf190bug
```

Building
========

To create your own image:

```
mvn clean package docker:build
```
