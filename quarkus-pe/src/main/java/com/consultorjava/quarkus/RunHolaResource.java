package com.consultorjava.quarkus;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;

public class RunHolaResource implements QuarkusApplication {

	@Override
	public int run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inicio de Aplicacion");
		Quarkus.waitForExit();
		return 0;
	}

}
