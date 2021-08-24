package com.consultorjava.quarkus;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quarkus.run(RunHolaResource.class, args);

	}

}
