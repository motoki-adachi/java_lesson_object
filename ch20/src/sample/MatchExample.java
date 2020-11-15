package sample;
import java.util.List;
public class MatchExample {
	public static void main(String[] args) {
		List<PC> pcList = PC.getList();
		
		if(pcList.stream().anyMatch(pc->"Ariban".equals(pc.getName()))) {
			System.out.println("Aribanと言う名前のパソコンはあります");
		}else {
			System.out.println("Aribanと言う名前のパソコンはありません");
		}
	}
}
