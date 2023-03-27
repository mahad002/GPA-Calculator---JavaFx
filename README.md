# GPA-Calculator---JavaFx
Gpa calculator which calculates your gpa and even lets you calculate cgpa by entering sgpa.


The user enters the course name, grade and credit hour of each course along with the Previous GPA and
Previous Credits. You can assume the user can study at max 7 courses in a semester as shown above. The
application reads the grade and credit hour of each course entered by the user along with the Previous
GPA and Previous Credits and calculates the CGPA when “Calculate” button is clicked based on the below
formula:

CGPA = ((Previous GPA ∗ Previous Credits) + (SGPA ∗ Credits of Semester)) / (Previous Credits + Credits of Semester)

Here, SGPA is calculated as:

SGPA = Grade of Course1 ∗ Credit Hours of Course1 + Grade of Course2 ∗ Credit Hours of Course2 + ⋯ + Grade of Course7 ∗ Credit Hours of Course7

and Credits of Semester is calculated as:

Credits of Semester = Credit Hours of Course1 + Credit Hours of Course2 + ⋯ + Credit Hours of Course7

The CGPA’s field is then updated with the calculated CGPA.
When the application reads the entered fields from the GUI, the data is stored in a file called “Grades.txt”.
At the end, calculated CGPA is also stored in the file. A sample grades.txt looks as below:
