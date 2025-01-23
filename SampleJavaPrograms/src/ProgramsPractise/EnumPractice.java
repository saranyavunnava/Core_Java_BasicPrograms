package ProgramsPractise;

public class EnumPractice {

	enum status
	{pending,success,failed,onhold
		};
	
	public class Laptop{
				enum system{
			HP(2000),Lenovo(1500),Dell(900),Apple(1700);

			private int price;

			system(int price) {
				// TODO Auto-generated constructor stub
				this.setPrice(price);
			}

			public int getPrice() {
				return price;
			}

			public void setPrice(int price) {
				this.price = price;
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * status s=status.success; status ss[]=status.values(); for(status a:ss)
		 * System.out.println(a);
		 * 
		 * System.out.println(s);
		 */	
		
	}

}
