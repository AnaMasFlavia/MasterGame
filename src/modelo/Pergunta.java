package modelo;

public class Pergunta {
	@Override
	public String toString() {
		return "Pergunta [pergunta=" + pergunta + ", resposta1=" + resposta1
				+ ", resposta2=" + resposta2 + ", resposta3=" + resposta3
				+ ", resposta4=" + resposta4 + ", resposta5=" + resposta5 + "]";
	}
	private String pergunta;
	private String resposta1;
	private String resposta2;
	private String resposta3;
	private String resposta4;
	private String resposta5;
	private String respostaCerta;
	
	public String getRespostaCerta() {
		return respostaCerta;
	}
	public void setRespostaCerta(String respostaCerta) {
		this.respostaCerta = respostaCerta;
	}
	public Pergunta(){
		
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getResposta1() {
		return resposta1;
	}
	public void setResposta1(String resposta1) {
		this.resposta1 = resposta1;
	}
	public String getResposta2() {
		return resposta2;
	}
	public void setResposta2(String resposta2) {
		this.resposta2 = resposta2;
	}
	public String getResposta3() {
		return resposta3;
	}
	public void setResposta3(String resposta3) {
		this.resposta3 = resposta3;
	}
	public String getResposta4() {
		return resposta4;
	}
	public void setResposta4(String resposta4) {
		this.resposta4 = resposta4;
	}
	public String getResposta5() {
		return resposta5;
	}
	public void setResposta5(String resposta5) {
		this.resposta5 = resposta5;
	}
}
