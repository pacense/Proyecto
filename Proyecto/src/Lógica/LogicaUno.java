package Lógica;

public class LogicaUno {
public int LogicaIntUno;
public int getLogicaIntUno() {
	return LogicaIntUno;
}

public void setLogicaIntUno(int logicaIntUno) {
	LogicaIntUno = logicaIntUno;
}

public float getLogicaIntDos() {
	return LogicaIntDos;
}

public void setLogicaIntDos(float logicaIntDos) {
	LogicaIntDos = logicaIntDos;
}

public float LogicaIntDos;

public LogicaUno(int LogicaIntUno, float LogicaIntDos) {
	this.LogicaIntUno=LogicaIntUno;
	this.LogicaIntDos=LogicaIntDos;
}

public static int calcularLogica(int LogicaIntUno,int LogicaIntDos){
	int calculoLogico = LogicaIntUno+LogicaIntDos;
	return calculoLogico;
}
}
