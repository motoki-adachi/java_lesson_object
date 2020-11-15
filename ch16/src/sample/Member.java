package sample;  // 11章のプロジェクトのsample2パッケージから、16章のプロジェクトの　　
                  //　sampleパッケージにMemberクラスをコピーしてください

public class Member  implements Comparable<Member>{
	private int id;
	private String name;

	public Member(int id, String name) {
		this.id = id;
		this.name = name;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if(id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

}
