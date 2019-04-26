
public class EmployeeDetails {
	
	int eid;
	String ename;
	float esal;
	
	EmployeeDetails(int id,String n,float s){
		
		
		eid=id;
		ename=n;
		esal=s;
	}	
		void display() {
			
			
		System.out.println(eid+" "+ename+" "+esal);	
		
		
	}	
		public static void main(String[] args) {
			EmployeeDetails ed=new EmployeeDetails(4444,"manibabu",10000f);

			EmployeeDetails ed1=new EmployeeDetails(4455,"Hari",50000f);
			

			EmployeeDetails ed2=new EmployeeDetails(4466,"AmanPreet",60000f);
			
			ed.display();
			ed1.display();
			ed2.display();
			
		}

}
