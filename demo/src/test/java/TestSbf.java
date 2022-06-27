public class TestSbf extends Thread{
    public   StringBuilder stringBuffer = new StringBuilder("开始");
    public  Integer count=0;
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        stf(Thread.currentThread().getName());
    }

    public  void stf(String str){
        for(int i=0;i<10;i++){
            stringBuffer.append(str);
        }
        System.out.println(stringBuffer);
    }
    public  void add(){
        for(int i=0;i<10;i++){
            System.out.println(count++);
        }

    }
}
 class T{
     public static void main(String[] args) {
         TestSbf testSbf =new TestSbf();
         new Thread(testSbf,"1").start();
         new Thread(testSbf,"2").start();
         new Thread(testSbf,"3").start();
     }
}