public class ConcatenateString{
    public static String concatenateString(String[] input){
        StringBuffer result = new StringBuffer();
        
        for(String str : input){
            result.append(str);
        }
        return result.toString();
    }
	public static void main(String[] args) {
		String[] input = {"Hello"," ", "World","!"};
		System.out.println(concatenateString(input));
	}
}
