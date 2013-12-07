package ufpb.pas2.spun;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class CadastroVendedorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro_vendedor);
		
		Button cancel = (Button)findViewById(R.id.btnCancelCadVendedor);
		Button confirm = (Button)findViewById(R.id.btnCadVendedor);
		
		cancel.setOnClickListener(new LinkBackGerVendedorActivity());
		confirm.setOnClickListener(new LinkSuccessBackGerVendedorActivity());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro_vendedor, menu);
		return true;
	}
	
	private class LinkBackGerVendedorActivity implements OnClickListener{
		@Override
		public void onClick(View b) {
			Intent i = new Intent(CadastroVendedorActivity.this, GerenciarVendedorActivity.class);
			startActivity(i);
			
		}
    }
	
	private class LinkSuccessBackGerVendedorActivity implements OnClickListener{
		@Override
		public void onClick(View b) {
			String msg = "Vendedor cadastrado!";
			Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_SHORT);
			t.setGravity(Gravity.CENTER_HORIZONTAL, 0, 0);
	        t.show();
			Intent i = new Intent(CadastroVendedorActivity.this, GerenciarVendedorActivity.class);
			startActivity(i);
			
		}
    }

}
