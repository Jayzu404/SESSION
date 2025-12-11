E-TECHTORIAL

Loops
What is a Loop?
A loop is a control structure that repeats a block of code until a condition is met.

1. FOR Loop
A for loop is a control structure that repeats a block of code a specific number of times. It uses three control expressions—initialization, condition, and update—to manage the loop's execution and is ideal when you know exactly how many times you want to loop.
Syntax:
javascriptfor (initialization; condition; update) {
  // code
}

2. WHILE Loop
A while loop is a control structure that repeatedly executes a block of code as long as a given boolean condition remains true. It is commonly used when the number of repetitions is unknown and depends on a condition that changes during runtime.
Syntax:
javascriptwhile (condition) {
  // code
}

3. DO WHILE Loop
A do–while loop is a control structure that executes a block of code at least once before checking the condition. After the first execution, it continues looping as long as the condition remains true. It is ideal when the code must run at least once regardless of the condition.
Syntax:
javascriptdo {
  // code
} while (condition);
