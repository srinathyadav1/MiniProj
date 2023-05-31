import java.util.*;

class Patient{
	int  id,age;
	long phno,gphno,aadhar;
	String name,gname,gender,city,adress,gadress,date;
    Boolean status;
	
	public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public long getGphno() {
		return gphno;
	}
	public void setGphno(long gphno) {
		this.gphno = gphno;
	}
	public long getAadhar() {
		return aadhar;
	}
	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getGadress() {
		return gadress;
	}
	public void setGadress(String gadress) {
		this.gadress = gadress;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}

class Arogya {
	Scanner s = new Scanner(System.in);
    int idd=1000;
	ArrayList<Patient> al = new ArrayList<Patient>();

	public void add() {

		Patient p1 = new Patient();
        

//---------------------------------------------------------------------------------------------------
       
            boolean z=true;
            while(z==true){
            int c=0;
            //System.out.println("Enter the ID:");
            int a=0;
            try{
                a=idd;
                for(Patient x:al){
                    if(a==x.getId()){
                        System.out.println("Id exist");
                        break;
                    }
                    else{
                        c++;
                    }
                }
                if(c==al.size()){
                    z=false;
                    p1.setId(a);
                }
            }catch(Exception e){
                System.out.println("Enter correct Id format");
            }
            //s.nextLine();
            if(z==true){
                System.out.print("Please Re - ");
            }
            
        }
        idd++;
 
//---------------------------------------------------------------------------------------------------		
		

		System.out.println("Enter the Patient Name:");
		p1.setName(s.next());

//---------------------------------------------------------------------------------------------------
        boolean y=true;
        while(y==true){
            try{
                System.out.println("Enter the Patient Age:");
                 int a=s.nextInt();
                 String s=Integer.toString(a);
            if(s.length()==1 || s.length()==2 ){
                p1.setAge(a);
                y=false;
            }
            else{
                System.out.println("Age should be 1 or 2 digit only");
            }
            }catch(Exception e){
                System.out.println("Enter correct age format");
                s.next();
            }
            if(y==true){
                System.out.print("Please Re - ");
            }
            

        }

//------------------------------------------------------------------------------------------------------		
		

		System.out.println("Enter the Patient Gender:");
		p1.setGender(s.next());

//------------------------------------------------------------------------------------------------------
		
        boolean x=true;
        while(x==true){
            try{
                System.out.println("Enter the Patient Aadharcard Number:");
            long a=s.nextLong();
            String s=Long.toString(a);
            if(s.length()==12){
                p1.setAadhar(a);
                x=false;
            }
            else{
                System.out.println("Aadhar should be 12 digits only");
            }
            }catch(Exception e){
                System.out.println("Invalid Aadhar format");
                s.next();
            }
            if(x==true){
                System.out.print("Please Re - ");
            }
        }
        
		
//------------------------------------------------------------------------------------------------------
		
        boolean w=true;
        while(w==true){
            try{
                System.out.println("Enter the Phone Number:");
            long a=s.nextLong();
            String s=Long.toString(a);
            if(s.length()==10){
                if(s.charAt(0)=='9' || s.charAt(0)=='8' || s.charAt(0)=='7' || s.charAt(0)=='6' ){
                    p1.setPhno(a);
                    w=false;
                }
                else{
                    System.out.println("Enter valid phone number");
                }
                
            }
            else{
                System.out.println("Phone number should be 10 digits only");
            }
            }catch(Exception e){
                System.out.println("Invalid Phone Number");
                s.next();
            }
            if(w==true){
                System.out.print("Please Re - ");
            }
        }
        
		
//------------------------------------------------------------------------------------------------------
		System.out.println("Enter the City:");
		p1.setCity(s.next());
//------------------------------------------------------------------------------------------------------
		System.out.println("Enter the Address:");
		s.nextLine();
		p1.setAdress(s.nextLine());
//------------------------------------------------------------------------------------------------------
		System.out.println("Enter the Date:");
		p1.setDate(s.next());
//------------------------------------------------------------------------------------------------------
		System.out.println("Enter the Guardian Name:");
		p1.setGname(s.next());
//------------------------------------------------------------------------------------------------------
		System.out.println("Enter the Guardian Address:");
		s.nextLine();
		p1.setGadress(s.nextLine());
//------------------------------------------------------------------------------------------------------
		boolean v=true;
        while(v==true){
            try{
                System.out.println("Enter the Guardian Phone Number:");
            long a=s.nextLong();
            String s=Long.toString(a);
            if(s.length()==10){
                if(s.charAt(0)=='9' || s.charAt(0)=='8' || s.charAt(0)=='7' || s.charAt(0)=='6' ){
                    p1.setGphno(a);
                    v=false;
                }
                else{
                    System.out.println("Enter valid phone number");
                }
                
            }
            else{
                System.out.println("Phone number should be 10 digits only");
            }
            }catch(Exception e){
                System.out.println("Invalid Phone Number ");
                s.next();
            }
            if(v==true){
                System.out.print("Please Re - ");
            }
        }
        
		
//------------------------------------------------------------------------------------------------------
        boolean t=true;
        while(t){
            try{
               // System.out.println("Enter Patient Status :");
                p1.setStatus(false);
               // p1.setStatus(s.nextBoolean());
                t=false;
            }catch(Exception e){
                System.out.println("Enter Valid details");
                s.next();
            }
            if(t==true){
                System.out.print("Please Re - ");
            }
        }
        
//------------------------------------------------------------------------------------------------------
		al.add(p1);
        System.out.println("\nPatient Details Added Successfully\n");
//------------------------------------------------------------------------------------------------------    
	}
    public void print(Patient x){
        System.out.println("ID: " + x.getId());
			System.out.println("Name: " + x.getName());
			System.out.println("Age: " + x.getAge());
			System.out.println("Gender: " + x.getGender());
			System.out.println("Aadhar : " + x.getAadhar());
			System.out.println("phno: " + x.getPhno());
			System.out.println("City: " + x.getCity());
			System.out.println("Address: " + x.getAdress());
			System.out.println("Date : " + x.getDate());
			System.out.println("Guardian Name: " + x.getGname());
			System.out.println("Guardian Address: " + x.getGadress());
			System.out.println("Gphno: " + x.getGphno());
            if(x.getStatus()==true){
                System.out.println("Patient Status : Recovered");
            }else{
                System.out.println("Patient Status : Not Recovered");
            }
			System.out.println("---------------------------------");
    }
	public void display() {
		for (Patient x : al) {
			print(x);
		}
        if(al.size()==0){
            System.out.println("\nPatients data was empty\n");
        }
	}
    public void id(){
        int c=0;
        System.out.println("Enter Id ");
        int i=s.nextInt();
        for (Patient x : al) {
            if(x.getId()==i){
			print(x);
            break;
            }
            else{
                c++;
            }
		}
        if(c==al.size()){
            System.out.println("Id not found");
        }
    }
    public void city(){
        int c=0;
        System.out.println("Enter City");
        String a=s.next();
        for (Patient x : al) {
            if(x.getCity().equals(a)){
			print(x);
            }
            else{
                c++;
            }
		}
        if(c==al.size()){
            System.out.println("No Patient from "+a+" city");
        }
        
    }
    public void age(){
        int c=0;
        System.out.println("Enter age range");
        int a=s.nextInt();
        int b=s.nextInt();
        for (Patient x : al) {
            if(x.getAge()>=a && x.getAge()<=b){
			print(x);
            }
            else{
                c++;
            }
		}
        if(c==al.size()){
            System.out.println("No Patient from "+a+" city");
        }
    }
    public void recvr(){
        int c=0;
        System.out.println("Enter Patient ID :");
        int i=s.nextInt();
        for (Patient x : al) {
            if(x.getId()==i){
                System.out.println("Enter Patient Recovered : yes or no");
                String a=s.next();
                if(a.equals("yes")){
                    x.setStatus(true);
                    System.out.println("Patient status successfully changed");
                }
                else if(a.equals("no")){
                    x.setStatus(false);
                    System.out.println("Patient status successfully changed");
                }
                else{
                    System.out.println("Enter correct input ");
                }
                
                break;
            }
            else{
                c++;
            }
            
        }
        
        if(c==al.size()){
            System.out.println("Patient Not Found");
        }

    }
    public void rem(){
        int c=1;
        System.out.println("Enter Patient ID :");
        int i=s.nextInt();
    for (Patient x : al) {
        if (x.getId() == i) {
            al.remove(x);
            System.out.println("\nPatient data removed successfully\n");
            break;
        }
        else{
            c++;
        }
    }

    if(c==al.size()){
        System.out.println("Patient Not Found");
    }

    }
}

public class Hospital {
	public static void main(String[] a) {
		Arogya obj = new Arogya();
		Scanner s = new Scanner(System.in);
		int option;

		do {
			System.out.println("Press 1 for adding new member");
		    System.out.println("Press 2 to view list of all available members");
		    System.out.println("Press 3 to search member by ID");
		    System.out.println("Press 4 to search member from a particular city");
		    System.out.println("Press 5 to search member from a particular age group");
		    System.out.println("Press 6 to mark recovery of a member");
		    System.out.println("Press 7 to delete data of a member");
		    System.out.println("Press 0 to exit");
			 option=s.nextInt(); 

			switch (option) {
				case 1:
					obj.add();
					break;
				case 2:
					obj.display();
					break;
                    case 3 :
                    obj.id();
                    break;
                    case 4 :
                    obj.city();
                    break;
                    case 5 :
                    obj.age();
                    break;
                    case 6 :
                    obj.recvr();
                    break;
                    case 7 :
                    obj.rem();
                    break;
                    case 0 :
                    break;
                    default :
                    System.out.println("Invalid Selection");

			
			}
		} while (option != 0);
	}
}