package sample;
import java.util.List;
import java.util.Optional;
public class OptionalExample {
	public static void main(String[] args) {
		List<PC> pcList = PC.getList();
		
		Optional<PC> anyPc = 
				pcList.stream()
						.filter(pc->"Panann".equals(pc.getMaker()))
						.findAny();
												
		anyPc.ifPresentOrElse( 
				pc->System.out.println(pc.getName()),			// 在る時
				()->System.out.println("該当がありません"));	// 無い時
	}
}
