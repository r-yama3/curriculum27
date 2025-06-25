package curriculum27;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String line = scanner.nextLine(); // 1行まとめて入力
		String[] animals = line.split(","); // ,で動物を分割
		for (String animalData : animals) { //:でデータを分ける
			String[] parts = animalData.split(":");

			String name = parts[0]; // 最初の部分 → 名前
			double height = Double.parseDouble(parts[1]); // 次の部分 → 小数
			int speed = Integer.parseInt(parts[2]); // 次の部分 → 整数

			Animal animal = new Animal(name, height, speed);
			animal.showInfo();

			switch (name) { //名前が入力されたら学名を表示
			case "ライオン":
				System.out.println("学名：パンテラ レオ");
				break;
			case "ゾウ":
				System.out.println("学名：ロキソドンタ・サイクロティス");
				break;
			case "パンダ":
				System.out.println("学名：アイルロポダ・メラノレウカ");
				break;
			case "チンパンジー":
				System.out.println("学名：パン・トゥログロディテス");
				break;
			case "シマウマ":
				System.out.println("学名：チャップマンシマウマ");
				break;
			case "インコ":
				System.out.println("学名：不明");
				break;
			}
			scanner.close();
		}
	}
}
