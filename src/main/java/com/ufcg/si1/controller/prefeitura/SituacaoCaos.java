package com.ufcg.si1.controller.prefeitura;

public class SituacaoCaos implements SituacaoPrefeitura{
	
	private static final int BOM = 2;
	private static final int REGULAR = 1;
	private static final int RUIM = 0;
	
	@Override
	public int getSituacaoQueixa(int queixasAbertas, int totalQueixas) {
		double situacao =  (double) queixasAbertas / totalQueixas;
		if (situacao < 0.02) {
			return BOM;
		} else if (situacao < 0.05) {
			return REGULAR;
		} else {
			return RUIM;
		}
	}
}
