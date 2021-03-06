package org.jude.bigdata.recroom.movies.etl.parser;

import org.apache.log4j.Logger;

/**
 * Parses the Aka-Names list
 * 
 * @author user
 * 
 */
public class WritersFileParser extends RoleFileParser {
	static final String SOURCE_NAME = "writers";
	static final String PRE_HEADER_LINE = "Name\t\t\tTitles";
	static final String HEADER_LINE = "----			------";
	static final String END_LINE = "---------------------";

	Logger logger = Logger.getLogger(WritersFileParser.class);

	/**
	 * Constructor. Takes file system directory path for file.
	 * 
	 * @param path
	 */
	public WritersFileParser(String path) {
		super(path, SOURCE_NAME, PRE_HEADER_LINE, HEADER_LINE, END_LINE);
	}
}
