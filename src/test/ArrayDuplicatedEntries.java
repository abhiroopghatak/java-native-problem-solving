package test;
import java.util.*;
// Given an array of length n , this program will find duplicated entries and displays their frequency 
public class ArrayDuplicatedEntries {
    public static Map<String ,Integer> DuplicateFindingsInArray( String[] arr){
		Map<String , Integer> result = new HashMap<String,Integer>();
		for(int i = 0; i < arr.length ; i++){
		
			if(result.get(arr[i])==null){
				result.put(arr[i],1);
			}else{
				result.put(arr[i],result.get(arr[i]) + 1);
			}
		}
		return result;
	}

	public static void main (String ...a){
	
		String[] arr ={"aa","aa","ab","cs","cs","cs"}; 
		
		Map<String, Integer> result = DuplicateFindingsInArray(arr);
		
		for (Map.Entry<String, Integer>  entry : result.entrySet()){
			if(entry.getValue()>1){
				System.out.println(entry.getKey()+"---frequency--"+ entry.getValue());
			}
		}
	}
}
