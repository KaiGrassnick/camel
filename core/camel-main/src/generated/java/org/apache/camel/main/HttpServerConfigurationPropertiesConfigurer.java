/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.HttpServerConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class HttpServerConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.HttpServerConfigurationProperties target = (org.apache.camel.main.HttpServerConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationenabled":
        case "authenticationEnabled": target.setAuthenticationEnabled(property(camelContext, boolean.class, value)); return true;
        case "authenticationpath":
        case "authenticationPath": target.setAuthenticationPath(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertiesfile":
        case "basicPropertiesFile": target.setBasicPropertiesFile(property(camelContext, java.lang.String.class, value)); return true;
        case "devconsoleenabled":
        case "devConsoleEnabled": target.setDevConsoleEnabled(property(camelContext, boolean.class, value)); return true;
        case "downloadenabled":
        case "downloadEnabled": target.setDownloadEnabled(property(camelContext, boolean.class, value)); return true;
        case "enabled": target.setEnabled(property(camelContext, boolean.class, value)); return true;
        case "healthcheckenabled":
        case "healthCheckEnabled": target.setHealthCheckEnabled(property(camelContext, boolean.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "infoenabled":
        case "infoEnabled": target.setInfoEnabled(property(camelContext, boolean.class, value)); return true;
        case "jolokiaenabled":
        case "jolokiaEnabled": target.setJolokiaEnabled(property(camelContext, boolean.class, value)); return true;
        case "jwtkeystorepassword":
        case "jwtKeystorePassword": target.setJwtKeystorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "jwtkeystorepath":
        case "jwtKeystorePath": target.setJwtKeystorePath(property(camelContext, java.lang.String.class, value)); return true;
        case "jwtkeystoretype":
        case "jwtKeystoreType": target.setJwtKeystoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbodysize":
        case "maxBodySize": target.setMaxBodySize(property(camelContext, java.lang.Long.class, value)); return true;
        case "metricsenabled":
        case "metricsEnabled": target.setMetricsEnabled(property(camelContext, boolean.class, value)); return true;
        case "path": target.setPath(property(camelContext, java.lang.String.class, value)); return true;
        case "port": target.setPort(property(camelContext, int.class, value)); return true;
        case "staticcontextpath":
        case "staticContextPath": target.setStaticContextPath(property(camelContext, java.lang.String.class, value)); return true;
        case "staticenabled":
        case "staticEnabled": target.setStaticEnabled(property(camelContext, boolean.class, value)); return true;
        case "uploadenabled":
        case "uploadEnabled": target.setUploadEnabled(property(camelContext, boolean.class, value)); return true;
        case "uploadsourcedir":
        case "uploadSourceDir": target.setUploadSourceDir(property(camelContext, java.lang.String.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationenabled":
        case "authenticationEnabled": return boolean.class;
        case "authenticationpath":
        case "authenticationPath": return java.lang.String.class;
        case "basicpropertiesfile":
        case "basicPropertiesFile": return java.lang.String.class;
        case "devconsoleenabled":
        case "devConsoleEnabled": return boolean.class;
        case "downloadenabled":
        case "downloadEnabled": return boolean.class;
        case "enabled": return boolean.class;
        case "healthcheckenabled":
        case "healthCheckEnabled": return boolean.class;
        case "host": return java.lang.String.class;
        case "infoenabled":
        case "infoEnabled": return boolean.class;
        case "jolokiaenabled":
        case "jolokiaEnabled": return boolean.class;
        case "jwtkeystorepassword":
        case "jwtKeystorePassword": return java.lang.String.class;
        case "jwtkeystorepath":
        case "jwtKeystorePath": return java.lang.String.class;
        case "jwtkeystoretype":
        case "jwtKeystoreType": return java.lang.String.class;
        case "maxbodysize":
        case "maxBodySize": return java.lang.Long.class;
        case "metricsenabled":
        case "metricsEnabled": return boolean.class;
        case "path": return java.lang.String.class;
        case "port": return int.class;
        case "staticcontextpath":
        case "staticContextPath": return java.lang.String.class;
        case "staticenabled":
        case "staticEnabled": return boolean.class;
        case "uploadenabled":
        case "uploadEnabled": return boolean.class;
        case "uploadsourcedir":
        case "uploadSourceDir": return java.lang.String.class;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.HttpServerConfigurationProperties target = (org.apache.camel.main.HttpServerConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "authenticationenabled":
        case "authenticationEnabled": return target.isAuthenticationEnabled();
        case "authenticationpath":
        case "authenticationPath": return target.getAuthenticationPath();
        case "basicpropertiesfile":
        case "basicPropertiesFile": return target.getBasicPropertiesFile();
        case "devconsoleenabled":
        case "devConsoleEnabled": return target.isDevConsoleEnabled();
        case "downloadenabled":
        case "downloadEnabled": return target.isDownloadEnabled();
        case "enabled": return target.isEnabled();
        case "healthcheckenabled":
        case "healthCheckEnabled": return target.isHealthCheckEnabled();
        case "host": return target.getHost();
        case "infoenabled":
        case "infoEnabled": return target.isInfoEnabled();
        case "jolokiaenabled":
        case "jolokiaEnabled": return target.isJolokiaEnabled();
        case "jwtkeystorepassword":
        case "jwtKeystorePassword": return target.getJwtKeystorePassword();
        case "jwtkeystorepath":
        case "jwtKeystorePath": return target.getJwtKeystorePath();
        case "jwtkeystoretype":
        case "jwtKeystoreType": return target.getJwtKeystoreType();
        case "maxbodysize":
        case "maxBodySize": return target.getMaxBodySize();
        case "metricsenabled":
        case "metricsEnabled": return target.isMetricsEnabled();
        case "path": return target.getPath();
        case "port": return target.getPort();
        case "staticcontextpath":
        case "staticContextPath": return target.getStaticContextPath();
        case "staticenabled":
        case "staticEnabled": return target.isStaticEnabled();
        case "uploadenabled":
        case "uploadEnabled": return target.isUploadEnabled();
        case "uploadsourcedir":
        case "uploadSourceDir": return target.getUploadSourceDir();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        default: return null;
        }
    }
}

