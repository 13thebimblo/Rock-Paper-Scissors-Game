# Rock-Paper-Scissors-Game

### Basic RPS simulator

## *Tools used*
- Language: Java
- Compiler: VSCode
- Version: 0.0


## Pseudocode
1. Players choose rock, paper, or scissors
    1. Represent choices with a `int`
        1. 1 - rock
        2. 2 - paper
        3. 3 - scissors
    2. Store choices
        1. Prompt `Scanner` object `nextInt()`
        2. `int playerOneChoice`
        3. `int playerTwoChoice`
2. Count down and reveal choices on "shoot"
    1. `Thread.sleep()` to artificially wait
3. Compare choices of players
    1. Rock beats scissors
    2. Scissors beats paper
    3. Paper beats rock
    4. Redo if choices are the same
