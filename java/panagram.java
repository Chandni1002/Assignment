String str=sc.nextLine();
		str=str.replaceAll("","").toLowerCase();
		String res="";
    for(char i='a';i<='z';i++){
			if(str.indexOf(i)!=-1){
				res=res+i;
			}
    }
		if(res.length()==26){
			System.out.println("Pangram");
		}
		else{
			System.out.println(" Not Pangram");
		}
