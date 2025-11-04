## Gomoku (Terminal-Based Java Game)

A console-based **Gomoku** (Five in a Row) game implemented in Java, featuring both player vs computer gameplay and adjustable difficulty levels.

# Features

- Play against the **computer** in a turn-based Gomoku match.

- **Difficulty options:**
  - *Normal mode* – computer plays with basic logic.  
  - *Hard mode* – computer uses weighted evaluation for smarter moves.  
- **Turn selection:** choose to play **first or second**.  
- **Quit anytime** – players can exit the game gracefully.  
- **Recursive AI logic** – computer decisions use recursive evaluation.  
- **File I/O integration** – game board state is stored and read from text files.  
- **Object-Oriented Design** – encapsulated methods handle gameplay, checking, and file management.  
- **Win detection** – automatically checks for 5-in-a-row horizontally, vertically, or diagonally.

# How to Play

1. Compile and run the program:
**Gomoku.java**

2. Choose your preferred difficulty:
**Normal / Hard**

3. Choose who goes first (player or computer).

4. Enter your move coordinates (row, column) when prompted.

5. The game alternates turns until someone wins or you choose to quit.

# Technical Details

**Language:** Java

**Concepts used:**

Recursion

File I/O (reading/writing game state)

Arrays and data structures

Object-Oriented Programming (encapsulation, modular functions)

Control flow and input validation

# Requirements

Java 8 or later

Terminal or command prompt for running the program

# Future Improvements

- Add GUI using JavaFX or Swing

- Implement save/load feature for ongoing games

- Enhance AI using Minimax algorithm with alpha-beta pruning

# Author

Yi Xing

December 2023
