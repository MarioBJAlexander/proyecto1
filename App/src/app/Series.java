package app;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Series {
//------------------------------------------------------------------------------
    // Factorial

    public String fact(int o) {
        String res = "";
        String rest = "";
        for (int i = 1; i <= o; i++) {
            if (i == o) {
                res += (i);
            } else {
                res += (i + " * ");
            }

        }
        rest = (" = " + factorial(o));
        return res + rest;

    }

    public int factorial(int n) {

        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;

    }

//------------------------------------------------------------------------------
    // numeros primos
    public String iniciar(int limite) {
        int prim = 0;
        String result = "";
        int suma = 0;
        for (int i = 2; prim < limite; i++) {
            if (primo(i) == true) {
                prim++;
                if (prim == limite) {
                    result += i;
                    suma += i;
                } else {
                    result += i + " + ";
                    suma += i;
                }
            }

        }
        return result + " = " + suma;
    }

    public boolean primo(int n) {

        int aux;
        for (int cont = 2; cont < n; cont++) {
            aux = n % cont;
            if (aux == 0) {
                return false;
            }
        }
        return true;
    }

//------------------------------------------------------------------------------
    // Serie de Fibonacci
    public String fibonacci(int n) {

        int f1 = 0;
        int f2 = 1;
        int valor;
        int cont = 0;
        int conta = 0;
        int total = -1;
        String resu = "";

        resu += (f1 + " - ");
        resu += (f2 + " + ");

        if (n == 1) {
            return f1 + " = " + f1;
        }
        if (n == 2) {
            return f1 + "-" + f2 + " = -1";
        }

        for (int i = 1; i <= n - 2; i++) {
            cont += 1;
            conta += 1;

            valor = f1 + f2;
            f1 = f2;
            f2 = valor;

            if (cont == (n - 2)) {
                resu += Integer.toString(valor);
            } else {
                if (conta % 2 == 0) {
                    resu += (valor + " + ");
                    System.out.println("-> " + valor);
                } else {
                    resu += (valor + " - ");
                    System.out.println("->> " + valor);
                }
            }
        }
        return resu + " = " + total;
    }

    public String fibonacci2(int n) {

        int f1 = 0;
        int f2 = 1;
        int valor = 0;
        int conta = 0;
        int total = -1;
        String resu = "";

        resu += (f1 + " - ");
        resu += (f2 + " + ");

        if (n == 1) {
            return f1 + " = " + f1;
        }
        if (n == 2) {
            return f1 + "-" + f2 + " = -1";
        }

        for (int i = 1; i <= n - 2; i++) {
            conta += 1;
            valor = f1 + f2;
            if (conta % 2 == 0) {
                total = total - valor;
            } else {
                total = total + valor;
            }

            f1 = f2;
            f2 = valor;

            if (conta == (n - 2)) {
                resu = resu + Integer.toString(valor);
            } else {
                if (conta % 2 == 0) {
                    resu += (valor + " + ");
                } else {
                    resu += (valor + " - ");
                }
            }
        }
        return resu + " = " + total;
    }

//------------------------------------------------------------------------------
    //Serie adicional 
    public String serie(int p) {
        double suma = 0;
        int cont = 2;
        double div = 0;
        String re = "";
        for (int i = 1; i <= p; i++) {

            while (primo(cont) == false) {
                cont++;
            }
            int pri = cont;
            double fa = factorial(i);
            if (i == p) {
                re = re + (pri + "/" + i + "!");
                div = (pri / fa);
                suma = suma + div;
            } else {
                re = re + (pri + "/" + i + "!" + " + ");
                div = (pri / fa);
                suma = suma + div;
                cont++;
            }
        }
        return re + " = " + suma;
    }

//------------------------------------------------------------------------------
    //Serie adicional 2 
    public String ser(int q) {
        double suma = 0;
        int cont = 2;
        double div = 0;
        String re = "";
        for (int i = 1; i <= q; i++) {

            while (primo(cont) == false) {
                cont++;
            }
            int pri = cont;
            double fa = factorial(pri);
            if (i == q) {
                re = re + (i + "/" + pri + "!");
                div = (i / fa);
                suma = suma + div;
            } else {
                re = re + (i + "/" + pri + "!" + " + ");
                div = (i / fa);
                suma = suma + div;
                cont++;
            }
        }
        return re + " = " + suma;
    }

//------------------------------------------------------------------------------
    // SENO 
    public String seno(int q) {
        String op;
        double div = 0;
        double num = 0;
        int cont = 1;
        int imp = 1;
        double total = 0;
        String r = "";
        
        for (int i = 1; i <= q; i++) {
                    num = Math.pow(q, imp);
                    div = (num / factorial(imp));
                    if ((cont % 2) == 0) {
                        op = " + ";
                        r += ((q + "^" + imp) + " / " + imp + "!" + op);
                        total = total - div;
                    } else {
                        op = " - ";
                        r += ((q + "^" + imp) + " / " + imp + "!" + op);
                        total = total + div;
                    }
                    cont++;
                imp = imp + 2;
        }
        return r + " = " + total;
    }
}
