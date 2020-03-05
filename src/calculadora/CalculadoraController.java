/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.event.ActionEvent;

/**
 *
 * @author Rodrigo
 */
public class CalculadoraController {

    private final JanelaCalculadora view;

    private double num1, num2, resultado = 0;

    public CalculadoraController(JanelaCalculadora view) {
        this.view = view;

        InicializacaoBotoes();
    }

    public static double getSoma(double n1, double n2) {
        ws.CalculadoraWSService service = new ws.CalculadoraWSService();
        ws.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getSoma(n1, n2);
    }

    private static double getSub(double n1, double n2) {
        ws.CalculadoraWSService service = new ws.CalculadoraWSService();
        ws.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getSub(n1, n2);
    }

    private static double getMulti(double n1, double n2) {
        ws.CalculadoraWSService service = new ws.CalculadoraWSService();
        ws.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getMulti(n1, n2);
    }

    private static double getDivisao(double n1, double n2) {
        ws.CalculadoraWSService service = new ws.CalculadoraWSService();
        ws.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getDivisao(n1, n2);
    }

    private void InicializacaoBotoes() {

        view.getBotaoSomar().addActionListener((ActionEvent e) -> {

            num1 = Double.parseDouble(view.getCampon1().getText());
            num2 = Double.parseDouble(view.getCampon2().getText());

            resultado = CalculadoraController.getSoma(num1, num2);

            view.getCampoResultado().setText(String.valueOf(resultado));
        });

        view.getBotaoSub().addActionListener((ActionEvent e) -> {
            num1 = Double.parseDouble(view.getCampon1().getText());
            num2 = Double.parseDouble(view.getCampon2().getText());

            resultado = CalculadoraController.getSub(num1, num2);

            view.getCampoResultado().setText(String.valueOf(resultado));

        });

        view.getBotaoMult().addActionListener((ActionEvent e) -> {

            num1 = Double.parseDouble(view.getCampon1().getText());
            num2 = Double.parseDouble(view.getCampon2().getText());

            resultado = CalculadoraController.getMulti(num1, num2);

            view.getCampoResultado().setText(String.valueOf(resultado));

        });

        view.getBotaoDivi().addActionListener((ActionEvent e) -> {

            num1 = Double.parseDouble(view.getCampon1().getText());
            num2 = Double.parseDouble(view.getCampon2().getText());

            resultado = CalculadoraController.getDivisao(num1, num2);

            view.getCampoResultado().setText(String.valueOf(resultado));

        });

    }

}
