package ufpb.pas2.spun;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroClienteActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_cliente);
		
		Button cancel = (Button)findViewById(R.id.btnCancelCadCliente);
		Button confirm = (Button)findViewById(R.id.btnCadCliente);
		
		cancel.setOnClickListener(new LinkBackGerClienteActivity());
		confirm.setOnClickListener(new LinkSuccessBackGerClienteActivity());
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.novo_cliente, menu);
		return true;
	}
	
	private class LinkBackGerClienteActivity implements OnClickListener{
		@Override
		public void onClick(View b) {
			Intent i = new Intent(CadastroClienteActivity.this, GerenciarClienteActivity.class);
			startActivity(i);
			
		}
    }
	
	private class LinkSuccessBackGerClienteActivity implements OnClickListener{
		@Override
		public void onClick(View b) {
			String msg = "Cliente cadastrado!";
			Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
			t.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
	        t.show();
			Intent i = new Intent(CadastroClienteActivity.this, GerenciarClienteActivity.class);
			startActivity(i);
			
		}
    }

}
