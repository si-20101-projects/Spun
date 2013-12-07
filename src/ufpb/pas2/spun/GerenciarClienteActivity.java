package ufpb.pas2.spun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class GerenciarClienteActivity extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_gerenciar_cliente);

        ListView lista = (ListView) findViewById(R.id.list);

        String[] strings = new String[] { "João Helis Bernardo", "Smith Ascari", "Juan Duarte", "Raoni Kulesza",
        		                           "Projeto Avançado II", "Projeto Avançado I"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strings);

        lista.setAdapter(adapter);
        
        Button addCliente = (Button)findViewById(R.id.add_cliente);
		addCliente.setOnClickListener(new LinkNovoClienteActivity());
    }
	
	private class LinkNovoClienteActivity implements OnClickListener{
		
		@Override
		public void onClick(View b) {
			Intent i = new Intent(GerenciarClienteActivity.this, CadastroClienteActivity.class);
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
