package ufpb.pas2.spun;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CadastroClienteActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_cliente);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.novo_cliente, menu);
		return true;
	}

}