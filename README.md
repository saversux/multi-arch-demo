# multi-arch-demo

Simple quarkus service that prints the architecture of the machine it is running on during startup

## Build 

You can use one of the two Dockerfiles in src/main/docker:

1. Dockerfile.jvm for a traditional jar file deployment to a docker image
2. Dockerfile.native for a multi-stage native image build

## Github Actions

This repo contains a Github Workflow that builds Dockerfile.native for arm64 and amd64
and pushes both images to ghcr.io