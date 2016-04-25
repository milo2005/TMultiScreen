package movil.tmultiscreen;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import movil.tmultiscreen.fragments.DetailFragment;
import movil.tmultiscreen.fragments.MasterFragment;

public class MainActivity extends AppCompatActivity implements MasterFragment.OnColorSelected{

    MasterFragment master;
    DetailFragment detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);

        master = new MasterFragment();
        detail = new DetailFragment();
        detail.setColor(0);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container1,master);
        ft.commit();

    }

    @Override
    public void onColorSelected(int pos) {

    }
}
