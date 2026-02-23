import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javStreams {

	public static void main(String[] args) {

		// Java Stream is a collection class of string.
		// we use stream for optimize the code
		/*
		 * steps create the String collection ex: ArrayList<String> names = new
		 * ArrayList<String>(); add the names to the collection using add method convert
		 * the string collection to stream class names.stream() use the intermediate
		 * operator ex: filter() its called lambda expression
		 * Names.stream().filter(leftside operator ->rightside lamda body expression)
		 * Names.stream().filter(name->name.startswith("A")) at last we have to use the
		 * terminator long c=Names.stream().filter(name->name.startswith("A")).count();
		 * if terminal operator is not mentioned streat has no life terminate operator
		 * will execute only if intermediate operator return true.
		 */

		ArrayList<String> names = new ArrayList<String>();
		names.add("Siri");
		names.add("Lekhana");
		names.add("Shreya");
		names.add("Akshay");
		names.add("Jaya");
		Stream<String> streams = Stream.of("Raj", "Krish", "Thej", "Sachi");
		List<String> names1 = Arrays.asList("Esha", "Yesh", "Siddu", "Prathap");
		int count = 0;
		// regular way of finding how many strings starts with letter S
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("S")) {
				count++;
			}

		}
		System.out.println(count);

		// Using Streams collection to achieve same

		Long c = names.stream().filter(name -> name.startsWith("S")).count();
		System.out.println("Number of times name return with letter S= " + c);
		System.out.println();
		// stream way of print name starts with letter S
		names.stream().filter(name -> name.startsWith("S"))
				.forEach(name -> System.out.println("name starts with letter s = " + name));
		System.out.println();
		// limit the output to only one value , above streams return all names starts
		// with letter s ,
		// but below will return only mentioned limit
		names.stream().filter(name -> name.startsWith("S")).limit(1)
				.forEach(name -> System.out.println("name starts with letter s = " + name));
		System.out.println();
		// print name having lenght 4 and above
		names.stream().filter(name -> name.length() > 4)
				.forEach(name -> System.out.println("name lenght >4 = " + name));
		System.out.println();
		// streamMap using to manipulate the result , in this case convert to uppercase.
		names.stream().filter(name -> name.length() > 4).map(name -> name.toUpperCase())
				.forEach(name -> System.out.println("name lenght >4 and with upper case = " + name));
		System.out.println();
		// print names starts with letter s and convert to upper case and sort the
		// results.
		names.stream().filter(name -> name.startsWith("S")).map(name -> name.toUpperCase()).sorted()
				.forEach(name -> System.out.println("name lenght >4 and with upper case and sorted= " + name));
		System.out.println();
		// merge two different list , sort and print
		Stream<String> concatted = Stream.concat(names.stream(), names1.stream());
		concatted.sorted().forEach(name -> System.out.println("Concatted and sortted list = " + name));
		System.out.println();
		// find the matching string and return true or false
		boolean flag = names.stream().anyMatch(name -> name.equalsIgnoreCase("Siri"));
		System.out.println("Matching results = " + flag);

		// list given and convert to streams , do manipulations and convert back to list
		// and get the string present at 0
		System.out.println();
		List<String> listresult = names.stream().filter(name -> name.endsWith("i")).collect(Collectors.toList());
		System.out.println("converted back to list and printing the result = " + listresult.get(0));

		// list given and convert to streams , do manipulations and without convert back
		// to list
		// and get the string present at 0
		System.out.println();
		names.stream().filter(name -> name.endsWith("a")).limit(1).forEach(name -> System.out.println("without converting back to collection and print result = "+name));
		// System.out.println("without converted back to list and printing the result =
		// " + n.toString());
		System.out.println();
		//print unique values from the list
		List<Integer> values = Arrays.asList(8,4,1,2,2,3,4,5,5,9,9,0,5);
		values.stream().distinct().forEach(value->System.out.println("Unique values from the list ="+ value));
		//print unique values from the list and sort and get 3rd item
		System.out.println();
		List<Integer> sortedvalues = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("get distinct values and sorted the integer values = "+ sortedvalues.get(2));

	}

}
