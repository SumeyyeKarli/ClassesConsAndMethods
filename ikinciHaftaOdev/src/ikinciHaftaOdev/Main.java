package ikinciHaftaOdev;

public class Main {

	public static void main(String[] args) {
		
		Course course1= new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Engin Demiro�",0);
		Course course2= new Course(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Engin Demiro�",0);
		Course course3= new Course(3,"Programlamaya Giri� i�in Temel Kurs","Engin Demiro�",0);

		Course[] courses= {course1,course2,course3};
		for(Course course:courses) {
			System.out.println(course.name);
		}
		
		Category category1 = new Category(1,"Programlama");
		//Category category2= new Category(2,"...");
		//Category category3= new Category(3,"...");
		
		//Category[] categories= {category1,category2,category3};
		//for(Category category:categories) {
		//	System.out.println(category.categoryName);
		//}
		
		AddToList addToList= new AddToList();
		AddToList.addToList(course1);
		//...di�er kurslar i�in yapmak istersek ayn� �ekilde yaz�yoruz.	
	
		DeleteFromList deleteFromList= new DeleteFromList();
		DeleteFromList.deleteFromList(course1);
		DeleteFromList.deleteFromList(course2);
		//...di�er kurslar i�in yapmak istersek ayn� �ekilde yaz�yoruz.	
		
	
	}

}
