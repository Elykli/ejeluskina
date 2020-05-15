package jtm.activity03;

public class RandomPerson {

	// TODO Create _private_ structure of random person to store values:
	
		private String name;
		private int age;
		private float weight;
		private boolean isFemale;
		private char smile;
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public float getWeight() {
			return weight;
		}
		public boolean isFemale() {
			return isFemale;
		}
		public char getSmile() {
			return smile;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setWeight(float weight) {
			this.weight = weight;
		}
		public void setFemale(boolean isFemale) {
			this.isFemale = isFemale;
		}
		public void setSmile(char smile) {
			this.smile = smile;
		}
		
	
	// name as String,
	// age as int,
	// weight as float,
	// isFemale as boolean;
	// smile as char
	// HINT: use Alt+Shift+A to switch to Block selection (multi-line cursor)
	// to edit list of all properties at once

	// TODO Select menu "Source — Generate Getters and Setters..." then select
	// all properties and generate _public_ getters and setters for all of them
}
