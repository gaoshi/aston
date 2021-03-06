package com.wenzeng.aston.autoconfigure.velocity;

import org.springframework.boot.autoconfigure.template.AbstractTemplateViewResolverProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wenzeng
 * @since 1.0
 */
@ConfigurationProperties(prefix = "mogu.spring.velocity")
public class MoGuVelocityProperties extends AbstractTemplateViewResolverProperties {

    public static final String DEFAULT_RESOURCE_LOADER_PATH = "classpath:/templates/";

    public static final String DEFAULT_PREFIX = "";

    public static final String DEFAULT_SUFFIX = ".vm";

    /**
     * 新增部分:layoutUrl
     */
    private String layoutUrl;
    /**
     * 新增部分:layoutKey
     */
    private String layoutKey;
    /**
     * 新增部分:screenContentKey
     */
    private String screenContentKey;

    /**
     * Name of the DateTool helper object to expose in the Velocity context of the view.
     */
    private String dateToolAttribute;

    /**
     * Name of the NumberTool helper object to expose in the Velocity context of the view.
     */
    private String numberToolAttribute;

    /**
     * Additional velocity properties.
     */
    private Map<String, String> properties = new HashMap<String, String>();

    /**
     * Template path.
     */
    private String resourceLoaderPath = DEFAULT_RESOURCE_LOADER_PATH;

    /**
     * Velocity Toolbox config location, for example "/WEB-INF/toolbox.xml". Automatically
     * loads a Velocity Tools toolbox definition file and expose all defined tools in the
     * specified scopes.
     */
    private String toolboxConfigLocation;

    /**
     * Prefer file system access for template loading. File system access enables hot
     * detection of template changes.
     */
    private boolean preferFileSystemAccess = true;

    public MoGuVelocityProperties() {
        super(DEFAULT_PREFIX, DEFAULT_SUFFIX);
    }

    public String getDateToolAttribute() {
        return this.dateToolAttribute;
    }

    public void setDateToolAttribute(String dateToolAttribute) {
        this.dateToolAttribute = dateToolAttribute;
    }

    public String getNumberToolAttribute() {
        return this.numberToolAttribute;
    }

    public void setNumberToolAttribute(String numberToolAttribute) {
        this.numberToolAttribute = numberToolAttribute;
    }

    public Map<String, String> getProperties() {
        return this.properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public String getResourceLoaderPath() {
        return this.resourceLoaderPath;
    }

    public void setResourceLoaderPath(String resourceLoaderPath) {
        this.resourceLoaderPath = resourceLoaderPath;
    }

    public String getToolboxConfigLocation() {
        return this.toolboxConfigLocation;
    }

    public void setToolboxConfigLocation(String toolboxConfigLocation) {
        this.toolboxConfigLocation = toolboxConfigLocation;
    }

    public boolean isPreferFileSystemAccess() {
        return this.preferFileSystemAccess;
    }

    public void setPreferFileSystemAccess(boolean preferFileSystemAccess) {
        this.preferFileSystemAccess = preferFileSystemAccess;
    }

    public String getLayoutUrl() {
        return layoutUrl;
    }

    public void setLayoutUrl(String layoutUrl) {
        this.layoutUrl = layoutUrl;
    }

    public String getLayoutKey() {
        return layoutKey;
    }

    public void setLayoutKey(String layoutKey) {
        this.layoutKey = layoutKey;
    }

    public String getScreenContentKey() {
        return screenContentKey;
    }

    public void setScreenContentKey(String screenContentKey) {
        this.screenContentKey = screenContentKey;
    }

    @Override
    public void applyToViewResolver(Object viewResolver) {
        super.applyToViewResolver(viewResolver);
        MoGuEmbeddedVelocityLayoutViewResolver resolver = (MoGuEmbeddedVelocityLayoutViewResolver) viewResolver;
        resolver.setToolboxConfigLocation(getToolboxConfigLocation());
        resolver.setDateToolAttribute(getDateToolAttribute());
        resolver.setNumberToolAttribute(getNumberToolAttribute());
        resolver.setLayoutUrl(getLayoutUrl());
        resolver.setLayoutKey(getLayoutKey());
        resolver.setScreenContentKey(getScreenContentKey());
    }
}
