# RockPaperScissor
REST API for Rock_Paper_Scissor Game.

It is a microservice where player 1 is user and player 2 is computer itself. Code finds the winner as per below rules. 
1. The Rock beats the Scissors
2. The Scissors beats the Paper
3. The Paper beats the Rock

Player 1 will pass its move through a rest endpoint as parameter and possible values of parameters are "ROCK, PAPER and SCISSOR".<br />
Computer as player 2 will generate random move out of "ROCK, PAPER and SCISSOR". <br />
Winner will be reported appropriately in response, possible values of response "Player wins", "Computer wins", or "It is a tie".<br />

## Installation

This application requires Java 17 to run.<br />
Install the dependencies and devDependencies and start the server.

## API Curls

```sh
https://www.getpostman.com/collections/cfd0d713aa1f9aa1a96d
```

## Unit Tests

Appropriate unit tests have been added. 

## Author
- [@jatin.saini](https://github.com/js-designs-321)
