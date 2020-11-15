package sample;
import java.util.List;
import java.util.Optional;
public class FindExample {
	public static void main(String[] args) {
		List<PC> pcList = PC.getList();
		
		PC nonePC = new PC();
		nonePC.setName("No-exist");
		
		Optional<PC> anyPc = pcList.stream()
						.filter(pc->"Panann".equals(pc.getMaker()))
						.findAny();
		
		// 取得したパソコンの名前を表示する										
		System.out.println(anyPc.orElse(nonePC).getName());

	}
}
