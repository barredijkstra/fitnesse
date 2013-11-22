// Copyright (C) 2003-2009 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the CPL Common Public License version 1.0.
package fitnesseMain;

import fitnesse.FitNesseContext;

public class Arguments {
  public static final String DEFAULT_PATH = ".";
  public static final String DEFAULT_ROOT = "FitNesseRoot";
  public static final String DEFAULT_WEB_ROOT_CONTEXT = "";
  public static final int DEFAULT_COMMAND_PORT = 9123;
  public static final String DEFAULT_CONFIG_FILE = "plugins.properties";
  public static final int DEFAULT_VERSION_DAYS = 14;
  private String rootPath = DEFAULT_PATH;
  private int port = -1;
  private String rootDirectory = DEFAULT_ROOT;
  private String webRootContext = DEFAULT_WEB_ROOT_CONTEXT;
  private String logDirectory;
  private boolean omitUpdate = false;
  private int daysTillVersionsExpire = DEFAULT_VERSION_DAYS;
  private String userpass;
  private boolean installOnly;
  private String command = null;
  private String output = null;
  private String configFile = null;
  private boolean verboseLogging;

  public String getRootPath() {
    return rootPath;
  }

  public void setRootPath(String rootPath) {
    this.rootPath = rootPath;
  }

  public int getPort() {
    return port == -1 ? getDefaultPort() : port;
  }

  public void setPort(String port) {
    this.port = Integer.parseInt(port);
  }

  public String getRootDirectory() {
    return rootDirectory;
  }

  public void setRootDirectory(String rootDirectory) {
    this.rootDirectory = rootDirectory;
  }

  public String getWebRootContext() {
      return webRootContext;
  }

  public boolean isWebRootContextUsed() {
      return webRootContext == null || DEFAULT_WEB_ROOT_CONTEXT.equals(webRootContext);
  }

  public void setWebRootContext(String webRootContext) {
      this.webRootContext = webRootContext;
  }

  public String getLogDirectory() {
    return logDirectory;
  }

  public void setLogDirectory(String logDirectory) {
    this.logDirectory = logDirectory;
  }

  public void setOmitUpdates(boolean omitUpdates) {
    this.omitUpdate = omitUpdates;
  }

  public boolean isOmittingUpdates() {
    return omitUpdate;
  }

  public String getUserpass() {
    if (userpass == null || userpass.length() == 0)
      return null;
    else
      return userpass;
  }

  public void setUserpass(String userpass) {
    this.userpass = userpass;
  }

  public int getDaysTillVersionsExpire() {
    return daysTillVersionsExpire;
  }

  public void setDaysTillVersionsExpire(String daysTillVersionsExpire) {
    this.daysTillVersionsExpire = Integer.parseInt(daysTillVersionsExpire);
  }

  public boolean isInstallOnly() {
    return installOnly;
  }

  public void setInstallOnly(boolean installOnly) {
    this.installOnly = installOnly;
  }

  public String getCommand() {
    if (command == null)
      return null;
    else
      return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }

  public String getConfigFile() {
    return configFile == null ? (rootPath + "/" + DEFAULT_CONFIG_FILE) : configFile;
  }

  public void setConfigFile(String configFile) {
    this.configFile = configFile;
  }

  public void setVerboseLogging(boolean verboseLogging) {
    this.verboseLogging = verboseLogging;
  }

  public boolean hasVerboseLogging() {
    return verboseLogging;
  }

  private int getDefaultPort() {
    return command == null ? FitNesseContext.DEFAULT_PORT : DEFAULT_COMMAND_PORT;
  }
}
