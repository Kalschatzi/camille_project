.PHONY: build-java
build-java:
	cd java-service && ./gradlew :build -x test

.PHONY: test-java
test-java:
	cd java-service && ./gradlew :test


.PHONY: run-java
run-java:
	cd java-service && ./gradlew :run