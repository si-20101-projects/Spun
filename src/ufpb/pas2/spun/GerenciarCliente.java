package ufpb.pas2.spun;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;

public class GerenciarCliente extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gerenciar_cliente);
		
		Button addCliente = (Button)findViewById(R.id.add_cliente);
		addCliente.setOnClickListener(new LinkNovoClienteActivity());
	}
	
	private class LinkNovoClienteActivity implements OnClickListener{
		
		@Override
		public void onClick(View b) {
			Intent i = new Intent(GerenciarCliente.this, NovoCliente.class);
			startActivity(i);
			
		}
    }
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gerenciar_cliente, menu);
		return true;
	}

}
