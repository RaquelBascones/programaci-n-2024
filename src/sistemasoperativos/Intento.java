
import javax.swing.*;
import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Intento extends JFrame {
    public JTextArea terminalArea;
    public JScrollPane scrollPane;

    public Intento() {
        // Configuración de la ventana principal
        setTitle("Terminal");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Configuración del área de texto (terminal)
        terminalArea = new JTextArea();
        terminalArea.setEditable(true);
        terminalArea.setBackground(Color.BLACK);
        terminalArea.setForeground(Color.GREEN);
        terminalArea.setCaretColor(Color.GREEN);
        terminalArea.setFont(new Font("Monospaced", Font.PLAIN, 20));

        // Configuración del panel de desplazamiento para el área de texto
        scrollPane = new JScrollPane(terminalArea);
        add(scrollPane);

        // Mostrar la ruta actual antes de solicitar el comando
        appendToTerminal(getCurrentPath() + "> ");

        // Configuración del evento de teclado para procesar comandos al presionar Enter
        terminalArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
                    processCommand();
                    evt.consume();
                }
            }
        });

        // Hacer visible la ventana
        setVisible(true);
    }

    // Método para obtener la ruta actual del directorio de trabajo
    public String getCurrentPath() {
        return "Sully Terminal";
    }

    // Método para procesar el comando ingresado
    public void processCommand() {
        String command = getCommand();
        switch (command.toLowerCase()) {
            case "saludo":
                appendToTerminal("\nBuenas tardes");
                break;
            case "juego":
                // Agrega aquí el código para el caso "juego"
                break;
                
            case "clear":
                terminalArea.setText(""); // Limpiar el contenido del área de texto
                terminalArea.setCaretPosition(0); // Mover el cursor al principio del texto
                break;
                
            case "fiesta":
            	new Thread(() -> {
        	        try {
        	            for (int i = 0; i < 10; i++) {
        	                terminalArea.setBackground(Color.RED);
        	                Thread.sleep(50);
        	                terminalArea.setBackground(Color.GREEN);
        	                Thread.sleep(50);
        	                terminalArea.setBackground(Color.BLUE);
        	                Thread.sleep(50);
        	                terminalArea.setBackground(Color.MAGENTA);
        	                Thread.sleep(50);
        	                terminalArea.setBackground(Color.RED);
        	                Thread.sleep(50);
        	                terminalArea.setBackground(Color.YELLOW);
        	                Thread.sleep(50);
        	                terminalArea.setBackground(Color.CYAN);
        	                Thread.sleep(50);
        	                terminalArea.setBackground(Color.ORANGE);
        	                Thread.sleep(50);
        	                terminalArea.setBackground(Color.BLUE);
        	                Thread.sleep(50);
        	                terminalArea.setBackground(Color.GREEN);
        	                Thread.sleep(50);
        	                terminalArea.setBackground(Color.RED);
        	                Thread.sleep(50);
        	                terminalArea.setBackground(Color.BLUE);
        	                Thread.sleep(50);
        	            }
        	            terminalArea.setBackground(Color.BLACK); // Vuelve al color negro al final
        	        } catch (InterruptedException e) {
        	            e.printStackTrace();
        	        }
        	    }).start();
                break;
            default:
                // Si no coincide con ningún comando predefinido, se asume que es un comando de Bash
                executeBashCommand(command);
                break;
        }
        appendToTerminal(getCurrentPath() + "> ");  // Mostrar la ruta actual antes de solicitar el próximo comando
        setCommand("");  // Limpiar el área de entrada
    }

    // Método para ejecutar el comando ingresado en bash
    private void executeBashCommand(String command) {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"bash", "-c", command});
            process.waitFor();

            // Leer la salida del comando y mostrarla en el terminal
            java.util.Scanner scanner = new java.util.Scanner(process.getInputStream()).useDelimiter("\\A");
            appendToTerminal(scanner.hasNext() ? scanner.next() : "");
        } catch (Exception e) {
            appendToTerminal("Error al ejecutar el comando: " + e.getMessage());
        }
    }

    // Método para agregar texto al área de texto (terminal)
    public void appendToTerminal(String text) {
        SwingUtilities.invokeLater(() -> {
            terminalArea.append(text + "\n");
            terminalArea.setCaretPosition(terminalArea.getDocument().getLength());
        });
    }

    // Método para obtener el comando ingresado
    public String getCommand() {
        String text = terminalArea.getText();
        int lastNewLine = text.lastIndexOf("\n");
        if (lastNewLine >= 0) {
            return text.substring(lastNewLine + 1);
        } else {
            return text;
        }
    }

    // Método para establecer el texto en el área de entrada del terminal
    public void setCommand(String command) {
        SwingUtilities.invokeLater(() -> terminalArea.setText(terminalArea.getText() + command));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Intento());
    }
}