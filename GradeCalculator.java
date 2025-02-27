def getStudentScore():
    while True:
        try:
            score = float(input("Enter the student's score: "))  # Get user input
            if 0 <= score <= 100:  # Validate if the score is within a valid range
                return score
            else:
                print("Invalid input. Please enter a score between 0 and 100.")
        except ValueError:
            print("Invalid input. Please enter a numerical value.")

def calculateGrade(score):
    if score >= 90:
        return 'A'
    elif score >= 80:
        return 'B'
    elif score >= 70:
        return 'C'
    elif score >= 60:
        return 'D'
    else:
        return 'F'

# Main program
score = getStudentScore()  # Get student score
grade = calculateGrade(score)  # Calculate the grade
print(f"The student's grade is: {grade}")  # Display the result
