package obj1;

public class TestInstanceof {
    public static void main(String[] args) {
        //����helloʱʹ��Object�࣬��hello�ı���������Object��Object��������ĸ���
        //��hello������ʵ��������String
        Object hello = "Hello";
        //String��Object������࣬���Է���true��
        System.out.println("�ַ����Ƿ���Object���ʵ����" + (hello instanceof Object));
        //����true��
        System.out.println("�ַ����Ƿ���String���ʵ����" + (hello instanceof String));
        //����false��
        System.out.println("�ַ����Ƿ���Math���ʵ����" + (hello instanceof Math));
        //Stringʵ����Comparable�ӿڣ����Է���true��
        System.out.println("�ַ����Ƿ���Comparable�ӿڵ�ʵ����" + (hello instanceof Comparable));
        String a = "Hello";
        //String��Ȳ���Math�࣬Ҳ����Math��ĸ��࣬���������������޷�ͨ��
        //System.out.println("�ַ����Ƿ���Math���ʵ����" + (a instanceof Math));
    }
}