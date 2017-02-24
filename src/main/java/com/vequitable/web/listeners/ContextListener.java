package com.vequitable.web.listeners;

import com.vequitable.web.com.vequitable.web.util.AppConfig;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Bonso on 2/24/2017.
 */
public class ContextListener implements ServletContextListener {

    private static final Logger LOGGER = Logger.getLogger(ContextListener.class.getName());

    public void contextDestroyed(ServletContextEvent scl) {
        // TODO Auto-generated method stub

    }

    public void contextInitialized(ServletContextEvent scl) {

        LOGGER.log(Level.INFO,"Context Initialisation starts...");

        //try {

            //1 get properties from config file.
            /*FileInputStream configFile = new FileInputStream(System.getProperty(AppConfig.PROPERTY_CONFIG_PATH));
            System.getProperties().load(configFile);*/

            //2 set context objects
            /*AnnotationConfigApplicationContext api = new AnnotationConfigApplicationContext(OserionBuilder.class);
            scl.getServletContext().setAttribute(AppConfig.PROPERTY_DB_CONNECTION, api.getBean(IDBConnection.class));
            scl.getServletContext().setAttribute(AppConfig.PROPERTY_SPRING_CONTEXT_API, api);*/


        /*} catch (IOException e) {
            e.printStackTrace();
            LOGGER.log(Level.SEVERE, "Context Initialisation failure :", e);
        }*/


        LOGGER.log(Level.INFO, "Context Initialisation done");


    }


}