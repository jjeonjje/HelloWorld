package me.jjh.refactoring.chapter08.DuplicateObservedData.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class IntervalWIndow extends Frame {

	private static final long serialVersionUID = 1L;
	
	TextField _startField = new TextField("0",10);
	TextField _endField = new TextField("0",10);
	TextField _lengthField = new TextField("0",10);
	
	private void create() {
		setSize(500,80);
		setLayout(new FlowLayout());
		setTitle("관측 데이터 복제(리팩토링 전)");
		setVisible(true);
		
		add(new Label("start", Label.RIGHT));
		add(_startField,BorderLayout.NORTH);
		add(new Label("end", Label.RIGHT));
		add(_endField,BorderLayout.CENTER);
		add(new Label("length", Label.RIGHT));
		add(_lengthField,BorderLayout.SOUTH);
		
		_startField.addFocusListener(new SymFocus());
		_endField.addFocusListener(new SymFocus());
		_lengthField.addFocusListener(new SymFocus());		
	}
	
	public IntervalWIndow(){
		create();
	}
	
	class SymFocus extends FocusAdapter{
		public void focusLost(FocusEvent event) {
			Object object = event.getSource();
			
			if(object == _startField)
				StartField_FocusLost(event);
			else if(object == _endField)
				EndField_FocusLost(event);
			else if(object == _lengthField)
				LengthField_FocusLost(event);
		}
		
		private boolean isNumber(String str) {
			return str.replaceAll("\\d+","").equals("") ? true : false;
		}
		
		void StartField_FocusLost(FocusEvent event) {
			if(!isNumber(_startField.getText()))
				_startField.setText("0");
			calculateLength();
		}
		
		void EndField_FocusLost(FocusEvent event) {
			if(!isNumber(_endField.getText()))
				_endField.setText("0");
			calculateLength();			
		}
		
		void LengthField_FocusLost(FocusEvent event) {
			if(!isNumber(_lengthField.getText()))
				_lengthField.setText("0");
			calculateEnd();			
		}		
		
		void calculateLength() {
			try {
				
				int start = Integer.parseInt(_startField.getText());
				int end = Integer.parseInt(_endField.getText());
				int length = end - start;
				
				_lengthField.setText(String.valueOf(length));
				
			} catch (Exception e) {
				throw new RuntimeException("잘못된 숫자 형식 오류");
			}
		}
		
		void calculateEnd() {
			try {
				
				int start = Integer.parseInt(_startField.getText());
				int length = Integer.parseInt(_lengthField.getText());
				int end = start + length;
				
				_endField.setText(String.valueOf(end));
				
			} catch (Exception e) {
				throw new RuntimeException("잘못된 숫자 형식 오류");
			}
		}
	}
	
}
