import java.util.Scanner;

//import javax.swing.JOptionPane;

public class GEmulator extends Thread{
	
	public static void main(String[] args) {
		Thread t = new Thread(new GEmulator());
		try {
			//java.applet.AudioClip clip = java.applet.Applet.newAudioClip(new java.net.URL("funny.wav"));
			//clip.play();
			System.out.println("     '''''''''''     ");
			Thread.sleep(500); 
			System.out.println("     ''       ''     ");
			Thread.sleep(500);
			System.out.println("     '' ^   ^ ''     ");
			Thread.sleep(500);
			System.out.println("    ''    |    ''    ");
			Thread.sleep(500);
			System.out.println("  ''    _____   ''   ");
			Thread.sleep(500);
			System.out.println(" ''               '' ");
			Thread.sleep(500);
			System.out.println("\n\n\n");
			System.out.print("*");
			Thread.sleep(50);
			System.out.print("*");
			Thread.sleep(50);
			System.out.print("* ");
			Thread.sleep(50);
			System.out.print("THE ");
			Thread.sleep(500);
			System.out.print("GUNJAN ");
			Thread.sleep(500);
			System.out.print("GAURI ");
			Thread.sleep(500);
			System.out.print("EMULATOR ");
			Thread.sleep(50);
			System.out.print("*");
			Thread.sleep(50);
			System.out.print("*");
			Thread.sleep(50);
			System.out.print("*\n\n\n");
			t.run();
			System.out.println("Thanks for your help! Please come for my wedding with Rajalakshmy Iyer in either Cancun or The Grand Canyon");
			Thread.sleep(4000);
			System.out.println("Why Raju you ask?");
			Thread.sleep(2000);
			System.out.println("Well thats easy! I'll probably say no to the whole universe of boys and so the only person left is Raju.\nWe will be happy together!");
			Thread.sleep(5000);
			System.out.println("Now go away, its time to brozone somewhere else...");
			System.out.println("    '''''''''''    ");
			Thread.sleep(500);
			System.out.println("    ''       ''    ");
			Thread.sleep(500);
			System.out.println("    '' ^   ^ ''    ");
			Thread.sleep(500);
			System.out.println("   ''    |    ''    ");
			Thread.sleep(500);
			System.out.println("  ''   _____   ''    ");
			Thread.sleep(500);
			System.out.println(" ''             ''    ");
			Thread.sleep(500);
			System.out.println("\n\n\n");
			System.out.print("*");
			Thread.sleep(50);
			System.out.print("*");
			Thread.sleep(50);
			System.out.print("* ");
			Thread.sleep(50);
			System.out.print("THE ");
			Thread.sleep(500);
			System.out.print("GUNJAN ");
			Thread.sleep(500);
			System.out.print("GAURI ");
			Thread.sleep(500);
			System.out.print("EMULATOR ");
			Thread.sleep(50);
			System.out.print("*");
			Thread.sleep(50);
			System.out.print("*");
			Thread.sleep(50);
			System.out.print("*\n\n\n");
			System.out.println("Bye Bye!");
		} catch (InterruptedException e) {
			System.out.println("Wait your turn, Gunjan is bro-zoning other people right now");
		} //catch (MalformedURLException e1) {
			//e1.getStackTrace();
		//}
	}
		public String gunjanComments(int commNo) {
			return null;
		}
		
		public void run() {
			Scanner s = new Scanner(System.in);
			String ans1 = "";
			String temp = "";
			try {
				while(true) {
					System.out.println("Alright, who do you want me to date?");
					String ans = s.next();
					if (ans.equalsIgnoreCase("Dev") || ans.equalsIgnoreCase("Sumedh") || ans.equalsIgnoreCase("Pranav") || 
							ans.equalsIgnoreCase("Harsh") || ans.equalsIgnoreCase("Pandu") || ans.equalsIgnoreCase("Yash")
								|| ans.equalsIgnoreCase("Atmaram") || ans.equalsIgnoreCase("Arpan") || ans.equalsIgnoreCase("Rishabh")
									|| ans.equalsIgnoreCase("Zhash") || ans.equalsIgnoreCase("Shiroya") || ans.equalsIgnoreCase("Bassi")
										|| ans.equalsIgnoreCase("Rochak") || ans.equalsIgnoreCase("Kartik") || ans.equalsIgnoreCase("Ishaan")
											|| ans.equalsIgnoreCase("Deva") || ans.equalsIgnoreCase("Vihar")) {
						if (ans.equals(temp)) {
							System.out.println("Noooo na! I already said that we're friends only!!");
							Thread.sleep(2000);
							System.out.println("Besides, He wont ask also pakka");
							Thread.sleep(100);
						}
						else {
							System.out.println("He's is a friend yaar! He wont ask me out, even in..... \n");
							Thread.sleep(2000);
							System.out.println("even in hypothetical situations :)");
							Thread.sleep(100);
							temp = ans;
						}
					}
					else if (ans.equalsIgnoreCase("Aakash") || ans.equalsIgnoreCase("Vittha") || ans.equalsIgnoreCase("Vinay") || ans.equalsIgnoreCase("Digraj")) {
						
						if (ans.equalsIgnoreCase(temp)) {
							System.out.print("Dude, he is");
							Thread.sleep(200);
							System.out.print(" a brother....");
							Thread.sleep(300); System.out.println(" So No please");
							Thread.sleep(100);
						}
						System.out.println("He is my brother! I cant date him!");
						Thread.sleep(1000);
						System.out.println("Ask about someone else and I'll be willing to give it a shot");
						Thread.sleep(2000);
						System.out.println("Maybe.....");
						temp = ans;
					}
					else if (ans.equalsIgnoreCase("Eehita")) {
						System.out.println("Definitely....Any Day!");
						Thread.sleep(2000);
						System.out.println("We to do Thukai every day anyways...");
						Thread.sleep(2000);
						System.out.println("No more need for guys!");
						Thread.sleep(500);
						break;
					}
					else {
						if (ans.equalsIgnoreCase(temp)) {
							System.out.println("Ya ya...he is to mine only....");
							Thread.sleep(3000);
							System.out.println("I was being sarcastic.....Don't man");
							Thread.sleep(2000);
							System.out.println("I don't even like his face...so Please. Move on");
							Thread.sleep(500);
							
						}
						else {
							System.out.println("Sheeeeeee!! Don't even think about it!");
							Thread.sleep(100);
							System.out.println("Never");
							Thread.sleep(1000);
							System.out.println("Like....never");
							Thread.sleep(1000);
							System.out.println("Ever.\n");
							Thread.sleep(500);
							temp = ans;
						}
					}
					do {
						System.out.println("Any more options you wanna explore? (yes/no)");
						ans1 = s.next();
					} while (!ans1.equalsIgnoreCase("yes") && !ans1.equalsIgnoreCase("no"));
					if (ans1.equalsIgnoreCase("Yes")) {
						continue;
					}
					else break;
				}
				s.close();
			} catch (Exception e) {
				System.out.println("Something happened");
				e.printStackTrace();
			}
		}
}

