# camille_project
Camille Project

This repository is to showcase my programming skills journey.  I will begin with learning the foundational concepts of programmming, working up to more advance concepts in languages such as Java and Go.
Java is a great language to begin learning as it is object-oriented, widely used and incorporates great foundational concepts of programming.

**Ways of Working**

Projects will be moved from the Backlog and tickets worked on and reviewed weekly.

Rules:

* Main branch must be protected
* PRs need review
* PRs must have comments addressed
* PR checks must be green


Day to day:

* Issues must be regularly updated with current status
* Branch Names should follow a standard naming convention, by issue name and what the branch is working on e.g:
  * data-struc/exercise-1
* Commits should state what has been modified
* PRs must be linked to and issue: which will be done by linking it in its description
* README to be updated in detail on each exercise as each area of the project is developed.


# Usage

A Makefile was created and should be our interface for all commands.
Usage is `make <taskName>`
Created a basic java application that has the following makefile tasks:
* build-java - builds the app
* test-java - executes tests
* run-java - runs the application