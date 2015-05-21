package oop03.inheritance;
/*
 Method Overriding
 - ��Ӱ��迡�� Parent�� ���� �� �޼ҵ带 Child���� �ٽ� ������ ���
 - �̷� ��� Parent�� �޼ҵ�� ���õ�
 - ���� �޼ҵ尡 Parent�� Child���� ��� ���� �Ǿ�����
 - ������ �ٸ�
 - Ŭ������ �������� ���� �� �� ����
 - Parent�� Child ���� �޼ҵ��� ����(�޼ҵ��, �Ķ���� ����, �Ķ���� ������ Ÿ��)�� 
   ���ƾ� ��
 - Parent�� �޼ҵ带 ������ֳ� Child�� �ڽ��� ������ �޼ҵ带 �켱 ���.
 - Parent�� �޼ҵ� ����� �����ϸ鼭 ��Ȳ�� ���� Child�� ������
 - ����� ����ϰ� ���� ��쿡 ����ϸ� ������ ������ �ٽɿ���.
 - Parent�� �޼ҵ带 ����ȭ�Ѵٰ� �� �� �ִ�.
 - Parent�� ������� ���ִ� ���� �ƴ϶�,
 - �����ϸ鼭 ���ο� ������� ��ü�Ϸ��� �������� ���.
 * */

public class OverridingDemo {
	/*
	 Parent �� show() �� Child ��
	 show() ������ �����Ƿ� �������̵��̴�.
	 * */
	public static void main(String[] args) {
		ParentB b =  new ParentB();
		b.show();
		ChildB c = new ChildB();
		c.show();
		
	}
}

class ParentB{
	void show(){
		System.out.println("Parent show() ����");
	}
	void run(){
		System.out.println("�θ�� �޸���.");
	}
}

class ChildB extends ParentB{
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Child show() ����");	
		super.show();
	}
}