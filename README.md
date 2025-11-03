# Number Guessing Game (Java)

A simple command-line number guessing game written in Java. The program picks a random number between 1 and 100 and asks the player to guess it, giving hints like “too high” or “too low” until they get it right.

### Features
- Random secret number between 1 and 100
- Input validation (rejects non-numeric input)
- Hints for high/low guesses
- Simple, self-contained single-class app

### Project Structure
```
number_guessing_game/
├─ README.md
├─ src/
│  └─ main/
│     └─ java/
│        └─ guessing_game/
│           └─ GuessingGame.java
```

### Prerequisites
- Java JDK 17+ (earlier versions may work, but 17 is recommended)
- A terminal (Command Prompt or PowerShell on Windows)

### How to Build and Run
Build into the generated `out/` directory and run from there.
Note: the `out/` folder is created by the compiler and is git-ignored in this repo.

#### Option A: Compile from source
1. Open a terminal in the project root folder: `C:\Users\AldoryWaltrick\Desktop\JavaProjects\number_guessing_game`
2. Compile:
   ```powershell
   javac -d out src\main\java\guessing_game\GuessingGame.java
   ```
3. Run:
   ```powershell
   java -cp out guessing_game.GuessingGame
   ```


### Usage
Example session:
```
Guess a number between 1 and 100
Enter your guess:
50
Your guess is too high.
Enter your guess:
25
Your guess is too low.
Enter your guess:
32
You guessed right!
```


### How It Works (Brief Overview)
- Uses `java.util.Random` to pick a secret number from 1 to 100.
- Reads user input with `java.util.Scanner`.
- Validates input, prompting again if it’s not an integer.
- Compares the guess against the secret number and prints hints until correct.

### Potential Improvements
- Add attempt counter and display attempts on success
- Add configurable range (e.g., via command-line arguments)
- Add replay option without restarting the program
- Add difficulty levels and a maximum number of attempts
- Write unit tests for input handling and comparison logic

### License
Licensed under the MIT License. See the `LICENSE` file for details.

### Contributing
Pull requests and suggestions are welcome. For larger changes, please open an issue to discuss what you’d like to change.
