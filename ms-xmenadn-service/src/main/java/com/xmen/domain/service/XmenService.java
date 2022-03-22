package com.xmen.domain.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.xmen.domain.models.RequestInHeadersDTO;

@Component
public class XmenService {

	public ResponseEntity<Object> validateMutants(RequestInHeadersDTO requestInHeaders, String request) {
		String[] ary = request.split(":");
		String nitrogenBase = ary[1];
		String sNitrogenBase = nitrogenBase.replace("[", "").replace("]", "").replace("}", "").replace("\"", "")
				.replaceAll("\\s+", "");
		String[] dna = sNitrogenBase.split(",");
		if (isMutant(dna)) {
			return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(Boolean.FALSE, HttpStatus.FORBIDDEN);
		}
	}

	private boolean isMutant(String[] dna) {
		boolean isMutant = false;
		String column = dna[0];
		int rowSize = dna.length;
		int columnSize = column.length();
		char[][] matriz = new char[rowSize][columnSize];
		int cont = 0;

		for (int i = 0; i < rowSize; i++) {
			String data = dna[i];
			for (int j = 0; j < columnSize; j++) {
				matriz[i][j] = data.charAt(j);
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length - 3; j++) {

				if (matriz[i][j] == matriz[i][j + 1] && matriz[i][j] == matriz[i][j + 2]
						&& matriz[i][j] == matriz[i][j + 3]) {
					cont+=1;
				}
			}
		}

		for (int i = 0; i < matriz.length - 3; i++) {
			for (int j = 0; j < matriz[0].length; j++) {

				if (matriz[i][j] == matriz[i + 1][j] && matriz[i][j] == matriz[i + 2][j]
						&& matriz[i][j] == matriz[i + 3][j]) {
					cont+=1;
				}
			}
		}

		for (int i = 0; i < matriz.length - 3; i++) {
			for (int j = 0; j < matriz[0].length - 3; j++) {

				if (matriz[i][j] == matriz[i + 1][j + 1] && matriz[i][j] == matriz[i + 2][j + 2]
						&& matriz[i][j] == matriz[i + 3][j + 3]) {
					cont+=1;
				}
			}
		}
		if(cont>1) {
			isMutant = true;
		}
		return isMutant;
	}
}