/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uninove.controle;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Roberto Silva
 */
public class Util_OS {
    
    public static void limparCampos(Container container) {
        Component components[] = container.getComponents();

        for (Component component : components) {
             
            if (component instanceof JFormattedTextField) {
                JFormattedTextField field = (JFormattedTextField) component;
                field.setValue(null);
            }else if (component instanceof JTextField) {
                JTextField field = (JTextField) component;
                field.setText("");
            }  else if (component instanceof JPasswordField) {
                JPasswordField password = (JPasswordField) component;
                password.setText("");
            }
        }
    }
    
     public static void habilitarCampos(Container container) {
        Component components[] = container.getComponents();

        for (Component component : components) {

            if (component instanceof JFormattedTextField) {
                JFormattedTextField fieldF = (JFormattedTextField) component;
                fieldF.setEditable(true);

            } else if (component instanceof JTextField) {
                JTextField fieldT = (JTextField) component;
                fieldT.setEditable(true);

            } else if (component instanceof JTextArea) {
                JTextArea area = (JTextArea) component;
                area.setEditable(true);
            } else if (component instanceof JComboBox) {
                JComboBox combobox = (JComboBox) component;
                combobox.setEnabled(true);
            } else if (component instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) component;
                checkBox.setEnabled(true);
            }
        }
    }

    public static void desabilitarCampos(Container container) {
        Component components[] = container.getComponents();

        for (Component component : components) {

            if (component instanceof JFormattedTextField) {
                JFormattedTextField fieldF = (JFormattedTextField) component;
                fieldF.setEditable(false);

            } else if (component instanceof JTextField) {
                JTextField fieldT = (JTextField) component;
                fieldT.setEditable(false);

            } else if (component instanceof JTextArea) {
                JTextArea area = (JTextArea) component;
                area.setEditable(false);
            } else if (component instanceof JComboBox) {
                JComboBox combobox = (JComboBox) component;
                combobox.setEnabled(false);
            } else if (component instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) component;
                checkBox.setEnabled(false);
                checkBox.setSelected(false);
            }
        }
    }
}
