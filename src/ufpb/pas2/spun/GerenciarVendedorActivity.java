package ufpb.pas2.spun;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GerenciarVendedorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gerenciar_vendedor);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gerenciar_vendedor, menu);
		return true;
	}

}
