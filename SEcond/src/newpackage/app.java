package newpackage;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rect R1= new rect();
		rect R2 = new rect(40,50);
		System.out.println("�������� ������� ������������ - "+R1.getPerimeter());
		System.out.println("�������� ������� ������������ - "+R2.getPerimeter());
		System.out.println("����� ������� ������������ - "+R1.getSquare());
		System.out.println("����� ������� ������������ - "+R2.getSquare());
round r1=new round(5.5);

		System.out.println("������� ������ ���� ��������� "+"2*pi*"+r1.getRadius()+" = "+r1.getLenght());
		System.out.println("����� ������ ����� ��������� "+"0.25*pi*"+r1.getDiameter()+" = "+r1.getSquare());
	}

}
