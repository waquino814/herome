package wellington.org.herome.Activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import wellington.org.herome.Fragments.BackStoryFragment;
import wellington.org.herome.Fragments.MainFragment;
import wellington.org.herome.Fragments.PickPowerFragment;
import wellington.org.herome.R;
import wellington.org.herome.dao.Hero;


public class MainActivity extends AppCompatActivity implements MainFragment.MainFragmentInteractionListener, PickPowerFragment.PickPowerInteractionListener, BackStoryFragment.BackStoryInteractionListener{
    private Hero hero = new Hero();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);
        if(fragment == null){
            fragment = new MainFragment();
            manager.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }
    }
    public void loadPickPowerScreen(){
        PickPowerFragment pickPowerFragment = new PickPowerFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, pickPowerFragment).addToBackStack(null).commit();
    }
    public void loadBackStoryScreen(){
        BackStoryFragment backStoryFragment = new BackStoryFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, backStoryFragment).addToBackStack(null).commit();
    }
    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPickPowerFragmentInteraction(Uri uri) {

    }

    @Override
    public void onBackStoryFragmentInteraction(Uri uri) {

    }

    public Hero getHero() {
        return hero;
    }
}
