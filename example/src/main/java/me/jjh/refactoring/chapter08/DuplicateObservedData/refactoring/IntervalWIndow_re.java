package me.jjh.refactoring.chapter08.DuplicateObservedData.refactoring;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Observable;
import java.util.Observer;

public class IntervalWIndow_re extends Frame implements Observer{

	private static final long serialVersionUID = 1L;
	
	TextField startField = new TextField("0",10);
	TextField endField = new TextField("0",10);;
	TextField lengthField = new TextField("0",10);;
	
	private Interval subject;
	
	private void create() {
		setSize(500,80);
		setLayout(new FlowLayout());
		setTitle("관측 데이터 복제(리팩토링 후)");
		setVisible(true);
		
		add(new Label("start", Label.RIGHT));
		add(startField,BorderLayout.NORTH);
		add(new Label("end", Label.RIGHT));
		add(endField,BorderLayout.CENTER);
		add(new Label("length", Label.RIGHT));
		add(lengthField,BorderLayout.SOUTH);
		
		startField.addFocusListener(new SymFocus());
		endField.addFocusListener(new SymFocus());
		lengthField.addFocusListener(new SymFocus());		
	}
	
	public IntervalWIndow_re(){
		create();
		
		subject = new Interval();
		subject.addObserver(this);
		update(subject,null);
	}
	
	public void update(Observable o, Object arg) {
		startField.setText(subject.getStart());
		endField.setText(subject.getEnd());
		lengthField.setText(subject.getLength());
	}	
	
	String getStart() {
		return subject.getStart();
	}
	
	void setStart(String start) {
		subject.setStart(start);
	}
	
	String getEnd() {
		return subject.getEnd();
	}
	
	void setEnd(String end) {
		subject.setEnd(end);
	}
	
	String getLength() {
		return subject.getLength();
	}
	
	void setLength(String length) {
		subject.setLength(length);
	}
	
	class SymFocus extends FocusAdapter{
		public void focusLost(FocusEvent event) {
			Object object = event.getSource();
			
			if(object == startField)
				StartField_FocusLost(event);
			else if(object == endField)
				EndField_FocusLost(event);
			else if(object == lengthField)
				LengthField_FocusLost(event);
		}
		
		private boolean isNumber(String str) {
			return str.replaceAll("\\d+","").equals("") ? true : false;
		}
		
		void StartField_FocusLost(FocusEvent event) {
			setStart(startField.getText());
			if(!isNumber(getStart()))
				setStart("0");
			subject.calculateLength();
		}
		
		void EndField_FocusLost(FocusEvent event) {
			setEnd(endField.getText());
			if(!isNumber(getEnd()))
				setEnd("0");
			subject.calculateLength();			
		}
		
		void LengthField_FocusLost(FocusEvent event) {
			setLength(lengthField.getText());
			if(!isNumber(getLength()))
				setLength("0");
			subject.calculateEnd();			
		}		
		
	}

}
