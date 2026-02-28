**Repository Overview**
- **Purpose**: Small BlueJ/Java teaching examples and exercises — simple console programs that demonstrate arrays, ArrayList, Scanner input, and basic control flow.
- **Key files**: `Bus.java`, `Student.java`, `SimpleNumber.java`, and their BlueJ context files `*.ctxt` and `package.bluej`.

**Big Picture / Architecture**
- **Single-file console apps**: Each main example is a self-contained class with a `main` method (no external frameworks or libraries). Examples live at repository root and are not organized into packages.
- **Data flow**: Programs read or define arrays/collections in-memory and print to STDOUT. `Student.java` demonstrates `Scanner` input and dynamic `ArrayList` population.
- **Why this structure**: This repo is structured for teaching — minimal friction, easy to compile/run from command line or BlueJ. Avoid adding complex build systems.

**What to avoid editing**
- **Do not edit**: compiled artifacts (`*.class`) and BlueJ context files (`*.ctxt`, `package.bluej`) unless you know BlueJ behavior — these are generated/used by the IDE.

**Build / Run / Debug workflows**
- **Quick compile & run (terminal)**:
```
javac *.java
java Student
```
- **Run a specific example**: compile then run the class with `main`. E.g., to run the Bus example:
```
javac Bus.java
java Bus
```
- **BlueJ**: Open the project in BlueJ (open folder). BlueJ will use `*.ctxt` and `package.bluej` — prefer the BlueJ UI to compile/run when iterating with that IDE.
- **Inputs**: `Student.java` expects an integer `n` followed by `n` lines (entered via console). Keep that behavior when writing tests or sample runs.

**Project-specific conventions & patterns**
- **No packages**: All classes are in the default package — when adding new classes, follow this pattern unless intentionally introducing packages.
- **One public class per file**: Each `.java` file defines a single public class named after the file.
- **Console-first I/O**: Examples use `System.out.println` and `Scanner` — prefer simple console interactions for new examples.

**Examples from the codebase**
- `Bus.java`: demonstrates arrays, loops (for, enhanced-for), and computing averages.
- `SimpleNumber.java`: iterates an `int[]`, computes sum and average, prints results.
- `Student.java`: uses `Scanner`, reads `n`, builds an `ArrayList<String>` from input, and mutates an in-memory `String[]`.

**Suggested agent behavior when editing this repo**
- **Preserve teaching intent**: Make minimal, clear edits. Favor small, focused examples rather than adding complex dependencies.
- **Keep build simple**: Don’t introduce Maven/Gradle unless the user asks. If you must, add migration notes and a minimal `pom.xml` or `build.gradle` and update README.
- **Avoid modifying**: `.ctxt`, `package.bluej`, and any `.class` files — these are IDE artifacts.
- **If adding examples**: follow existing style—single-file program, descriptive `main` examples, in-repo README update with usage instructions.

**Where to look for more context**
- `README.TXT` — placeholder project README; update it when adding features or exercises.
- `Bus.java`, `Student.java`, `SimpleNumber.java` — canonical examples to mirror when adding new content.

**Quick checklist for PRs / edits**
- Compile locally: `javac *.java` and run affected `main` classes.
- Do not commit `*.class` or `.ctxt` changes unless the change intentionally updates a BlueJ project state and is described in PR.
- Update `README.TXT` when adding or modifying examples.

If anything here is unclear or you'd like more explicit examples (unit tests, a small harness, or a BlueJ-run checklist), tell me which you'd prefer and I will update this file.
