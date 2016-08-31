package org.tzi.use.uran.location;
import java.util.List;

public abstract class Report{

	public abstract void generate();
	public abstract void addConflicts(List<List<Status>> sets);
	public abstract void addSingleConflicts(List<Status> single);
	public abstract void finalise();
}
