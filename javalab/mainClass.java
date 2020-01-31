import java.util.*;

class Student
{
	String name,usn;
	int age;
	float avgm;

	Student(String name,String usn,int age,float avgm)
	{
		this.name =name;
		this.usn = usn;
		this.age=age;
		this.avgm=avgm;
	}
	
	public String toString()
	{
			return(name +" " + usn +" "+ age +" "+ avgm);
	}
}
class mainClass{
	public static void main(String args[]){
	ArrayList<Student> st = new ArrayList<Student>();
	st.add(new Student("Chirayu","1MS17IS038",21,9.13f));
	
	st.add(new Student("Gagan","1MS17IS043",20,9.0f));
	System.out.println("Iterating with iterator");
	Iterator<Student> itr = st.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	
	System.out.println("Iterating using for each loop");
	for(Student s : st)
	{
		System.out.println(s);
	}
	System.out.println("iterating using list Iterator");
	ListIterator<Student> litr = st.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
}
	System.out.println("iterating using previous list iterator");
	while(litr.hasPrevious())
	{
		System.out.println(litr.previous());
	}
}
}
