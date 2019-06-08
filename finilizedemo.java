class finilizedemo{
	
	
	  int a;
	  
	  public void finalize(){
		  
		  System.out.println("filinilize");
		  
	  }
	  
	public static void main(String ar[]){
		
		finilizedemo f=new finilizedemo();
		f.a=10;
		System.out.println(""+f.a);
		f=null;
		
		//System.out.println(""+f.a);
		System.gc();
		System.out.println(""+f.a);
		kr.amrit@gmai.com
		
		
		
		
		
	}

}