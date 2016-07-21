package org.tzi.use.uran.location;

import java.util.*;

public final class Solution{

	private List<Status> records = new ArrayList<Status>();

	public void addStatus(Status status){ records.add(status);}
	public Status get(int k){return records.get(k);}
	public void remove(int i){records.remove(i);}
	public int size(){return records.size();}
}

