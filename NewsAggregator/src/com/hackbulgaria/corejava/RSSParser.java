package com.hackbulgaria.corejava;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

public class RSSParser {
	public static void parseRSS(URL url, HttpServletResponse response) throws IllegalArgumentException, FeedException, IOException{
		HttpURLConnection httpcon = (HttpURLConnection)url.openConnection();
		// Reading the feed
		SyndFeedInput input = new SyndFeedInput();
		SyndFeed feed = input.build(new XmlReader(httpcon));
		List entries = feed.getEntries();
		Iterator itEntries = entries.iterator();

		while (itEntries.hasNext()) {
			SyndEntry entry = (SyndEntry) itEntries.next();
			PrintWriter out = response.getWriter();
			out.append(String.format("<h2>%s</h2>", entry.getTitle()));
			out.append(String.format("<a href=%s>Линк</a>", entry.getLink()));
			out.append(String.format("<h4>Автор: %s</h4>", entry.getAuthor()));
			out.append(String.format("<p>Дата: %s</p>", entry.getPublishedDate()));
			out.append(String.format("<p>%s</p>", entry.getDescription().getValue()));
		}
	}
}
