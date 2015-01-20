import javax.swing.*;


import java.util.*;
import java.awt.*;
import java.awt.event.*;

/**
 * 
 * @author Scott Killeen
 * @SDate May 9, 2013
 * 
 * This creates a hangman game where the user gets a certain amount of guesses to guess a word. It will
 * display knowledge of paint and using button actions.
 */
public class HangManGame extends JApplet {
	private static final String BOLD = null;
	JLabel L1, L2, L3, L4, L5, L6, L7, L8, L9;
	JPanel pan = new JPanel();
	int num1 = 0; //Integer to keep track of # of rounds.
	int num2 = 0; //Int to keep track of # of wrong guesses.
	int num3 =0; //int to count up each time the next button is hit.
	int num4=0; //int to keep score/
	Font BFont = new Font("Plain",Font.BOLD,16); //Creating font
	JButton Btn1;
	JButton Btn2;
	JButton Btn3;
	JButton Btn4;
	JButton Btn5;
	JButton Btn6;
	JButton Btn7;
	JButton Btn8;
	JButton Btn9;
	JButton Btn10;
	JButton Btn11;
	JButton Btn12;
	JButton Btn13;
	JButton Btn14;
	JButton Btn15;
	JButton Btn16;
	JButton Btn17;
	JButton Btn18;
	JButton Btn19;
	JButton Btn20;
	JButton Btn21;
	JButton Btn22;
	JButton Btn23;
	JButton Btn24;
	JButton Btn25;
	JButton Btn26; //Creating buttons.
	JButton next;
	boolean one=false;
	boolean two=false;
	boolean three=false;
	boolean four=false;
	boolean five=false;
	boolean six=false;
	boolean seven=false;
	boolean eight=false; //Creating booleans for the labels. (If the right letter is guessed it will be set to true)
	

	public void init() {
		setSize(550, 550);
		Btn1 = new JButton("A    ");
		Btn2 = new JButton("B    ");
		Btn3 = new JButton("C    ");
		Btn4 = new JButton("D    ");
		Btn5 = new JButton("E    ");
		Btn6 = new JButton("F    ");
		Btn7 = new JButton("G    ");
		Btn8 = new JButton("H    ");
		Btn9 = new JButton("I    ");
		Btn10 = new JButton("J    ");
		Btn11 = new JButton("K    ");
		Btn12 = new JButton("L    ");
		Btn13 = new JButton("M    ");
		Btn14 = new JButton("N    ");
		Btn15 = new JButton("O    ");
		Btn16 = new JButton("P    ");
		Btn17 = new JButton("Q    ");
		Btn18 = new JButton("R    ");
		Btn19 = new JButton("S    ");
		Btn20 = new JButton("T    ");
		Btn21 = new JButton("U    ");
		Btn22 = new JButton("V    ");
		Btn23 = new JButton("W    ");
		Btn24 = new JButton("X    ");
		Btn25 = new JButton("Y    ");
		Btn26 = new JButton("Z    "); // Giving labels on the buttons.
		next =new JButton("Next");
		JPanel s= new JPanel();//Creating Panels for layout.
		JPanel b=new JPanel();
		b.setLayout(new GridLayout(3,9));
		s.setLayout(new GridLayout(1,0));
		add(b,BorderLayout.NORTH);
		b.add(Btn1);
		b.add(Btn2);
		b.add(Btn3);
		b.add(Btn4);
		b.add(Btn5);
		b.add(Btn6);
		b.add(Btn7);
		b.add(Btn8);
		b.add(Btn9);
		b.add(Btn10);
		b.add(Btn11);
		b.add(Btn12);
		b.add(Btn13);
		b.add(Btn14);
		b.add(Btn15);
		b.add(Btn16);
		b.add(Btn17);
		b.add(Btn18);
		b.add(Btn19);
		b.add(Btn20); 
		b.add(Btn21);
		b.add(Btn22);
		b.add(Btn23);
		b.add(Btn24);
		b.add(Btn25);
		b.add(Btn26);// Adding the buttons.
		next.setVisible(false);
		s.add(next);
		L1 = new JLabel("____");
		L2 = new JLabel("____");
		L3 = new JLabel("____");
		L4 = new JLabel("____");
		L5 = new JLabel("____");
		L6 =new JLabel("You Lose!");
		L7 =new  JLabel("____");
		L8 = new JLabel("____");
		L6.setVisible(false);
		L7.setVisible(false);
		L8.setVisible(false);
		add(s,BorderLayout.SOUTH);
		L1.setFont(BFont);
		L2.setFont(BFont);
		L3.setFont(BFont);
		L4.setFont(BFont);
		L5.setFont(BFont);
		L6.setFont(BFont);
		L7.setFont(BFont);
		L8.setFont(BFont);
		s.add(L1);
		s.add(L2);
		s.add(L3);
		s.add(L4);
		s.add(L5);
		s.add(L7);
		s.add(L8);
		s.add(L6); //adding labels.
		
	
		
	
	Btn1.addActionListener(new ActionListener() { // Button for A
		public void actionPerformed(ActionEvent event){ //If it is correct it will display the letter, else it will paint.
			Btn1.setEnabled(false);
			if (num1 == 0) { 
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if(num1==2){
				L2.setText("A");
				seven=true;
				repaint();
			}
			if(num1==3){
				L7.setText("A");
				six=true;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	
	Btn2.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){ //If it is correct it will display the letter, else it will paint.
			Btn2.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn3.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){ //If it is correct it will display the letter, else it will paint.
			Btn3.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn4.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){ //If it is correct it will display the letter, else it will paint.
			Btn4.setEnabled(false);
			if (num1 == 0) {
				L4.setText("D");
				repaint();
				four=true;
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}

	});
	Btn5.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn5.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if(num1==3){
				L2.setText("E");
				two=true;
				repaint();
			}
			if (num1==4){
				L2.setText("E");
				two=true;
				repaint();
			}
		}
	});
	Btn6.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn6.setEnabled(false);
			if (num1 == 0) {
				L1.setText("F");
				repaint();
				one=true;
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
		
	});
	Btn7.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn7.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				L1.setText("G");
				repaint();
				one=true;
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if(num1==3){
				L3.setText("G");
				three=true;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
			
		}
	});
	Btn8.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn8.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}

	});
	Btn9.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn9.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				L2.setText("I");
				L5.setText("I");
				repaint();
				two=true;
				five=true;
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn10.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn10.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn11.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn11.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}

	});

	Btn12.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn12.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				L4.setText("L");
				repaint();
				four=true;
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if(num1==3){
				L1.setText("L");
				L5.setText("L");
				one=true;
				five=true;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}

	});
	Btn13.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn13.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				L3.setText("M");
				repaint();
				three=true;
			}
			if(num1==2){
				L3.setText("M");
				eight=true;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				L1.setText("M");
				one=true;
				repaint();
			}
		}
	});
	Btn14.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn14.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn15.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){ //If it is correct it will display the letter, else it will paint.
			Btn15.setEnabled(false);
			if (num1 == 0) {
				L3.setText("O");
				L5.setText("O");
				repaint();
				three=true;
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if(num1==3){
				L4.setText("O");
				four=true;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}

	});
	Btn16.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn16.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn17.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn17.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn18.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn18.setEnabled(false);
			if (num1 == 0) {
				L2.setText("R");
				repaint();
				two=true;
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				L3.setText("R");
				L4.setText("R");
				three=true;
				four=true;
				repaint();
			}
		}
	});
	Btn19.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn19.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if(num1==2){
				L1.setText("S");
				six=true;
				repaint();
			
			}
			if(num1==3){
				L8.setText("S");
				seven=true;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn20.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn20.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn21.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn21.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn22.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn22.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn23.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn23.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn24.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn24.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});
	Btn25.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn25.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==3){
				num2++;
				repaint();
			}
			if (num1==4){
				L5.setText("Y");
				five=true;
				repaint();
			}
		}
	});
	Btn26.addActionListener(new ActionListener() { // Internal class
		public void actionPerformed(ActionEvent event){//If it is correct it will display the letter, else it will paint.
			Btn26.setEnabled(false);
			if (num1 == 0) {
				num2++;
				repaint();
			}
			if (num1==1){
				num2++;
				repaint();
			}
			if (num1==2){
				num2++;
				repaint();
			}
			if (num1==4){
				num2++;
				repaint();
			}
		}
	});

	next.addActionListener(new ActionListener(){ //Button to go to next round. Enables all the buttons and resets the data.
		public void actionPerformed(ActionEvent event){
			num3++;
			Btn1.setEnabled(true);
			Btn2.setEnabled(true);
			Btn3.setEnabled(true);
			Btn4.setEnabled(true);
			Btn5.setEnabled(true);
			Btn6.setEnabled(true);
			Btn7.setEnabled(true);
			Btn8.setEnabled(true);
			Btn9.setEnabled(true);
			Btn10.setEnabled(true);
			Btn11.setEnabled(true);
			Btn12.setEnabled(true);
			Btn13.setEnabled(true);
			Btn14.setEnabled(true);
			Btn15.setEnabled(true);
			Btn16.setEnabled(true);
			Btn17.setEnabled(true);
			Btn18.setEnabled(true);
			Btn19.setEnabled(true);
			Btn20.setEnabled(true);
			Btn21.setEnabled(true);
			Btn22.setEnabled(true);
			Btn23.setEnabled(true);
			Btn24.setEnabled(true);
			Btn25.setEnabled(true);
			Btn26.setEnabled(true);
			if (num1==3){
				L7.setVisible(true);
				L8.setVisible(true);
			}
			else{
				L7.setVisible(false);
				L8.setVisible(false);
			}
			L1.setText("____");
			L2.setText("____");
			L3.setText("____");
			L4.setText("____");
			L5.setText("____");
			L6.setVisible(false);
			next.setVisible(false);
			num2=0;
			repaint();
			if(num3==2){
				L4.setVisible(false);
				L5.setVisible(false);
					
				}
			else{
				L4.setVisible(true);
				L5.setVisible(true);
			}
			if(num1==5){
				L1.setText("Your Score is "+num4+"/5");
				L2.setVisible(false);
				L3.setVisible(false);
				L4.setVisible(false);
				L5.setVisible(false);
				L6.setVisible(false);
			}
		}
		
	});
	}
/**
 * This paint method draws the hangman picture. For each time num2 is increased it will draw
 * another piece of it. After it has drawn all of it, the player will lose.
 */

	public void paint(Graphics g) { 
		super.paint(g);
		g.fillRect(155, 150, 50, 250);
		g.fillRect(155, 150, 175, 50);
		if (num2 == 1) {
			g.setColor(new Color(255, 235, 205));
			g.fillOval(290, 195, 50, 50);
		}
		if (num2 == 2) {
			g.setColor(new Color(255, 105, 180));
			g.fillRect(298, 244, 35, 80);
			g.setColor(new Color(255, 235, 205));
			g.fillOval(290, 195, 50, 50);
			
		}
		if (num2 == 3) {
			g.setColor(new Color(255, 105, 180));
			g.fillRect(298, 244, 35, 80);
			g.setColor(new Color(255, 235, 205));
			g.fillOval(290, 195, 50, 50);
			g.fillRect(298, 324, 15, 50);
		}
		if (num2 == 4) {
			g.setColor(new Color(255, 105, 180));
			g.fillRect(298, 244, 35, 80);
			g.setColor(new Color(255, 235, 205));
			g.fillOval(290, 195, 50, 50);
			g.fillRect(298, 324, 15, 50);
			g.fillRect(318, 324, 15, 50);
			g.fillRect(298, 324, 15, 50);
		}
		if (num2 == 5) {
			g.setColor(new Color(255, 235, 205));
			g.fillOval(290, 195, 50, 50);
			g.fillRect(298, 324, 15, 50);
			g.fillRect(318, 324, 15, 50);
			g.fillRect(298, 324, 15, 50);
			g.fillRect(250, 274, 65, 15);
			g.fillRect(318, 324, 15, 50);
			g.fillRect(298, 324, 15, 50);
			g.setColor(new Color(255, 105, 180));
			g.fillRect(298, 244, 35, 80);
		}
		if (num2 == 6) {
			g.setColor(new Color(255, 235, 205));
			g.fillOval(290, 195, 50, 50);
			g.fillRect(318, 274, 65, 15);
			g.fillRect(250, 274, 65, 15);
			g.fillRect(318, 324, 15, 50);
			g.fillRect(298, 324, 15, 50);
			g.setColor(new Color(255, 105, 180));
			g.fillRect(298, 244, 35, 80);
		}
		if (num2 == 7) {
			g.setColor(new Color(255, 235, 205));
			g.fillOval(290, 195, 50, 50);
			g.fillRect(318, 274, 65, 15);
			g.fillRect(250, 274, 65, 15);
			g.fillRect(318, 324, 15, 50);
			g.fillRect(298, 324, 15, 50);
			g.setColor(new Color(255, 105, 180));
			g.fillRect(298, 244, 35, 80);
			g.setColor(Color.BLACK);
			g.fillOval(299,210,9,9);
			g.fillOval(320,210,9,9);
			g.fillArc(305,225,20,20,0,180);
			L6.setVisible(true);
			L6.setText("You Lose!");
			num1++;
			next.setVisible(true);
			Btn1.setEnabled(false);
			Btn2.setEnabled(false);
			Btn3.setEnabled(false);
			Btn4.setEnabled(false);
			Btn5.setEnabled(false);
			Btn6.setEnabled(false);
			Btn7.setEnabled(false);
			Btn8.setEnabled(false);
			Btn9.setEnabled(false);
			Btn10.setEnabled(false);
			Btn11.setEnabled(false);
			Btn12.setEnabled(false);
			Btn13.setEnabled(false);
			Btn14.setEnabled(false);
			Btn15.setEnabled(false);
			Btn16.setEnabled(false);
			Btn17.setEnabled(false);
			Btn18.setEnabled(false);
			Btn19.setEnabled(false);
			Btn20.setEnabled(false);
			Btn21.setEnabled(false);
			Btn22.setEnabled(false);
			Btn23.setEnabled(false);
			Btn24.setEnabled(false);
			Btn25.setEnabled(false);
			Btn26.setEnabled(false); 
		}
		//If all correct answers are selected.
		if(num1==0 && one==true && two==true && three==true && four==true){
			L6.setVisible(true);
			L6.setText("Correct!!! :D");
			num1++;
			one=false;
			two=false;
			three=false;
			four=false;
			five=false;
			next.setVisible(true);
			num4++;
			Btn1.setEnabled(false);
			Btn2.setEnabled(false);
			Btn3.setEnabled(false);
			Btn4.setEnabled(false);
			Btn5.setEnabled(false);
			Btn6.setEnabled(false);
			Btn7.setEnabled(false);
			Btn8.setEnabled(false);
			Btn9.setEnabled(false);
			Btn10.setEnabled(false);
			Btn11.setEnabled(false);
			Btn12.setEnabled(false);
			Btn13.setEnabled(false);
			Btn14.setEnabled(false);
			Btn15.setEnabled(false);
			Btn16.setEnabled(false);
			Btn17.setEnabled(false);
			Btn18.setEnabled(false);
			Btn19.setEnabled(false);
			Btn20.setEnabled(false);
			Btn21.setEnabled(false);
			Btn22.setEnabled(false);
			Btn23.setEnabled(false);
			Btn24.setEnabled(false);
			Btn25.setEnabled(false);
			Btn26.setEnabled(false);
		}
		if(num1==1 && one==true && two==true && three==true && four==true){
			L6.setVisible(true);
			L6.setText("Correct!!! :D");
			num1++;
			one=false;
			two=false;
			three=false;
			four=false;
			five=false;
			next.setVisible(true);
			num4++;
			Btn1.setEnabled(false);
			Btn2.setEnabled(false);
			Btn3.setEnabled(false);
			Btn4.setEnabled(false);
			Btn5.setEnabled(false);
			Btn6.setEnabled(false);
			Btn7.setEnabled(false);
			Btn8.setEnabled(false);
			Btn9.setEnabled(false);
			Btn10.setEnabled(false);
			Btn11.setEnabled(false);
			Btn12.setEnabled(false);
			Btn13.setEnabled(false);
			Btn14.setEnabled(false);
			Btn15.setEnabled(false);
			Btn16.setEnabled(false);
			Btn17.setEnabled(false);
			Btn18.setEnabled(false);
			Btn19.setEnabled(false);
			Btn20.setEnabled(false);
			Btn21.setEnabled(false);
			Btn22.setEnabled(false);
			Btn23.setEnabled(false);
			Btn24.setEnabled(false);
			Btn25.setEnabled(false);
			Btn26.setEnabled(false);
		}
		if(six==true && seven==true && eight==true){
			L6.setVisible(true);
			L6.setText("Correct!!! :D");
			num1++;
			six=false;
			seven=false;
			eight=false;
			next.setVisible(true);
			num4++;
			Btn1.setEnabled(false);
			Btn2.setEnabled(false);
			Btn3.setEnabled(false);
			Btn4.setEnabled(false);
			Btn5.setEnabled(false);
			Btn6.setEnabled(false);
			Btn7.setEnabled(false);
			Btn8.setEnabled(false);
			Btn9.setEnabled(false);
			Btn10.setEnabled(false);
			Btn11.setEnabled(false);
			Btn12.setEnabled(false);
			Btn13.setEnabled(false);
			Btn14.setEnabled(false);
			Btn15.setEnabled(false);
			Btn16.setEnabled(false);
			Btn17.setEnabled(false);
			Btn18.setEnabled(false);
			Btn19.setEnabled(false);
			Btn20.setEnabled(false);
			Btn21.setEnabled(false);
			Btn22.setEnabled(false);
			Btn23.setEnabled(false);
			Btn24.setEnabled(false);
			Btn25.setEnabled(false);
			Btn26.setEnabled(false);
		}
		if(num1==3 && one==true && two==true && three==true && four==true && five==true && six==true && seven==true){
			L6.setVisible(true);
			L6.setText("Correct!!! :D");
			num1++;
			one=false;
			two=false;
			three=false;
			four=false;
			five=false;
			six=false;
			seven=false;
			next.setVisible(true);
			num4++;
			Btn1.setEnabled(false);
			Btn2.setEnabled(false);
			Btn3.setEnabled(false);
			Btn4.setEnabled(false);
			Btn5.setEnabled(false);
			Btn6.setEnabled(false);
			Btn7.setEnabled(false);
			Btn8.setEnabled(false);
			Btn9.setEnabled(false);
			Btn10.setEnabled(false);
			Btn11.setEnabled(false);
			Btn12.setEnabled(false);
			Btn13.setEnabled(false);
			Btn14.setEnabled(false);
			Btn15.setEnabled(false);
			Btn16.setEnabled(false);
			Btn17.setEnabled(false);
			Btn18.setEnabled(false);
			Btn19.setEnabled(false);
			Btn20.setEnabled(false);
			Btn21.setEnabled(false);
			Btn22.setEnabled(false);
			Btn23.setEnabled(false);
			Btn24.setEnabled(false);
			Btn25.setEnabled(false);
			Btn26.setEnabled(false);
		}
		if(num1==4 && one==true && two==true && three==true && four==true && five==true){
			L6.setVisible(true);
			L6.setText("Correct!!! :D");
			num1++;
			one=false;
			two=false;
			three=false;
			four=false;
			five=false;
			next.setVisible(true);
			num4++;
			Btn1.setEnabled(false);
			Btn2.setEnabled(false);
			Btn3.setEnabled(false);
			Btn4.setEnabled(false);
			Btn5.setEnabled(false);
			Btn6.setEnabled(false);
			Btn7.setEnabled(false);
			Btn8.setEnabled(false);
			Btn9.setEnabled(false);
			Btn10.setEnabled(false);
			Btn11.setEnabled(false);
			Btn12.setEnabled(false);
			Btn13.setEnabled(false);
			Btn14.setEnabled(false);
			Btn15.setEnabled(false);
			Btn16.setEnabled(false);
			Btn17.setEnabled(false);
			Btn18.setEnabled(false);
			Btn19.setEnabled(false);
			Btn20.setEnabled(false);
			Btn21.setEnabled(false);
			Btn22.setEnabled(false);
			Btn23.setEnabled(false);
			Btn24.setEnabled(false);
			Btn25.setEnabled(false);
			Btn26.setEnabled(false);
		}
		
	}
	
}

