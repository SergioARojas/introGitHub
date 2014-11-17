package com.sergiorojas.prueba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PruebaMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();	
		
	
		
		setContentView(R.layout.activity_prueba_main);
		
	
			final EditText Quiz= (EditText) findViewById(R.id.eQuiz);
			final EditText Practica= (EditText) findViewById(R.id.eProyec);
			final EditText Exposicion= (EditText) findViewById(R.id.eExpo);
			final EditText Proyecto= (EditText) findViewById(R.id.eProyec);
			final EditText NotaFinal =(EditText) findViewById(R.id.eNota);
			final Button Calcular= (Button) findViewById(R.id.bCalcular);
		
		Calcular.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
					try {double qui, exp,prac,pro,nota;
					qui=Double.parseDouble(Quiz.getText().toString());
					exp=Double.parseDouble(Exposicion.getText().toString());
					prac=Double.parseDouble(Practica.getText().toString());
					pro=Double.parseDouble(Proyecto.getText().toString());
				
					if ((qui<=5)&&(exp<=5)&&( prac<=5)&&( pro<=5)){
						nota=qui*.15+ exp*0.1+ prac*0.4+ pro*0.35;
						NotaFinal.setText(String.valueOf(nota));
					}
					else {Toast.makeText(getApplicationContext(), "Las notas son de 0-5", Toast.LENGTH_SHORT).show();
}	}
					catch(Exception e) {
				Toast.makeText(getApplicationContext(), "Faltan valores por ingresar", Toast.LENGTH_SHORT).show();
		       	NotaFinal.setText(" ");	 }
					
						
			}
			
		});
		
		
		
		}
	protected void onStart(){
		super.onStart();
		Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
	}
	protected void onResume(){
		super.onResume();
		Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
	}
	protected void onPause(){
		super.onPause();
		Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
	}
	
	protected void onStop(){
		super.onStop();
		Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
	}
	protected void onRestart(){
		super.onRestart();
		Toast.makeText(this, "OnRestart", Toast.LENGTH_SHORT).show();
	}
	protected void onDestroy(){
		super.onDestroy();
		Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.prueba_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		if(id== R.id.Acercade){
			Intent i = new Intent(this, Acercade.class);
			startActivity(i);
			
		}
		return super.onOptionsItemSelected(item);
	}
}
