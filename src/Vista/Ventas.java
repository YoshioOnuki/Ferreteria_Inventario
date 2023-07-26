
package Vista;

import Consultas.clienteConsulta;
import Consultas.ventaConsulta;
import Modelo.cliente;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.io.File;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Ventas extends javax.swing.JPanel {
    
    DefaultTableModel m = new DefaultTableModel();
    
    Modelo.cliente cliente = new cliente();
    
    ventaConsulta ventaConsulta = new ventaConsulta();
    Consultas.clienteConsulta clienteConsulta = new clienteConsulta();
    
    public static int tipo_vista;
    
    public Ventas() {
        initComponents();
        mostrarUsuarios();
        mostrarBotones();
    }
    
    void mostrarBotones(){
        if(Login.id_rol == 2){
            btnCompras.setVisible(false);
            lblTrabajadores.setVisible(false);
            btnVentas.setVisible(false);
            lblVentas.setVisible(false);
        }else{
            btnCompras.setVisible(true);
            lblTrabajadores.setVisible(true);
            btnVentas.setVisible(true);
            lblVentas.setVisible(true);
        }
    }
    
    //Generamos el Numero del recibo
    String generarReciNum(int id_venta){
        String numRe = "VENT" + ventaConsulta.generarNum(id_venta);
        
        return numRe;
    }
    
    void imprimir_pdf(){
        int fila = tablaVentas.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }else{
            int id_venta = Integer.parseInt(tablaVentas.getValueAt(fila, 0).toString());
            String nombreBoleta = generarReciNum(id_venta);
            File path = new File(nombreBoleta+ ".pdf");
            
            int id_cliente = ventaConsulta.buscarCliente(id_venta);
            cliente = clienteConsulta.datosClienteID(id_cliente);

            String fecha = tablaVentas.getValueAt(fila, 3).toString();
            String dniCliente = cliente.getCliente_documento();
            String nombreCliente = tablaVentas.getValueAt(fila, 1).toString();
            String nombreTrabajador = tablaVentas.getValueAt(fila, 2).toString();
            String dir = cliente.getCliente_direccion();
            double total = Double.parseDouble(tablaVentas.getValueAt(fila, 4).toString());

            try {
                generar_pdf(nombreBoleta, fecha, dniCliente, nombreCliente, nombreTrabajador, dir, total, id_venta);
            } catch (FileNotFoundException ex) {
                System.out.println("Error 1 de pdf FileNotFoundException> ");
            } catch (DocumentException ex) {
                System.out.println("Error 2 de pdf DocumentException> ");
            }

            ImageIcon icon = new ImageIcon("src/Image/IconDocConf.png");
            JOptionPane.showMessageDialog(null, "Generando Recibo de Venta", "¡Abriendo!",JOptionPane.WARNING_MESSAGE, icon);

            abrirPDF(nombreBoleta);
            
        }
        
    }
    
    //metodo que me abre el pdf generado
    public void abrirPDF(String codigo){
        try {
            String nombreArchivo = codigo + ".pdf";

            // Obtenemos la ubicación actual del proyecto
            String ubicacionProyecto = Paths.get("").toAbsolutePath().toString();

            // Ruta completa del archivo PDF
            String rutaCompleta = Paths.get(ubicacionProyecto, "PDF_Ventas", nombreArchivo).toString();

            File path = new File(rutaCompleta);
            Desktop.getDesktop().open(path);
        } catch (Exception e) {
            System.out.println("Error al abrir el pdf " + e);
        }
    }
    
    //metodo que me crea un pdf del recibo
    public void generar_pdf(String codigo, String fecha, String dni, String nombreCliente, String nombreTrabajador, String dir, double total, int id_venta) throws FileNotFoundException, DocumentException {
        String nombreArchivo = codigo + ".pdf";
        String rutaCarpetaVentas = "PDF_Ventas";
        
        // Obtenemos la ubicación actual del proyecto
        String ubicacionProyecto = Paths.get("").toAbsolutePath().toString();

        // Creamos la carpeta "Ventas" en la ubicación del proyecto si no existe
        File carpetaVentas = new File(ubicacionProyecto, rutaCarpetaVentas);
        if (!carpetaVentas.exists()) {
            carpetaVentas.mkdirs();
        }

        // Ruta completa del archivo en la carpeta "Ventas"
        String rutaCompleta = Paths.get(ubicacionProyecto, rutaCarpetaVentas, nombreArchivo).toString();
        FileOutputStream archivo = new FileOutputStream(rutaCompleta);

        Document documento = new Document() ;
        PdfWriter.getInstance(documento, archivo);
        documento.open();
                
        try {
            Font negrita1 = new Font(Font.FontFamily.HELVETICA,14,Font.BOLD,BaseColor.BLACK);
            Font negrita2 = new Font(Font.FontFamily.HELVETICA,22,Font.BOLD,BaseColor.BLACK);
            Font negrita3 = new Font(Font.FontFamily.HELVETICA,12,Font.BOLD,BaseColor.BLACK);
            Font negrita4 = new Font(Font.FontFamily.HELVETICA,12,Font.BOLD,BaseColor.WHITE);
            
            
            PdfPTable encabezado = new PdfPTable(1);
            encabezado.setWidthPercentage(100);
            encabezado.getDefaultCell().setBorder(0);
            float[] clumnasEncabezado = new float[]{100f};
            encabezado.setWidths(clumnasEncabezado);
            encabezado.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            Paragraph parrafo = new Paragraph("Ferreteria José Mori",negrita2);
            parrafo.setAlignment(1);
            documento.add(parrafo);
            Paragraph parrafo2 = new Paragraph("Tu ferretería de confianza, donde cada proyecto toma forma.",negrita1);
            parrafo2.setAlignment(1);
            documento.add(parrafo2);
            
            Paragraph linea1 = new Paragraph("\n                                                                                    ________________________",negrita1);
            documento.add(linea1);
            Paragraph titulo3 = new Paragraph("\n                                                                                   R.U.C. N° 1234567890",negrita1);
            titulo3.setAlignment(1);
            documento.add(titulo3);
            Paragraph titulo = new Paragraph("                                                                                   Boleta de Pago Electrónico",negrita1);
            titulo.setAlignment(1);
            documento.add(titulo);
            Paragraph titulo2 = new Paragraph("                                                                                   " + codigo, negrita1);
            titulo2.setAlignment(1);
            documento.add(titulo2);
            Paragraph linea2 = new Paragraph("                                                                                    ________________________",negrita1);
            documento.add(linea2);
            
            //datos de la empresa
            documento.add(new Paragraph("\n\n"));
            PdfPTable tablaEmpresa = new PdfPTable(2);
            tablaEmpresa.setWidthPercentage(100);
            tablaEmpresa.getDefaultCell().setBorder(0);
            float[] clumnasE = new float[]{55f,100f};
            tablaEmpresa.setWidths(clumnasE);
            tablaEmpresa.setHorizontalAlignment(Element.ALIGN_CENTER);
            PdfPCell pEmp1 = new  PdfPCell(new Phrase(" ",negrita4));
            PdfPCell pEmp2 = new  PdfPCell(new Phrase("Ferreteria José Mori E.I.R.L",negrita4));
            pEmp1.setBorder(0);
            pEmp2.setBorder(0);
            pEmp1.setBackgroundColor(BaseColor.GRAY);
            pEmp2.setBackgroundColor(BaseColor.GRAY);
            tablaEmpresa.addCell(pEmp1);
            tablaEmpresa.addCell(pEmp2);
            documento.add(tablaEmpresa);
            
            documento.add(new Paragraph("Fecha:           " + fecha + "                                    Trabajador:           "+nombreTrabajador));
            documento.add(new Paragraph("Celular:         999999999                                     Direccion:         Av. Curimaná #69"));
            
            //datos del cliente
            documento.add(new Paragraph("\n______________________________________________________________________________"));
            documento.add(new Paragraph("Cliente:          " + nombreCliente));
            documento.add(new Paragraph("DNI:               " + dni + "                                      Direccion:         " + dir));
            
            Paragraph titulo5 = new Paragraph("\nDetalles de la Venta",negrita1);
            titulo5.setAlignment(1);
            documento.add(titulo5);
            
            //prodcutos
            documento.add(new Paragraph("\n"));
            PdfPTable tablaP = new PdfPTable(4);
            tablaP.setWidthPercentage(100);
            tablaP.getDefaultCell().setBorder(0);
            float[] clumnasP = new float[]{15f, 60f, 20f, 20f};
            tablaP.setWidths(clumnasP);
            tablaP.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell p1 = new  PdfPCell(new Phrase("N° ",negrita4));
            PdfPCell p2 = new  PdfPCell(new Phrase("Descripción",negrita4));
            PdfPCell p3 = new  PdfPCell(new Phrase("Cantidad",negrita4));
            PdfPCell p4 = new  PdfPCell(new Phrase("Importe",negrita4));
            p1.setBorder(0);
            p2.setBorder(0);
            p3.setBorder(0);
            p4.setBorder(0);
            p1.setBackgroundColor(BaseColor.DARK_GRAY);
            p2.setBackgroundColor(BaseColor.DARK_GRAY);
            p3.setBackgroundColor(BaseColor.DARK_GRAY);
            p4.setBackgroundColor(BaseColor.DARK_GRAY);
            tablaP.addCell(p1);
            tablaP.addCell(p2);
            tablaP.addCell(p3);
            tablaP.addCell(p4);
            
            Object[][] datos = ventaConsulta.obtenerDatosDetalle(id_venta);
            
            for(int i=0;i<datos.length;i++){
                String nro = String.valueOf(i + 1);
                String des = String.valueOf(datos[i][0]);
                String cantidad = String.valueOf(datos[i][1]);
                String importe = String.format("%.2f", Double.parseDouble(datos[i][2].toString()));

                tablaP.addCell(nro);
                tablaP.addCell(des);
                tablaP.addCell(cantidad);
                tablaP.addCell(importe);
            }
            
            documento.add(tablaP);
            
            //pago
            documento.add(new Paragraph("______________________________________________________________________________"));
            documento.add(new Paragraph("                                                                                                       Pago:            S/. " + String.format("%.2f", total)));
            
            Paragraph finall = new Paragraph("\n\n\nAgradecemos su compra. ¡Su satisfacción es nuestra mayor recompensa!", negrita3);
            finall.setAlignment(Element.ALIGN_CENTER);
            documento.add(finall);
            
        } catch (BadElementException ex) {
            System.out.println("" + ex);
        }
        documento.close();
        
    }
    
    void mostrarUsuarios(){
        try {
            m = ventaConsulta.consultarVentas();
            tablaVentas.setModel(m);

            JTableHeader header = tablaVentas.getTableHeader();
            
            TableColumn t1 = tablaVentas.getColumn("ID");
            t1.setPreferredWidth(50);
            t1.setMaxWidth(50);
            t1.setMinWidth(50);
            DefaultTableCellRenderer centerRenderer1 = new DefaultTableCellRenderer();
            centerRenderer1.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t1.setCellRenderer(centerRenderer1);
            
            TableColumn t2 = tablaVentas.getColumn("CLIENTE");
            t2.setPreferredWidth(280);
            t2.setMaxWidth(280);
            t2.setMinWidth(280);
            
            
            TableColumn t3 = tablaVentas.getColumn("TRABAJADOR");
            t3.setPreferredWidth(280);
            t3.setMaxWidth(280);
            t3.setMinWidth(280);
            
            TableColumn t4 = tablaVentas.getColumn("FECHA");
            t4.setPreferredWidth(116);
            t4.setMaxWidth(116);
            t4.setMinWidth(116);
            DefaultTableCellRenderer centerRenderer4 = new DefaultTableCellRenderer();
            centerRenderer4.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t4.setCellRenderer(centerRenderer4);
            
            TableColumn t5 = tablaVentas.getColumn("TOTAL");
            t5.setPreferredWidth(90);
            t5.setMaxWidth(90);
            t5.setMinWidth(90);
            DefaultTableCellRenderer centerRenderer5 = new DefaultTableCellRenderer();
            centerRenderer5.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            t5.setCellRenderer(centerRenderer5);
            
            tablaVentas.setRowHeight(30);
        } catch (Exception e) {
            System.out.println("Error al listar ventas: " + e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        btnCompras = new javax.swing.JPanel();
        lblTrabajadores = new javax.swing.JLabel();
        btnVentas = new javax.swing.JPanel();
        lblVentas = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JPanel();
        nuevo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        btnPDF = new javax.swing.JPanel();
        pdf = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setMaximumSize(new java.awt.Dimension(970, 620));
        setMinimumSize(new java.awt.Dimension(970, 620));

        jPanel6.setBackground(new java.awt.Color(53, 66, 89));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMaximumSize(new java.awt.Dimension(970, 40));
        jPanel6.setMinimumSize(new java.awt.Dimension(970, 40));
        jPanel6.setPreferredSize(new java.awt.Dimension(970, 40));

        btnCompras.setBackground(new java.awt.Color(53, 66, 89));
        btnCompras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.setMaximumSize(new java.awt.Dimension(200, 40));
        btnCompras.setMinimumSize(new java.awt.Dimension(200, 40));
        btnCompras.setPreferredSize(new java.awt.Dimension(200, 40));
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprasMouseExited(evt);
            }
        });

        lblTrabajadores.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblTrabajadores.setForeground(new java.awt.Color(255, 255, 255));
        lblTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrabajadores.setText("Compras");
        lblTrabajadores.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTrabajadores.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTrabajadores.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnComprasLayout = new javax.swing.GroupLayout(btnCompras);
        btnCompras.setLayout(btnComprasLayout);
        btnComprasLayout.setHorizontalGroup(
            btnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnComprasLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnComprasLayout.setVerticalGroup(
            btnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTrabajadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnVentas.setBackground(new java.awt.Color(221, 107, 77));
        btnVentas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setMaximumSize(new java.awt.Dimension(200, 40));
        btnVentas.setMinimumSize(new java.awt.Dimension(200, 40));
        btnVentas.setPreferredSize(new java.awt.Dimension(200, 40));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });

        lblVentas.setFont(new java.awt.Font("SF UI Display", 1, 16)); // NOI18N
        lblVentas.setForeground(new java.awt.Color(255, 255, 255));
        lblVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentas.setText("Ventas");
        lblVentas.setMaximumSize(new java.awt.Dimension(210, 28));
        lblVentas.setMinimumSize(new java.awt.Dimension(210, 28));
        lblVentas.setPreferredSize(new java.awt.Dimension(210, 28));

        javax.swing.GroupLayout btnVentasLayout = new javax.swing.GroupLayout(btnVentas);
        btnVentas.setLayout(btnVentasLayout);
        btnVentasLayout.setHorizontalGroup(
            btnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnVentasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnVentasLayout.setVerticalGroup(
            btnVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnVentasLayout.createSequentialGroup()
                .addComponent(lblVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 571, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("SF UI Display", 1, 26)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(24, 28, 50));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Ventas");
        lblTitulo.setMaximumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setMinimumSize(new java.awt.Dimension(210, 28));
        lblTitulo.setPreferredSize(new java.awt.Dimension(210, 28));

        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setMaximumSize(new java.awt.Dimension(100, 42));
        btnNuevo.setMinimumSize(new java.awt.Dimension(100, 42));

        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnNuevo.png"))); // NOI18N

        javax.swing.GroupLayout btnNuevoLayout = new javax.swing.GroupLayout(btnNuevo);
        btnNuevo.setLayout(btnNuevoLayout);
        btnNuevoLayout.setHorizontalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnNuevoLayout.setVerticalGroup(
            btnNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(816, 350));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(816, 350));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(816, 350));

        tablaVentas.setFont(new java.awt.Font("SF UI Display", 0, 17)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "TRABAJADOR", "FECHA", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaVentas);

        btnPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPDF.setMaximumSize(new java.awt.Dimension(100, 42));
        btnPDF.setMinimumSize(new java.awt.Dimension(100, 42));
        btnPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPDFMouseClicked(evt);
            }
        });

        pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnPDF.png"))); // NOI18N
        pdf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnPDFLayout = new javax.swing.GroupLayout(btnPDF);
        btnPDF.setLayout(btnPDFLayout);
        btnPDFLayout.setHorizontalGroup(
            btnPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnPDFLayout.setVerticalGroup(
            btnPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseClicked
        Compras Compras = new Compras();
            
        Compras.setSize(new Dimension(970, 620));
        Compras.setLocation(0,0);
        Principal.PanelPrincipal.removeAll();
        Principal.PanelPrincipal.add(Compras,BorderLayout.CENTER);
        Principal.PanelPrincipal.revalidate();
        Principal.PanelPrincipal.repaint();
    }//GEN-LAST:event_btnComprasMouseClicked

    private void btnComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseEntered
        btnCompras.setBackground(new Color(204, 94, 65));
    }//GEN-LAST:event_btnComprasMouseEntered

    private void btnComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseExited
        btnCompras.setBackground(new Color(53, 66, 89));
    }//GEN-LAST:event_btnComprasMouseExited

    
    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnPDFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPDFMouseClicked
        imprimir_pdf();
    }//GEN-LAST:event_btnPDFMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCompras;
    private javax.swing.JPanel btnNuevo;
    private javax.swing.JPanel btnPDF;
    private javax.swing.JPanel btnVentas;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTrabajadores;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JLabel nuevo;
    private javax.swing.JLabel pdf;
    public static javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
