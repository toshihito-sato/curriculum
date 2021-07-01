package study;

/**
 * Main.java
 *
 * 本課題では、mainメソッド・インスタンス・メソッドの呼び出しの使い方を学んでいきましょう。
 * 課題範囲は以下のとおりです。
 *   User.java: 問①
 *   Main.java: 問①から問②
 * 指定された値と変数名を守って記述してください。
 *
 */
public class Main {

    public static void main(String[] args) {

        // ① 以下のルールに従いUserクラスのインスタンスを生成してください。
        // 変数名:「user」
    	User user=new User();

        // ② ①のインスタンス変数より、アカウント情報をコンソール出力するメソッドを呼び出しなさい。
    	user.printAccountInfo();
    }
}


/**
 * User.java
 */
class User {

    // フィールド変数
    private String userName;
    private int id;
    private String password;

    // コンストラクタ
    public User() {
        this.userName ="hoge" ;
        this.id =123;
        this.password = "abc123";
    }

  

	// ① 以下のルールに従いアカウント情報（名前、ID、パスワード）を出力するメソッドを作成してください。
    // アクセス修飾子:「protected」
    // メソッド名:「printAccountInfo」
    protected void printAccountInfo() {
    	System.out.print("ユーザー名は、");
    	System.out.println( this.userName);
    	System.out.print("IDは、");
    	System.out.println(this.id);
    	System.out.print("パスワードは、");
    	System.out.println(this.password);
    	
    	
    	
    }


}