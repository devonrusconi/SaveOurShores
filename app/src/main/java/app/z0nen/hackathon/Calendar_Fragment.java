package app.z0nen.hackathon;

import android.app.Fragment;
import android.app.usage.UsageEvents;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.CalendarView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by Devon on 3/14/2015.
 */
public class Calendar_Fragment extends Fragment {

    /*
    //public ArrayList<Event> eventList = new ArrayList<Event>();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.US);
    GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("US/Pacific"));

    public static Fragment newInstance(Context context)
    {
        Calendar_Fragment f = new Calendar_Fragment();

        return f;
    }

    */


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.calendar_layout, container, false);

        /*
        final ViewGroup root = (ViewGroup) inflater.inflate(R.layout.calendar_layout, null);
        final CalendarView c = (CalendarView) root.findViewById(R.id.calendar);

        cal.setTimeInMillis(c.getDate());
        eventList = MainActivity.datasource.getEvent(Integer.parseInt(sdf.format(cal.getTime())));

        ListAdapter adapter = new EventListAdapter(getActivity(), R.layout.notification_list_item, eventList);
        //ListView listview = (ListView)root.findViewById(R.id.eventList);
        listView.setAdapter(adapter);

        */

        return rootView;
    }

    //View rootView = inflater.inflate(R.layout.calendar_layout, container, false);

        /*
        WebView webView = (WebView)rootView.findViewById(R.id.webCalendar);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.loadUrl("http://saveourshores.org/media/newsletters/");
        webView.getSettings().setBuiltInZoomControls(true);
        webView.setInitialScale(50);
        */

//
//        WebView webView = (WebView)rootView.findViewById(R.id.webCalendar);
//        webView.getSettings().setJavaScriptEnabled(true);
//
//        webView.loadUrl("http://saveourshores.org/calendar/");
//        webView.getSettings().setBuiltInZoomControls(true);
//        webView.setInitialScale(50);


    //return rootView;
}