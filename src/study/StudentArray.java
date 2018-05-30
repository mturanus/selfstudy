package study;

public class StudentArray {

	public static void main(String[] args) {

		String[] students = { "Muhammed", "Dana", "Claci", "Cristos" };

		for (int index = 0; index < students.length; index++) {

			System.out.println(students[index]);
		}

		for (String name : students) {
			System.out.println(name);
		}

		int[] nums = { 10, 100, 20, 300 };
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);

		}
	}
}