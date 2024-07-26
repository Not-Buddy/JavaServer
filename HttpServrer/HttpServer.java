package com.coderfromscratch.httpserver;

import com.coderfromscratch.httpserver.config.Configuration;
import com.coderfromscratch.httpserver.config.ConfigurationManager;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer
{
  public static void main(String args[])
  {
    System.out.println("Server starting..");
    ConfigurationManager.getInstance().loadConfigurationFile("")
    Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

    System.out.println("Using Port: "+ conf.getPort());
    System.out.println("Using WebRoot: "+ conf.getWebRoot());

  }
}
