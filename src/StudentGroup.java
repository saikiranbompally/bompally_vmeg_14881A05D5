import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students.length>0){
		return students;}
		else{
		return null;}
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		for(int i=0;i<students.length;i++){
		this.students[i]=student[i];}
		
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		for(int i=0;i<students.length;i++){
			students[i]=students[i+1];
		}
		students[0]=students;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		students[students.length+1]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		for(int i=index;i<students.length;i++){
			students[i]=students[i+1];
		}
		students[index]=student;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		for(int i=index;i<students.length;i++)
		{
			students[i]=students[i+1];
		}
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		for(int i=0;students[i]!=student;i++){
		}
		for(int k=0;j<students.length;k++){
		studnts[k]=students[k+1];
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		for(int i=index;i<students.length;i++){
			students[i]=null;
		}
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int index=0;
		for(int k=0;k<students.length;k++){
			if((students[k].id==student[k].id))&&(students[k].fullname==student[k].fullname) && (students[k].birthDate==student[k].birthDate) && (students[k].avgMark==student[i].avgMark)){
				break;
			}
			else{index+=1;}
		}
		remoceFromIndex(index);
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		for(int j=1;j<students.length;j++)
		{
			if(i+index>students.length)
			{
				break;
			}
			students[i]=students[i+index];
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int index=0;
		for(int k=0;k<students.length;k++){
			if((students[k].id==student[k].id))&&(students[k].fullname==student[k].fullname) && (students[k].birthDate==student[k].birthDate) && (students[k].avgMark==student[i].avgMark)){
				break;
			}
			else{index+=1;}
		}
		remoceFromIndex(index);
	}	

	@Override
	public void bubbleSort() {
		// Add your implementation here
		student temp;
		for(int i=0;i<students.length;i++)
		{
			for(j=0;j<students.length;j++)
			{
				if(students[j].birthDate)>students[j+1].birthDate){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		for(int i=0;i<students.length;i++)
		{
			if(students[i].birth.Date==date){
				return students[i];
			}
		}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		student stu=new student[10];
		int k=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].birth.Date>firstDate && students[i].birth.Date>lastDate){
				stu[k]=students[i];
				k+=1;
			}
		}
		if(k>0){return stu;}
		else{
		return null;}
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		student[] stu=new student(10);
		int k=0;
		for(int i=0;i<students.length;i++)
		{
			if(students[i].birthDate==age){
			stu[k]=students[i];
			K+=1;}
		}
		
		return stu;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		int max=100;
		int id=0;
		for(int i=0;i<students.length;i++){
			if(students[i].avgMark>max){
			if(students[i].avgMark>max){
			max=students[i].avgMark;
			id=1;
			}
		}
		return students[id];
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int i;
		for(i=0;i<students.length;i++){
			if((students[k].id==student[k].id))&&(students[k].fullname==student[k].fullname) && (students[k].birthDate==student[k].birthDate) && (students[k].avgMark==student[i].avgMark)){
				break;
			}
		}
		return students[i+1];
	}
}
