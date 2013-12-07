package ufpb.pas2.spun;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
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
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gerenciar_vendedor, menu);
		return true;
	}

}
