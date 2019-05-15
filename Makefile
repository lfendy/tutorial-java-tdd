DOCKER_IMAGE_NAME=tddtutorial

.PHONY: dockerbuild
dockerbuild:
	docker build . -t ${DOCKER_IMAGE_NAME}

.PHONY: shell
shell:
	docker run -it -v`pwd`:/app -v`pwd`/../m2:/root/.m2 ${DOCKER_IMAGE_NAME} bash

.PHONY: compile
compile:
	docker run -it -v`pwd`:/app -v`pwd`/../m2:/root/.m2 ${DOCKER_IMAGE_NAME} mvn compile

.PHONY: test
test:
	docker run -it -v`pwd`:/app -v`pwd`/../m2:/root/.m2 ${DOCKER_IMAGE_NAME} mvn test

