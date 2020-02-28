# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.
   -I added two java files, one called Animal.java and the other called Dog.java

2. What five objects are created in the main?
   - An ArrayList of Dogs called dogs
   - A Dog named Fido with 4 legs
   - A Dog named Fido with 3 legs
   - A Dog named Alfie with 4 legs
   - A Comparator object of type Animal

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?
   -The Comparator constructor call happens with "new Comparator<Animal>".  The class definition for the Comparator happens in the same line as the constructor call because the program is technically initalizing a new class and constructor at the same time before it overrides the compare method.