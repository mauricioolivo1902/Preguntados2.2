import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class interfaz {

    private int jugador=0;
    private int numPregu=1;
    private int puntaje=0;
    ArrayList<jugadores> juga = new ArrayList<jugadores>();
    preguntas pregus = new preguntas();
    record rank = new record ();
    private JPanel panel1;
    private JTextField txtNombre;
    private JButton btnRegistro;
    private JButton res1;
    private JLabel numJugador;
    private JLabel nomJugador;
    private JLabel pregunta;
    private JButton res2;
    private JButton res3;
    private JButton res4;
    private JPanel registro;
    private JPanel preguntas;
    private JTabbedPane tabbedPane1;
    private JPanel play;
    private JPanel ranking;
    private JTextArea txtAJuga;
    private JTextArea txtAPunt;
    private JButton actualizarButton;

    public boolean hayJugad(){
        if(jugador+1==juga.size()){
            return  false;
        }else {
            return true;
        }
    }

    private void actualizar(){
        juga.get(jugador).setPuntuacion(puntaje);
        if(pregus.hayPregus(numPregu)==false){
            if(hayJugad()==false){
                JOptionPane.showMessageDialog(null,"Se acabo el Juego");
                registro.setVisible(true);
                preguntas.setVisible(false);
                acabo();
            }else{
                JOptionPane.showMessageDialog(null,"Siguiente Jugador");
                jugador+=1;
                numPregu=1;
                puntaje=0;
                nomJugador.setText(juga.get(jugador).getNombre());
                pregunta.setText(pregus.quePregunta(numPregu));
                res1.setText(pregus.Op1(numPregu));
                res2.setText(pregus.Op2(numPregu));
                res3.setText(pregus.Op3(numPregu));
                res4.setText(pregus.Op4(numPregu));
            }
        }else {
            numPregu+=1;
            pregunta.setText(pregus.quePregunta(numPregu));
            res1.setText(pregus.Op1(numPregu));
            res2.setText(pregus.Op2(numPregu));
            res3.setText(pregus.Op3(numPregu));
            res4.setText(pregus.Op4(numPregu));
        }
    }

    public void acabo(){
        int obj = juga.size();
        for(int i=0;i<obj;i++){
            rank.agregar(juga.get(i));
        }
        rank.ordenar();
        txtAJuga.setText(rank.imprimirNom());
        txtAPunt.setText(rank.imprimirPun());
        tabbedPane1.setSelectedComponent(ranking);
        juga.clear();
        numPregu=1;
        jugador=0;
        puntaje=0;
        numJugador.setText(String.valueOf(jugador+1));
    }

    public interfaz() {
        registro.setVisible(true);
        preguntas.setVisible(false);
        pregunta.setText(pregus.quePregunta(numPregu));
        res1.setText(pregus.Op1(numPregu));
        res2.setText(pregus.Op2(numPregu));
        res3.setText(pregus.Op3(numPregu));
        res4.setText(pregus.Op4(numPregu));

        btnRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                juga.add(new jugadores(txtNombre.getText()));
                JOptionPane.showMessageDialog(null,"Se registro el jugador Correctamente");
                jugador+=1;
                int pregu = JOptionPane.showConfirmDialog(null, "¿Quieres registrar otro jugador?", "Confirmar", JOptionPane.YES_NO_OPTION);
                numJugador.setText(String.valueOf(jugador+1));
                txtNombre.setText("");
                    if (pregu == JOptionPane.NO_OPTION) {
                        registro.setVisible(false);
                        preguntas.setVisible(true);
                        jugador=0;
                        nomJugador.setText(juga.get(jugador).getNombre());
                    }
                }

        });
        res1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pregus.opCorr(numPregu)==1){
                    JOptionPane.showMessageDialog(null,"Correcto!");
                    puntaje+=1;
                    actualizar();
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrecto!");
                    actualizar();
                }
            }
        });
        res2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pregus.opCorr(numPregu)==2){
                    JOptionPane.showMessageDialog(null,"Correcto!");
                    puntaje+=1;
                    actualizar();
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrecto!");
                    actualizar();
                }
            }
        });
        res3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pregus.opCorr(numPregu)==3){
                    JOptionPane.showMessageDialog(null,"Correcto!");
                    puntaje+=1;
                    actualizar();
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrecto!");
                    actualizar();
                }
            }
        });
        res4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pregus.opCorr(numPregu)==4){
                    JOptionPane.showMessageDialog(null,"Correcto!");
                    actualizar();
                    puntaje+=1;
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrecto!");
                    actualizar();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("interfaz");
        frame.setContentPane(new interfaz().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
