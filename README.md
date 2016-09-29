This project is managed by Maven, and is also an Intellij IDEA project.

### Usage:

	cd /path/to/source/folder
	mvn clean
	mvn compile
	mvn test-compile
	mvn org.pitest:pitest-maven:mutationCoverage
	
### Specification

1. An integer calculator accepts expressions that contain **POSITIVE** integer operands and operators including `+`, `-`, `*`, `/`. Whitespace is allowed and will be omitted when evaluating the expression.
2. The results should be double values.
3. If an expression contains characters which are not valid operators and operands discussed above, an `UnsupportedOperatorException` will be thrown.
4. If the parentheses are not balanced, an `EmptyStackException` will be thrown.
5. If the number of operands cannot fulfil a binary operation, an `EmptyStackException` will be thrown, e.g. `*3`.