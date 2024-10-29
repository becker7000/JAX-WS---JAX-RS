package mx.com.cst.webapp.cliente.gui;

import mx.com.cst.webapp.jaxws.service.Paciente;
import mx.com.cst.webapp.jaxws.service.ServicioWebMedico;
import mx.com.cst.webapp.jaxws.service.ServicioWebMedicoImpService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaImc extends JFrame {

    private JTextField masaTextField;
    private JTextField estaturaTextField;
    private JButton generarDiagnosticoButton;
    private JPanel panel;
    private JTextArea diagnosticoTextArea;
    private JTextField nombreTextField;
    private JButton limpiarDatosButton;

    public VentanaImc(){

        this.setTitle("Cliente Web Service");
        this.setVisible(true);
        this.setSize(500,580);
        this.setMinimumSize(new Dimension(480,480));
        this.setLocationRelativeTo(null);
        this.iniciarComponentes();
        this.diagnosticoTextArea.setEditable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes() {
        this.colocarPaneles();
        this.comportamientoBotones();
    }

    private void colocarPaneles() {
        this.getContentPane().add(panel);
    }

    private void comportamientoBotones() {

        ActionListener click = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{

                    // Primero probar este código:
                    ServicioWebMedico servicioWebMedico = new ServicioWebMedicoImpService().getServicioWebMedicoImpPort();
                    String nombre = nombreTextField.getText();
                    double masa = Double.parseDouble(masaTextField.getText());
                    double estatura = Double.parseDouble(estaturaTextField.getText());
                    String diagnostico = servicioWebMedico.obtenerDiagnostico(nombre,masa,estatura);
                    diagnosticoTextArea.setText(diagnostico);

                    // Otros detalles:
                    System.out.println("\n\t Saludo: "+servicioWebMedico.saludar(nombre));
                    Paciente paciente = new Paciente();
                    paciente.setNombre(nombre);
                    Paciente pacienteCopia = servicioWebMedico.crearPaciente(paciente);
                    System.out.println("\n\t Paciente copia: "+pacienteCopia.getNombre());
                    System.out.println("\n\t Lista de pacientes: ");
                    servicioWebMedico.listarPacientes().forEach(
                            p-> System.out.print("\n\t Nombre: "+p.getNombre())
                    );
                    System.out.println("\n");
                }catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(
                            null,
                            "La masa y la estatura deben ser numeros",
                            "Error de entrada",
                            JOptionPane.ERROR_MESSAGE
                    );
                }catch (Exception exception){
                    System.out.println("\n\t Error al consultar el Web Service");
                    System.out.println("\n\t Error: "+exception.getMessage());
                }
            }
        };

        generarDiagnosticoButton.addActionListener(click);

        ActionListener limpiar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreTextField.setText("");
                masaTextField.setText("");
                estaturaTextField.setText("");
                diagnosticoTextArea.setText("");
            }
        };

        limpiarDatosButton.addActionListener(limpiar);

    }


}
