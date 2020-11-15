package sample2;
public class Member implements Comparable<Member> {
	private int id;
	private String name;
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Member() {
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Member m) {
		return Integer.compare(id, m.id);
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
}
