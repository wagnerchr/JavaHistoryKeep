package avaliativa01;

import static avaliativa01.TelaAdd.cadastros;
import static avaliativa01.TelaAdd.count;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.ImageIcon;


public class TelaExibe extends javax.swing.JFrame {

    // VARIÁVEIS STATICAS
     
    public static  ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
    public static String arquivo =  "bd.txt";

    public TelaExibe(ArrayList x, int count) {
        
        initComponents();
        this.cadastros = x;
        Atualiza(count);
        // ler_arquivo(bd, arquivo);
        // LER ARQUIVO
            
   
    }
    
    
    // ATUALIZA DADOS de cadastros
    public void Atualiza(int count) {
    
    // Sem cadastros
        if(cadastros.size()<=0){
            
             ImageIcon iconDefault = new ImageIcon("default-image.jpg");
            Image imageDefault = iconDefault.getImage().getScaledInstance(fotoLabel.getWidth(), fotoLabel.getHeight(), java.awt.Image.SCALE_SMOOTH);
            ImageIcon photoDefault = new ImageIcon(imageDefault);
               
            this.nomeText.setText("Nada a exibir");
            this.enderecoText.setText("Nada a exibir");
            this.cidadeText.setText("Nada a exibir");
            this.data_nascText.setText("Nada a exibir");
            this.alturaText.setText("Nada a exibir");
            this.numeroText.setText("Nada a exibir");
            this.fotoLabel.setIcon(photoDefault);
            
        } else{
        
            if(count > cadastros.size()-1)
                count = cadastros.size()-1;

            this.nomeText.setText(this.cadastros.get(count).getNome());
            this.enderecoText.setText(this.cadastros.get(count).getEndereco());
            this.cidadeText.setText(this.cadastros.get(count).getCidade());
            this.data_nascText.setText(String.valueOf(this.cadastros.get(count).getDataNasc()));
            this.alturaText.setText(String.valueOf(this.cadastros.get(count).getAltura()));
            this.numeroText.setText(String.valueOf(this.cadastros.get(count).getNumero()));
            this.fotoLabel.setIcon(this.cadastros.get(count).getFoto());
                
            selecionado.setText("Cadastros " + cadastros.indexOf(cadastros.get(count)) + "/" + (cadastros.size() -1));
        }
    }
    
    public void ler_arquivo(ArrayList bd, String arquivo) {
    
        try( BufferedReader buffRead = new BufferedReader(new FileReader(arquivo))) {
        
            String linha;
            while((linha = buffRead.readLine()) != null) {
                String vet[] = linha.split(",");
                
                System.out.println("WHILE - LENDO ARQUVIO");
                
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(vet[3]);
                ImageIcon img = new ImageIcon(vet[6]);
             
                bd.add(new Cadastro(vet[0], vet[1], vet[2], date, Float.parseFloat(vet[4]), Integer.parseInt(vet[5]), img));
            }
            
        } catch(IOException e) {
            System.out.println(e);
        } catch(Exception e){
            System.out.println(e);
        }

    }

         

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeText = new javax.swing.JTextField();
        insereCadastro = new javax.swing.JButton();
        data_nascText = new javax.swing.JTextField();
        alertLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enderecoText = new javax.swing.JTextPane();
        cidadeText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        estadoText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        numeroText = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        alturaText = new javax.swing.JTextField();
        fotoLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        selecionado = new javax.swing.JLabel();
        lerBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextActionPerformed(evt);
            }
        });

        insereCadastro.setText("Inserir novo Cadastro");
        insereCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insereCadastroActionPerformed(evt);
            }
        });

        data_nascText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_nascTextActionPerformed(evt);
            }
        });

        alertLabel.setText(".");

        jLabel2.setText("Nome");

        jLabel8.setText("Endereço");

        jLabel3.setText("Data de Nascimento");

        jScrollPane1.setViewportView(enderecoText);

        jLabel4.setText("Cidade");

        jLabel9.setText("Número");

        jScrollPane2.setViewportView(numeroText);

        jLabel5.setText("Estado");

        fotoLabel.setText("                             Escolher Foto");
        fotoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoLabelMouseClicked(evt);
            }
        });

        jLabel7.setText("Altura");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("Excluir esta Cadastro");

        selecionado.setText(".");

        lerBTN.setText("jButton1");
        lerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lerBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(fotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alturaText)
                                    .addComponent(data_nascText)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(estadoText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(insereCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selecionado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(lerBTN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selecionado)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(data_nascText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alturaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cidadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(estadoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(lerBTN)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insereCadastro)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alertLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// WAIT ! DANGER    
    private void nomeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextActionPerformed

// ABRIR TELA INSERE CADASTRO
    private void insereCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insereCadastroActionPerformed
        new TelaAdd().setVisible(true);
        this.setVisible(false);      
    }//GEN-LAST:event_insereCadastroActionPerformed
//
 
// WAIT A SECCOND    
    private void data_nascTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_nascTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_nascTextActionPerformed

// FUNCÃO DESCARTADA
    private void fotoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoLabelMouseClicked

    }//GEN-LAST:event_fotoLabelMouseClicked
//
   
// LER BD.TXT    
    private void lerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lerBTNActionPerformed
                   
            try {
                BufferedReader buffRead = new BufferedReader(new FileReader("bd.txt", StandardCharsets.ISO_8859_1)); 
        
                String linha = buffRead.readLine();
                
                while (linha != null) {    

                    String vet[] = linha.split(" ");

                    // Data
                        DateFormat formatter = new SimpleDateFormat("d/MM/yyyy");
                        Date date = (Date)formatter.parse("12/12/2000");

                    // String nome, String endereco, String cidade, Date dataNasc, float altura, int numero, ImageIcon foto
                    cadastros.add(new Cadastro(vet[0],  vet[1],  vet[2],  date, Float.parseFloat(vet[4]), Integer.parseInt(vet[5]),  new ImageIcon(vet[6])));

                    linha = buffRead.readLine();
                }
                 buffRead.close();
            }
            
            catch(Exception e) {
                System.out.println(e);
            }                
        
    }//GEN-LAST:event_lerBTNActionPerformed
//
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaExibe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaExibe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaExibe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaExibe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaExibe(cadastros, count).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertLabel;
    private javax.swing.JTextField alturaText;
    private javax.swing.JTextField cidadeText;
    private javax.swing.JTextField data_nascText;
    private javax.swing.JTextPane enderecoText;
    private javax.swing.JTextField estadoText;
    private javax.swing.JLabel fotoLabel;
    private javax.swing.JButton insereCadastro;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lerBTN;
    private javax.swing.JTextField nomeText;
    private javax.swing.JTextPane numeroText;
    private javax.swing.JLabel selecionado;
    // End of variables declaration//GEN-END:variables
}
