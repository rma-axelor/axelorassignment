package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


class node
{
	int one,two;
	public node(int one,int two)
	{
		this.one = one;
		this.two = two;
	}
	public int getOne() {
		return one;
	}
	public void setOne(int one) {
		this.one = one;
	}
	public int getTwo() {
		return two;
	}
	public void setTwo(int two) {
		this.two = two;
	}
	
}

public class Main {
	
	private static Set<String>set;
	private static void dfs(Map<String,List<String>>map,String root)
	{
		set.add(root);
		System.out.println(root);
		if(map.containsKey(root))
		{
	      List<String>list = map.get(root);
	      for( int i = 0 ; i < list.size() ; i++ )
	      {
	    	  if(set.contains(list.get(i)))continue;
	    	  dfs(map,list.get(i));
	      }
		}
	}
	
	public static void main(String[] args)throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	Map<String,List<String>>map = new HashMap<>();
	for( int i = 0 ; i < n ; i++ )
	{
		String[] s = br.readLine().split(" ");
		if(map.containsKey(s[0]))
		{
			List<String>list = map.get(s[0]);
			list.add(s[1]);
			map.put(s[0], list);
		}
		else
		{
			List<String>list = new ArrayList<>();
			list.add(s[1]);
			map.put(s[0], list);
		}
	}
	String u = br.readLine();
	set = new HashSet<>();
	dfs(map,u);
	}
}
