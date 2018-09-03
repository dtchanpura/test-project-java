all: build

build:
	mvn package

clean:
	rm -rf target/*
