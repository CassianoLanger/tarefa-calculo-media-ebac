package calculo;

public class Media {
	
	double notaA;
	double notaB;
	double notaC;
	double notaD;
	double media;
	
	public Media() {
	}
	
	public Media(double nota1, double nota2, double notaC, double notaD) {
		this.notaA = nota1;
		this.notaB = nota2;
		this.notaC = notaC;
		this.notaD = notaD;
	}

	public double getNotaA() {
		return this.notaA;
	}
	
	public void setNotaA(double notaA) {
		this.notaA = notaA;
	}

	public double getNotaB() {
		return notaB;
	}

	public void setNotaB(double notaB) {
		this.notaB = notaB;
	}

	public double getNotaC() {
		return notaC;
	}

	public void setNotaC(double notaC) {
		this.notaC = notaC;
	}

	public double getNotaD() {
		return notaD;
	}

	public void setNotaD(double notaD) {
		this.notaD = notaD;
	}


	public double media() {
		media = (notaA + notaB + notaC + notaD)/4;
		return media;
	}
	
}
