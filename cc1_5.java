
/*
* getong
*/


// public class CC1_5{
//     public String str;
//     public CC1_5(String str){
//         this.str = str;
//     }
//     public static void main(String[] args){
//         CC1_5 c = new CC1_5(args[0]);
        
//         System.out.print(c.space2percent());
//     }
    
//     public String space2percent(){
//     	/*deal with situation where spaces appear at the end of the string!*/
//     	if (str.charAt(str.length()-1) == ' ')
//     		str = str.substring(0,str.length()-1).concat("%20");
//         String[] cc = str.split(" ");
//         String newStr = "";
//         for (int i = 0; i < cc.length; i++){
//         	if (i == cc.length - 1)
//         		newStr = newStr.concat(cc[i]);
//         	else
//             	newStr = newStr.concat(cc[i]).concat("%20");
//         }

//         return newStr;
//     }
// }

/*
* zhangzimao
*/

public class CC1_5{
	String str;
	public CC1_5 (String str) {
		this.str = str;
	}

	public String convert() {
		int length = str.length();
		for (int i = 0; i < length; i++) {
			System.out.println(length);
			if (str.charAt(i) == ' ') {
				str = str.substring(0,i).concat("%20").concat(str.substring(i+1,length));
				System.out.println(str);
				if (i != length-1){
					i += 2;
					length +=2;
				}
			}	
		}
		return str;
	}
	

	public static void main(String args[]) {
		String input = args[0];
		CC1_5 rep = new CC1_5(input);
		System.out.println(rep.convert());
	}
}