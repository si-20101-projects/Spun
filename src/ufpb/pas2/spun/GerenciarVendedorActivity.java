package ufpb.pas2.spun;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class GerenciarVendedorActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gerenciar_vendedor);
		
		ListView lista = (ListView) findViewById(R.id.list);

        String[] strings = new String[] { "João Helis Bernardo", "Smith Ascari", "Juan Duarte", "Raoni Kulesza",
        		                           "Projeto Avançado II", "Projeto Avançado I"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strings);

        lista.setAdapter(adapter);
        
        Button addVendedor = (Button) findViewById(R.id.addVendedor);
        addVendedor.setOnClickListener(new LinkCadastrarVendedorActivity());
        
        ImageView home = (ImageView)findViewById(R.id.gerVendToHome);
        home.setOnClickListener(new LinkGerVendedorToHomeActivity());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gerenciar_vendedor, menu);
		return true;
	}
	
	private class LinkCadastrarVendedorActivity implements OnClickListener{

		@Override
		public void onClick(View b) {
			Intent i = new Intent(GerenciarVendedorActivity.this, CadastroVendedorActivity.class);
			startActivity(i);

		}
	}
	
	private class LinkGerVendedorToHomeActivity implements OnClickListener{

		@Override
		public void onClick(View b) {
			Intent i = new Intent(GerenciarVendedorActivity.this, MainActivity.class);
			startActivity(i);

		}
	}

}
