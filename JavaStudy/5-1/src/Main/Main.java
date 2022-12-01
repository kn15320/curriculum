package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
//	public static Long one = true;//
//	public static Object tow = false;
//	public static Object thuree = 0.1;
	public static Object one = 12d;
	public static Object two = true;
	public static Object thuree = 54.6;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
//      問① 下記例の配列をString型しか格納できないように修正してください。
//		現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
//	       例List<Object> array = new ArrayList<>();
//		また、arrayには[hoge, pos, foo]の文字列３要素を入れてください。
//	    <以下記述>
			List<String> array = new ArrayList<>();
			array.add("hoge");
			array.add("pos");
			array.add("foo");
			
//      問② arrayの二つ目の要素を"bar"にしましょう。
//	　<以下記述>
			array.set(1, "bar");
			
//      問③ fooが格納されているインデックスを出力してください。
//	　<以下記述>
			int indexline = array.indexOf("foo");
			System.out.println("fooのインデックス " + indexline);
		
			
		
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
//	　<以下記述>//曖昧な値は使用しない
		map.put("yui", one);
		map.put("haku", two);
		map.put("poipoi", thuree);
//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
		for (String key: map.keySet()) {
			System.out.println("キー：" + key);
		}

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//	    <以下記述> 値が入っていない　値を取得する方法
		for (Object val: map.values()) {
			System.out.println("バリュー：" + val);
		}
		 
//      問⑦ Calender型calを使い、int型配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
           
           int[] arrayDate = new int[3];//int型配列arrayDateに要素が3つの配列を代入
           arrayDate[0] = cal.get(Calendar.YEAR);
           arrayDate[1] = cal.get(Calendar.MONTH) + 1;
           arrayDate[2] = cal.get(Calendar.DATE);
          
//	    <以下記述>
//      問⑧ 配列arrayDateをList型に置換しましょう。
//      ヒント：asListメソッドはプリミティブ型のデータ型のみ扱えます。
           //int型をString型へ変換
//	    <以下記述>
           //List<int[]> list = Arrays.asList(arrayDate);　asListは返すのは多重配列
           String[] strArray = Arrays.stream(arrayDate).mapToObj(String::valueOf).toArray(String[]::new);
  
           List<String> list = Arrays.asList(strArray);
           
//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>//いっこづずまわす
           for(String st : list) {
        	   System.out.println(st);
           }
		
		
	}
}
