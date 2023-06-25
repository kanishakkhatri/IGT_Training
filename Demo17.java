class Emp{
	Emp(int id, String name , int age , int salary , String designation, String pan){
		System.out.println(" yes perfect  HR ");
	}
	Emp(int id, String name , String project, String location){
		System.out.println(" yes perfect  manager ");	
	}
}
class  Demo17{
	public static void main(String args[]){
	 	Emp e = new Emp(100,"Rama",35,45678,"Dev","ABC123");
		Emp e1 = new Emp(100,"Rama","Facebook","Bangalore");
	}	
}

// HR  : id, name ,age , salry , loc,
// manager  :id , name , project , location 
		    


