// Read the following code and, without executing it first, explain what it does.

int currentYear = 2012
print "When were you born (year)?"
// User prompted to enter the year in which you were born
String str = System.console().readLine();
int birthYear = Integer.parseInt(str);
// age variable is set to the current year (2012) minus the users' birth year.
int ageAprox = currentYear - birthYear;
// Is greater than 17? If so print a space and if not (:) print "not "
String result = (ageAprox > 17) ? "" : "not "
// It seems you are + not + an adult (if under 17)...
println "It seems you are " + result + "an adult."

