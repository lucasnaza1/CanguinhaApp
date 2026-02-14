package br.com.nazadev.CanguinhaApp.models;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.HashMap;

public class Investimentos {
        private BigDecimal taxaRendimentoDiario;
        private static Map<Integer, Double> TABELA_IOF = new HashMap<>();

        static {
            TABELA_IOF.put(1, 0.96);
            TABELA_IOF.put(2, 0.93);
            TABELA_IOF.put(15, 0.50);
            TABELA_IOF.put(30, 0.00);
        }

        public Investimentos(BigDecimal taxa) {
            this.taxaRendimentoDiario = taxa;
        }

        public BigDecimal calcularRendimentoLiquido(BigDecimal saldo, int diasPassados) {
            BigDecimal rendimentoBruto = saldo.multiply(taxaRendimentoDiario)
                    .setScale(4, RoundingMode.HALF_EVEN);

            double percentualIOF = TABELA_IOF.getOrDefault(diasPassados, 0.0);
            BigDecimal valorIOF = rendimentoBruto.multiply(BigDecimal.valueOf(percentualIOF))
                    .setScale(4, RoundingMode.HALF_EVEN);

            BigDecimal rendimentoAposIOF = rendimentoBruto.subtract(valorIOF);

            return rendimentoAposIOF.setScale(2, RoundingMode.HALF_EVEN);
        }
    }

