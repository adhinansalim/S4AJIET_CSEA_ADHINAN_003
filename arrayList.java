*******************************************************************************/
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("Java");
		list.add(0,"c");
		System.out.println(list);
		System.out.println(list.get(0));
	}
}
