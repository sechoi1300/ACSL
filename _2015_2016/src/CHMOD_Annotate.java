/*
for(int i =0; i < 5; i++){

  //takes in each number
  String[] octal = in.nextLine().split(" ");
  
  String[] perm = new String[3];
  for(int j = 0; j < octal.length; j++){
  
  		//changes each number to binary and saves it to array
		octal[j] = Integer.toBinaryString(octal[j])
		
  	while(octal[j].length() < 3)
  	
  	  //converts numbers that are too short into a "---" format
      octal[j] = "0" + octal[j];
      
  }
  
  for(int x = 0; x < 3; x++){
  
  	//determines whether read permission is given
    if(octal[x].charAt(0) == '1')	perm[x] += "r";
    else	perm[x] += "-";
    
    //determines whether write permission is given
    if(octal[x].charAt(1) == '1')	perm[x] += "w";
    else	perm[x] += "-";
    
    //determines whether execute permission is given
    if(octal[x].charAt(2) == '1')	perm[x] += "x";
    else	perm[x] += "-";
  }
  
  
}
*/