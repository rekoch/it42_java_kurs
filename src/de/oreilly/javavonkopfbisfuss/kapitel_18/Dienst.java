package de.oreilly.javavonkopfbisfuss.kapitel_18;

import java.io.Serializable;

import javax.swing.JPanel;

public interface Dienst extends Serializable { 
	public JPanel getGuiPanel();
}