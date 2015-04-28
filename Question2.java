public static void updateFile(String content){
		
	try{

		int  u;
		String line;
		String context;
		String context2="";
		String line2;
		FileReader fw=new FileReader(content);
		BufferedReader br=new BufferedReader(fw);
		while((u=br.read())!=-1){
		
			System.out.println((char)u);

		}
		
	}catch(Exception e){
		System.out.println(e.toString());
	}
	}