# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Repository Purpose
This is a competitive programming practice repository for solving Baekjoon Online Judge problems, organized for systematic tier climbing and algorithm practice.

## Languages and Structure
- **Java**: Primary language in `src/solution/` directory with package `solution`
- **C++**: Secondary language in `cpp/` directory
- **File naming**: `QuestionXXXX.java` or `QuestionXXXX.cpp` where XXXX is the Baekjoon problem number

## Common Commands

### Java Development (IntelliJ IDEA project)
- **Compile**: Use IntelliJ IDEA built-in compiler (compiles to `out/production/CodingTest-Baekjoon/`)
- **Run single solution**: Run the main method of specific Question class
- **Source folder**: `src/` is configured as source root

### C++ Development  
- **Compile**: `g++ -o QuestionXXXX.exe QuestionXXXX.cpp` (from cpp/ directory)
- **Run**: `./QuestionXXXX.exe` or `QuestionXXXX.exe`
- **Clean**: Remove `.exe` files when needed

## Code Architecture

### Java Solutions Pattern
- All solutions use `BufferedReader`/`BufferedWriter` for efficient I/O
- Standard structure: read input → process algorithm → output result
- Package declaration: `package solution;`
- Exception handling with `throws IOException`

### C++ Solutions Pattern  
- Uses standard competitive programming libraries: `<iostream>`, `<string>`, `<stack>`, `<vector>`, `<algorithm>`
- Efficient I/O with `cin`/`cout`
- Korean comments explaining algorithm approaches

### Problem Organization
Compiled Java classes are organized by difficulty:
- `class01/`, `class02/` - Basic levels
- `level3/` through `level8/` - Progressive difficulty  
- `silver4/` - Baekjoon tier-based categories
- `others/` - Miscellaneous problems

## Development Workflow
1. Create new solution file with proper naming convention
2. Implement algorithm with efficient I/O patterns
3. Test with sample inputs/outputs from problem description
4. Commit with descriptive messages (repository uses emoji prefixes)
5. Both languages can be used for the same problem if needed

## Git Commit Style
The repository uses emoji-prefixed commit messages:
- 🎨 for solved problems
- ♻️ for work in progress
- Follow existing Korean/English mixed commit style