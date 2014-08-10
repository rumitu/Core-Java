package com.hackbulgaria.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Recording {
    public static void getStudentsAttendance() throws MalformedURLException, IOException, JSONException {
        Map<String, Integer> attendances = new HashMap<>();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                new URL("https://hackbulgaria.com/api/checkins/").openStream()));

        String contents = "";
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            contents += inputLine + "\n";
        }

        JSONArray json = new JSONArray(contents);
        JSONObject student;
        Object name;
        for (int i = 0; i < json.length(); i++) {
            student = (JSONObject) json.get(i);
            name = student.get("student_name");
            if (!attendances.containsKey(name)) {
                attendances.put((String) name, 1);
            } else {
                attendances.put((String) name, attendances.get(name) + 1);
            }
        }
        for (Iterator i = sortByValue(attendances).iterator(); i.hasNext();) {
            String key = (String) i.next();
            System.out.printf("Име: %s, Посещения: %s\n", key, attendances.get(key));
        }
    }

    public static void getStudentsEnrolledInMoreThanOneCourse() throws JSONException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(
                new URL("https://hackbulgaria.com/api/students/").openStream()));

        String contents = "";
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            contents += inputLine + "\n";
        }

        JSONArray json = new JSONArray(contents);
        JSONObject student;
        for (int i = 0; i < json.length(); i++) {
            student = (JSONObject) json.get(i);

            if (((JSONArray) student.get("courses")).length() > 1) {
                System.out.println(student.get("name"));
            }
        }
    }

    public static void main(String[] args) throws MalformedURLException, IOException, JSONException {
        getStudentsAttendance();
        System.out.println();
        getStudentsEnrolledInMoreThanOneCourse();
    }

    @SuppressWarnings("unchecked")
    private static List<String> sortByValue(final Map<String, Integer> m) {
        List<String> keys = new ArrayList<String>();
        keys.addAll(m.keySet());
        Collections.sort(keys, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Object v1 = m.get(o1);
                Object v2 = m.get(o2);
                if (v1 == null) {
                    return (v2 == null) ? 0 : 1;
                } else if (v1 instanceof Comparable) {
                    return ((Comparable) v1).compareTo(v2);
                } else {
                    return 0;
                }
            }
        });
        return keys;
    }
}
