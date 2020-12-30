package com.angkorteam.blueprint.dao;

import com.angkorteam.metamodel.utility.LiquibaseUtility;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;

public class RepairProgram {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, TransformerException {
        File folder = new File("blueprint-dao/src/main/resources");
        LiquibaseUtility.process(folder);
    }
}
