package ufpb.pas2.spun;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button link = (Button)findViewById(R.id.gerCliente);
		link.setOnClickListener(new LinkGerClienteActivity());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// link for class management client
	private class LinkGerClienteActivity implements OnClickListener{
		@Override
		public void onClick(View b) {
			Intent i = new Intent(MainActivity.this, GerenciarCliente.class);
			startActivity(i);
			
		}
    }

}
