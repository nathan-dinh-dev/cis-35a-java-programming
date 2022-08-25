/* Name: Trung Nghia Dinh
 * Class and Section: CIS 35A - 63Z
 * Assignment Number: Assignment 5
 * Due Date: 03/07/2022
 * Date Submitted: 03/07/2022
 */

package assignment_5;

public class Statistics {
	// Declare Variables
	private int[] lowscores;
	private int[] highscores;
	private float[] avgscores;
	
	// Constructor
	public Statistics() {
		lowscores = new int[5];
		highscores = new int[5];
		avgscores = new float[5];
	}
	
	// Method of finding lowest score each quizzes
	public void findlow(Student[] a) {
		int index = 0;
		for (int i = 0; i < lowscores.length; i++) {
			int min = a[0].getScore(i);
			for (int k = 0; k < Student.getNumberOfStudents(); k++)  {
				if (min > a[k].getScore(i)) {
					min = a[k].getScore(i);
				}
			}
			lowscores[index] = min;
			index++;
		}
	}
	
	// Method of finding highest score each quizzes
	public void findhigh(Student[] a) {
		int index = 0;
		for (int i = 0; i < lowscores.length; i++) {
			int max = a[0].getScore(i);
			for (int k = 0; k < Student.getNumberOfStudents(); k++)  {
				if (max < a[k].getScore(i)) {
					max = a[k].getScore(i);
				}
			}
			highscores[index] = max;
			index++;
		}
	}
	
	// Method of calculating average score each quizzes
	public void findavg(Student[] a) {
		int index = 0;
		for (int i = 0; i < avgscores.length; i++) {
			float sum = 0;
			for (int k = 0; k < Student.getNumberOfStudents(); k++) {
				sum += (float)(a[k].getScore(i))/15;
			}
			avgscores[index] = sum;
			index++;
		}
	}
	
	// Accessors - Getters
	public int getLowScores(int i) {
		return lowscores[i];
	}
	
	public int getHighScores(int i) {
		return highscores[i];
	}
	
	public float getAvgScores(int i) {
		return avgscores[i];
	}
	
	// Print method
	public void print(int option) {
		switch(option) {
		case 1:
			System.out.printf("Low Scores in each Quiz:\n");
			for (int i = 0; i < lowscores.length; i++) {
				System.out.printf("Quiz %d: %d\n", i+1, lowscores[i]);
			}
			break;
			
		case 2:
			System.out.printf("High Scores in each Quiz:\n");
			for (int i = 0; i < highscores.length; i++) {
				System.out.printf("Quiz %d: %d\n", i+1, highscores[i]);
			}
			break;
			
		case 3:
			System.out.printf("Average Scores in each Quiz:\n");
			for (int i = 0; i < avgscores.length; i++) {
				System.out.printf("Quiz %d: %.2f\n", i+1, avgscores[i]);
			}
			break;
		
		case 4:
			System.out.printf("Printing all data...\n");
			System.out.printf("%8s%12s%14s%17s\n", "", "Low Scores", "High Scores", "Average Scores");
			for (int i = 0; i < avgscores.length; i++) {
				System.out.printf("Quiz %d%14d%14d%17.2f\n", i+1, lowscores[i], highscores[i], avgscores[i]);
			}
			break;
		}
	}
}
